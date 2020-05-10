package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEngineDefaultClusterParametersResult extends js.Object {
  var EngineDefaults: js.UndefOr[typingsSlinky.awsSdk.rdsMod.EngineDefaults] = js.native
}

object DescribeEngineDefaultClusterParametersResult {
  @scala.inline
  def apply(): DescribeEngineDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineDefaultClusterParametersResult]
  }
  @scala.inline
  implicit class DescribeEngineDefaultClusterParametersResultOps[Self <: DescribeEngineDefaultClusterParametersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngineDefaults(value: EngineDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineDefaults")(js.undefined)
        ret
    }
  }
  
}

