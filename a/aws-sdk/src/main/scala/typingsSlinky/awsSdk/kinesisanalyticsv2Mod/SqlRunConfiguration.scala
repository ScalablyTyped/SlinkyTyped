package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlRunConfiguration extends js.Object {
  /**
    * The input source ID. You can get this ID by calling the DescribeApplication operation. 
    */
  var InputId: Id = js.native
  /**
    * The point at which you want the application to start processing records from the streaming source. 
    */
  var InputStartingPositionConfiguration: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration = js.native
}

object SqlRunConfiguration {
  @scala.inline
  def apply(InputId: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): SqlRunConfiguration = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any], InputStartingPositionConfiguration = InputStartingPositionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlRunConfiguration]
  }
  @scala.inline
  implicit class SqlRunConfigurationOps[Self <: SqlRunConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStartingPositionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

