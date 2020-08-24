package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Credentials")
@js.native
class Credentials () extends js.Object {
  def this(password: ProtectedValue) = this()
  def this(password: Null, keyFile: String) = this()
  def this(password: Null, keyFile: js.typedarray.ArrayBuffer) = this()
  def this(password: Null, keyFile: js.typedarray.Uint8Array) = this()
  def this(password: ProtectedValue, keyFile: String) = this()
  def this(password: ProtectedValue, keyFile: js.typedarray.ArrayBuffer) = this()
  def this(password: ProtectedValue, keyFile: js.typedarray.Uint8Array) = this()
  def getHash(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def setKeyFile(): js.Promise[Unit] = js.native
  def setKeyFile(keyFile: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
  def setKeyFile(keyFile: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  def setPassword(): js.Promise[Unit] = js.native
  def setPassword(password: ProtectedValue): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("kdbxweb", "Credentials")
@js.native
object Credentials extends js.Object {
  def createKeyFileWithHash(hash: String): js.typedarray.Uint8Array = js.native
  def createRandomKeyFile(): js.typedarray.Uint8Array = js.native
}

