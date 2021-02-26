package typingsSlinky.calidation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.calidation.mod.CustomValidatorFunction
import typingsSlinky.calidation.mod.ValidatorsProviderProps
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValidatorsProvider {
  
  @scala.inline
  def apply[T /* <: js.Object */](validators: Record[String, CustomValidatorFunction[T]]): Builder[T] = {
    val __props = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ValidatorsProviderProps[T]]))
  }
  
  @JSImport("calidation", "ValidatorsProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: js.Object */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.calidation.mod.ValidatorsProvider[T]]
  
  def withProps[T /* <: js.Object */](p: ValidatorsProviderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
