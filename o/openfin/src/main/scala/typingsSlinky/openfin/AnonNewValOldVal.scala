package typingsSlinky.openfin

import typingsSlinky.openfin.downloadPreloadMod.DownloadPreloadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewValOldVal extends js.Object {
  var newVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
  var oldVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
}

object AnonNewValOldVal {
  @scala.inline
  def apply(): AnonNewValOldVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNewValOldVal]
  }
  @scala.inline
  implicit class AnonNewValOldValOps[Self <: AnonNewValOldVal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewVal(value: js.Array[DownloadPreloadOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVal")(js.undefined)
        ret
    }
    @scala.inline
    def withOldVal(value: js.Array[DownloadPreloadOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldVal")(js.undefined)
        ret
    }
  }
  
}

