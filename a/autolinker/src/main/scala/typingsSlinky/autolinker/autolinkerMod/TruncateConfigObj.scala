package typingsSlinky.autolinker.autolinkerMod

import typingsSlinky.autolinker.autolinkerStrings.end
import typingsSlinky.autolinker.autolinkerStrings.middle
import typingsSlinky.autolinker.autolinkerStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncateConfigObj extends TruncateConfig {
  var length: js.UndefOr[Double] = js.native
  var location: js.UndefOr[end | middle | smart] = js.native
}

object TruncateConfigObj {
  @scala.inline
  def apply(): TruncateConfigObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateConfigObj]
  }
  @scala.inline
  implicit class TruncateConfigObjOps[Self <: TruncateConfigObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: end | middle | smart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

