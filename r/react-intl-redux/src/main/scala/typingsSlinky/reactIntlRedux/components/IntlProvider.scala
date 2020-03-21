package typingsSlinky.reactIntlRedux.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.intlMessageformatParser.mod.MessageFormatElement
import typingsSlinky.reactIntl.mod.CustomFormats
import typingsSlinky.reactIntl.mod.OptionalIntlConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IntlProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactIntlRedux.mod.IntlProvider] {
  @JSImport("react-intl-redux", "IntlProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    locale: String,
    defaultFormats: CustomFormats = null,
    defaultLocale: String = null,
    formats: CustomFormats = null,
    messages: Record[String, js.Array[MessageFormatElement] | String] = null,
    onError: /* err */ String => Unit = null,
    textComponent: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any = null,
    timeZone: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactIntlRedux.mod.IntlProvider] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (defaultFormats != null) __obj.updateDynamic("defaultFormats")(defaultFormats.asInstanceOf[js.Any])
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OptionalIntlConfig
}

