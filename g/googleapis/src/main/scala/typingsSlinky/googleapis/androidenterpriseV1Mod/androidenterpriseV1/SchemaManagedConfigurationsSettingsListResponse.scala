package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configurations settings for a product.
  */
@js.native
trait SchemaManagedConfigurationsSettingsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsSettingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A managed configurations settings for an app that may be assigned to a
    * group of users in an enterprise.
    */
  var managedConfigurationsSettings: js.UndefOr[js.Array[SchemaManagedConfigurationsSettings]] = js.native
}

object SchemaManagedConfigurationsSettingsListResponse {
  @scala.inline
  def apply(): SchemaManagedConfigurationsSettingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsSettingsListResponse]
  }
  @scala.inline
  implicit class SchemaManagedConfigurationsSettingsListResponseOps[Self <: SchemaManagedConfigurationsSettingsListResponse] (val x: Self) extends AnyVal {
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
    def withManagedConfigurationsSettings(value: js.Array[SchemaManagedConfigurationsSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurationsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedConfigurationsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurationsSettings")(js.undefined)
        ret
    }
  }
  
}

