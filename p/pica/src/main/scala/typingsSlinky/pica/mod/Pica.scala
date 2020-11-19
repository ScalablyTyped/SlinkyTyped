package typingsSlinky.pica.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pica extends js.Object {
  
  def resize(from: Blob, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
  def resize(from: Blob, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
  def resize(from: File, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
  def resize(from: File, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
  /**
    * Resize image from one canvas (or image) to another.
    * Sizes are taken from source and destination objects.
    * Result is Promise, resolved with to on success.
    * (!) If you need to process multiple images, do it sequentially to optimize CPU & memory use.
    * Pica already knows how to use multiple cores (if browser allows).
    */
  def resize(from: HTMLCanvasElement, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
  def resize(from: HTMLCanvasElement, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
  def resize(from: HTMLImageElement, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
  def resize(from: HTMLImageElement, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
  
  /**
    * Supplementary method, not recommended for direct use.
    * Resize Uint8Array with raw RGBA bitmap (don't confuse with jpeg / png / ... binaries).
    * It does not use tiles & webworkers. Left for special cases when you really need to process raw binary data (for example, if you decode jpeg files "manually").
    */
  def resizeBuffer(options: PicaResizeBufferOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Convenience method, similar to canvas.toBlob(), but with promise interface & polyfill for old browsers.
    */
  def toBlob(canvas: HTMLCanvasElement, mimeType: String): js.Promise[Blob] = js.native
  def toBlob(canvas: HTMLCanvasElement, mimeType: String, quality: Double): js.Promise[Blob] = js.native
}
