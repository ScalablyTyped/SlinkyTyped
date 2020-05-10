package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationUpdate extends js.Object {
  /**
    * Describes application code updates.
    */
  var ApplicationCodeUpdate: js.UndefOr[ApplicationCode] = js.native
  /**
    * Describes application CloudWatch logging option updates.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionUpdates] = js.native
  /**
    * Describes application input configuration updates.
    */
  var InputUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputUpdates] = js.native
  /**
    * Describes application output configuration updates.
    */
  var OutputUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.OutputUpdates] = js.native
  /**
    * Describes application reference data source updates.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ReferenceDataSourceUpdates] = js.native
}

object ApplicationUpdate {
  @scala.inline
  def apply(): ApplicationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUpdate]
  }
  @scala.inline
  implicit class ApplicationUpdateOps[Self <: ApplicationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationCodeUpdate(value: ApplicationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCodeUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationCodeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCodeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchLoggingOptionUpdates(value: CloudWatchLoggingOptionUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLoggingOptionUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withInputUpdates(value: InputUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputUpdates(value: OutputUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceDataSourceUpdates(value: ReferenceDataSourceUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSourceUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDataSourceUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSourceUpdates")(js.undefined)
        ret
    }
  }
  
}

