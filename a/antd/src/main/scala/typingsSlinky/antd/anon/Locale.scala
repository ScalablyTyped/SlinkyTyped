package typingsSlinky.antd.anon

import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.generatePickerMod.PickerLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: js.UndefOr[PickerLocale] = js.undefined
  var size: js.UndefOr[large | default | small] = js.undefined
}

object Locale {
  @scala.inline
  def apply(locale: PickerLocale = null, size: large | default | small = null): Locale = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

