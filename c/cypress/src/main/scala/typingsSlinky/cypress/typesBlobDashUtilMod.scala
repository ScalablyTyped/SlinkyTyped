package typingsSlinky.cypress

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cypress/types/blob-util", JSImport.Namespace)
@js.native
object typesBlobDashUtilMod extends js.Object {
  def arrayBufferToBlob(arrayBuff: scala.scalajs.js.typedarray.ArrayBuffer): js.Promise[Blob] = js.native
  def arrayBufferToBlob(arrayBuff: scala.scalajs.js.typedarray.ArrayBuffer, `type`: String): js.Promise[Blob] = js.native
  def base64StringToBlob(base64: String): js.Promise[Blob] = js.native
  def base64StringToBlob(base64: String, `type`: String): js.Promise[Blob] = js.native
  def binaryStringToBlob(binary: String): js.Promise[Blob] = js.native
  def binaryStringToBlob(binary: String, `type`: String): js.Promise[Blob] = js.native
  def blobToArrayBuffer(blob: Blob): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def blobToBase64String(blob: Blob): js.Promise[String] = js.native
  def blobToBinaryString(blob: Blob): js.Promise[String] = js.native
  def blobToDataURL(blob: Blob): js.Promise[String] = js.native
  def canvasToBlob(canvas: HTMLCanvasElement): js.Promise[Blob] = js.native
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: String): js.Promise[Blob] = js.native
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: String, quality: Double): js.Promise[Blob] = js.native
  def createBlob(parts: js.Array[_]): Blob = js.native
  def createBlob(parts: js.Array[_], options: Anon_Type): Blob = js.native
  def createObjectURL(blob: Blob): String = js.native
  def dataURLToBlob(dataURL: String): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: String): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: String): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[Blob] = js.native
  def imgSrcToDataURL(src: String): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: String): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[String] = js.native
  def revokeObjectURL(url: String): Unit = js.native
}

