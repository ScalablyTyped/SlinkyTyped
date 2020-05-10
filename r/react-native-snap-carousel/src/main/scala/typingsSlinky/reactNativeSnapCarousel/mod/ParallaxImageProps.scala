package typingsSlinky.reactNativeSnapCarousel.mod

import typingsSlinky.reactNative.mod.ImageProps
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSnapCarousel.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallaxImageProps
  extends ImageProps
     with AdditionalParallaxProps {
  /**
    * Optional style for image's container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * On screen dimensions of the image
    */
  var dimensions: js.UndefOr[AnonHeight] = js.native
  /**
    * Speed of parallax effect. A higher value appears more 'zoomed in'
    */
  var parallaxFactor: js.UndefOr[Double] = js.native
  /**
    * Whether to display a loading spinner
    */
  var showSpinner: js.UndefOr[Boolean] = js.native
  /**
    * Color of the loading spinner if displayed
    */
  var spinnerColor: js.UndefOr[String] = js.native
}

object ParallaxImageProps {
  @scala.inline
  def apply(source: ImageSourcePropType): ParallaxImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallaxImageProps]
  }
  @scala.inline
  implicit class ParallaxImagePropsOps[Self <: ParallaxImageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withDimensions(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withParallaxFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallaxFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSpinner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerColor")(js.undefined)
        ret
    }
  }
  
}

