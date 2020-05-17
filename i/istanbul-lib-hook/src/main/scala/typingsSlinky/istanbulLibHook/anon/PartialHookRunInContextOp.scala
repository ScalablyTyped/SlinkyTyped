package typingsSlinky.istanbulLibHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.HookRunInContextOptions> */
@js.native
trait PartialHookRunInContextOp extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialHookRunInContextOp {
  @scala.inline
  def apply(): PartialHookRunInContextOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHookRunInContextOp]
  }
  @scala.inline
  implicit class PartialHookRunInContextOpOps[Self <: PartialHookRunInContextOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

