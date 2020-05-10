package typingsSlinky.flipsnap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipsnapOptions extends js.Object {
  /**
    * When support 3D transform browser and this option set true, it is not used 3D transform and use 2D transform. You should set true, when it is a device which has a bug in 3D transform(old Android or BlackBerry etc). default is false.
    */
  var disable3d: js.UndefOr[Boolean] = js.native
  /**
    * When set true, touch event is disabled. Only handling button or etc interface. default is false.
    */
  var disableTouch: js.UndefOr[Boolean] = js.native
  /**
    * Move distance. default is auto calculate from element width and maxPont.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * Stop point count. default is auto calculate from element item count.
    */
  var maxPoint: js.UndefOr[Double] = js.native
  /**
    * Transition duration (millisecond). default is 350.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}

object FlipsnapOptions {
  @scala.inline
  def apply(): FlipsnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipsnapOptions]
  }
  @scala.inline
  implicit class FlipsnapOptionsOps[Self <: FlipsnapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable3d: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable3d")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
  }
  
}

