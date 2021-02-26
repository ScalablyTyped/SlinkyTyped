package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import typingsSlinky.officeUiFabricReact.anon.Options
import typingsSlinky.officeUiFabricReact.dropdownTypesMod.IDropdown
import typingsSlinky.officeUiFabricReact.dropdownTypesMod.IDropdownOption
import typingsSlinky.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
  @js.native
  class DropdownBase protected ()
    extends Component[IDropdownInternalProps, IDropdownState, js.Any]
       with IDropdown {
    def this(props: IDropdownProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDropdownBase(newProps: IDropdownProps): Unit = js.native
    
    var _classNames: js.Any = js.native
    
    var _copyArray: js.Any = js.native
    
    var _dropDown: js.Any = js.native
    
    var _focusZone: js.Any = js.native
    
    var _getAllSelectedIndices: js.Any = js.native
    
    var _getSelectedIndex: js.Any = js.native
    
    /** Get all selected indexes for multi-select mode */
    var _getSelectedIndexes: js.Any = js.native
    
    /** Flag for when we get the first mouseMove */
    var _gotMouseMove: js.Any = js.native
    
    var _host: js.Any = js.native
    
    var _id: js.Any = js.native
    
    /**
      * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
      */
    var _isAltOrMeta: js.Any = js.native
    
    /**
      * Because the isDisabled prop is deprecated, we have had to repeat this logic all over the place.
      * This helper method avoids all the repetition.
      */
    var _isDisabled: js.Any = js.native
    
    /** Flag for tracking whether focus is triggered by click (alternatively triggered by keyboard nav) */
    var _isFocusedByClick: js.Any = js.native
    
    var _isScrollIdle: js.Any = js.native
    
    var _labelId: js.Any = js.native
    
    /** True if the most recent keydown event was for alt (option) or meta (command). */
    var _lastKeyDownWasAltOrMeta: js.Any = js.native
    
    var _listId: js.Any = js.native
    
    /**
      * Finds the next valid Dropdown option and sets the selected index to it.
      * @param stepValue - Value of how many items the function should traverse.  Should be -1 or 1.
      * @param index - Index of where the search should start
      * @param selectedIndex - The selectedIndex Dropdown's state
      * @returns The next valid dropdown option's index
      */
    var _moveIndex: js.Any = js.native
    
    var _onChange: js.Any = js.native
    
    var _onDismiss: js.Any = js.native
    
    var _onDropdownBlur: js.Any = js.native
    
    var _onDropdownClick: js.Any = js.native
    
    var _onDropdownKeyDown: js.Any = js.native
    
    var _onDropdownKeyUp: js.Any = js.native
    
    var _onDropdownMouseDown: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    var _onItemClick: js.Any = js.native
    
    var _onItemMouseEnter: js.Any = js.native
    
    var _onItemMouseMove: js.Any = js.native
    
    var _onMouseItemLeave: js.Any = js.native
    
    var _onPositioned: js.Any = js.native
    
    /** Render Caret Down Icon */
    var _onRenderCaretDown: js.Any = js.native
    
    /** Render Callout or Panel container and pass in list */
    var _onRenderContainer: js.Any = js.native
    
    var _onRenderItem: js.Any = js.native
    
    /** Render custom label for drop down item */
    var _onRenderItemLabel: js.Any = js.native
    
    var _onRenderLabel: js.Any = js.native
    
    /** Render List of items */
    var _onRenderList: js.Any = js.native
    
    /** Render content of item (i.e. text/icon inside of button) */
    var _onRenderOption: js.Any = js.native
    
    /** Render placeholder text in dropdown input */
    var _onRenderPlaceholder: js.Any = js.native
    
    /** Render text in dropdown input */
    var _onRenderTitle: js.Any = js.native
    
    /**
      * Scroll handler for the callout to make sure the mouse events
      * for updating focus are not interacting during scroll
      */
    var _onScroll: js.Any = js.native
    
    var _onZoneKeyDown: js.Any = js.native
    
    var _onZoneKeyUp: js.Any = js.native
    
    var _optionId: js.Any = js.native
    
    /** Get either props.placeholder (new name) or props.placeHolder (old name) */
    val _placeholder: js.Any = js.native
    
    /** Wrap item list in a FocusZone */
    var _renderFocusableList: js.Any = js.native
    
    var _renderHeader: js.Any = js.native
    
    var _renderOption: js.Any = js.native
    
    var _renderSeparator: js.Any = js.native
    
    var _requestAnimationFrame: js.Any = js.native
    
    val _scrollIdleDelay: js.Any = js.native
    
    var _scrollIdleTimeoutId: js.Any = js.native
    
    /**
      * We close the menu on key up only if ALL of the following are true:
      * - Most recent key down was alt or meta (command)
      * - The alt/meta key down was NOT followed by some other key (such as down/up arrow to
      *   expand/collapse the menu)
      * - We're not on a Mac (or iOS)
      *
      * This is because on Windows, pressing alt moves focus to the application menu bar or similar,
      * closing any open context menus. There is not a similar behavior on Macs.
      */
    var _shouldHandleKeyUp: js.Any = js.native
    
    var _shouldIgnoreMouseEvent: js.Any = js.native
    
    /**
      * Returns true if dropdown should set to open on focus.
      * Otherwise, isOpen state should be toggled on click
      */
    var _shouldOpenOnFocus: js.Any = js.native
    
    var _sizePosCache: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDropdownBase(prevProps: IDropdownProps, prevState: IDropdownState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDropdownBase(): Unit = js.native
    
    def setSelectedIndex(event: SyntheticEvent[EventTarget with HTMLDivElement, Event], index: Double): Unit = js.native
  }
  /* static members */
  object DropdownBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase.defaultProps")
    @js.native
    def defaultProps: Options = js.native
    @scala.inline
    def defaultProps_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState because var conflicts: responsiveMode. Inlined  */ @js.native
  trait IDropdownInternalProps extends IDropdownProps
  object IDropdownInternalProps {
    
    @scala.inline
    def apply(options: js.Array[IDropdownOption]): IDropdownInternalProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownInternalProps]
    }
  }
  
  @js.native
  trait IDropdownState extends StObject {
    
    var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.native
    
    /** Whether the root dropdown element has focus. */
    var hasFocus: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    var selectedIndices: js.Array[Double] = js.native
  }
  object IDropdownState {
    
    @scala.inline
    def apply(hasFocus: Boolean, isOpen: Boolean, selectedIndices: js.Array[Double]): IDropdownState = {
      val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectedIndices = selectedIndices.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownState]
    }
    
    @scala.inline
    implicit class IDropdownStateMutableBuilder[Self <: IDropdownState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalloutRenderEdge(value: RectangleEdge): Self = StObject.set(x, "calloutRenderEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutRenderEdgeUndefined: Self = StObject.set(x, "calloutRenderEdge", js.undefined)
      
      @scala.inline
      def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndices(value: js.Array[Double]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndicesVarargs(value: Double*): Self = StObject.set(x, "selectedIndices", js.Array(value :_*))
    }
  }
}
