package typingsSlinky.reactRecaptchaV3.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactRecaptchaV3.mod.ReCaptcha.ReCaptchaProps
import typingsSlinky.reactRecaptchaV3.mod.ReCaptcha_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReCaptcha
  extends ExternalComponentWithAttributesWithRefType[tag.type, ReCaptcha_] {
  @JSImport("react-recaptcha-v3", "ReCaptcha")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    action: String,
    sitekey: String,
    elementID: String = null,
    verifyCallback: /* response */ String => Unit = null,
    verifyCallbackName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ReCaptcha_] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
    if (elementID != null) __obj.updateDynamic("elementID")(elementID.asInstanceOf[js.Any])
    if (verifyCallback != null) __obj.updateDynamic("verifyCallback")(js.Any.fromFunction1(verifyCallback))
    if (verifyCallbackName != null) __obj.updateDynamic("verifyCallbackName")(verifyCallbackName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReCaptchaProps
}

