package typingsSlinky.jsqrcode.global

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.ImageData
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`10`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`11`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`12`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`13`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`14`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`16`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`8`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("qrcode")
@js.native
object qrcode extends js.Object {
  
  def binarize(th: Double): js.Array[Boolean] = js.native
  
  def callback(result: String): Unit = js.native
  
  def captureToCanvas(): Unit = js.native
  
  var debug: Boolean = js.native
  
  def decode(): Unit = js.native
  def decode(src: String): Unit = js.native
  
  def decode_url(s: String): String = js.native
  
  def decode_utf8(s: String): String = js.native
  
  def getMiddleBrightnessPerArea(image: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  
  def getPixel(x: Double, y: Double): Double = js.native
  
  def grayScaleToBitmap(grayScale: js.Array[Double]): js.typedarray.Uint8Array = js.native
  
  def grayscale(): js.typedarray.Uint8Array = js.native
  
  var height: Double = js.native
  
  var imagedata: ImageData = js.native
  
  def isUrl(s: String): Boolean = js.native
  
  var maxImgSize: Double = js.native
  
  def orderBestPatterns(patterns: js.Array[typingsSlinky.jsqrcode.AlignmentPattern]): Unit = js.native
  
  def process(ctx: CanvasRenderingContext2D): String = js.native
  
  var qrCodeSymbol: js.Any = js.native
  
  def setWebcam(videoId: String): Unit = js.native
  
  val sizeOfDataLengthInfo: js.Tuple3[
    js.Tuple4[`10`, `9`, `8`, `8`], 
    js.Tuple4[`12`, `11`, `16`, `10`], 
    js.Tuple4[`14`, `13`, `16`, `12`]
  ] = js.native
  
  def vidError(): Unit = js.native
  def vidError(error: js.Any): Unit = js.native
  
  var width: Double = js.native
}
