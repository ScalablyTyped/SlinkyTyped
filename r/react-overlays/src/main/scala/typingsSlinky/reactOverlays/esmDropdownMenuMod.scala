package typingsSlinky.reactOverlays

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.reactOverlays.anon.Arialabelledby
import typingsSlinky.reactOverlays.anon.OmitUsePopperOptionsenabl
import typingsSlinky.reactOverlays.anon.Popper
import typingsSlinky.reactOverlays.anon.Ref
import typingsSlinky.reactOverlays.esmUsePopperMod.Offset
import typingsSlinky.reactOverlays.esmUsePopperMod.OffsetValue
import typingsSlinky.reactOverlays.esmUseRootCloseMod.MouseEvents
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDropdownMenuMod {
  
  object default {
    
    /**
      * Also exported as `<Dropdown.Menu>` from `Dropdown`.
      *
      * @displayName DropdownMenu
      * @memberOf Dropdown
      */
    @JSImport("react-overlays/esm/DropdownMenu", JSImport.Default)
    @js.native
    def apply(hasChildrenOptions: DropdownMenuProps): ReactElement = js.native
    @JSImport("react-overlays/esm/DropdownMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("react-overlays/esm/DropdownMenu", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-overlays/esm/DropdownMenu", "default.defaultProps.usePopper")
      @js.native
      def usePopper: Boolean = js.native
      @scala.inline
      def usePopper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("react-overlays/esm/DropdownMenu", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Aligns the dropdown menu to the 'end' of it's placement position.
        * Generally this is provided by the parent `Dropdown` component,
        * but may also be specified as a prop directly.
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.alignEnd")
      @js.native
      def alignEnd: Requireable[Boolean] = js.native
      @scala.inline
      def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
      
      /**
        * A render prop that returns a Menu element. The `props`
        * argument should spread through to **a component that can accept a ref**.
        *
        * @type {Function ({
        *   show: boolean,
        *   alignEnd: boolean,
        *   close: (?SyntheticEvent) => void,
        *   placement: Placement,
        *   update: () => void,
        *   forceUpdate: () => void,
        *   props: {
        *     ref: (?HTMLElement) => void,
        *     style: { [string]: string | number },
        *     aria-labelledby: ?string
        *   },
        *   arrowProps: {
        *     ref: (?HTMLElement) => void,
        *     style: { [string]: string | number },
        *   },
        * }) => React.Element}
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.children")
      @js.native
      def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /**
        * Enables the Popper.js `flip` modifier, allowing the Dropdown to
        * automatically adjust it's placement in case of overlap with the viewport or toggle.
        * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.flip")
      @js.native
      def flip: Requireable[Boolean] = js.native
      @scala.inline
      def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
      
      /**
        * A set of popper options and props passed directly to react-popper's Popper component.
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.popperConfig")
      @js.native
      def popperConfig: Requireable[js.Object] = js.native
      @scala.inline
      def popperConfig_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      /**
        * Override the default event used by RootCloseWrapper.
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.rootCloseEvent")
      @js.native
      def rootCloseEvent: Requireable[String] = js.native
      @scala.inline
      def rootCloseEvent_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the visible state of the menu, generally this is
        * provided by the parent `Dropdown` component,
        * but may also be specified as a prop directly.
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.show")
      @js.native
      def show: Requireable[Boolean] = js.native
      @scala.inline
      def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
      
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.usePopper")
      @js.native
      def usePopper: Requireable[Boolean] = js.native
      @scala.inline
      def usePopper_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-overlays/esm/DropdownMenu", "useDropdownMenu")
  @js.native
  def useDropdownMenu(): UseDropdownMenuValue = js.native
  @JSImport("react-overlays/esm/DropdownMenu", "useDropdownMenu")
  @js.native
  def useDropdownMenu(options: UseDropdownMenuOptions): UseDropdownMenuValue = js.native
  
  @js.native
  trait DropdownMenuProps extends UseDropdownMenuOptions {
    
    def children(args: UseDropdownMenuValue): ReactElement = js.native
  }
  object DropdownMenuProps {
    
    @scala.inline
    def apply(children: UseDropdownMenuValue => ReactElement): DropdownMenuProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    @scala.inline
    implicit class DropdownMenuPropsMutableBuilder[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: UseDropdownMenuValue => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UseDropdownMenuOptions extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Offset] = js.native
    
    var popperConfig: js.UndefOr[OmitUsePopperOptionsenabl] = js.native
    
    var rootCloseEvent: js.UndefOr[MouseEvents] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var usePopper: js.UndefOr[Boolean] = js.native
  }
  object UseDropdownMenuOptions {
    
    @scala.inline
    def apply(): UseDropdownMenuOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseDropdownMenuOptions]
    }
    
    @scala.inline
    implicit class UseDropdownMenuOptionsMutableBuilder[Self <: UseDropdownMenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignEnd(value: Boolean): Self = StObject.set(x, "alignEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignEndUndefined: Self = StObject.set(x, "alignEnd", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction1(value: /* details */ Popper => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPopperConfig(value: OmitUsePopperOptionsenabl): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      @scala.inline
      def setRootCloseEvent(value: MouseEvents): Self = StObject.set(x, "rootCloseEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCloseEventUndefined: Self = StObject.set(x, "rootCloseEvent", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setUsePopper(value: Boolean): Self = StObject.set(x, "usePopper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePopperUndefined: Self = StObject.set(x, "usePopper", js.undefined)
    }
  }
  
  @js.native
  trait UseDropdownMenuValue extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.native
    
    var arrowProps: (Record[String, _]) with Ref = js.native
    
    def close(e: Event): Unit = js.native
    
    def forceUpdate(): Unit = js.native
    
    var hasShown: Boolean = js.native
    
    var props: (Record[String, _]) with Arialabelledby = js.native
    
    var show: Boolean = js.native
    
    def update(): Unit = js.native
  }
  object UseDropdownMenuValue {
    
    @scala.inline
    def apply(
      arrowProps: (Record[String, _]) with Ref,
      close: Event => Unit,
      forceUpdate: () => Unit,
      hasShown: Boolean,
      props: (Record[String, _]) with Arialabelledby,
      show: Boolean,
      update: () => Unit
    ): UseDropdownMenuValue = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], close = js.Any.fromFunction1(close), forceUpdate = js.Any.fromFunction0(forceUpdate), hasShown = hasShown.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[UseDropdownMenuValue]
    }
    
    @scala.inline
    implicit class UseDropdownMenuValueMutableBuilder[Self <: UseDropdownMenuValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignEnd(value: Boolean): Self = StObject.set(x, "alignEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignEndUndefined: Self = StObject.set(x, "alignEnd", js.undefined)
      
      @scala.inline
      def setArrowProps(value: (Record[String, _]) with Ref): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: Event => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasShown(value: Boolean): Self = StObject.set(x, "hasShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: (Record[String, _]) with Arialabelledby): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
