package typingsSlinky.oracleOraclejet.ojganttMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.finishStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startFinish
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojGanttDependencySettableProperties extends JetSettableProperties {
  var predecessorTaskId: js.Any = js.native
  var shortDesc: String | Null = js.native
  var successorTaskId: js.Any = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var `type`: finishStart | finishFinish | startStart | startFinish = js.native
}

object ojGanttDependencySettableProperties {
  @scala.inline
  def apply(
    predecessorTaskId: js.Any,
    successorTaskId: js.Any,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: finishStart | finishFinish | startStart | startFinish
  ): ojGanttDependencySettableProperties = {
    val __obj = js.Dynamic.literal(predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttDependencySettableProperties]
  }
  @scala.inline
  implicit class ojGanttDependencySettablePropertiesOps[Self <: ojGanttDependencySettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredecessorTaskId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessorTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessorTaskId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successorTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: finishStart | finishFinish | startStart | startFinish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDescNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDesc")(null)
        ret
    }
  }
  
}

