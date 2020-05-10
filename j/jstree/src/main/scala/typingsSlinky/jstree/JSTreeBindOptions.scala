package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeBindOptions extends js.Object {
  var args: js.UndefOr[js.Any] = js.native
  var inst: js.UndefOr[js.Any] = js.native
  var rlbk: js.UndefOr[js.Any] = js.native
  var rslt: js.UndefOr[js.Any] = js.native
}

object JSTreeBindOptions {
  @scala.inline
  def apply(): JSTreeBindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeBindOptions]
  }
  @scala.inline
  implicit class JSTreeBindOptionsOps[Self <: JSTreeBindOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Any): Self = {
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
    def withInst(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inst")(js.undefined)
        ret
    }
    @scala.inline
    def withRlbk(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rlbk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRlbk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rlbk")(js.undefined)
        ret
    }
    @scala.inline
    def withRslt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rslt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRslt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rslt")(js.undefined)
        ret
    }
  }
  
}

