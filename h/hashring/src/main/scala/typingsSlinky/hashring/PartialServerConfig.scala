package typingsSlinky.hashring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hashring.hashring.ServerConfig> */
@js.native
trait PartialServerConfig extends js.Object {
  var vnodes: js.UndefOr[Double] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object PartialServerConfig {
  @scala.inline
  def apply(): PartialServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerConfig]
  }
  @scala.inline
  implicit class PartialServerConfigOps[Self <: PartialServerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVnodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVnodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnodes")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

