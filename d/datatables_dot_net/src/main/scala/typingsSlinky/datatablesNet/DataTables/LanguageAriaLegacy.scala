package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageAriaLegacy extends js.Object {
  var sSortAscending: js.UndefOr[String] = js.native
  var sSortDescending: js.UndefOr[String] = js.native
}

object LanguageAriaLegacy {
  @scala.inline
  def apply(): LanguageAriaLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageAriaLegacy]
  }
  @scala.inline
  implicit class LanguageAriaLegacyOps[Self <: LanguageAriaLegacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSSortAscending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortAscending")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortDescending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortDescending")(js.undefined)
        ret
    }
  }
  
}

