package typingsSlinky.jsonFilePlus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-file-plus", "JSONFile")
@js.native
class JSONFile protected () extends JSONData {
  def this(filename: String, raw: String) = this()
  
  var filename: String = js.native
  
  def save(): js.Promise[Unit] = js.native
  def save(cb: js.Function1[/* err */ js.Error, Unit]): js.Promise[Unit] = js.native
  
  def saveSync(): Unit = js.native
}
