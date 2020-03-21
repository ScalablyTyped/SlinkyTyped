package typingsSlinky.reactRecaptcha.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactRecaptcha.mod.RecaptchaProps
import typingsSlinky.reactRecaptcha.mod.^
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.`inline`
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.audio
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.bottomleft
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.bottomright
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.compact
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.dark
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.explicit
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.image
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.invisible
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.light
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.normal
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.onload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactRecaptcha
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
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactRecaptcha.mod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RecaptchaProps
}

