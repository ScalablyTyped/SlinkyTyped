package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFailureMessage extends js.Object {
  /** Failure message which is set when the query could not be transformed successfully. */
  var failureMessage: String | Null = js.native
  /** Transformed call expression. */
  var node: CallExpression = js.native
}

object AnonFailureMessage {
  @scala.inline
  def apply(node: CallExpression): AnonFailureMessage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailureMessage]
  }
  @scala.inline
  implicit class AnonFailureMessageOps[Self <: AnonFailureMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: CallExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(null)
        ret
    }
  }
  
}

