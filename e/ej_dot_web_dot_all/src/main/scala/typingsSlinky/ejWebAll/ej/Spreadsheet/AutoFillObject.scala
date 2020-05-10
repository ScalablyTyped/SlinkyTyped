package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFillObject extends js.Object {
  /** Pass the data range to autofill
    */
  var dataRange: js.UndefOr[String] = js.native
  /** Pass the direction to autofill
    */
  var direction: js.UndefOr[String] = js.native
  /** Pass the fill range to autofill
    */
  var fillRange: js.UndefOr[String] = js.native
  /** Pass the fill type to perform autofill in spreadsheet
    */
  var fillType: js.UndefOr[String] = js.native
}

object AutoFillObject {
  @scala.inline
  def apply(): AutoFillObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFillObject]
  }
  @scala.inline
  implicit class AutoFillObjectOps[Self <: AutoFillObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withFillRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRange")(js.undefined)
        ret
    }
    @scala.inline
    def withFillType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillType")(js.undefined)
        ret
    }
  }
  
}

