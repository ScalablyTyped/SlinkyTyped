package typingsSlinky.blobUtil

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.BlobPropertyBag
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blob-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def arrayBufferToBinaryString(buffer: js.typedarray.ArrayBuffer): String = js.native
  
  def arrayBufferToBlob(buffer: js.typedarray.ArrayBuffer): Blob = js.native
  def arrayBufferToBlob(buffer: js.typedarray.ArrayBuffer, `type`: String): Blob = js.native
  
  def base64StringToBlob(base64: String): Blob = js.native
  def base64StringToBlob(base64: String, `type`: String): Blob = js.native
  
  def binaryStringToArrayBuffer(binary: String): js.typedarray.ArrayBuffer = js.native
  
  def binaryStringToBlob(binary: String): Blob = js.native
  def binaryStringToBlob(binary: String, `type`: String): Blob = js.native
  
  def blobToArrayBuffer(blob: Blob): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def blobToBase64String(blob: Blob): js.Promise[String] = js.native
  
  def blobToBinaryString(blob: Blob): js.Promise[String] = js.native
  
  def blobToDataURL(blob: Blob): js.Promise[String] = js.native
  
  def canvasToBlob(canvas: HTMLCanvasElement): js.Promise[Blob] = js.native
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: js.UndefOr[scala.Nothing], quality: Double): js.Promise[Blob] = js.native
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: String): js.Promise[Blob] = js.native
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: String, quality: Double): js.Promise[Blob] = js.native
  
  def createBlob(parts: js.Array[_]): Blob = js.native
  def createBlob(parts: js.Array[_], properties: String): Blob = js.native
  def createBlob(parts: js.Array[_], properties: BlobPropertyBag): Blob = js.native
  
  def createObjectURL(blob: Blob): String = js.native
  
  def dataURLToBlob(dataURL: String): Blob = js.native
  
  def imgSrcToBlob(src: String): js.Promise[Blob] = js.native
  def imgSrcToBlob(
    src: String,
    `type`: js.UndefOr[scala.Nothing],
    crossOrigin: js.UndefOr[scala.Nothing],
    quality: Double
  ): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: js.UndefOr[scala.Nothing], crossOrigin: String): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: js.UndefOr[scala.Nothing], crossOrigin: String, quality: Double): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: String): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: js.UndefOr[scala.Nothing], quality: Double): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: String): js.Promise[Blob] = js.native
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[Blob] = js.native
  
  def imgSrcToDataURL(src: String): js.Promise[String] = js.native
  def imgSrcToDataURL(
    src: String,
    `type`: js.UndefOr[scala.Nothing],
    crossOrigin: js.UndefOr[scala.Nothing],
    quality: Double
  ): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: js.UndefOr[scala.Nothing], crossOrigin: String): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: js.UndefOr[scala.Nothing], crossOrigin: String, quality: Double): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: String): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: js.UndefOr[scala.Nothing], quality: Double): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String): js.Promise[String] = js.native
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[String] = js.native
  
  def revokeObjectURL(url: String): Unit = js.native
}
