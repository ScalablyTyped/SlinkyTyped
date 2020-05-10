package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateEnvironmentMessage extends js.Object {
  /**
    * The ID of the environment to terminate.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * The name of the environment to terminate.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * Terminates the target environment even if another environment in the same group is dependent on it.
    */
  var ForceTerminate: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ForceTerminate] = js.native
  /**
    * Indicates whether the associated AWS resources should shut down when the environment is terminated:    true: The specified environment as well as the associated AWS resources, such as Auto Scaling group and LoadBalancer, are terminated.    false: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS resources continue to operate.    For more information, see the  AWS Elastic Beanstalk User Guide.    Default: true   Valid Values: true | false 
    */
  var TerminateResources: js.UndefOr[TerminateEnvironmentResources] = js.native
}

object TerminateEnvironmentMessage {
  @scala.inline
  def apply(): TerminateEnvironmentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateEnvironmentMessage]
  }
  @scala.inline
  implicit class TerminateEnvironmentMessageOps[Self <: TerminateEnvironmentMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withForceTerminate(value: ForceTerminate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceTerminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateResources(value: TerminateEnvironmentResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateResources")(js.undefined)
        ret
    }
  }
  
}

