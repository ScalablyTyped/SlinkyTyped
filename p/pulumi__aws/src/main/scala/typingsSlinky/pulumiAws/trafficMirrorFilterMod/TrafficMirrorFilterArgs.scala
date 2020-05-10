package typingsSlinky.pulumiAws.trafficMirrorFilterMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterArgs extends js.Object {
  /**
    * A description of the filter.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of amazon network services that should be mirrored. Valid values: amazon-dns
    */
  val networkServices: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object TrafficMirrorFilterArgs {
  @scala.inline
  def apply(): TrafficMirrorFilterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterArgs]
  }
  @scala.inline
  implicit class TrafficMirrorFilterArgsOps[Self <: TrafficMirrorFilterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkServices(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkServices")(js.undefined)
        ret
    }
  }
  
}

