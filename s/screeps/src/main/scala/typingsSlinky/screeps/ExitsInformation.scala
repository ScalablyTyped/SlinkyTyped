package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type SD<K extends ResourceConstant> = {
//   [P in K]: number;
//   energy: number;
// }
/* Inlined std.Partial<std.Record<screeps.ExitKey, string>> */
@js.native
trait ExitsInformation extends js.Object {
  var `1`: js.UndefOr[String] = js.native
  var `3`: js.UndefOr[String] = js.native
  var `5`: js.UndefOr[String] = js.native
  var `7`: js.UndefOr[String] = js.native
}

object ExitsInformation {
  @scala.inline
  def apply(): ExitsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExitsInformation]
  }
  @scala.inline
  implicit class ExitsInformationOps[Self <: ExitsInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(js.undefined)
        ret
    }
    @scala.inline
    def with3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(js.undefined)
        ret
    }
    @scala.inline
    def with5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(js.undefined)
        ret
    }
    @scala.inline
    def with7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("7")(js.undefined)
        ret
    }
  }
  
}

