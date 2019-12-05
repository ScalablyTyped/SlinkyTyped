package typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase.firestore.Blob")
@js.native
class Blob () extends js.Object {
  def isEqual(other: Blob): Boolean = js.native
  def toBase64(): String = js.native
  def toUint8Array(): scala.scalajs.js.typedarray.Uint8Array = js.native
}

/* static members */
@JSImport("react-native-firebase", "RNFirebase.firestore.Blob")
@js.native
object Blob extends js.Object {
  def fromBase64String(base64: String): Blob = js.native
  def fromUint8Array(array: scala.scalajs.js.typedarray.Uint8Array): Blob = js.native
}

