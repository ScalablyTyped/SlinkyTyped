package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.fabric.fabricImplMod.ICanvasOptions
import typingsSlinky.fabric.fabricStrings.getImageData
import typingsSlinky.fabric.fabricStrings.setLineDash
import typingsSlinky.fabric.fabricStrings.toDataURL
import typingsSlinky.fabric.fabricStrings.toDataURLWithQuality
import org.scalablytyped.runtime.StObject
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
  def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
  def this(element: Null, options: ICanvasOptions) = this()
}
/* static members */
object Canvas {
  
  @JSImport("fabric", "fabric.Canvas")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric", "fabric.Canvas.EMPTY_JSON")
  @js.native
  def EMPTY_JSON: String = js.native
  @scala.inline
  def EMPTY_JSON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_JSON")(x.asInstanceOf[js.Any])
  
  /**
    * Provides a way to check support of some of the canvas methods
    * (either those of HTMLCanvasElement itself, or rendering context)
    * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
    */
  @JSImport("fabric", "fabric.Canvas.supports")
  @js.native
  def supports_getImageData(methodName: getImageData): Boolean = js.native
  @JSImport("fabric", "fabric.Canvas.supports")
  @js.native
  def supports_setLineDash(methodName: setLineDash): Boolean = js.native
  @JSImport("fabric", "fabric.Canvas.supports")
  @js.native
  def supports_toDataURL(methodName: toDataURL): Boolean = js.native
  @JSImport("fabric", "fabric.Canvas.supports")
  @js.native
  def supports_toDataURLWithQuality(methodName: toDataURLWithQuality): Boolean = js.native
  
  /**
    * Returns JSON representation of canvas
    * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    */
  @JSImport("fabric", "fabric.Canvas.toJSON")
  @js.native
  def toJSON(): String = js.native
  @JSImport("fabric", "fabric.Canvas.toJSON")
  @js.native
  def toJSON(propertiesToInclude: js.Array[String]): String = js.native
}
