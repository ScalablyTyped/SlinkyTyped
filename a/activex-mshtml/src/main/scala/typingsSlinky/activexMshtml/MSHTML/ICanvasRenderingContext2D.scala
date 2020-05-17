package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasRenderingContext2D extends js.Object {
  @JSName("MSHTML.ICanvasRenderingContext2D_typekey")
  var MSHTMLDotICanvasRenderingContext2D_typekey: ICanvasRenderingContext2D = js.native
  val canvas: IHTMLCanvasElement = js.native
  var fillStyle: js.Any = js.native
  var font: String = js.native
  var globalAlpha: Double = js.native
  var globalCompositeOperation: String = js.native
  var lineCap: String = js.native
  var lineJoin: String = js.native
  var lineWidth: Double = js.native
  var miterLimit: Double = js.native
  var shadowBlur: Double = js.native
  var shadowColor: String = js.native
  var shadowOffsetX: Double = js.native
  var shadowOffsetY: Double = js.native
  var strokeStyle: js.Any = js.native
  var textAlign: String = js.native
  var textBaseline: String = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  def beginPath(): Unit = js.native
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def clip(): Unit = js.native
  def closePath(): Unit = js.native
  def createImageData(a1: js.Any, a2: js.Any): ICanvasImageData = js.native
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): ICanvasGradient = js.native
  def createPattern(Image: js.Any, repetition: js.Any): ICanvasPattern = js.native
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): ICanvasGradient = js.native
  def drawImage(
    pSrc: js.Any,
    a1: js.Any,
    a2: js.Any,
    a3: js.Any,
    a4: js.Any,
    a5: js.Any,
    a6: js.Any,
    a7: js.Any,
    a8: js.Any
  ): Unit = js.native
  def fill(): Unit = js.native
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def fillText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit = js.native
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ICanvasImageData = js.native
  def isPointInPath(x: Double, y: Double): Boolean = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def measureText(text: String): ICanvasTextMetrics = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def putImageData(
    imagedata: ICanvasImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.Any,
    dirtyY: js.Any,
    dirtyWidth: js.Any,
    dirtyHeight: js.Any
  ): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def restore(): Unit = js.native
  def rotate(angle: Double): Unit = js.native
  def save(): Unit = js.native
  def scale(x: Double, y: Double): Unit = js.native
  def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  def stroke(): Unit = js.native
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def strokeText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit = js.native
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
}

