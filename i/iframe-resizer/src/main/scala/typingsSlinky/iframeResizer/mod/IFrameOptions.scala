package typingsSlinky.iframeResizer.mod

import typingsSlinky.iframeResizer.iframeResizerStrings.auto
import typingsSlinky.iframeResizer.iframeResizerStrings.child
import typingsSlinky.iframeResizer.iframeResizerStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IFrameOptions extends js.Object {
  /**
    * When enabled changes to the Window size or the DOM will cause the iFrame to resize to the new content size.
    * Disable if using size method with custom dimensions.
    */
  var autoResize: js.UndefOr[Boolean] = js.native
  /**
    * Override the body background style in the iFrame.
    */
  var bodyBackground: js.UndefOr[String] = js.native
  /**
    * Override the default body margin style in the iFrame. A string can be any valid value for the
    * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
    */
  var bodyMargin: js.UndefOr[Double | String] = js.native
  /**
    * Override the default body padding style in the iFrame. A string can be any valid value for the
    * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
    */
  var bodyPadding: js.UndefOr[Double | String] = js.native
  /**
    * When set to true, only allow incoming messages from the domain listed in the src property of the iFrame tag.
    * If your iFrame navigates between different domains, ports or protocols; then you will need to
    * provide an array of URLs or disable this option.
    */
  var checkOrigin: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Called when iFrame is closed via parentIFrame.close() or iframe.iframeResizer.close() methods.
    */
  var closedCallback: js.UndefOr[js.Function1[/* iframeId */ String, Unit]] = js.native
  /**
    * Height calculation method.
    */
  var heightCalculationMethod: js.UndefOr[HeightCalculationMethod] = js.native
  /**
    * Set iFrame Id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * When enabled in page linking inside the iFrame and from the iFrame to the parent page will be enabled.
    */
  var inPageLinks: js.UndefOr[Boolean] = js.native
  /**
    * Initial setup callback function.
    */
  var initCallback: js.UndefOr[js.Function1[/* iframe */ IFrameComponent, Unit]] = js.native
  /**
    * In browsers that don't support mutationObserver, such as IE10, the library falls back to using
    * setInterval, to check for changes to the page size.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Setting the log option to true will make the scripts in both the host page and the iFrame output
    * everything they do to the JavaScript console so you can see the communication between the two scripts.
    */
  var log: js.UndefOr[Boolean] = js.native
  /**
    * Set maximum height of iFrame.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Set maximum width of iFrame.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Receive message posted from iFrame with the parentIFrame.sendMessage() method.
    */
  var messageCallback: js.UndefOr[js.Function1[/* data */ IFrameMessageData, Unit]] = js.native
  /**
    * Set minimum height of iFrame.
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * Set minimum width of iFrame.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Listen for resize events from the parent page, or the iFrame. Select the 'child' value if the iFrame
    * can be resized independently of the browser window. Selecting this value can cause issues with some
    * height calculation methods on mobile devices.
    */
  var resizeFrom: js.UndefOr[parent | child] = js.native
  /**
    * Function called after iFrame resized. Passes in messageData object containing the iFrame, height, width
    * and the type of event that triggered the iFrame to resize.
    */
  var resizedCallback: js.UndefOr[js.Function1[/* data */ IFrameResizedData, Unit]] = js.native
  /**
    * Called before the page is repositioned after a request from the iFrame, due to either an in page link,
    * or a direct request from either parentIFrame.scrollTo() or parentIFrame.scrollToOffset().
    * If this callback function returns false, it will stop the library from repositioning the page, so that
    * you can implement your own animated page scrolling instead.
    */
  var scrollCallback: js.UndefOr[js.Function1[/* data */ IFrameScrollData, Boolean]] = js.native
  /**
    * Enable scroll bars in iFrame.
    */
  var scrolling: js.UndefOr[Boolean | auto] = js.native
  /**
    * Resize iFrame to content height.
    */
  var sizeHeight: js.UndefOr[Boolean] = js.native
  /**
    * Resize iFrame to content width.
    */
  var sizeWidth: js.UndefOr[Boolean] = js.native
  /**
    * Set the number of pixels the iFrame content size has to change by, before triggering a resize of the iFrame.
    */
  var tolerance: js.UndefOr[Double] = js.native
  /**
    * Width calculation method.
    */
  var widthCalculationMethod: js.UndefOr[WidthCalculationMethod] = js.native
}

object IFrameOptions {
  @scala.inline
  def apply(): IFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFrameOptions]
  }
  @scala.inline
  implicit class IFrameOptionsOps[Self <: IFrameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyMargin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyPadding(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckOrigin(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withClosedCallback(value: /* iframeId */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClosedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightCalculationMethod(value: HeightCalculationMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightCalculationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightCalculationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightCalculationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInPageLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPageLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInPageLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPageLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withInitCallback(value: /* iframe */ IFrameComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageCallback(value: /* data */ IFrameMessageData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMessageCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeFrom(value: parent | child): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withResizedCallback(value: /* data */ IFrameResizedData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizedCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizedCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollCallback(value: /* data */ IFrameScrollData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthCalculationMethod(value: WidthCalculationMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthCalculationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthCalculationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthCalculationMethod")(js.undefined)
        ret
    }
  }
  
}

