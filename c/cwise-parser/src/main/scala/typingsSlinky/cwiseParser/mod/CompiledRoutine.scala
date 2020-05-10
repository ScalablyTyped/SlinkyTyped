package typingsSlinky.cwiseParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompiledRoutine extends js.Object {
  var args: js.Array[CompiledArgument] = js.native
  var body: String = js.native
  var localVars: js.Array[String] = js.native
  var thisVars: js.Array[String] = js.native
}

object CompiledRoutine {
  @scala.inline
  def apply(
    args: js.Array[CompiledArgument],
    body: String,
    localVars: js.Array[String],
    thisVars: js.Array[String]
  ): CompiledRoutine = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], localVars = localVars.asInstanceOf[js.Any], thisVars = thisVars.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledRoutine]
  }
  @scala.inline
  implicit class CompiledRoutineOps[Self <: CompiledRoutine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[CompiledArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalVars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisVars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisVars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

