package typingsSlinky.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetBreakpointByUrlParameterType extends js.Object {
  /**
    * Offset in the line to set breakpoint at.
    */
  var columnNumber: js.UndefOr[Double] = js.native
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[String] = js.native
  /**
    * Line number to set breakpoint at.
    */
  var lineNumber: Double = js.native
  /**
    * Script hash of the resources to set breakpoint on.
    */
  var scriptHash: js.UndefOr[String] = js.native
  /**
    * URL of the resources to set breakpoint on.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or <code>urlRegex</code> must be specified.
    */
  var urlRegex: js.UndefOr[String] = js.native
}

object SetBreakpointByUrlParameterType {
  @scala.inline
  def apply(lineNumber: Double): SetBreakpointByUrlParameterType = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointByUrlParameterType]
  }
  @scala.inline
  implicit class SetBreakpointByUrlParameterTypeOps[Self <: SetBreakpointByUrlParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptHash")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRegex")(js.undefined)
        ret
    }
  }
  
}

