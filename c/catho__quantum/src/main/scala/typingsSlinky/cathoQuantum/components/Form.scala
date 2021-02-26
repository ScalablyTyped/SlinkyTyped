package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.Valid
import typingsSlinky.cathoQuantum.formMod.FormProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Form {
  
  @JSImport("@catho/quantum/Form", "Form")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.formMod.Form] {
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSubmit(value: /* hasValid */ js.UndefOr[Valid] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValidSubmit(value: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit): this.type = set("onValidSubmit", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Form.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
