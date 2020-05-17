package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the basic graphical output operations for a canvas.
  *
  * This interface is a simplified version of the {@link XCanvas} interface. It holds explicit state, i.e. the pen and fill color, the current
  * transformation, clip and font are persistently remembered.
  *
  * In contrast to the {@link XCanvas} interface, {@link XSimpleCanvas} does not distinguish between stroke and fill operations; instead, switching
  * between stroke and fill (or taking both) works by setting appropriate pen and fill colors.
  */
@js.native
trait XSimpleCanvas extends XInterface {
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  val Canvas: XCanvas = js.native
  /** Retrieve current clip rect */
  val CurrentClipRect: RealRectangle2D = js.native
  /** Retrieve color currently used for fills */
  val CurrentFillColor: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  val CurrentFont: XCanvasFont = js.native
  /** Retrieve color currently used for lines. */
  val CurrentPenColor: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  /** Retrieve current transformation matrix */
  val CurrentTransformation: AffineMatrix2D = js.native
  /**
    * Retrieve view state.
    * @returns the view state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  val CurrentViewState: ViewState = js.native
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  val Device: XGraphicDevice = js.native
  /**
    * Request the font metrics of the current font.
    * @returns the font metrics of the currently selected font.
    */
  val FontMetrics: typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontMetrics = js.native
  /**
    * Draws the bitmap on the canvas.
    * @param xBitmap Bitmap to render
    * @param aLeftTop Left, top position of the bitmap on the destination canvas.
    */
  def drawBitmap(xBitmap: XBitmap, aLeftTop: RealPoint2D): Unit = js.native
  /** Draws a line on the canvas. */
  def drawLine(aStartPoint: RealPoint2D, aEndPoint: RealPoint2D): Unit = js.native
  /** Sets a single pixel on the canvas. */
  def drawPixel(aPoint: RealPoint2D): Unit = js.native
  /** Draws a poly-polygon on the canvas. */
  def drawPolyPolygon(xPolyPolygon: XPolyPolygon2D): Unit = js.native
  /** Draws a rectangle on the canvas. */
  def drawRect(aRect: RealRectangle2D): Unit = js.native
  /**
    * Draws text on the canvas.
    * @param aText Text to render. The text color is the current pen color.
    * @param aOutPos Output position of the text. This is the left or right edge, depending on nTextDirection. Output position is always relative to the font
    * @param nTextDirection A value from the {@link TextDirection} collection, denoting the main writing direction for this string. The main writing direction
    */
  def drawText(aText: StringContext, aOutPos: RealPoint2D, nTextDirection: Double): Unit = js.native
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  def getCanvas(): XCanvas = js.native
  /** Retrieve current clip rect */
  def getCurrentClipRect(): RealRectangle2D = js.native
  /** Retrieve color currently used for fills */
  def getCurrentFillColor(): typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  def getCurrentFont(): XCanvasFont = js.native
  /** Retrieve color currently used for lines. */
  def getCurrentPenColor(): typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  /**
    * Retrieve render state.
    * @param bUseFillColor When true, the Color member of the {@link RenderState} is initialized with the current fill color; when false, the current pen colo
    * @returns the render state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentRenderState(bUseFillColor: Boolean): RenderState = js.native
  /** Retrieve current transformation matrix */
  def getCurrentTransformation(): AffineMatrix2D = js.native
  /**
    * Retrieve view state.
    * @returns the view state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentViewState(): ViewState = js.native
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  def getDevice(): XGraphicDevice = js.native
  /**
    * Request the font metrics of the current font.
    * @returns the font metrics of the currently selected font.
    */
  def getFontMetrics(): typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontMetrics = js.native
  /**
    * Select a font.
    *
    * This method selects the specified font (or a close substitute) as the current font for text output.
    * @param sFontName The name of the font (like e.g. Arial)
    * @param size The size of the font (note that this is not the usual points unit, but in the same coordinate system as the other rendering operations - usu
    * @param bold When true, selected font is bold.
    * @param italic When true, selected font is italic
    */
  def selectFont(sFontName: String, size: Double, bold: Boolean, italic: Boolean): Unit = js.native
  /**
    * Sets the fill color.
    *
    * To disable filling, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setFillColor(nsRgbaColor: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color): Unit = js.native
  /**
    * Sets the color used by line and text operations.
    *
    * To disable stroking, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setPenColor(nsRgbaColor: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color): Unit = js.native
  /** Sets the clip to the specified rectangle. */
  def setRectClip(aRect: RealRectangle2D): Unit = js.native
  /** Set the current transform matrix. */
  def setTransformation(aTransform: AffineMatrix2D): Unit = js.native
}

