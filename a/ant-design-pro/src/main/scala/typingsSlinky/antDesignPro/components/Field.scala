package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.fieldMod.IFieldProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  @JSImport("ant-design-pro/lib/Charts", "Field")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.chartsMod.Field] {
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: ReactElement): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Field.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
