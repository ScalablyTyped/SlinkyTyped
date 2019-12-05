package typingsSlinky.reactDashGoogleDashRecaptcha.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashGoogleDashRecaptcha.reactDashGoogleDashRecaptchaMod.Badge
import typingsSlinky.reactDashGoogleDashRecaptcha.reactDashGoogleDashRecaptchaMod.ReCAPTCHAProps
import typingsSlinky.reactDashGoogleDashRecaptcha.reactDashGoogleDashRecaptchaMod.Size
import typingsSlinky.reactDashGoogleDashRecaptcha.reactDashGoogleDashRecaptchaMod.Theme
import typingsSlinky.reactDashGoogleDashRecaptcha.reactDashGoogleDashRecaptchaMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ReCAPTCHAProps_1175034233[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    sitekey: String,
    badge: Badge = null,
    grecaptcha: js.Object = null,
    hl: String = null,
    onErrored: () => Unit = null,
    onExpired: () => Unit = null,
    size: Size = null,
    stoken: String = null,
    tabindex: Int | Double = null,
    theme: Theme = null,
    `type`: Type = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (grecaptcha != null) __obj.updateDynamic("grecaptcha")(grecaptcha.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (onErrored != null) __obj.updateDynamic("onErrored")(js.Any.fromFunction0(onErrored))
    if (onExpired != null) __obj.updateDynamic("onExpired")(js.Any.fromFunction0(onExpired))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stoken != null) __obj.updateDynamic("stoken")(stoken.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReCAPTCHAProps
}

