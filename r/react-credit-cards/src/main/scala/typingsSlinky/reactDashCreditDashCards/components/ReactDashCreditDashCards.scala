package typingsSlinky.reactDashCreditDashCards.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCreditDashCards.Anon_Name
import typingsSlinky.reactDashCreditDashCards.Anon_Valid
import typingsSlinky.reactDashCreditDashCards.reactDashCreditDashCardsMod.CallbackArgument
import typingsSlinky.reactDashCreditDashCards.reactDashCreditDashCardsMod.Focused
import typingsSlinky.reactDashCreditDashCards.reactDashCreditDashCardsMod.ReactCreditCardProps
import typingsSlinky.reactDashCreditDashCards.reactDashCreditDashCardsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashCreditDashCards
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-credit-cards", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    cvc: String | Double,
    expiry: String | Double,
    name: String,
    number: String | Double,
    acceptedCards: js.Array[String] = null,
    callback: (/* type */ CallbackArgument, /* isValid */ Boolean) => Unit = null,
    focused: Focused = null,
    issuer: String = null,
    locale: Anon_Valid = null,
    placeholders: Anon_Name = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (acceptedCards != null) __obj.updateDynamic("acceptedCards")(acceptedCards.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactCreditCardProps
}

