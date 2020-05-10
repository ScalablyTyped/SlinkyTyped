package typingsSlinky.html2canvas.Html2Canvas_

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html2CanvasOptions extends js.Object {
  /** Whether to allow cross-origin images to taint the canvas */
  var allowTaint: js.UndefOr[Boolean] = js.native
  /** Whether to parse and render the element asynchronously */
  var async: js.UndefOr[Boolean] = js.native
  /** Canvas background color, if none is specified in DOM. Set null for transparent */
  var backgroundColor: js.UndefOr[String | Null] = js.native
  /** Existing canvas element to use as a base for drawing on */
  var canvas: js.UndefOr[js.Any] = js.native
  /** Whether to use ForeignObject rendering if the browser supports it */
  var foreignObjectRendering: js.UndefOr[Boolean] = js.native
  /** Define the heigt of the canvas in pixels. If null, renders with full height of the window. */
  var height: js.UndefOr[Double] = js.native
  /** Predicate function which removes the matching elements from the render. */
  var ignoreElements: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.native
  /** Timeout for loading images, in milliseconds. Setting it to 0 will result in no timeout. */
  var imageTimeout: js.UndefOr[Double] = js.native
  /** Whether to render each letter seperately. Necessary if letter-spacing is used. */
  var letterRendering: js.UndefOr[Boolean] = js.native
  /** Whether to log events in the console. */
  var logging: js.UndefOr[Boolean] = js.native
  /** Callback function which is called when the Document has been cloned for rendering, can be used to modify the contents that will be rendered without affecting the original source document. */
  var onclone: js.UndefOr[js.Function1[/* doc */ HTMLDocument, Unit]] = js.native
  /** Url to the proxy which is to be used for loading cross-origin images. If left empty, cross-origin images won't be loaded. */
  var proxy: js.UndefOr[String] = js.native
  /** Whether to cleanup the cloned DOM elements html2canvas creates temporarily */
  var removeContainer: js.UndefOr[Boolean] = js.native
  /** The scale to use for rendering. Defaults to the browsers device pixel ratio. */
  var scale: js.UndefOr[Double] = js.native
  /** The x-scroll position to used when rendering element, (for example if the Element uses position: fixed ) */
  var scrollX: js.UndefOr[Double] = js.native
  /** The y-scroll position to used when rendering element, (for example if the Element uses position: fixed ) */
  var scrollY: js.UndefOr[Double] = js.native
  /** Use svg powered rendering where available (FF11+). */
  var svgRendering: js.UndefOr[Boolean] = js.native
  /** Whether to test each image if it taints the canvas before drawing them */
  var taintTest: js.UndefOr[Boolean] = js.native
  /** Whether to attempt to load cross-origin images as CORS served, before reverting back to proxy. */
  var useCORS: js.UndefOr[Boolean] = js.native
  /** Define the width of the canvas in pixels. If null, renders with full width of the window. */
  var width: js.UndefOr[Double] = js.native
  /** Window height to use when rendering Element, which may affect things like Media queries */
  var windowHeight: js.UndefOr[Double] = js.native
  /** Window width to use when rendering Element, which may affect things like Media queries */
  var windowWidth: js.UndefOr[Double] = js.native
  /** Crop canvas x-coordinate */
  var x: js.UndefOr[Double] = js.native
  /** Crop canvas y-coordinate */
  var y: js.UndefOr[Double] = js.native
}

object Html2CanvasOptions {
  @scala.inline
  def apply(): Html2CanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html2CanvasOptions]
  }
  @scala.inline
  implicit class Html2CanvasOptionsOps[Self <: Html2CanvasOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTaint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTaint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTaint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTaint")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(null)
        ret
    }
    @scala.inline
    def withCanvas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(js.undefined)
        ret
    }
    @scala.inline
    def withForeignObjectRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignObjectRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignObjectRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignObjectRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreElements(value: /* element */ HTMLElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreElements")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIgnoreElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreElements")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclone(value: /* doc */ HTMLDocument => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnclone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclone")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withTaintTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taintTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaintTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taintTest")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCORS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCORS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCORS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCORS")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
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
    def withY(value: Double): Self = {
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

