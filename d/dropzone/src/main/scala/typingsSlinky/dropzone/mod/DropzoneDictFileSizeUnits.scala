package typingsSlinky.dropzone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneDictFileSizeUnits extends js.Object {
  var b: js.UndefOr[String] = js.native
  var gb: js.UndefOr[String] = js.native
  var kb: js.UndefOr[String] = js.native
  var mb: js.UndefOr[String] = js.native
  var tb: js.UndefOr[String] = js.native
}

object DropzoneDictFileSizeUnits {
  @scala.inline
  def apply(): DropzoneDictFileSizeUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneDictFileSizeUnits]
  }
  @scala.inline
  implicit class DropzoneDictFileSizeUnitsOps[Self <: DropzoneDictFileSizeUnits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(js.undefined)
        ret
    }
    @scala.inline
    def withGb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gb")(js.undefined)
        ret
    }
    @scala.inline
    def withKb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kb")(js.undefined)
        ret
    }
    @scala.inline
    def withMb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(js.undefined)
        ret
    }
    @scala.inline
    def withTb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tb")(js.undefined)
        ret
    }
  }
  
}

