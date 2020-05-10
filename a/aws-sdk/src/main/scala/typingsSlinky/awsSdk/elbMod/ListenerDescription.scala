package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDescription extends js.Object {
  /**
    * The listener.
    */
  var Listener: js.UndefOr[typingsSlinky.awsSdk.elbMod.Listener] = js.native
  /**
    * The policies. If there are no policies enabled, the list is empty.
    */
  var PolicyNames: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyNames] = js.native
}

object ListenerDescription {
  @scala.inline
  def apply(): ListenerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerDescription]
  }
  @scala.inline
  implicit class ListenerDescriptionOps[Self <: ListenerDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListener(value: Listener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Listener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Listener")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyNames(value: PolicyNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyNames")(js.undefined)
        ret
    }
  }
  
}

