package typingsSlinky.calidation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.calidation.calidationMod.Dictionary
import typingsSlinky.calidation.calidationMod.SimpleValidatorConfig
import typingsSlinky.calidation.calidationMod.ValidatorsProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ValidatorsProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.calidation.calidationMod.ValidatorsProvider] {
  @JSImport("calidation", "ValidatorsProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    validators: Dictionary[
      js.Function1[/* config */ SimpleValidatorConfig, js.Function1[/* value */ _, String | Null]]
    ],
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.calidation.calidationMod.ValidatorsProvider] = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ValidatorsProviderProps
}

