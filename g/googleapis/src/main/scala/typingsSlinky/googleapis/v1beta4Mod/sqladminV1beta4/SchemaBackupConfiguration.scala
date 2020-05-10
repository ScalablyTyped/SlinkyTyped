package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance backup configuration.
  */
@js.native
trait SchemaBackupConfiguration extends js.Object {
  /**
    * Whether binary log is enabled. If backup configuration is disabled,
    * binary log must be disabled as well.
    */
  var binaryLogEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether this configuration is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * This is always sql#backupConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Reserved for future use.
    */
  var replicationLogArchivingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Start time for the daily backup configuration in UTC timezone in the 24
    * hour format - HH:MM.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaBackupConfiguration {
  @scala.inline
  def apply(): SchemaBackupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupConfiguration]
  }
  @scala.inline
  implicit class SchemaBackupConfigurationOps[Self <: SchemaBackupConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryLogEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryLogEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryLogEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryLogEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
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
    def withReplicationLogArchivingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationLogArchivingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationLogArchivingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationLogArchivingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

