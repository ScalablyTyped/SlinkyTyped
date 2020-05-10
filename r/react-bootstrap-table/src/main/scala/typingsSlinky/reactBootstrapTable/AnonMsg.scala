package typingsSlinky.reactBootstrapTable

import typingsSlinky.reactBootstrapTable.mod.EditValidatorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMsg extends js.Object {
  /**
  		 * A text message explaining the validation result.
  		 */
  var msg: String = js.native
  /**
  		 * A text title explaining the validation result.
  		 */
  var title: String = js.native
  /**
  		 * One of 'success' or 'error'
  		 */
  var `type`: EditValidatorType = js.native
}

object AnonMsg {
  @scala.inline
  def apply(msg: String, title: String, `type`: EditValidatorType): AnonMsg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMsg]
  }
  @scala.inline
  implicit class AnonMsgOps[Self <: AnonMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: EditValidatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

