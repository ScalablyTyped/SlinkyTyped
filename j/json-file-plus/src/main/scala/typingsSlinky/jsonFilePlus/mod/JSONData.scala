package typingsSlinky.jsonFilePlus.mod

import typingsSlinky.node.Buffer
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-file-plus", "JSONData")
@js.native
class JSONData protected () extends js.Object {
  def this(raw: String) = this()
  
  var data: js.Any = js.native
  
  var format: Format = js.native
  
  def get(key: PropertyKey): js.Promise[_] = js.native
  
  def remove(key: PropertyKey): js.Promise[Unit] = js.native
  
  def set(data: js.Any): Unit = js.native
  
  def stringify(): Buffer = js.native
}
