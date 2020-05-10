package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A managed configurations settings resource contains the set of managed
  * properties that have been configured for an Android app to be applied to a
  * set of users. The app&#39;s developer would have defined configurable
  * properties in the managed configurations schema.
  */
@js.native
trait SchemaManagedConfigurationsSettings extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last updated time of the managed configuration settings in
    * milliseconds since 1970-01-01T00:00:00Z.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The set of managed properties for this configuration.
    */
  var managedProperty: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String] = js.native
  /**
    * The name of the managed configurations settings.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaManagedConfigurationsSettings {
  @scala.inline
  def apply(): SchemaManagedConfigurationsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsSettings]
  }
  @scala.inline
  implicit class SchemaManagedConfigurationsSettingsOps[Self <: SchemaManagedConfigurationsSettings] (val x: Self) extends AnyVal {
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
    def withLastUpdatedTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestampMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedProperty(value: js.Array[SchemaManagedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withMcmId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMcmId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcmId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

