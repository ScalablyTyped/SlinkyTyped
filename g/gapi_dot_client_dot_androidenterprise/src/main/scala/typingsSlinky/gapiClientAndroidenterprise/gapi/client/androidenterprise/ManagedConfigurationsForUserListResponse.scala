package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedConfigurationsForUserListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfigurationsForUserListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** A managed configuration for an app for a specific user. */
  var managedConfigurationForUser: js.UndefOr[js.Array[ManagedConfiguration]] = js.native
}

object ManagedConfigurationsForUserListResponse {
  @scala.inline
  def apply(): ManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsForUserListResponse]
  }
  @scala.inline
  implicit class ManagedConfigurationsForUserListResponseOps[Self <: ManagedConfigurationsForUserListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedConfigurationForUser(value: js.Array[ManagedConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurationForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedConfigurationForUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurationForUser")(js.undefined)
        ret
    }
  }
  
}

