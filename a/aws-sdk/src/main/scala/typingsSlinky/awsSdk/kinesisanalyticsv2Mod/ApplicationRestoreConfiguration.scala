package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationRestoreConfiguration extends js.Object {
  /**
    * Specifies how the application should be restored.
    */
  var ApplicationRestoreType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationRestoreType = js.native
  /**
    * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if RESTORE_FROM_CUSTOM_SNAPSHOT is specified for the ApplicationRestoreType.
    */
  var SnapshotName: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SnapshotName] = js.native
}

object ApplicationRestoreConfiguration {
  @scala.inline
  def apply(ApplicationRestoreType: ApplicationRestoreType): ApplicationRestoreConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationRestoreType = ApplicationRestoreType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationRestoreConfiguration]
  }
  @scala.inline
  implicit class ApplicationRestoreConfigurationOps[Self <: ApplicationRestoreConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationRestoreType(value: ApplicationRestoreType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationRestoreType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotName(value: SnapshotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotName")(js.undefined)
        ret
    }
  }
  
}

