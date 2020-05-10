package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlinkRunConfiguration extends js.Object {
  /**
    * When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. This will happen if the program is updated between savepoints to remove stateful parameters, and state data in the savepoint no longer corresponds to valid application data. For more information, see  Allowing Non-Restored State in the Apache Flink documentation.
    */
  var AllowNonRestoredState: js.UndefOr[BooleanObject] = js.native
}

object FlinkRunConfiguration {
  @scala.inline
  def apply(): FlinkRunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkRunConfiguration]
  }
  @scala.inline
  implicit class FlinkRunConfigurationOps[Self <: FlinkRunConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNonRestoredState(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowNonRestoredState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNonRestoredState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowNonRestoredState")(js.undefined)
        ret
    }
  }
  
}

