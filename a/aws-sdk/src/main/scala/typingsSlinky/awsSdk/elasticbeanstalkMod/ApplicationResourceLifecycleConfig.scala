package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationResourceLifecycleConfig extends js.Object {
  /**
    * The ARN of an IAM service role that Elastic Beanstalk has permission to assume. The ServiceRole property is required the first time that you provide a VersionLifecycleConfig for the application in one of the supporting calls (CreateApplication or UpdateApplicationResourceLifecycle). After you provide it once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to specify it again in subsequent UpdateApplicationResourceLifecycle calls. You can, however, specify it in subsequent calls to change the Service Role to another value.
    */
  var ServiceRole: js.UndefOr[String] = js.native
  /**
    * The application version lifecycle configuration.
    */
  var VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig] = js.native
}

object ApplicationResourceLifecycleConfig {
  @scala.inline
  def apply(): ApplicationResourceLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationResourceLifecycleConfig]
  }
  @scala.inline
  implicit class ApplicationResourceLifecycleConfigOps[Self <: ApplicationResourceLifecycleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionLifecycleConfig(value: ApplicationVersionLifecycleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLifecycleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionLifecycleConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLifecycleConfig")(js.undefined)
        ret
    }
  }
  
}

