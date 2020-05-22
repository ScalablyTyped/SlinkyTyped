package typingsSlinky.accedoAccedoOne.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@accedo/accedo-one.@accedo/accedo-one.AccedoEntryParams, 'preview' | 'at' | 'locale'> */
trait PickAccedoEntryParamsprev extends js.Object {
  var at: js.UndefOr[String | js.Date] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var preview: js.UndefOr[Boolean] = js.undefined
}

object PickAccedoEntryParamsprev {
  @scala.inline
  def apply(at: String | js.Date = null, locale: String = null, preview: js.UndefOr[Boolean] = js.undefined): PickAccedoEntryParamsprev = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAccedoEntryParamsprev]
  }
}

