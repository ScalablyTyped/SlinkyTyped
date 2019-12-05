package typingsSlinky.argon2.argon2Mod

import typingsSlinky.argon2.Anon_False
import typingsSlinky.argon2.Anon_Raw
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2", "hash")
@js.native
object hash extends js.Object {
  def apply(plain: String): js.Promise[String] = js.native
  def apply(plain: String, options: Options with (Anon_False | Anon_Raw)): js.Promise[Buffer] = js.native
  def apply(plain: Buffer): js.Promise[String] = js.native
  def apply(plain: Buffer, options: Options with (Anon_False | Anon_Raw)): js.Promise[Buffer] = js.native
}

