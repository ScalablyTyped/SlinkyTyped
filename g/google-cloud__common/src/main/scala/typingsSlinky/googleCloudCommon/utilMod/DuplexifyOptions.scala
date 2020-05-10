package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplexifyOptions extends DuplexOptions {
  var end: js.UndefOr[Boolean] = js.native
}

object DuplexifyOptions {
  @scala.inline
  def apply(): DuplexifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplexifyOptions]
  }
  @scala.inline
  implicit class DuplexifyOptionsOps[Self <: DuplexifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
  }
  
}

