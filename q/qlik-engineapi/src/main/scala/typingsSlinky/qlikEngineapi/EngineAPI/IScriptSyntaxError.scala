package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScriptSyntaxError...
  */
@js.native
trait IScriptSyntaxError extends js.Object {
  /**
    * Position of the erroneous text from the beginning of the line
    */
  var qColInLine: Double = js.native
  /**
    * Length of the word where the error is located
    */
  var qErrLen: Double = js.native
  /**
    * Line number in the section where the error is located
    */
  var qLineInTab: Double = js.native
  /**
    * The default value is false.
    */
  var qSecondaryFailure: Boolean = js.native
  /**
    * Number of the faulty section
    */
  var qTabIx: Double = js.native
  /**
    * Position of the erroneous text from the beginning of the script
    */
  var qTextPos: Double = js.native
}

object IScriptSyntaxError {
  @scala.inline
  def apply(
    qColInLine: Double,
    qErrLen: Double,
    qLineInTab: Double,
    qSecondaryFailure: Boolean,
    qTabIx: Double,
    qTextPos: Double
  ): IScriptSyntaxError = {
    val __obj = js.Dynamic.literal(qColInLine = qColInLine.asInstanceOf[js.Any], qErrLen = qErrLen.asInstanceOf[js.Any], qLineInTab = qLineInTab.asInstanceOf[js.Any], qSecondaryFailure = qSecondaryFailure.asInstanceOf[js.Any], qTabIx = qTabIx.asInstanceOf[js.Any], qTextPos = qTextPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScriptSyntaxError]
  }
  @scala.inline
  implicit class IScriptSyntaxErrorOps[Self <: IScriptSyntaxError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQColInLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qColInLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQErrLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qErrLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLineInTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLineInTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSecondaryFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSecondaryFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTabIx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTabIx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTextPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTextPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

