package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "ProtectedValue")
@js.native
class ProtectedValue protected () extends js.Object {
  def this(value: scala.scalajs.js.typedarray.ArrayBuffer, salt: scala.scalajs.js.typedarray.ArrayBuffer) = this()
  def getBinary(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getHash(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def getText(): String = js.native
  def includes(str: String): Boolean = js.native
  def setSalt(newSalt: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "ProtectedValue")
@js.native
object ProtectedValue extends js.Object {
  def fromBinary(binary: scala.scalajs.js.typedarray.ArrayBuffer): ProtectedValue = js.native
  def fromString(str: String): ProtectedValue = js.native
}

