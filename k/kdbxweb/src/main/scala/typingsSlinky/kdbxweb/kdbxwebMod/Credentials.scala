package typingsSlinky.kdbxweb.kdbxwebMod

import typingsSlinky.std.ArrayBuffer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Credentials")
@js.native
class Credentials protected () extends js.Object {
  def this(password: ProtectedValue, keyFile: String) = this()
  def this(password: ProtectedValue, keyFile: scala.scalajs.js.typedarray.ArrayBuffer) = this()
  def this(password: ProtectedValue, keyFile: scala.scalajs.js.typedarray.Uint8Array) = this()
  def getHash(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def setKeyFile(): js.Promise[Unit] = js.native
  def setKeyFile(keyFile: ArrayBuffer): js.Promise[Unit] = js.native
  def setKeyFile(keyFile: Uint8Array): js.Promise[Unit] = js.native
  def setPassword(): js.Promise[Unit] = js.native
  def setPassword(password: ProtectedValue): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("kdbxweb", "Credentials")
@js.native
object Credentials extends js.Object {
  def createKeyFileWithHash(hash: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def createRandomKeyFile(): scala.scalajs.js.typedarray.Uint8Array = js.native
}

