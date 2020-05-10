package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ProgressMessage...
  */
@js.native
trait IProgressMessage extends js.Object {
  /**
    * Code number to the corresponding localized message string.
    */
  var qMessageCode: Double = js.native
  /**
    * Parameters to be inserted in the localized message string.
    */
  var qMessageParameters: js.Array[String] = js.native
}

object IProgressMessage {
  @scala.inline
  def apply(qMessageCode: Double, qMessageParameters: js.Array[String]): IProgressMessage = {
    val __obj = js.Dynamic.literal(qMessageCode = qMessageCode.asInstanceOf[js.Any], qMessageParameters = qMessageParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressMessage]
  }
  @scala.inline
  implicit class IProgressMessageOps[Self <: IProgressMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQMessageCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMessageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMessageParameters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMessageParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

