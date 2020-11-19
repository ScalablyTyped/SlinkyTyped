package typingsSlinky.browserImageCompression.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browser-image-compression", "getDataUrlFromFile")
@js.native
object getDataUrlFromFile extends js.Object {
  
  def apply(file: Blob): js.Promise[String] = js.native
  def apply(file: File): js.Promise[String] = js.native
}
