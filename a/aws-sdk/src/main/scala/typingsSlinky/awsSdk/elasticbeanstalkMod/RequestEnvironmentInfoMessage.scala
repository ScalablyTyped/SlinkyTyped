package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestEnvironmentInfoMessage extends js.Object {
  /**
    * The ID of the environment of the requested data. If no such environment is found, RequestEnvironmentInfo returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * The name of the environment of the requested data. If no such environment is found, RequestEnvironmentInfo returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The type of information to request.
    */
  var InfoType: EnvironmentInfoType = js.native
}

object RequestEnvironmentInfoMessage {
  @scala.inline
  def apply(InfoType: EnvironmentInfoType): RequestEnvironmentInfoMessage = {
    val __obj = js.Dynamic.literal(InfoType = InfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEnvironmentInfoMessage]
  }
  @scala.inline
  implicit class RequestEnvironmentInfoMessageOps[Self <: RequestEnvironmentInfoMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoType(value: EnvironmentInfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentId(value: EnvironmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(js.undefined)
        ret
    }
  }
  
}

