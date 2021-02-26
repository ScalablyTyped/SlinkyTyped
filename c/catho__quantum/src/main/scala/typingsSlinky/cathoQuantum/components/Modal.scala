package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.cathoQuantum.anon.BreakpointsColors
import typingsSlinky.cathoQuantum.anon.`2`
import typingsSlinky.cathoQuantum.modalMod.ModalProps
import typingsSlinky.cathoQuantum.modalMod.StaticProps
import typingsSlinky.cathoQuantum.modalMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  object Content {
    
    @JSImport("@catho/quantum/Modal", "default.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_StaticProps_997824317 = new SharedBuilder_StaticProps_997824317(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StaticProps): SharedBuilder_StaticProps_997824317 = new SharedBuilder_StaticProps_997824317(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("@catho/quantum/Modal", "default.Footer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Footer.type): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: `2`): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("@catho/quantum/Modal", "default.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_StaticProps_997824317 = new SharedBuilder_StaticProps_997824317(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StaticProps): SharedBuilder_StaticProps_997824317 = new SharedBuilder_StaticProps_997824317(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object HeaderText {
    
    @JSImport("@catho/quantum/Modal", "default.HeaderText")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: HeaderText.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/Modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* e */ SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: BreakpointsColors): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
