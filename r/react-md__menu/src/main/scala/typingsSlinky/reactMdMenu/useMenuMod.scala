package typingsSlinky.reactMdMenu

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactMdMenu.reactMdMenuStrings.first
import typingsSlinky.reactMdMenu.reactMdMenuStrings.last
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMenuMod {
  
  @JSImport("@react-md/menu/types/useMenu", "useMenu")
  @js.native
  def useMenu(
    hasRefVisibleControlIdHorizontalOnClickOnKeyDownPortalledDefaultFocusOnRequestCloseDisableControlClickOkay: MenuOptions
  ): ReturnValue = js.native
  
  @js.native
  trait MenuOptions extends StObject {
    
    /**
      * The id of the element that controls the menu's visibility. This is required
      * so that the menu won't be closed when the control element is clicked since
      * it'll have it's own toggle functionality built-in already.
      */
    var controlId: String = js.native
    
    /**
      * The default focusable element within the menu.
      */
    var defaultFocus: first | last | String = js.native
    
    /**
      * Boolean if the close on outside click logic should consider the control
      * element within the menu and not call the `onRequestClose` function when it
      * is been clicked. This should be enabled when creating a context menu but
      * normally should remain `false` otherwise since the control element has it's
      * own toggle logic that conflicts with this close click.
      */
    var disableControlClickOkay: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the menu is oriented horizontally instead of vertically.  This
      * will update the keydown handlers to use the `ArrowLeft` and `ArrowRight`
      * keys instead of `ArrowUp` and `ArrrowDown` to navigate.
      */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional click handler to call when the `Menu` (or any child item) is
      * clicked. This will be merged with the default implementation to close the
      * menu once clicked.
      */
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    /**
      * An optional keydown handler to call when the `Menu` (or any child item)
      * triggers a keydown event. This will be merged witht he default logic of
      * allowing items to be focused with the arrow keys or closing when the escape
      * or tab key is pressed.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    /**
      * The function that should close the menu.
      */
    def onRequestClose(): Unit = js.native
    
    /**
      * Boolean if the menu has been portalled so that the tab keypress behavior
      * can be fixed since tab order is destroyed when portalling.
      */
    var portalled: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional ref to be merged into the menu's required ref handler.
      */
    var ref: js.UndefOr[Ref[HTMLDivElement | Null]] = js.native
    
    /**
      * Boolean if the menu is currently visible.
      */
    var visible: Boolean = js.native
  }
  object MenuOptions {
    
    @scala.inline
    def apply(
      controlId: String,
      defaultFocus: first | last | String,
      onRequestClose: () => Unit,
      visible: Boolean
    ): MenuOptions = {
      val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuOptions]
    }
    
    @scala.inline
    implicit class MenuOptionsMutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocus(value: first | last | String): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableControlClickOkay(value: Boolean): Self = StObject.set(x, "disableControlClickOkay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableControlClickOkayUndefined: Self = StObject.set(x, "disableControlClickOkay", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPortalled(value: Boolean): Self = StObject.set(x, "portalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalledUndefined: Self = StObject.set(x, "portalled", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLDivElement | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[HTMLDivElement | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'onClick' | 'onKeyDown'> */
  @js.native
  trait ReturnValue extends StObject {
    
    var menuRef: MutableRefObject[HTMLDivElement | Null] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    def ref(): Unit = js.native
    def ref(instance: HTMLDivElement): Unit = js.native
  }
}
