package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsCaptchaCaptchaMod.CaptchaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Captcha
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.captchaMod.Captcha] {
  @JSImport("primereact/captcha", "Captcha")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id, tabIndex, type */
  def apply(
    language: String = null,
    onExpire: () => Unit = null,
    onResponse: /* response */ js.Any => Unit = null,
    siteKey: String = null,
    size: String = null,
    theme: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.captchaMod.Captcha] = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onExpire != null) __obj.updateDynamic("onExpire")(js.Any.fromFunction0(onExpire))
    if (onResponse != null) __obj.updateDynamic("onResponse")(js.Any.fromFunction1(onResponse))
    if (siteKey != null) __obj.updateDynamic("siteKey")(siteKey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.captchaMod.Captcha] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.captchaMod.Captcha](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CaptchaProps
}

