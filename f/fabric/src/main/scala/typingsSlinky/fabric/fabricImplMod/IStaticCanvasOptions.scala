package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.fabric.anon.Tl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStaticCanvasOptions extends js.Object {
  /**
  	 * Indicates whether the browser can be scrolled when using a touchscreen and dragging on the canvas
  	 * @type Boolean
  	 */
  var allowTouchScrolling: js.UndefOr[Boolean] = js.native
  /**
  	 * Background color of canvas instance.
  	 * Should be set via {@link fabric.StaticCanvas#setBackgroundColor}.
  	 * @type {(String|fabric.Pattern)}
  	 */
  var backgroundColor: js.UndefOr[String | Pattern] = js.native
  /**
  	 * Background image of canvas instance.
  	 * Should be set via {@link fabric.StaticCanvas#setBackgroundImage}.
  	 * <b>Backwards incompatibility note:</b> The "backgroundImageOpacity"
  	 * and "backgroundImageStretch" properties are deprecated since 1.3.9.
  	 * Use {@link fabric.Image#opacity}, {@link fabric.Image#width} and {@link fabric.Image#height}.
  	 * since 2.4.0 image caching is active, please when putting an image as background, add to the
  	 * canvas property a reference to the canvas it is on. Otherwise the image cannot detect the zoom
  	 * vale. As an alternative you can disable image objectCaching
  	 * @type fabric.Image
  	 */
  var backgroundImage: js.UndefOr[Image | String] = js.native
  /**
  	 * if set to false background image is not affected by viewport transform
  	 * @since 1.6.3
  	 * @type Boolean
  	 */
  var backgroundVpt: js.UndefOr[Boolean] = js.native
  /**
  	 * a fabricObject that, without stroke define a clipping area with their shape. filled in black
  	 * the clipPath object gets used when the canvas has rendered, and the context is placed in the
  	 * top left corner of the canvas.
  	 * clipPath will clip away controls, if you do not want this to happen use controlsAboveOverlay = true
  	 * @type fabric.Object
  	 */
  var clipPath: js.UndefOr[Object] = js.native
  /**
  	 * Function that determines clipping of entire canvas area
  	 * Being passed context as first argument.
  	 * If you are using code minification, ctx argument can be minified/manglied you should use
  	 * as a workaround `var ctx = arguments[0];` in the function;
  	 * See clipping canvas area in {@link https://github.com/kangax/fabric.js/wiki/FAQ}
  	 * @deprecated since 2.0.0
  	 * @type Function
  	 */
  var clipTo: js.UndefOr[js.Function1[/* context */ CanvasRenderingContext2D, Unit]] = js.native
  /**
  	 * Indicates whether object controls (borders/controls) are rendered above overlay image
  	 * @type Boolean
  	 */
  var controlsAboveOverlay: js.UndefOr[Boolean] = js.native
  /**
  	 * When true, canvas is scaled by devicePixelRatio for better rendering on retina screens
  	 * @type Boolean
  	 */
  var enableRetinaScaling: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates whether this canvas will use image smoothing, this is on by default in browsers
  	 */
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates whether toObject/toDatalessObject should include default values
  	 * if set to false, takes precedence over the object value.
  	 * @type Boolean
  	 */
  var includeDefaultValues: js.UndefOr[Boolean] = js.native
  /**
  	 * Overlay color of canvas instance.
  	 * Should be set via {@link fabric.StaticCanvas#setOverlayColor}
  	 * @since 1.3.9
  	 * @type {(String|fabric.Pattern)}
  	 */
  var overlayColor: js.UndefOr[String | Pattern] = js.native
  /**
  	 * Overlay image of canvas instance.
  	 * Should be set via {@link fabric.StaticCanvas#setOverlayImage}.
  	 * <b>Backwards incompatibility note:</b> The "overlayImageLeft"
  	 * and "overlayImageTop" properties are deprecated since 1.3.9.
  	 * Use {@link fabric.Image#left} and {@link fabric.Image#top}.
  	 * since 2.4.0 image caching is active, please when putting an image as overlay, add to the
  	 * canvas property a reference to the canvas it is on. Otherwise the image cannot detect the zoom
  	 * vale. As an alternative you can disable image objectCaching
  	 * @type fabric.Image
  	 */
  var overlayImage: js.UndefOr[Image] = js.native
  /**
  	 * if set to false overlay image is not affected by viewport transform
  	 * @since 1.6.3
  	 * @type Boolean
  	 */
  var overlayVpt: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates whether {@link fabric.Collection.add}, {@link fabric.Collection.insertAt} and {@link fabric.Collection.remove},
  	 * {@link fabric.StaticCanvas.moveTo}, {@link fabric.StaticCanvas.clear} and many more, should also re-render canvas.
  	 * Disabling this option will not give a performance boost when adding/removing a lot of objects to/from canvas at once
  	 * since the renders are quequed and executed one per frame.
  	 * Disabling is suggested anyway and managing the renders of the app manually is not a big effort ( canvas.requestRenderAll() )
  	 * Left default to true to do not break documentation and old app, fiddles.
  	 * @type Boolean
  	 */
  var renderOnAddRemove: js.UndefOr[Boolean] = js.native
  /**
  	 * Based on vptCoords and object.aCoords, skip rendering of objects that
  	 * are not included in current viewport.
  	 * May greatly help in applications with crowded canvas and use of zoom/pan
  	 * If One of the corner of the bounding box of the object is on the canvas
  	 * the objects get rendered.
  	 * @memberOf fabric.StaticCanvas.prototype
  	 * @type Boolean
  	 */
  var skipOffscreen: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates whether objects' state should be saved
  	 * @type Boolean
  	 */
  var stateful: js.UndefOr[Boolean] = js.native
  /**
  	 * When true, getSvgTransform() will apply the StaticCanvas.viewportTransform to the SVG transformation. When true,
  	 * a zoomed canvas will then produce zoomed SVG output.
  	 * @type Boolean
  	 */
  var svgViewportTransformation: js.UndefOr[Boolean] = js.native
  /**
  	 * The transformation (in the format of Canvas transform) which focuses the viewport
  	 */
  var viewportTransform: js.UndefOr[js.Array[Double]] = js.native
  /**
  	 * Describe canvas element extension over design
  	 * properties are tl,tr,bl,br.
  	 * if canvas is not zoomed/panned those points are the four corner of canvas
  	 * if canvas is viewportTransformed you those points indicate the extension
  	 * of canvas element in plain untrasformed coordinates
  	 * The coordinates get updated with @method calcViewportBoundaries.
  	 * @memberOf fabric.StaticCanvas.prototype
  	 */
  var vptCoords: js.UndefOr[Tl] = js.native
}

