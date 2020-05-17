package typingsSlinky.electron.Electron

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeImage_ extends js.Object {
  /**
    * Add an image representation for a specific scale factor. This can be used to
    * explicitly add different scale factor representations to an image. This can be
    * called on empty images.
    */
  def addRepresentation(options: AddRepresentationOptions): Unit = js.native
  def crop(rect: Rectangle): NativeImage_ = js.native
  def getAspectRatio(): Double = js.native
  /**
    * The difference between getBitmap() and toBitmap() is, getBitmap() does not copy
    * the bitmap data, so you have to use the returned Buffer immediately in current
    * event loop tick, otherwise the data might be changed or destroyed.
    */
  def getBitmap(): Buffer = js.native
  def getBitmap(options: BitmapOptions): Buffer = js.native
  /**
    * Notice that the returned pointer is a weak pointer to the underlying native
    * image instead of a copy, so you must ensure that the associated nativeImage
    * instance is kept around.
    */
  def getNativeHandle(): Buffer = js.native
  def getSize(): Size = js.native
  def isEmpty(): Boolean = js.native
  def isTemplateImage(): Boolean = js.native
  /**
    * If only the height or the width are specified then the current aspect ratio will
    * be preserved in the resized image.
    */
  def resize(options: ResizeOptions): NativeImage_ = js.native
  /**
    * Marks the image as a template image.
    */
  def setTemplateImage(option: Boolean): Unit = js.native
  def toBitmap(): Buffer = js.native
  def toBitmap(options: ToBitmapOptions): Buffer = js.native
  def toDataURL(): String = js.native
  def toDataURL(options: ToDataURLOptions): String = js.native
  def toJPEG(quality: Double): Buffer = js.native
  def toPNG(): Buffer = js.native
  def toPNG(options: ToPNGOptions): Buffer = js.native
}

