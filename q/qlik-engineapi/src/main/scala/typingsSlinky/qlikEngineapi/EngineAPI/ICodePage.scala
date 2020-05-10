package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CodePage...
  */
@js.native
trait ICodePage extends js.Object {
  /**
    * Description of the code page
    */
  var qDescription: String = js.native
  /**
    * Name of the code page
    */
  var qName: String = js.native
  /**
    * Number of the code page
    */
  var qNumber: Double = js.native
}

object ICodePage {
  @scala.inline
  def apply(qDescription: String, qName: String, qNumber: Double): ICodePage = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumber = qNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodePage]
  }
  @scala.inline
  implicit class ICodePageOps[Self <: ICodePage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDescription")(value.asInstanceOf[js.Any])
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
  }
  
}