object IStaticCanvasOptions {
  @scala.inline
  def apply(): IStaticCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStaticCanvasOptions]
  }
  @scala.inline
  implicit class IStaticCanvasOptionsOps[Self <: IStaticCanvasOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTouchScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTouchScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String | Pattern): Self = {
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
    def withBackgroundImage(value: Image | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundVpt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundVpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundVpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundVpt")(js.undefined)
        ret
    }
    @scala.inline
    def withClipPath(value: Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(js.undefined)
        ret
    }
    @scala.inline
    def withClipTo(value: /* context */ CanvasRenderingContext2D => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClipTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipTo")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsAboveOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsAboveOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsAboveOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsAboveOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRetinaScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRetinaScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRetinaScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRetinaScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSmoothingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSmoothingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSmoothingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSmoothingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDefaultValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDefaultValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultValues")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayColor(value: String | Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayImage")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayVpt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayVpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayVpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayVpt")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderOnAddRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOnAddRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderOnAddRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOnAddRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipOffscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipOffscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withStateful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateful")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgViewportTransformation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgViewportTransformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgViewportTransformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgViewportTransformation")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportTransform(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withVptCoords(value: Tl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vptCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVptCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vptCoords")(js.undefined)
        ret
    }
  }
  
}

