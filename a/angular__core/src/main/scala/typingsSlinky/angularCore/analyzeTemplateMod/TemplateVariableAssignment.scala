package typingsSlinky.angularCore.analyzeTemplateMod

import typingsSlinky.angularCompiler.mod.PropertyWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateVariableAssignment extends js.Object {
  var end: Double = js.native
  var node: PropertyWrite = js.native
  var start: Double = js.native
}

object TemplateVariableAssignment {
  @scala.inline
  def apply(end: Double, node: PropertyWrite, start: Double): TemplateVariableAssignment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVariableAssignment]
  }
  @scala.inline
  implicit class TemplateVariableAssignmentOps[Self <: TemplateVariableAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: PropertyWrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

