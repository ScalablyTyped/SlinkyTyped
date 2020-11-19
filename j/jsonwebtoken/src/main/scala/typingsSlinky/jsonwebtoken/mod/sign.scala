package typingsSlinky.jsonwebtoken.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonwebtoken", "sign")
@js.native
object sign extends js.Object {
  
  def apply(payload: String, secretOrPrivateKey: Secret): String = js.native
  def apply(payload: String, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  def apply(payload: String, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  def apply(payload: String, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  def apply(payload: js.Object, secretOrPrivateKey: Secret): String = js.native
  def apply(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  def apply(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  def apply(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  def apply(payload: Buffer, secretOrPrivateKey: Secret): String = js.native
  def apply(payload: Buffer, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  def apply(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  def apply(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
}
