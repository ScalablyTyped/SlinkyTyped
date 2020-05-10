package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.PipelineBareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineBareFunction_
  extends BaseNode
     with _Node {
  var callee: Expression = js.native
  @JSName("type")
  var type_PipelineBareFunction_ : PipelineBareFunction = js.native
}

object PipelineBareFunction_ {
  @scala.inline
  def apply(callee: Expression, `type`: PipelineBareFunction): PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineBareFunction_]
  }
  @scala.inline
  implicit class PipelineBareFunction_Ops[Self <: PipelineBareFunction_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallee(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PipelineBareFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

