package typingsSlinky.reactStripeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.stripeV3.stripe.elements.ElementsCreateOptions
import typingsSlinky.stripeV3.stripe.elements.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Elements
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactStripeElements.mod.Elements] {
  @JSImport("react-stripe-elements", "Elements")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(fonts: js.Array[Font] = null, locale: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.Elements] = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.Elements] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactStripeElements.mod.Elements](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ElementsCreateOptions
}

