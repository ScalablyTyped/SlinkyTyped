package typingsSlinky.ffmpegJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mount extends js.Object {
  var mountpoint: String = js.native
  var opts: Opts = js.native
  var `type`: String = js.native
}

object Mount {
  @scala.inline
  def apply(mountpoint: String, opts: Opts, `type`: String): Mount = {
    val __obj = js.Dynamic.literal(mountpoint = mountpoint.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mount]
  }
  @scala.inline
  implicit class MountOps[Self <: Mount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMountpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: Opts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

