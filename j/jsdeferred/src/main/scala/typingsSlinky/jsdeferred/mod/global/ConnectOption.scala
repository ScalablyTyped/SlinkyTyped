package typingsSlinky.jsdeferred.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOption extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.native
  var ng: js.UndefOr[Double] = js.native
  var ok: js.UndefOr[Double] = js.native
  var target: js.Any = js.native
}

object ConnectOption {
  @scala.inline
  def apply(target: js.Any): ConnectOption = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOption]
  }
  @scala.inline
  implicit class ConnectOptionOps[Self <: ConnectOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withNg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ng")(js.undefined)
        ret
    }
    @scala.inline
    def withOk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(js.undefined)
        ret
    }
  }
  
}

