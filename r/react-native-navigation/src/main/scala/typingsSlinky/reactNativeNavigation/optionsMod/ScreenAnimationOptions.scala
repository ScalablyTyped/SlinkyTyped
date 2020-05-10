package typingsSlinky.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenAnimationOptions extends js.Object {
  /**
    * Animate the element over opacity
    */
  var alpha: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Enable or disable the animation
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Animate the element over rotation
    */
  var rotation: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over rotationX
    */
  var rotationX: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over rotationY
    */
  var rotationY: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over scaleX
    */
  var scaleX: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over scaleY
    */
  var scaleY: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Wait for the root view to render before start animation
    */
  var waitForRender: js.UndefOr[Boolean] = js.native
  /**
    * Animate the element over translateX
    */
  var x: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over translateY
    */
  var y: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
}

object ScreenAnimationOptions {
  @scala.inline
  def apply(): ScreenAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenAnimationOptions]
  }
  @scala.inline
  implicit class ScreenAnimationOptionsOps[Self <: ScreenAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: OptionsAnimationPropertyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: OptionsAnimationPropertyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationX(value: OptionsAnimationPropertyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationX")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationY(value: OptionsAnimationPropertyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationY")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleX(value: OptionsAnimationPropertyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleY(value: OptionsAnimationPropertyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForRender")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: OptionsAnimationPropertyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: OptionsAnimationPropertyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

