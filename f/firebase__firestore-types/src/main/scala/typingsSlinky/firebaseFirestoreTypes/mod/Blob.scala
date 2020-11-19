package typingsSlinky.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "Blob")
@js.native
class Blob protected () extends js.Object {
  
  def isEqual(other: Blob): Boolean = js.native
  
  def toBase64(): String = js.native
  
  def toUint8Array(): js.typedarray.Uint8Array = js.native
}
/* static members */
@JSImport("@firebase/firestore-types", "Blob")
@js.native
object Blob extends js.Object {
  
  def fromBase64String(base64: String): Blob = js.native
  
  def fromUint8Array(array: js.typedarray.Uint8Array): Blob = js.native
}
