package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanoramaInfo extends js.Object {
  /** The capture date of the streetside scene. */
  var cd: js.UndefOr[String] = js.native
}

object IPanoramaInfo {
  @scala.inline
  def apply(): IPanoramaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanoramaInfo]
  }
  @scala.inline
  implicit class IPanoramaInfoOps[Self <: IPanoramaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cd")(js.undefined)
        ret
    }
  }
  
}

