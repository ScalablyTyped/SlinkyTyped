package typingsSlinky.calidation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.calidation.mod.Dictionary
import typingsSlinky.calidation.mod.FieldsConfig
import typingsSlinky.calidation.mod.Transforms
import typingsSlinky.calidation.mod.ValidationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Validation {
  @JSImport("calidation", "Validation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.calidation.mod.Validation] {
    @scala.inline
    def initialValues(value: Dictionary[_]): this.type = set("initialValues", value.asInstanceOf[js.Any])
    @scala.inline
    def transforms(value: Transforms): this.type = set("transforms", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ValidationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(config: FieldsConfig): Builder = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ValidationProps]))
  }
}

