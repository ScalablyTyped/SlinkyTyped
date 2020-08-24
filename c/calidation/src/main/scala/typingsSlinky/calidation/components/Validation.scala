package typingsSlinky.calidation.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.calidation.mod.FieldsConfig
import typingsSlinky.calidation.mod.Transforms
import typingsSlinky.calidation.mod.ValidationContext
import typingsSlinky.calidation.mod.ValidationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Validation {
  @JSImport("calidation", "Validation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: js.Object */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.calidation.mod.Validation[T]] {
    @scala.inline
    def initialValues(value: T): this.type = set("initialValues", value.asInstanceOf[js.Any])
    @scala.inline
    def transforms(value: Transforms[T]): this.type = set("transforms", value.asInstanceOf[js.Any])
  }
  
  def withProps[/* <: js.Object */ T](p: ValidationProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: js.Object */ T](children: ValidationContext[T] => ReactElement, config: FieldsConfig[T]): Builder[T] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ValidationProps[T]]))
  }
}

