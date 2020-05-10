package typingsSlinky.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection reference when the connection is shared between AWS services.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: typingsSlinky.awsSdk.codestarconnectionsMod.ConnectionArn = js.native
}

object CreateConnectionOutput {
  @scala.inline
  def apply(ConnectionArn: ConnectionArn): CreateConnectionOutput = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionOutput]
  }
  @scala.inline
  implicit class CreateConnectionOutputOps[Self <: CreateConnectionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionArn(value: ConnectionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

