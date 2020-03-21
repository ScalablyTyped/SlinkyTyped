package typingsSlinky.reactStripeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typingsSlinky.stripeV3.stripe.Stripe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StripeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactStripeElements.mod.StripeProvider] {
  @JSImport("react-stripe-elements", "StripeProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apiKeystringstripeneverSt(apiKey: String, stripeAccount: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.StripeProvider] = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apiKeyneverstripeStripenu(stripe: Stripe = null, stripeAccount: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.StripeProvider] = {
    val __obj = js.Dynamic.literal()
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.StripeProvider] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactStripeElements.mod.StripeProvider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StripeProviderProps
}

