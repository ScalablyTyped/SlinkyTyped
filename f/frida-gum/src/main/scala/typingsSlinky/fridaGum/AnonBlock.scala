package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlock extends js.Object {
  /**
    * Whether to generate an event whenever a basic block is executed.
    *
    * Useful to record a coarse execution trace.
    */
  var block: js.UndefOr[Boolean] = js.native
  /**
    * Whether to generate events for CALL/BLR instructions.
    */
  var call: js.UndefOr[Boolean] = js.native
  /**
    * Whether to generate an event whenever a basic block is compiled.
    *
    * Useful for coverage.
    */
  var compile: js.UndefOr[Boolean] = js.native
  /**
    * Whether to generate events for all instructions.
    *
    * Not recommended as it's potentially a lot of data.
    */
  var exec: js.UndefOr[Boolean] = js.native
  /**
    * Whether to generate events for RET instructions.
    */
  var ret: js.UndefOr[Boolean] = js.native
}

object AnonBlock {
  @scala.inline
  def apply(): AnonBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBlock]
  }
  @scala.inline
  implicit class AnonBlockOps[Self <: AnonBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withCall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.undefined)
        ret
    }
    @scala.inline
    def withCompile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.undefined)
        ret
    }
    @scala.inline
    def withExec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.undefined)
        ret
    }
    @scala.inline
    def withRet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ret")(js.undefined)
        ret
    }
  }
  
}

