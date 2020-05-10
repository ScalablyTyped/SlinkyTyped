package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfigurationUpdate extends js.Object {
  /**
    * The array of InputUpdate objects describing the new input streams used by the application.
    */
  var InputUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputUpdates] = js.native
  /**
    * The array of OutputUpdate objects describing the new destination streams used by the application.
    */
  var OutputUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.OutputUpdates] = js.native
  /**
    * The array of ReferenceDataSourceUpdate objects describing the new reference data sources used by the application.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceUpdates] = js.native
}

object SqlApplicationConfigurationUpdate {
  @scala.inline
  def apply(): SqlApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfigurationUpdate]
  }
  @scala.inline
  implicit class SqlApplicationConfigurationUpdateOps[Self <: SqlApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

