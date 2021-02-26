package typingsSlinky.cathoQuantum

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.BreakpointsColors
import typingsSlinky.cathoQuantum.anon.`1`
import typingsSlinky.cathoQuantum.footerMod.Footer
import typingsSlinky.cathoQuantum.headerTextMod.HeaderText
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("@catho/quantum/Modal", JSImport.Default)
  @js.native
  class default ()
    extends Component[ModalProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Modal", "default.Content")
    @js.native
    def Content: ModalContent = js.native
    @scala.inline
    def Content_=(x: ModalContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Modal", "default.Footer")
    @js.native
    def Footer: typingsSlinky.cathoQuantum.footerMod.Footer = js.native
    @scala.inline
    def Footer_=(x: Footer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Modal", "default.Header")
    @js.native
    def Header: ModalHeader = js.native
    
    @JSImport("@catho/quantum/Modal", "default.HeaderText")
    @js.native
    def HeaderText: typingsSlinky.cathoQuantum.headerTextMod.HeaderText = js.native
    @scala.inline
    def HeaderText_=(x: HeaderText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Header_=(x: ModalHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  }
  
  type Modal = ReactComponentClass[ModalProps]
  
  type ModalContent = ReactComponentClass[StaticProps]
  
  type ModalHeader = ReactComponentClass[StaticProps]
  
  @js.native
  trait ModalProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
    
    var closeButtonAriaLabel: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[Element], Unit]] = js.native
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var theme: js.UndefOr[BreakpointsColors] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setTheme(value: BreakpointsColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait StaticProps extends StObject {
    
    var theme: js.UndefOr[`1`] = js.native
  }
  object StaticProps {
    
    @scala.inline
    def apply(): StaticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticProps]
    }
    
    @scala.inline
    implicit class StaticPropsMutableBuilder[Self <: StaticProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: `1`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
