package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.Longitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateMarkerOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 动画持续时长，默认值1000ms，平移与旋转分别计算。
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.native
  	// 指定marker移动到的目标点
  var autoRotate: Boolean = js.native
  	// 指定 marker
  var destination: Longitude = js.native
  	// marker 的旋转角度
  var duration: js.UndefOr[Double] = js.native
  var markerId: Double = js.native
  	// 移动过程中是否自动旋转 marker
  var rotate: Double = js.native
}

object TranslateMarkerOptions {
  @scala.inline
  def apply(autoRotate: Boolean, destination: Longitude, markerId: Double, rotate: Double): TranslateMarkerOptions = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateMarkerOptions]
  }
  @scala.inline
  implicit class TranslateMarkerOptionsOps[Self <: TranslateMarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: Longitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnd")(js.undefined)
        ret
    }
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
  }
  
}

