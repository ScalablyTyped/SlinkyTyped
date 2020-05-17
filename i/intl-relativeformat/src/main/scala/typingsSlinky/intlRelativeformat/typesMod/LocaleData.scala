package typingsSlinky.intlRelativeformat.typesMod

import typingsSlinky.intlRelativeformat.anon.finDATAFIELDdisplayNamest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleData extends js.Object {
  var fields: js.UndefOr[finDATAFIELDdisplayNamest] = js.native
  var locale: String = js.native
  var parentLocale: js.UndefOr[String] = js.native
}

object LocaleData {
  @scala.inline
  def apply(locale: String): LocaleData = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleData]
  }
  @scala.inline
  implicit class LocaleDataOps[Self <: LocaleData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: finDATAFIELDdisplayNamest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLocale")(js.undefined)
        ret
    }
  }
  
}

