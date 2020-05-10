package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePropsBase
  extends AccessibilityProps
     with ImagePropsIOS
     with ImagePropsAndroid {
  var borderBottomLeftRadius: js.UndefOr[Double] = js.native
  var borderBottomRightRadius: js.UndefOr[Double] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderTopLeftRadius: js.UndefOr[Double] = js.native
  var borderTopRightRadius: js.UndefOr[Double] = js.native
  /**
    * A static image to display while downloading the final image off the network.
    */
  var defaultSource: js.UndefOr[ImageURISource | Double] = js.native
  /**
    * similarly to `source`, this property represents the resource used to render
    * the loading indicator for the image, displayed until image is ready to be
    * displayed, typically after when it got downloaded from network.
    */
  var loadingIndicatorSource: js.UndefOr[ImageURISource] = js.native
  /**
    * Invoked on load error with {nativeEvent: {error}}
    */
  var onError: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]] = js.native
  /**
    * onLayout function
    *
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height} }}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  /**
    * Invoked when load completes successfully
    * { source: { url, height, width } }.
    */
  var onLoad: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]] = js.native
  /**
    * Invoked when load either succeeds or fails
    */
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Invoked on load start
    */
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  var progressiveRenderingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Determines how to resize the image when the frame doesn't match the raw
    * image dimensions.
    *
    * 'cover': Scale the image uniformly (maintain the image's aspect ratio)
    * so that both dimensions (width and height) of the image will be equal
    * to or larger than the corresponding dimension of the view (minus padding).
    *
    * 'contain': Scale the image uniformly (maintain the image's aspect ratio)
    * so that both dimensions (width and height) of the image will be equal to
    * or less than the corresponding dimension of the view (minus padding).
    *
    * 'stretch': Scale width and height independently, This may change the
    * aspect ratio of the src.
    *
    * 'repeat': Repeat the image to cover the frame of the view.
    * The image will keep it's size and aspect ratio. (iOS only)
    *
    * 'center': Scale the image down so that it is completely visible,
    * if bigger than the area of the view.
    * The image will not be scaled up.
    */
  var resizeMode: js.UndefOr[ImageResizeMode] = js.native
  /**
    * The image source (either a remote URL or a local file resource).
    *
    * This prop can also contain several remote URLs, specified together with their width and height and potentially with scale/other URI arguments.
    * The native side will then choose the best uri to display based on the measured size of the image container.
    * A cache property can be added to control how networked request interacts with the local cache.
    *
    * The currently supported formats are png, jpg, jpeg, bmp, gif, webp (Android only), psd (iOS only).
    */
  var source: ImageSourcePropType = js.native
  /**
    * A unique identifier for this element to be used in UI Automation testing scripts.
    */
  var testID: js.UndefOr[String] = js.native
}

object ImagePropsBase {
  @scala.inline
  def apply(source: ImageSourcePropType): ImagePropsBase = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePropsBase]
  }
  @scala.inline
  implicit class ImagePropsBaseOps[Self <: ImagePropsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: ImageSourcePropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderBottomLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomLeftRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomRightRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopLeftRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopRightRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSource(value: ImageURISource | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSource")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicatorSource(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicatorSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicatorSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicatorSource")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: SyntheticEvent[NodeHandle, ImageErrorEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: SyntheticEvent[NodeHandle, ImageLoadEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoadEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveRenderingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveRenderingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveRenderingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveRenderingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeMode(value: ImageResizeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(js.undefined)
        ret
    }
  }
  
}

