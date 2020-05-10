package typingsSlinky.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoopStatus extends js.Object {
  var idx: Double = js.native
  var isIf: js.UndefOr[Boolean] = js.native
  var loopOver: js.Array[VarValue] = js.native
  var refNode: Node = js.native
  var refNodeLevel: Double = js.native
  var varName: String = js.native
}

object LoopStatus {
  @scala.inline
  def apply(idx: Double, loopOver: js.Array[VarValue], refNode: Node, refNodeLevel: Double, varName: String): LoopStatus = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], loopOver = loopOver.asInstanceOf[js.Any], refNode = refNode.asInstanceOf[js.Any], refNodeLevel = refNodeLevel.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopStatus]
  }
  @scala.inline
  implicit class LoopStatusOps[Self <: LoopStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopOver(value: js.Array[VarValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNodeLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refNodeLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVarName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIf")(js.undefined)
        ret
    }
  }
  
}

