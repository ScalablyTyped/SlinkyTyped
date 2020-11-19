package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "loadImage")
@js.native
object loadImage extends js.Object {
  
  def apply(url: String): js.Promise[HTMLImageElement] = js.native
  def apply(url: String, allowCrossOrigin: Boolean): js.Promise[HTMLImageElement] = js.native
  def apply(url: js.Promise[String]): js.Promise[HTMLImageElement] = js.native
  def apply(url: js.Promise[String], allowCrossOrigin: Boolean): js.Promise[HTMLImageElement] = js.native
}
