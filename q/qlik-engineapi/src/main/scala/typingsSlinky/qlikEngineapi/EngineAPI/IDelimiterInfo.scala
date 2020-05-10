package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DelimiterInfo...
  */
@js.native
trait IDelimiterInfo extends js.Object {
  /**
    * Is set to true if multiple spaces are used to separate the values.
    */
  var qIsMultiple: Boolean = js.native
  /**
    * Name of the delimiter.
    * Example:
    * "Tab_DELIMITER"
    */
  var qName: String = js.native
  /**
    * Delimiter character number used by the engine to determine how to separate the values.
    */
  var qNumber: Double = js.native
  /**
    * Representation of the delimiter value that is used in the script.
    * Example:
    * "'\t'"
    */
  var qScriptCode: String = js.native
}

object IDelimiterInfo {
  @scala.inline
  def apply(qIsMultiple: Boolean, qName: String, qNumber: Double, qScriptCode: String): IDelimiterInfo = {
    val __obj = js.Dynamic.literal(qIsMultiple = qIsMultiple.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumber = qNumber.asInstanceOf[js.Any], qScriptCode = qScriptCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelimiterInfo]
  }
  @scala.inline
  implicit class IDelimiterInfoOps[Self <: IDelimiterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQIsMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQScriptCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qScriptCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

