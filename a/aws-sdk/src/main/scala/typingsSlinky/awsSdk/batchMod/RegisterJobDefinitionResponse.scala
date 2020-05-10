package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterJobDefinitionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job definition.
    */
  var jobDefinitionArn: String = js.native
  /**
    * The name of the job definition.
    */
  var jobDefinitionName: String = js.native
  /**
    * The revision of the job definition.
    */
  var revision: Integer = js.native
}

object RegisterJobDefinitionResponse {
  @scala.inline
  def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Integer): RegisterJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn.asInstanceOf[js.Any], jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterJobDefinitionResponse]
  }
  @scala.inline
  implicit class RegisterJobDefinitionResponseOps[Self <: RegisterJobDefinitionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobDefinitionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobDefinitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

