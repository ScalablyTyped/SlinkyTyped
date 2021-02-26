package typingsSlinky.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Binaries")
@js.native
class Binaries () extends StObject {
  
  def add(value: js.typedarray.ArrayBuffer): js.Promise[BinaryInforamtion] = js.native
  def add(value: ProtectedValue): js.Promise[BinaryInforamtion] = js.native
  
  def assignIds(): Unit = js.native
  
  def getBinaryHash(binary: js.typedarray.ArrayBuffer): js.Promise[String] = js.native
  def getBinaryHash(binary: js.typedarray.Uint8Array): js.Promise[String] = js.native
  def getBinaryHash(binary: ProtectedValue): js.Promise[String] = js.native
  
  def hash(): js.Promise[js.Array[_]] = js.native
}
