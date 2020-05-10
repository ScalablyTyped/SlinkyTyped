package typingsSlinky.calidation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.calidation.mod.Dictionary
import typingsSlinky.calidation.mod.SimpleValidatorConfig
import typingsSlinky.calidation.mod.ValidatorsProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ValidatorsProvider {
  @JSImport("calidation", "ValidatorsProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ValidatorsProviderProps): Default[tag.type, typingsSlinky.calidation.mod.ValidatorsProvider] = new Default[tag.type, typingsSlinky.calidation.mod.ValidatorsProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    validators: Dictionary[
      js.Function1[/* config */ SimpleValidatorConfig, js.Function1[/* value */ _, String | Null]]
    ]
  ): Default[tag.type, typingsSlinky.calidation.mod.ValidatorsProvider] = {
    val __props = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.calidation.mod.ValidatorsProvider](js.Array(this.component, __props.asInstanceOf[ValidatorsProviderProps]))
  }
}

