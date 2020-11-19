package typingsSlinky.argon2.mod

import typingsSlinky.argon2.anon.Optionsrawfalseundefined
import typingsSlinky.argon2.anon.Optionsrawtrue
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("argon2", "hash")
@js.native
object hash extends js.Object {
  
  def apply(plain: String): js.Promise[String] = js.native
  def apply(plain: String, options: Optionsrawfalseundefined): js.Promise[String] = js.native
  def apply(plain: String, options: Optionsrawtrue): js.Promise[Buffer] = js.native
  def apply(plain: Buffer): js.Promise[String] = js.native
  def apply(plain: Buffer, options: Optionsrawfalseundefined): js.Promise[String] = js.native
  def apply(plain: Buffer, options: Optionsrawtrue): js.Promise[Buffer] = js.native
}
