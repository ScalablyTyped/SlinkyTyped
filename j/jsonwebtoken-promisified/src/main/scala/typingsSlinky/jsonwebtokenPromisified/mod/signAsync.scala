package typingsSlinky.jsonwebtokenPromisified.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonwebtoken-promisified", "signAsync")
@js.native
object signAsync extends js.Object {
  
  def apply(payload: String, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def apply(payload: String, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def apply(payload: js.Object, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def apply(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def apply(payload: Buffer, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def apply(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
}
