package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLifecyclePolicy extends Entity {
  /**
    * List of email address to send notifications for groups without owners. Multiple email address can be defined by
    * separating email address with a semicolon.
    */
  var alternateNotificationEmails: js.UndefOr[String] = js.native
  /**
    * Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the
    * number of days defined.
    */
  var groupLifetimeInDays: js.UndefOr[Double] = js.native
  // The group type for which the expiration policy applies. Possible values are All, Selected or None.
  var managedGroupTypes: js.UndefOr[String] = js.native
}

object GroupLifecyclePolicy {
  @scala.inline
  def apply(): GroupLifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLifecyclePolicy]
  }
  @scala.inline
  implicit class GroupLifecyclePolicyOps[Self <: GroupLifecyclePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateNotificationEmails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateNotificationEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateNotificationEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateNotificationEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupLifetimeInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLifetimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupLifetimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLifetimeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedGroupTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedGroupTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedGroupTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedGroupTypes")(js.undefined)
        ret
    }
  }
  
}

