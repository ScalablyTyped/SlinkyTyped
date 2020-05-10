package typingsSlinky.cwiseCompiler.mod

import typingsSlinky.cwiseParser.mod.CompiledRoutine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserArgs extends js.Object {
  var args: js.Array[ArgType] = js.native
  var blockSize: Double = js.native
  var body: CompiledRoutine = js.native
  var debug: Boolean = js.native
  var funcName: String = js.native
  var post: CompiledRoutine = js.native
  var pre: CompiledRoutine = js.native
  var printCode: js.UndefOr[Boolean] = js.native
}

object UserArgs {
  @scala.inline
  def apply(
    args: js.Array[ArgType],
    blockSize: Double,
    body: CompiledRoutine,
    debug: Boolean,
    funcName: String,
    post: CompiledRoutine,
    pre: CompiledRoutine
  ): UserArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], blockSize = blockSize.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserArgs]
  }
  @scala.inline
  implicit class UserArgsOps[Self <: UserArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[ArgType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: CompiledRoutine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFuncName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost(value: CompiledRoutine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPre(value: CompiledRoutine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printCode")(js.undefined)
        ret
    }
  }
  
}

