package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.reactstrap.reactstrapStrings.append
import typingsSlinky.reactstrap.reactstrapStrings.prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("reactstrap/lib/Dropdown", JSImport.Default)
  @js.native
  class default ()
    extends Component[DropdownProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactstrap.reactstrapStrings.up
    - typingsSlinky.reactstrap.reactstrapStrings.down
    - typingsSlinky.reactstrap.reactstrapStrings.left
    - typingsSlinky.reactstrap.reactstrapStrings.right
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def down: typingsSlinky.reactstrap.reactstrapStrings.down = "down".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.down]
    
    @scala.inline
    def left: typingsSlinky.reactstrap.reactstrapStrings.left = "left".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reactstrap.reactstrapStrings.right = "right".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.right]
    
    @scala.inline
    def up: typingsSlinky.reactstrap.reactstrapStrings.up = "up".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.up]
  }
  
  type Dropdown = ReactComponentClass[DropdownProps]
  
  @js.native
  trait DropdownProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var a11y: js.UndefOr[Boolean] = js.native
    
    var active: js.UndefOr[Boolean] = js.native
    
    var addonType: js.UndefOr[Boolean | prepend | append] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var group: js.UndefOr[Boolean] = js.native
    
    var inNavbar: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var nav: js.UndefOr[Boolean] = js.native
    
    var setActiveFromChild: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
    
    var toggle: js.UndefOr[KeyboardEventHandler[_] | MouseEventHandler[_]] = js.native
  }
  object DropdownProps {
    
    @scala.inline
    def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
    
    @scala.inline
    implicit class DropdownPropsMutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11y(value: Boolean): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAddonType(value: Boolean | prepend | append): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonTypeUndefined: Self = StObject.set(x, "addonType", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setInNavbar(value: Boolean): Self = StObject.set(x, "inNavbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInNavbarUndefined: Self = StObject.set(x, "inNavbar", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      @scala.inline
      def setSetActiveFromChild(value: Boolean): Self = StObject.set(x, "setActiveFromChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetActiveFromChildUndefined: Self = StObject.set(x, "setActiveFromChild", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTag(value: ReactElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setToggle(value: SyntheticKeyboardEvent[_] | SyntheticMouseEvent[_] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  @js.native
  trait UncontrolledDropdownProps extends DropdownProps {
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var onToggle: js.UndefOr[
        js.Function2[
          /* event */ SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element], 
          /* isOpen */ Boolean, 
          Unit
        ]
      ] = js.native
  }
  object UncontrolledDropdownProps {
    
    @scala.inline
    def apply(): UncontrolledDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncontrolledDropdownProps]
    }
    
    @scala.inline
    implicit class UncontrolledDropdownPropsMutableBuilder[Self <: UncontrolledDropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setOnToggle(
        value: (/* event */ SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element], /* isOpen */ Boolean) => Unit
      ): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    }
  }
}
