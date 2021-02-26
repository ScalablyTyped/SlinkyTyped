package typingsSlinky.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarMod {
  
  @JSImport("react-bootstrap/lib/Navbar", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[NavbarProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Navbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Brand")
  @js.native
  class Brand ()
    extends typingsSlinky.reactBootstrap.navbarBrandMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Brand")
  @js.native
  def Brand: Instantiable0[typingsSlinky.reactBootstrap.navbarBrandMod.^] = js.native
  @scala.inline
  def Brand_=(x: Instantiable0[typingsSlinky.reactBootstrap.navbarBrandMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brand")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Collapse")
  @js.native
  class Collapse ()
    extends typingsSlinky.reactBootstrap.navbarCollapseMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Collapse")
  @js.native
  def Collapse: Instantiable0[typingsSlinky.reactBootstrap.navbarCollapseMod.^] = js.native
  @scala.inline
  def Collapse_=(x: Instantiable0[typingsSlinky.reactBootstrap.navbarCollapseMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collapse")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Form")
  @js.native
  class Form ()
    extends Component[NavbarFormProps, js.Object, js.Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Form")
  @js.native
  def Form: Instantiable0[NavbarForm] = js.native
  @scala.inline
  def Form_=(x: Instantiable0[NavbarForm]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Header")
  @js.native
  class Header ()
    extends typingsSlinky.reactBootstrap.navbarHeaderMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Header")
  @js.native
  def Header: Instantiable0[typingsSlinky.reactBootstrap.navbarHeaderMod.^] = js.native
  @scala.inline
  def Header_=(x: Instantiable0[typingsSlinky.reactBootstrap.navbarHeaderMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Link")
  @js.native
  class Link ()
    extends Component[NavbarLinkProps, js.Object, js.Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Link")
  @js.native
  def Link: Instantiable0[NavbarLink] = js.native
  @scala.inline
  def Link_=(x: Instantiable0[NavbarLink]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Text")
  @js.native
  class Text ()
    extends Component[NavbarTextProps, js.Object, js.Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Text")
  @js.native
  def Text: Instantiable0[NavbarText] = js.native
  @scala.inline
  def Text_=(x: Instantiable0[NavbarText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Toggle")
  @js.native
  class Toggle ()
    extends typingsSlinky.reactBootstrap.navbarToggleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Toggle")
  @js.native
  def Toggle: Instantiable0[typingsSlinky.reactBootstrap.navbarToggleMod.^] = js.native
  @scala.inline
  def Toggle_=(x: Instantiable0[typingsSlinky.reactBootstrap.navbarToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Navbar
    extends Component[NavbarProps, js.Object, js.Any]
  
  @js.native
  trait NavbarForm
    extends Component[NavbarFormProps, js.Object, js.Any]
  
  @js.native
  trait NavbarFormProps extends HTMLProps[NavbarForm] {
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
    
    var pullLeft: js.UndefOr[Boolean] = js.native
    
    var pullRight: js.UndefOr[Boolean] = js.native
  }
  object NavbarFormProps {
    
    @scala.inline
    def apply(): NavbarFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarFormProps]
    }
    
    @scala.inline
    implicit class NavbarFormPropsMutableBuilder[Self <: NavbarFormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setPullLeft(value: Boolean): Self = StObject.set(x, "pullLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullLeftUndefined: Self = StObject.set(x, "pullLeft", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
  
  @js.native
  trait NavbarLink
    extends Component[NavbarLinkProps, js.Object, js.Any]
  
  /**
    * the classes below aren't present in lib/
    */
  @js.native
  trait NavbarLinkProps extends HTMLProps[NavbarLink] {
    
    @JSName("href")
    var href_NavbarLinkProps: String = js.native
    
    @JSName("onClick")
    var onClick_NavbarLinkProps: js.UndefOr[MouseEventHandler[_]] = js.native
  }
  object NavbarLinkProps {
    
    @scala.inline
    def apply(href: String): NavbarLinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavbarLinkProps]
    }
    
    @scala.inline
    implicit class NavbarLinkPropsMutableBuilder[Self <: NavbarLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[_] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  @js.native
  trait NavbarProps extends HTMLProps[Navbar] {
    
    var brand: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var bsStyle: js.UndefOr[String] = js.native
    
    var collapseOnSelect: js.UndefOr[Boolean] = js.native
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
    
    var defaultNavExpanded: js.UndefOr[Boolean] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var fixedBottom: js.UndefOr[Boolean] = js.native
    
    var fixedTop: js.UndefOr[Boolean] = js.native
    
    var fluid: js.UndefOr[Boolean] = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var onToggle: js.UndefOr[js.Function] = js.native
    
    var staticTop: js.UndefOr[Boolean] = js.native
    
    var toggleButton: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var toggleNavKey: js.UndefOr[String | Double] = js.native
  }
  object NavbarProps {
    
    @scala.inline
    def apply(): NavbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarProps]
    }
    
    @scala.inline
    implicit class NavbarPropsMutableBuilder[Self <: NavbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrand(value: js.Any): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setCollapseOnSelect(value: Boolean): Self = StObject.set(x, "collapseOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnSelectUndefined: Self = StObject.set(x, "collapseOnSelect", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setDefaultNavExpanded(value: Boolean): Self = StObject.set(x, "defaultNavExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNavExpandedUndefined: Self = StObject.set(x, "defaultNavExpanded", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setFixedBottom(value: Boolean): Self = StObject.set(x, "fixedBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedBottomUndefined: Self = StObject.set(x, "fixedBottom", js.undefined)
      
      @scala.inline
      def setFixedTop(value: Boolean): Self = StObject.set(x, "fixedTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedTopUndefined: Self = StObject.set(x, "fixedTop", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setOnToggle(value: js.Function): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setStaticTop(value: Boolean): Self = StObject.set(x, "staticTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticTopUndefined: Self = StObject.set(x, "staticTop", js.undefined)
      
      @scala.inline
      def setToggleButton(value: js.Any): Self = StObject.set(x, "toggleButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleButtonUndefined: Self = StObject.set(x, "toggleButton", js.undefined)
      
      @scala.inline
      def setToggleNavKey(value: String | Double): Self = StObject.set(x, "toggleNavKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleNavKeyUndefined: Self = StObject.set(x, "toggleNavKey", js.undefined)
    }
  }
  
  @js.native
  trait NavbarText
    extends Component[NavbarTextProps, js.Object, js.Any]
  
  @js.native
  trait NavbarTextProps extends HTMLProps[NavbarText] {
    
    var pullRight: js.UndefOr[Boolean] = js.native
  }
  object NavbarTextProps {
    
    @scala.inline
    def apply(): NavbarTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarTextProps]
    }
    
    @scala.inline
    implicit class NavbarTextPropsMutableBuilder[Self <: NavbarTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
}
