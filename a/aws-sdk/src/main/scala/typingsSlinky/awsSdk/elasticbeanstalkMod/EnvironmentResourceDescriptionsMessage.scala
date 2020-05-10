package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentResourceDescriptionsMessage extends js.Object {
  /**
    *  A list of EnvironmentResourceDescription. 
    */
  var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.native
}

object EnvironmentResourceDescriptionsMessage {
  @scala.inline
  def apply(): EnvironmentResourceDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourceDescriptionsMessage]
  }
  @scala.inline
  implicit class EnvironmentResourceDescriptionsMessageOps[Self <: EnvironmentResourceDescriptionsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentResources(value: EnvironmentResourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentResources")(js.undefined)
        ret
    }
  }
  
}

