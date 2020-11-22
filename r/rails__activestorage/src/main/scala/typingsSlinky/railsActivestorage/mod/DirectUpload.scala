package typingsSlinky.railsActivestorage.mod

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/activestorage", "DirectUpload")
@js.native
class DirectUpload protected () extends js.Object {
  def this(file: File, url: String) = this()
  def this(file: File, url: String, delegate: DirectUploadDelegate) = this()
  
  def create(callback: js.Function2[/* error */ js.Error, /* blob */ Blob, Unit]): Unit = js.native
  
  var file: File = js.native
  
  var id: Double = js.native
  
  var url: String = js.native
}
