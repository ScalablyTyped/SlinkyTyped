package typingsSlinky.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PingLayerConfig extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var fps: js.UndefOr[Double] = js.native
  var opacityRange: js.UndefOr[js.Array[Double]] = js.native
  var radiusRange: js.UndefOr[js.Array[Double]] = js.native
}

object PingLayerConfig {
  @scala.inline
  def apply(): PingLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PingLayerConfig]
  }
  @scala.inline
  implicit class PingLayerConfigOps[Self <: PingLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacityRange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacityRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacityRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacityRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusRange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusRange")(js.undefined)
        ret
    }
  }
  
}

