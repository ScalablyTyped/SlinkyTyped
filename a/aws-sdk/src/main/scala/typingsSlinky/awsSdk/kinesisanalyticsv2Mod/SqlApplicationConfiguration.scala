package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfiguration extends js.Object {
  /**
    * The array of Input objects describing the input streams used by the application.
    */
  var Inputs: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Inputs] = js.native
  /**
    * The array of Output objects describing the destination streams used by the application.
    */
  var Outputs: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Outputs] = js.native
  /**
    * The array of ReferenceDataSource objects describing the reference data sources used by the application.
    */
  var ReferenceDataSources: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSources] = js.native
}

object SqlApplicationConfiguration {
  @scala.inline
  def apply(): SqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfiguration]
  }
  @scala.inline
  implicit class SqlApplicationConfigurationOps[Self <: SqlApplicationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: Inputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: Outputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceDataSources(value: ReferenceDataSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDataSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSources")(js.undefined)
        ret
    }
  }
  
}

