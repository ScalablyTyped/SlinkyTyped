package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// LocaleService
// see http://docs.angularjs.org/api/ng.$locale
///////////////////////////////////////////////////////////////////////////
@js.native
trait ILocaleService extends js.Object {
  var DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor = js.native
  // These are not documented
  // Check angular's i18n files for exemples
  var NUMBER_FORMATS: ILocaleNumberFormatDescriptor = js.native
  var id: String = js.native
  def pluralCat(num: js.Any): String = js.native
}

object ILocaleService {
  @scala.inline
  def apply(
    DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor,
    NUMBER_FORMATS: ILocaleNumberFormatDescriptor,
    id: String,
    pluralCat: js.Any => String
  ): ILocaleService = {
    val __obj = js.Dynamic.literal(DATETIME_FORMATS = DATETIME_FORMATS.asInstanceOf[js.Any], NUMBER_FORMATS = NUMBER_FORMATS.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pluralCat = js.Any.fromFunction1(pluralCat))
    __obj.asInstanceOf[ILocaleService]
  }
  @scala.inline
  implicit class ILocaleServiceOps[Self <: ILocaleService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDATETIME_FORMATS(value: ILocaleDateTimeFormatDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_FORMATS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMBER_FORMATS(value: ILocaleNumberFormatDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_FORMATS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluralCat(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralCat")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

