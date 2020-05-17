package typingsSlinky.gapiClientAdsensehost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Family extends js.Object {
  /** The family of the font. Possible values are: ACCOUNT_DEFAULT_FAMILY, ADSENSE_DEFAULT_FAMILY, ARIAL, TIMES and VERDANA. */
  var family: js.UndefOr[String] = js.native
  /** The size of the font. Possible values are: ACCOUNT_DEFAULT_SIZE, ADSENSE_DEFAULT_SIZE, SMALL, MEDIUM and LARGE. */
  var size: js.UndefOr[String] = js.native
}

object Family {
  @scala.inline
  def apply(): Family = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Family]
  }
  @scala.inline
  implicit class FamilyOps[Self <: Family] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

