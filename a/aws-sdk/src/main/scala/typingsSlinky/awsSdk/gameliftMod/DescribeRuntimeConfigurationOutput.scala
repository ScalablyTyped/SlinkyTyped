package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRuntimeConfigurationOutput extends js.Object {
  /**
    * Instructions describing how server processes should be launched and maintained on each instance in the fleet.
    */
  var RuntimeConfiguration: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.RuntimeConfiguration] = js.native
}

object DescribeRuntimeConfigurationOutput {
  @scala.inline
  def apply(): DescribeRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuntimeConfigurationOutput]
  }
  @scala.inline
  implicit class DescribeRuntimeConfigurationOutputOps[Self <: DescribeRuntimeConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuntimeConfiguration(value: RuntimeConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuntimeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuntimeConfiguration")(js.undefined)
        ret
    }
  }
  
}

