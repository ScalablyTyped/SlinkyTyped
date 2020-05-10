package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfigurationDescription extends js.Object {
  /**
    * The array of InputDescription objects describing the input streams used by the application.
    */
  var InputDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputDescriptions] = js.native
  /**
    * The array of OutputDescription objects describing the destination streams used by the application.
    */
  var OutputDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.OutputDescriptions] = js.native
  /**
    * The array of ReferenceDataSourceDescription objects describing the reference data sources used by the application.
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.native
}

object SqlApplicationConfigurationDescription {
  @scala.inline
  def apply(): SqlApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfigurationDescription]
  }
  @scala.inline
  implicit class SqlApplicationConfigurationDescriptionOps[Self <: SqlApplicationConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputDescriptions(value: InputDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDescriptions(value: OutputDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSourceDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDataSourceDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSourceDescriptions")(js.undefined)
        ret
    }
  }
  
}

