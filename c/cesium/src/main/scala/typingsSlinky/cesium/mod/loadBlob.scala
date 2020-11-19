package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "loadBlob")
@js.native
object loadBlob extends js.Object {
  
  def apply(url: String): js.Promise[Blob] = js.native
  def apply(url: String, headers: js.Any): js.Promise[Blob] = js.native
  def apply(url: js.Promise[String]): js.Promise[Blob] = js.native
  def apply(url: js.Promise[String], headers: js.Any): js.Promise[Blob] = js.native
}
