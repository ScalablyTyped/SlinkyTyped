package typingsSlinky.reactDashRecaptcha.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaMod.RecaptchaProps
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaMod.^
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.`inline`
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.audio
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.bottomleft
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.bottomright
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.compact
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.dark
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.explicit
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.image
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.invisible
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.light
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.normal
import typingsSlinky.reactDashRecaptcha.reactDashRecaptchaStrings.onload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashRecaptcha
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    badge: bottomright | bottomleft | `inline` = null,
    elementID: String = null,
    expiredCallback: () => _ = null,
    expiredCallbackName: String = null,
    hl: String = null,
    onloadCallback: () => _ = null,
    onloadCallbackName: String = null,
    render: onload | explicit = null,
    sitekey: String = null,
    size: normal | compact | invisible = null,
    tabindex: Double | String = null,
    theme: dark | light = null,
    `type`: audio | image = null,
    verifyCallback: /* response */ String => _ = null,
    verifyCallbackName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (elementID != null) __obj.updateDynamic("elementID")(elementID.asInstanceOf[js.Any])
    if (expiredCallback != null) __obj.updateDynamic("expiredCallback")(js.Any.fromFunction0(expiredCallback))
    if (expiredCallbackName != null) __obj.updateDynamic("expiredCallbackName")(expiredCallbackName.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (onloadCallback != null) __obj.updateDynamic("onloadCallback")(js.Any.fromFunction0(onloadCallback))
    if (onloadCallbackName != null) __obj.updateDynamic("onloadCallbackName")(onloadCallbackName.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (sitekey != null) __obj.updateDynamic("sitekey")(sitekey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verifyCallback != null) __obj.updateDynamic("verifyCallback")(js.Any.fromFunction1(verifyCallback))
    if (verifyCallbackName != null) __obj.updateDynamic("verifyCallbackName")(verifyCallbackName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RecaptchaProps
}

