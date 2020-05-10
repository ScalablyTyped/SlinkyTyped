package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkOptions extends js.Object {
  /** Pass the cell address in the cell
    */
  var cellAddress: js.UndefOr[String] = js.native
  /** Pass the text address in the cell
    */
  var text: js.UndefOr[String] = js.native
  /** Pass the web address in the cell
    */
  var webAddress: js.UndefOr[String] = js.native
}

object LinkOptions {
  @scala.inline
  def apply(): LinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkOptions]
  }
  @scala.inline
  implicit class LinkOptionsOps[Self <: LinkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withWebAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAddress")(js.undefined)
        ret
    }
  }
  
}

