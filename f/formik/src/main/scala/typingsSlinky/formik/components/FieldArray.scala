package typingsSlinky.formik.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formik.fieldArrayMod.FieldArrayConfig
import typingsSlinky.formik.fieldArrayMod.FieldArrayRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldArray {
  
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FieldArrayConfig]))
  }
  
  @JSImport("formik", "FieldArray")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: /* props */ FieldArrayRenderProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def component(value: String | (ReactComponentClass[FieldArrayRenderProps | Unit])): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[FieldArrayRenderProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[FieldArrayRenderProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: /* props */ FieldArrayRenderProps => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def validateOnChange(value: Boolean): this.type = set("validateOnChange", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FieldArrayConfig): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
