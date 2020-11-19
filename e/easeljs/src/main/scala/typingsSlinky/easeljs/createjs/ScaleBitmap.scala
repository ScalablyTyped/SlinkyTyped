package typingsSlinky.easeljs.createjs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleBitmap extends DisplayObject {
  
  var drawHeight: Double = js.native
  
  var drawWidth: Double = js.native
  
  // properties
  var image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
  
  var scale9Grid: Rectangle = js.native
  
  // methods
  def setDrawSize(newWidth: Double, newHeight: Double): Unit = js.native
  
  var sourceRect: Rectangle = js.native
}
