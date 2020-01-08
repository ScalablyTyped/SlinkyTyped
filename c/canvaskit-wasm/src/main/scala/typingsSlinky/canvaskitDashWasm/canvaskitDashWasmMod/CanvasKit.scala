package typingsSlinky.canvaskitDashWasm.canvaskitDashWasmMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.canvaskitDashWasm.Anon_A16float
import typingsSlinky.canvaskitDashWasm.Anon_Bevel
import typingsSlinky.canvaskitDashWasm.Anon_Black
import typingsSlinky.canvaskitDashWasm.Anon_Butt
import typingsSlinky.canvaskitDashWasm.Anon_Center
import typingsSlinky.canvaskitDashWasm.Anon_Clamp
import typingsSlinky.canvaskitDashWasm.Anon_Clear
import typingsSlinky.canvaskitDashWasm.Anon_Condensed
import typingsSlinky.canvaskitDashWasm.Anon_Difference
import typingsSlinky.canvaskitDashWasm.Anon_DifferenceIntersect
import typingsSlinky.canvaskitDashWasm.Anon_Downstream
import typingsSlinky.canvaskitDashWasm.Anon_EvenOdd
import typingsSlinky.canvaskitDashWasm.Anon_Fill
import typingsSlinky.canvaskitDashWasm.Anon_High
import typingsSlinky.canvaskitDashWasm.Anon_Inner
import typingsSlinky.canvaskitDashWasm.Anon_Italic
import typingsSlinky.canvaskitDashWasm.Anon_JPEG
import typingsSlinky.canvaskitDashWasm.Anon_LTR
import typingsSlinky.canvaskitDashWasm.Anon_Lines
import typingsSlinky.canvaskitDashWasm.Anon_Opaque
import typingsSlinky.canvaskitDashWasm.Anon_TriangleFan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasKit extends js.Object {
  // enums
  val Affinity: SkEnum[SkAffinity, Anon_Downstream] = js.native
  val AlphaType: SkEnum[SkAlphaType, Anon_Opaque] = js.native
  // colors
  val BLACK: SkColor = js.native
  val BLUE: SkColor = js.native
  val BlendMode: SkEnum[SkBlendMode, Anon_Clear] = js.native
  val BlurStyle: SkEnum[SkBlurStyle, Anon_Inner] = js.native
  val CYAN: SkColor = js.native
  val ClipOp: SkEnum[SkClipOp, Anon_Difference] = js.native
  val ColorType: SkEnum[SkColorType, Anon_A16float] = js.native
  val FillType: SkEnum[SkFillType, Anon_EvenOdd] = js.native
  val FilterQuality: SkEnum[SkFilterQuality, Anon_High] = js.native
  val FontSlant: SkEnum[SkFontSlant, Anon_Italic] = js.native
  val FontWeight: SkEnum[SkFontWeight, Anon_Black] = js.native
  val FontWidth: SkEnum[SkFontWidth, Anon_Condensed] = js.native
  val ImageFormat: SkEnum[SkImageFormat, Anon_JPEG] = js.native
  // decoration
  val LineThroughDecoration: SkDecoration = js.native
  val NoDecoration: SkDecoration = js.native
  val OverlineDecoration: SkDecoration = js.native
  val PaintStyle: SkEnum[SkPaintStyle, Anon_Fill] = js.native
  val ParagraphBuilder: SkParagraphBuilderFactory = js.native
  val ParagraphStyle: ParagraphStyleConstructor = js.native
  val PathOp: SkEnum[SkPathOp, Anon_DifferenceIntersect] = js.native
  val PointMode: SkEnum[SkPointMode, Anon_Lines] = js.native
  val RED: SkColor = js.native
  val ShapedText: ShapedTextConstructor = js.native
  val SkColorFilter: SkColorFilterFactory = js.native
  val SkFont: SkFontConstructor = js.native
  val SkFontMgr: SkFontMgrFactory = js.native
  val SkImageFilter: SkImageFilterFactory = js.native
  val SkMaskFilter: SkMaskFilterFactory = js.native
  // classes
  val SkPaint: SkPaintConstructor = js.native
  val SkPath: SKPathConstructor = js.native
  val SkPictureRecorder: SkPictureRecorderConstructor = js.native
  val SkTextBlob: SkTextBlobFactory = js.native
  val StrokeCap: SkEnum[SkStrokeCap, Anon_Butt] = js.native
  val StrokeJoin: SkEnum[SkStrokeJoin, Anon_Bevel] = js.native
  val TRANSPARENT: SkColor = js.native
  val TextAlign: SkEnum[SkTextAlign, Anon_Center] = js.native
  val TextDirection: SkEnum[SkTextDirection, Anon_LTR] = js.native
  val TextStyle: TextStyleConstructor = js.native
  val TileMode: SkEnum[SkTileMode, Anon_Clamp] = js.native
  val UnderlineDecoration: SkDecoration = js.native
  val VertexMode: SkEnum[SkVertexMode, Anon_TriangleFan] = js.native
  val WHITE: SkColor = js.native
  val YELLOW: SkColor = js.native
  // factories
  def Color(r: Double, g: Double, b: Double, a: Double): SkColor = js.native
  def LTRBRect(left: Double, top: Double, right: Double, bottom: Double): SkRect = js.native
  def MakeAnimatedImageFromEncoded(buffer: scala.scalajs.js.typedarray.ArrayBuffer): SkAnimatedImage = js.native
  def MakeAnimation(lottieJson: js.Any): SkAnimation = js.native
  def MakeCanvasSurface(canvas: HTMLCanvasElement): SkSurface = js.native
  def MakeImageFromEncoded(buffer: scala.scalajs.js.typedarray.ArrayBuffer): SkImage = js.native
  def MakeLinearGradientShader(
    start: SkPoint,
    end: SkPoint,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: Null,
    flags: Double
  ): SkShader = js.native
  def MakeLinearGradientShader(
    start: SkPoint,
    end: SkPoint,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: SkMatrix,
    flags: Double
  ): SkShader = js.native
  def MakePathFromCmds(cmds: js.Array[SkPathCommand]): typingsSlinky.canvaskitDashWasm.canvaskitDashWasmMod.SkPath = js.native
  def MakePathFromOp(
    first: typingsSlinky.canvaskitDashWasm.canvaskitDashWasmMod.SkPath,
    second: typingsSlinky.canvaskitDashWasm.canvaskitDashWasmMod.SkPath,
    op: SkPathOp
  ): typingsSlinky.canvaskitDashWasm.canvaskitDashWasmMod.SkPath = js.native
  def MakePathFromSVGString(svg: String): typingsSlinky.canvaskitDashWasm.canvaskitDashWasmMod.SkPath = js.native
  def MakeRadialGradientShader(
    center: SkPoint,
    radius: Double,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: Null,
    flags: Double
  ): SkShader = js.native
  def MakeRadialGradientShader(
    center: SkPoint,
    radius: Double,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: SkMatrix,
    flags: Double
  ): SkShader = js.native
  def MakeSkCornerPathEffect(radius: Double): SkPathEffect = js.native
  def MakeSkDashPathEffect(intervals: js.Array[Double], phase: Double): SkPathEffect = js.native
  def MakeSkDiscretePathEffect(frequency: Double, amplitude: Double, seed: Double): SkPathEffect = js.native
  def MakeSurface(width: Double, height: Double): SkSurface = js.native
  def MakeTwoPointConicalGradientShader(
    start: SkPoint,
    startRadius: Double,
    end: SkPoint,
    endRadius: Double,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: Null,
    flags: Double
  ): SkShader = js.native
  def MakeTwoPointConicalGradientShader(
    start: SkPoint,
    startRadius: Double,
    end: SkPoint,
    endRadius: Double,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: SkMatrix,
    flags: Double
  ): SkShader = js.native
  def RRectXY(rect: SkRect, rx: Double, ry: Double): SkRRect = js.native
  def XYWHRect(x: Double, y: Double, width: Double, height: Double): SkRect = js.native
  // methods
  def currentContext(): SkContext = js.native
  def setCurrentContext(context: SkContext): Unit = js.native
}