object XSimpleCanvas {
  @scala.inline
  def apply(
    Canvas: XCanvas,
    CurrentClipRect: RealRectangle2D,
    CurrentFillColor: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color,
    CurrentFont: XCanvasFont,
    CurrentPenColor: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color,
    CurrentTransformation: AffineMatrix2D,
    CurrentViewState: ViewState,
    Device: XGraphicDevice,
    FontMetrics: FontMetrics,
    acquire: () => Unit,
    drawBitmap: (XBitmap, RealPoint2D) => Unit,
    drawLine: (RealPoint2D, RealPoint2D) => Unit,
    drawPixel: RealPoint2D => Unit,
    drawPolyPolygon: XPolyPolygon2D => Unit,
    drawRect: RealRectangle2D => Unit,
    drawText: (StringContext, RealPoint2D, Double) => Unit,
    getCanvas: () => XCanvas,
    getCurrentClipRect: () => RealRectangle2D,
    getCurrentFillColor: () => typingsSlinky.activexLibreoffice.com_.sun.star.util.Color,
    getCurrentFont: () => XCanvasFont,
    getCurrentPenColor: () => typingsSlinky.activexLibreoffice.com_.sun.star.util.Color,
    getCurrentRenderState: Boolean => RenderState,
    getCurrentTransformation: () => AffineMatrix2D,
    getCurrentViewState: () => ViewState,
    getDevice: () => XGraphicDevice,
    getFontMetrics: () => FontMetrics,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectFont: (String, Double, Boolean, Boolean) => Unit,
    setFillColor: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color => Unit,
    setPenColor: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color => Unit,
    setRectClip: RealRectangle2D => Unit,
    setTransformation: AffineMatrix2D => Unit
  ): XSimpleCanvas = {
    val __obj = js.Dynamic.literal(Canvas = Canvas.asInstanceOf[js.Any], CurrentClipRect = CurrentClipRect.asInstanceOf[js.Any], CurrentFillColor = CurrentFillColor.asInstanceOf[js.Any], CurrentFont = CurrentFont.asInstanceOf[js.Any], CurrentPenColor = CurrentPenColor.asInstanceOf[js.Any], CurrentTransformation = CurrentTransformation.asInstanceOf[js.Any], CurrentViewState = CurrentViewState.asInstanceOf[js.Any], Device = Device.asInstanceOf[js.Any], FontMetrics = FontMetrics.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), drawBitmap = js.Any.fromFunction2(drawBitmap), drawLine = js.Any.fromFunction2(drawLine), drawPixel = js.Any.fromFunction1(drawPixel), drawPolyPolygon = js.Any.fromFunction1(drawPolyPolygon), drawRect = js.Any.fromFunction1(drawRect), drawText = js.Any.fromFunction3(drawText), getCanvas = js.Any.fromFunction0(getCanvas), getCurrentClipRect = js.Any.fromFunction0(getCurrentClipRect), getCurrentFillColor = js.Any.fromFunction0(getCurrentFillColor), getCurrentFont = js.Any.fromFunction0(getCurrentFont), getCurrentPenColor = js.Any.fromFunction0(getCurrentPenColor), getCurrentRenderState = js.Any.fromFunction1(getCurrentRenderState), getCurrentTransformation = js.Any.fromFunction0(getCurrentTransformation), getCurrentViewState = js.Any.fromFunction0(getCurrentViewState), getDevice = js.Any.fromFunction0(getDevice), getFontMetrics = js.Any.fromFunction0(getFontMetrics), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectFont = js.Any.fromFunction4(selectFont), setFillColor = js.Any.fromFunction1(setFillColor), setPenColor = js.Any.fromFunction1(setPenColor), setRectClip = js.Any.fromFunction1(setRectClip), setTransformation = js.Any.fromFunction1(setTransformation))
    __obj.asInstanceOf[XSimpleCanvas]
  }
  @scala.inline
  implicit class XSimpleCanvasOps[Self <: XSimpleCanvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: XCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentClipRect(value: RealRectangle2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentClipRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFillColor(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFont(value: XCanvasFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPenColor(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPenColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTransformation(value: AffineMatrix2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentTransformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentViewState(value: ViewState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentViewState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: XGraphicDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontMetrics(value: FontMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawBitmap(value: (XBitmap, RealPoint2D) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBitmap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrawLine(value: (RealPoint2D, RealPoint2D) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLine")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrawPixel(value: RealPoint2D => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPixel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrawPolyPolygon(value: XPolyPolygon2D => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPolyPolygon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrawRect(value: RealRectangle2D => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawRect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrawText(value: (StringContext, RealPoint2D, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawText")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetCanvas(value: () => XCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCanvas")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentClipRect(value: () => RealRectangle2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentClipRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentFillColor(value: () => typingsSlinky.activexLibreoffice.com_.sun.star.util.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentFillColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentFont(value: () => XCanvasFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentFont")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentPenColor(value: () => typingsSlinky.activexLibreoffice.com_.sun.star.util.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPenColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentRenderState(value: Boolean => RenderState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentRenderState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentTransformation(value: () => AffineMatrix2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentTransformation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentViewState(value: () => ViewState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentViewState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDevice(value: () => XGraphicDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFontMetrics(value: () => FontMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontMetrics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectFont(value: (String, Double, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFont")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetFillColor(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFillColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPenColor(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPenColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRectClip(value: RealRectangle2D => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRectClip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTransformation(value: AffineMatrix2D => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransformation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

