package typingsSlinky.humaneJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumaneMessageOptions extends js.Object {
  var addnCls: js.UndefOr[String] = js.native
  var clickToClose: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var waitForMove: js.UndefOr[Boolean] = js.native
}

object HumaneMessageOptions {
  @scala.inline
  def apply(): HumaneMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumaneMessageOptions]
  }
  @scala.inline
  implicit class HumaneMessageOptionsOps[Self <: HumaneMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddnCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addnCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddnCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addnCls")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToClose")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForMove")(js.undefined)
        ret
    }
  }
  
}