object ICanvasRenderingContext2D {
  @scala.inline
  def apply(
    MSHTMLDotICanvasRenderingContext2D_typekey: ICanvasRenderingContext2D,
    arc: (Double, Double, Double, Double, Double, Double) => Unit,
    arcTo: (Double, Double, Double, Double, Double) => Unit,
    beginPath: () => Unit,
    bezierCurveTo: (Double, Double, Double, Double, Double, Double) => Unit,
    canvas: IHTMLCanvasElement,
    clearRect: (Double, Double, Double, Double) => Unit,
    clip: () => Unit,
    closePath: () => Unit,
    createImageData: (js.Any, js.Any) => ICanvasImageData,
    createLinearGradient: (Double, Double, Double, Double) => ICanvasGradient,
    createPattern: (js.Any, js.Any) => ICanvasPattern,
    createRadialGradient: (Double, Double, Double, Double, Double, Double) => ICanvasGradient,
    drawImage: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    fill: () => Unit,
    fillRect: (Double, Double, Double, Double) => Unit,
    fillStyle: js.Any,
    fillText: (String, Double, Double, js.Any) => Unit,
    font: String,
    getImageData: (Double, Double, Double, Double) => ICanvasImageData,
    globalAlpha: Double,
    globalCompositeOperation: String,
    isPointInPath: (Double, Double) => Boolean,
    lineCap: String,
    lineJoin: String,
    lineTo: (Double, Double) => Unit,
    lineWidth: Double,
    measureText: String => ICanvasTextMetrics,
    miterLimit: Double,
    moveTo: (Double, Double) => Unit,
    putImageData: (ICanvasImageData, Double, Double, js.Any, js.Any, js.Any, js.Any) => Unit,
    quadraticCurveTo: (Double, Double, Double, Double) => Unit,
    rect: (Double, Double, Double, Double) => Unit,
    restore: () => Unit,
    rotate: Double => Unit,
    save: () => Unit,
    scale: (Double, Double) => Unit,
    setTransform: (Double, Double, Double, Double, Double, Double) => Unit,
    shadowBlur: Double,
    shadowColor: String,
    shadowOffsetX: Double,
    shadowOffsetY: Double,
    stroke: () => Unit,
    strokeRect: (Double, Double, Double, Double) => Unit,
    strokeStyle: js.Any,
    strokeText: (String, Double, Double, js.Any) => Unit,
    textAlign: String,
    textBaseline: String,
    transform: (Double, Double, Double, Double, Double, Double) => Unit,
    translate: (Double, Double) => Unit
  ): ICanvasRenderingContext2D = {
    val __obj = js.Dynamic.literal(arc = js.Any.fromFunction6(arc), arcTo = js.Any.fromFunction5(arcTo), beginPath = js.Any.fromFunction0(beginPath), bezierCurveTo = js.Any.fromFunction6(bezierCurveTo), canvas = canvas.asInstanceOf[js.Any], clearRect = js.Any.fromFunction4(clearRect), clip = js.Any.fromFunction0(clip), closePath = js.Any.fromFunction0(closePath), createImageData = js.Any.fromFunction2(createImageData), createLinearGradient = js.Any.fromFunction4(createLinearGradient), createPattern = js.Any.fromFunction2(createPattern), createRadialGradient = js.Any.fromFunction6(createRadialGradient), drawImage = js.Any.fromFunction9(drawImage), fill = js.Any.fromFunction0(fill), fillRect = js.Any.fromFunction4(fillRect), fillStyle = fillStyle.asInstanceOf[js.Any], fillText = js.Any.fromFunction4(fillText), font = font.asInstanceOf[js.Any], getImageData = js.Any.fromFunction4(getImageData), globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any], isPointInPath = js.Any.fromFunction2(isPointInPath), lineCap = lineCap.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineTo = js.Any.fromFunction2(lineTo), lineWidth = lineWidth.asInstanceOf[js.Any], measureText = js.Any.fromFunction1(measureText), miterLimit = miterLimit.asInstanceOf[js.Any], moveTo = js.Any.fromFunction2(moveTo), putImageData = js.Any.fromFunction7(putImageData), quadraticCurveTo = js.Any.fromFunction4(quadraticCurveTo), rect = js.Any.fromFunction4(rect), restore = js.Any.fromFunction0(restore), rotate = js.Any.fromFunction1(rotate), save = js.Any.fromFunction0(save), scale = js.Any.fromFunction2(scale), setTransform = js.Any.fromFunction6(setTransform), shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffsetX = shadowOffsetX.asInstanceOf[js.Any], shadowOffsetY = shadowOffsetY.asInstanceOf[js.Any], stroke = js.Any.fromFunction0(stroke), strokeRect = js.Any.fromFunction4(strokeRect), strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeText = js.Any.fromFunction4(strokeText), textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], transform = js.Any.fromFunction6(transform), translate = js.Any.fromFunction2(translate))
    __obj.updateDynamic("MSHTML.ICanvasRenderingContext2D_typekey")(MSHTMLDotICanvasRenderingContext2D_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasRenderingContext2D]
  }
  @scala.inline
  implicit class ICanvasRenderingContext2DOps[Self <: ICanvasRenderingContext2D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotICanvasRenderingContext2D_typekey(value: ICanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ICanvasRenderingContext2D_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArc(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withArcTo(value: (Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcTo")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withBeginPath(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBezierCurveTo(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bezierCurveTo")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withCanvas(value: IHTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearRect(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearRect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withClip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClosePath(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateImageData(value: (js.Any, js.Any) => ICanvasImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImageData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateLinearGradient(value: (Double, Double, Double, Double) => ICanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLinearGradient")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCreatePattern(value: (js.Any, js.Any) => ICanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPattern")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateRadialGradient(value: (Double, Double, Double, Double, Double, Double) => ICanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRadialGradient")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withDrawImage(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawImage")(js.Any.fromFunction9(value))
        ret
    }
    @scala.inline
    def withFill(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFillRect(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFillStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillText(value: (String, Double, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillText")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetImageData(value: (Double, Double, Double, Double) => ICanvasImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageData")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGlobalAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalCompositeOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalCompositeOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPointInPath(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPointInPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLineCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineTo(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasureText(value: String => ICanvasTextMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveTo(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPutImageData(value: (ICanvasImageData, Double, Double, js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putImageData")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withQuadraticCurveTo(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadraticCurveTo")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRect(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRestore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRotate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScale(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTransform(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransform")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStrokeRect(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeRect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withStrokeStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeText(value: (String, Double, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeText")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBaseline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withTranslate(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

