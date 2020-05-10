package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configuration resources for the user.
  */
@js.native
trait SchemaManagedConfigurationsForUserListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsForUserListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A managed configuration for an app for a specific user.
    */
  var managedConfigurationForUser: js.UndefOr[js.Array[SchemaManagedConfiguration]] = js.native
}

object SchemaManagedConfigurationsForUserListResponse {
  @scala.inline
  def apply(): SchemaManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsForUserListResponse]
  }
  @scala.inline
  implicit class SchemaManagedConfigurationsForUserListResponseOps[Self <: SchemaManagedConfigurationsForUserListResponse] (val x: Self) extends AnyVal {
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
    def withManagedConfigurationForUser(value: js.Array[SchemaManagedConfiguration]): Self = {
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

