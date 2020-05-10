package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.PartialPlotData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformStyle extends js.Object {
  var target: Double | String | (js.Array[Double | String]) = js.native
  var value: PartialPlotData = js.native
}

object TransformStyle {
  @scala.inline
  def apply(target: Double | String | (js.Array[Double | String]), value: PartialPlotData): TransformStyle = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStyle]
  }
  @scala.inline
  implicit class TransformStyleOps[Self <: TransformStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: Double | String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: PartialPlotData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

