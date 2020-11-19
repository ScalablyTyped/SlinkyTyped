package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.firestore.Blob")
@js.native
class Blob () extends js.Object {
  
  def isEqual(other: Blob): Boolean = js.native
  
  def toBase64(): String = js.native
  
  def toUint8Array(): js.typedarray.Uint8Array = js.native
}
/* static members */
@JSImport("react-native-firebase", "RNFirebase.firestore.Blob")
@js.native
object Blob extends js.Object {
  
  def fromBase64String(base64: String): Blob = js.native
  
  def fromUint8Array(array: js.typedarray.Uint8Array): Blob = js.native
}
