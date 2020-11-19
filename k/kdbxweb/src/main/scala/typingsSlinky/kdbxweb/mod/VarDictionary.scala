package typingsSlinky.kdbxweb.mod

import typingsSlinky.kdbxweb.anon.Bool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "VarDictionary")
@js.native
class VarDictionary () extends js.Object {
  
  def get(key: String): js.Object = js.native
  
  def keys(): js.Array[String] = js.native
  
  def remove(key: String): Unit = js.native
  
  def set(key: String, `type`: Double, value: js.Object): Unit = js.native
  
  def write(stm: BinaryStream): Unit = js.native
}
/* static members */
@JSImport("kdbxweb", "VarDictionary")
@js.native
object VarDictionary extends js.Object {
  
  var ValueType: Bool = js.native
  
  def read(stm: BinaryStream): VarDictionary = js.native
}
