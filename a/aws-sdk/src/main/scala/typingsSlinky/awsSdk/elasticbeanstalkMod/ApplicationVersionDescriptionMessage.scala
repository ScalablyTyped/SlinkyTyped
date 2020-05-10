package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionDescriptionMessage extends js.Object {
  /**
    *  The ApplicationVersionDescription of the application version. 
    */
  var ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.native
}

object ApplicationVersionDescriptionMessage {
  @scala.inline
  def apply(): ApplicationVersionDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescriptionMessage]
  }
  @scala.inline
  implicit class ApplicationVersionDescriptionMessageOps[Self <: ApplicationVersionDescriptionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationVersion(value: ApplicationVersionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersion")(js.undefined)
        ret
    }
  }
  
}

