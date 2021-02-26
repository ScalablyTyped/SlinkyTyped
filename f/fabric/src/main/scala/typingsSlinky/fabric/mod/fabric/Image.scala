package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.fabricImplMod.IAllFilters
import typingsSlinky.fabric.fabricImplMod.IImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(element: js.UndefOr[scala.Nothing], options: IImageOptions) = this()
  def this(element: String, options: IImageOptions) = this()
  def this(element: HTMLImageElement, options: IImageOptions) = this()
  def this(element: HTMLVideoElement, options: IImageOptions) = this()
}
/* static members */
object Image {
  
  @JSImport("fabric", "fabric.Image")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric", "fabric.Image.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Default CSS class name for canvas
    */
  @JSImport("fabric", "fabric.Image.CSS_CANVAS")
  @js.native
  def CSS_CANVAS: String = js.native
  @scala.inline
  def CSS_CANVAS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CSS_CANVAS")(x.asInstanceOf[js.Any])
  
  @JSImport("fabric", "fabric.Image.filters")
  @js.native
  def filters: IAllFilters = js.native
  @scala.inline
  def filters_=(x: IAllFilters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filters")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Image instance from an SVG element
    * @param element Element to parse
    * @param callback Callback to execute when fabric.Image object is created
    * @param [options] Options object
    */
  @JSImport("fabric", "fabric.Image.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function): typingsSlinky.fabric.fabricImplMod.Image = js.native
  @JSImport("fabric", "fabric.Image.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function, options: IImageOptions): typingsSlinky.fabric.fabricImplMod.Image = js.native
  
  /**
    * Creates an instance of fabric.Image from an URL string
    * @param url URL to create an image from
    * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
    * @param [imgOptions] Options object
    */
  @JSImport("fabric", "fabric.Image.fromURL")
  @js.native
  def fromURL(url: String): typingsSlinky.fabric.fabricImplMod.Image = js.native
  @JSImport("fabric", "fabric.Image.fromURL")
  @js.native
  def fromURL(url: String, callback: js.UndefOr[scala.Nothing], imgOptions: IImageOptions): typingsSlinky.fabric.fabricImplMod.Image = js.native
  @JSImport("fabric", "fabric.Image.fromURL")
  @js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit]): typingsSlinky.fabric.fabricImplMod.Image = js.native
  @JSImport("fabric", "fabric.Image.fromURL")
  @js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit], imgOptions: IImageOptions): typingsSlinky.fabric.fabricImplMod.Image = js.native
}
