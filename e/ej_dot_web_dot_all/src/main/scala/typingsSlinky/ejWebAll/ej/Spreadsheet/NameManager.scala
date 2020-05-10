package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameManager extends js.Object {
  /** Specifies the name for the cell or a range.
    */
  var name: js.UndefOr[String] = js.native
  /** Specifies the address for the cell or a range.
    */
  var refersto: js.UndefOr[String] = js.native
}

object NameManager {
  @scala.inline
  def apply(): NameManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameManager]
  }
  @scala.inline
  implicit class NameManagerOps[Self <: NameManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRefersto(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refersto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefersto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refersto")(js.undefined)
        ret
    }
  }
  
}

