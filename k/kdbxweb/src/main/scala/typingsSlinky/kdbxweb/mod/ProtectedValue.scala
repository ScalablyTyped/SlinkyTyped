package typingsSlinky.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "ProtectedValue")
@js.native
class ProtectedValue protected () extends StObject {
  def this(value: js.typedarray.ArrayBuffer, salt: js.typedarray.ArrayBuffer) = this()
  
  def getBinary(): js.typedarray.Uint8Array = js.native
  
  def getHash(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def getText(): String = js.native
  
  def includes(str: String): Boolean = js.native
  
  def setSalt(newSalt: js.typedarray.ArrayBuffer): Unit = js.native
}
/* static members */
object ProtectedValue {
  
  @JSImport("kdbxweb", "ProtectedValue.fromBinary")
  @js.native
  def fromBinary(binary: js.typedarray.ArrayBuffer): ProtectedValue = js.native
  
  @JSImport("kdbxweb", "ProtectedValue.fromString")
  @js.native
  def fromString(str: String): ProtectedValue = js.native
}
