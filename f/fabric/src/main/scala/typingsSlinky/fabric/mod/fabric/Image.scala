package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.fabricImplMod.IAllFilters
import typingsSlinky.fabric.fabricImplMod.IImageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Image")
@js.native
/**
  * Constructor
  * @param element Image or Video element
  * @param [options] Options object
  */
class Image ()
  extends typingsSlinky.fabric.fabricImplMod.Image {
  def this(element: String) = this()
  def this(element: HTMLImageElement) = this()
  def this(element: HTMLVideoElement) = this()
  def this(element: String, options: IImageOptions) = this()
  def this(element: HTMLImageElement, options: IImageOptions) = this()
  def this(element: HTMLVideoElement, options: IImageOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Image")
@js.native
object Image extends js.Object {
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Default CSS class name for canvas
    */
  var CSS_CANVAS: String = js.native
  var filters: IAllFilters = js.native
  /**
    * Returns Image instance from an SVG element
    * @param element Element to parse
    * @param callback Callback to execute when fabric.Image object is created
    * @param [options] Options object
    */
  def fromElement(element: SVGElement, callback: js.Function): typingsSlinky.fabric.fabricImplMod.Image = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: IImageOptions): typingsSlinky.fabric.fabricImplMod.Image = js.native
  /**
    * Creates an instance of fabric.Image from an URL string
    * @param url URL to create an image from
    * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
    * @param [imgOptions] Options object
    */
  def fromURL(url: String): typingsSlinky.fabric.fabricImplMod.Image = js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit]): typingsSlinky.fabric.fabricImplMod.Image = js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit], imgOptions: IImageOptions): typingsSlinky.fabric.fabricImplMod.Image = js.native
}

