package typingsSlinky.reactIntl.mod

import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlCache extends js.Object {
  var dateTime: Record[String, DateTimeFormat] = js.native
  var displayNames: Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames */ _
  ] = js.native
  var list: Record[String, default] = js.native
  var message: Record[String, typingsSlinky.intlMessageformat.mod.default] = js.native
  var number: Record[String, NumberFormat] = js.native
  var pluralRules: Record[String, PluralRules] = js.native
  var relativeTime: Record[String, typingsSlinky.formatjsIntlRelativetimeformat.mod.default] = js.native
}

object IntlCache {
  @scala.inline
  def apply(
    dateTime: Record[String, DateTimeFormat],
    displayNames: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames */ _
    ],
    list: Record[String, default],
    message: Record[String, typingsSlinky.intlMessageformat.mod.default],
    number: Record[String, NumberFormat],
    pluralRules: Record[String, PluralRules],
    relativeTime: Record[String, typingsSlinky.formatjsIntlRelativetimeformat.mod.default]
  ): IntlCache = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlCache]
  }
  @scala.inline
  implicit class IntlCacheOps[Self <: IntlCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTime(value: Record[String, DateTimeFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayNames(
      value: Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: Record[String, default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: Record[String, typingsSlinky.intlMessageformat.mod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Record[String, NumberFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluralRules(value: Record[String, PluralRules]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeTime(value: Record[String, typingsSlinky.formatjsIntlRelativetimeformat.mod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

