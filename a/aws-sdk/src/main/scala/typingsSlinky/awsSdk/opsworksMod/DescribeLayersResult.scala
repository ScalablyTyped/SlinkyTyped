package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLayersResult extends js.Object {
  /**
    * An array of Layer objects that describe the layers.
    */
  var Layers: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Layers] = js.native
}

object DescribeLayersResult {
  @scala.inline
  def apply(): DescribeLayersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLayersResult]
  }
  @scala.inline
  implicit class DescribeLayersResultOps[Self <: DescribeLayersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: Layers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layers")(js.undefined)
        ret
    }
  }
  
}

