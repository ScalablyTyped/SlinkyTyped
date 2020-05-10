package typingsSlinky.cwiseCompiler.mod

import typingsSlinky.cwiseParser.mod.CompiledRoutine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Procedure extends js.Object {
  var argTypes: js.Array[ArgType] = js.native
  var arrayArgs: js.Array[Double] = js.native
  var arrayBlockIndices: js.Array[Double] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  var body: CompiledRoutine = js.native
  var debug: Boolean = js.native
  var funcName: String = js.native
  var indexArgs: js.Array[Double] = js.native
  var offsetArgIndex: js.Array[Double] = js.native
  var offsetArgs: js.Array[OffsetArg] = js.native
  var post: CompiledRoutine = js.native
  var pre: CompiledRoutine = js.native
  var scalarArgs: js.Array[Double] = js.native
  var shapeArgs: js.Array[Double] = js.native
  var shimArgs: js.Array[String] = js.native
}

object Procedure {
  @scala.inline
  def apply(
    argTypes: js.Array[ArgType],
    arrayArgs: js.Array[Double],
    arrayBlockIndices: js.Array[Double],
    body: CompiledRoutine,
    debug: Boolean,
    funcName: String,
    indexArgs: js.Array[Double],
    offsetArgIndex: js.Array[Double],
    offsetArgs: js.Array[OffsetArg],
    post: CompiledRoutine,
    pre: CompiledRoutine,
    scalarArgs: js.Array[Double],
    shapeArgs: js.Array[Double],
    shimArgs: js.Array[String]
  ): Procedure = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], arrayArgs = arrayArgs.asInstanceOf[js.Any], arrayBlockIndices = arrayBlockIndices.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], indexArgs = indexArgs.asInstanceOf[js.Any], offsetArgIndex = offsetArgIndex.asInstanceOf[js.Any], offsetArgs = offsetArgs.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], scalarArgs = scalarArgs.asInstanceOf[js.Any], shapeArgs = shapeArgs.asInstanceOf[js.Any], shimArgs = shimArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  @scala.inline
  implicit class ProcedureOps[Self <: Procedure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgTypes(value: js.Array[ArgType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayArgs(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayBlockIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBlockIndices")(value.asInstanceOf[js.Any])
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
    def withIndexArgs(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetArgIndex(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetArgIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetArgs(value: js.Array[OffsetArg]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetArgs")(value.asInstanceOf[js.Any])
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
    def withScalarArgs(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalarArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeArgs(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShimArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(js.undefined)
        ret
    }
  }
  
}

