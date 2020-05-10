package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationResourceLifecycleDescriptionMessage extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
}

object ApplicationResourceLifecycleDescriptionMessage {
  @scala.inline
  def apply(): ApplicationResourceLifecycleDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationResourceLifecycleDescriptionMessage]
  }
  @scala.inline
  implicit class ApplicationResourceLifecycleDescriptionMessageOps[Self <: ApplicationResourceLifecycleDescriptionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLifecycleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLifecycleConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLifecycleConfig")(js.undefined)
        ret
    }
  }
  
}

