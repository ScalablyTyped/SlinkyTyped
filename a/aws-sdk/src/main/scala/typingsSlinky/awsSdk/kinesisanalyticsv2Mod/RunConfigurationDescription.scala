package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunConfigurationDescription extends js.Object {
  /**
    * Describes the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration] = js.native
}

object RunConfigurationDescription {
  @scala.inline
  def apply(): RunConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfigurationDescription]
  }
  @scala.inline
  implicit class RunConfigurationDescriptionOps[Self <: RunConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationRestoreConfigurationDescription(value: ApplicationRestoreConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationRestoreConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationRestoreConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationRestoreConfigurationDescription")(js.undefined)
        ret
    }
  }
  
}

