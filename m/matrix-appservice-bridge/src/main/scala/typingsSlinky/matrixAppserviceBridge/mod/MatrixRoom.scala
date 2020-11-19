package typingsSlinky.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "MatrixRoom")
@js.native
class MatrixRoom protected () extends js.Object {
  def this(roomId: String) = this()
  
  def deserialize(data: js.Object): Unit = js.native
  
  def get(key: String): js.Object = js.native
  
  def getId(): String = js.native
  
  var roomId: String = js.native
  
  def serialize(): js.Object = js.native
  
  def set(key: String, `val`: js.Any): Unit = js.native
}
