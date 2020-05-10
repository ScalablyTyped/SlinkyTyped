package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxBulletOptions extends BaseSparklineOptions[dxBullet] {
  /** Specifies a color for the bullet bar. */
  var color: js.UndefOr[String] = js.native
  /** Specifies an end value for the invisible scale. */
  var endScaleValue: js.UndefOr[Double] = js.native
  /** Specifies whether or not to show the target line. */
  var showTarget: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not to show the line indicating zero on the invisible scale. */
  var showZeroLevel: js.UndefOr[Boolean] = js.native
  /** Specifies a start value for the invisible scale. */
  var startScaleValue: js.UndefOr[Double] = js.native
  /** Specifies the value indicated by the target line. */
  var target: js.UndefOr[Double] = js.native
  /** Specifies a color for both the target and zero level lines. */
  var targetColor: js.UndefOr[String] = js.native
  /** Specifies the width of the target line. */
  var targetWidth: js.UndefOr[Double] = js.native
  /** Specifies the primary value indicated by the bullet bar. */
  var value: js.UndefOr[Double] = js.native
}

object dxBulletOptions {
  @scala.inline
  def apply(): dxBulletOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBulletOptions]
  }
  @scala.inline
  implicit class dxBulletOptionsOps[Self <: dxBulletOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withEndScaleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endScaleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndScaleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endScaleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withShowZeroLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZeroLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZeroLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZeroLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStartScaleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScaleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartScaleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScaleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

