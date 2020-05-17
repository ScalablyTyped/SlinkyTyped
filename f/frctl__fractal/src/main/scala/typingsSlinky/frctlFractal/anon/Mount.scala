package typingsSlinky.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mount extends js.Object {
  var mount: js.UndefOr[String] = js.native
}

object Mount {
  @scala.inline
  def apply(): Mount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mount]
  }
  @scala.inline
  implicit class MountOps[Self <: Mount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.undefined)
        ret
    }
  }
  
}

