package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.fabric.fabricImplMod.ICanvasOptions
import typingsSlinky.fabric.fabricStrings.getImageData
import typingsSlinky.fabric.fabricStrings.setLineDash
import typingsSlinky.fabric.fabricStrings.toDataURL
import typingsSlinky.fabric.fabricStrings.toDataURLWithQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Canvas")
@js.native
/**
  * Constructor
  * @param element <canvas> element to initialize instance on
  * @param [options] Options object
  */
class Canvas ()
  extends typingsSlinky.fabric.fabricImplMod.Canvas {
  def this(element: String) = this()
  def this(element: HTMLCanvasElement) = this()
  def this(element: String, options: ICanvasOptions) = this()
  def this(element: Null, options: ICanvasOptions) = this()
  def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
}
/* static members */
@JSImport("fabric", "fabric.Canvas")
@js.native
object Canvas extends js.Object {
  
  var EMPTY_JSON: String = js.native
  
  /**
    * Provides a way to check support of some of the canvas methods
    * (either those of HTMLCanvasElement itself, or rendering context)
    * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
    */
  @JSName("supports")
  def supports_getImageData(methodName: getImageData): Boolean = js.native
  @JSName("supports")
  def supports_setLineDash(methodName: setLineDash): Boolean = js.native
  @JSName("supports")
  def supports_toDataURL(methodName: toDataURL): Boolean = js.native
  @JSName("supports")
  def supports_toDataURLWithQuality(methodName: toDataURLWithQuality): Boolean = js.native
  
  /**
    * Returns JSON representation of canvas
    * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    */
  def toJSON(): String = js.native
  def toJSON(propertiesToInclude: js.Array[String]): String = js.native
}
