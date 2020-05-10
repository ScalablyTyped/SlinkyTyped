package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversion extends js.Object {
  /**
    * The locations of the analysis tool's per-run log files.
    */
  var analysisToolLogFiles: js.UndefOr[js.Array[ArtifactLocation]] = js.native
  /**
    * An invocation object that describes the invocation of the converter.
    */
  var invocation: js.UndefOr[Invocation] = js.native
  /**
    * Key/value pairs that provide additional information about the conversion.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A tool object that describes the converter.
    */
  var tool: Tool = js.native
}

object Conversion {
  @scala.inline
  def apply(tool: Tool): Conversion = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversion]
  }
  @scala.inline
  implicit class ConversionOps[Self <: Conversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTool(value: Tool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalysisToolLogFiles(value: js.Array[ArtifactLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisToolLogFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisToolLogFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisToolLogFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withInvocation(value: Invocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocation")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

