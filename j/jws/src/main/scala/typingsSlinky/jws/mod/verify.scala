package typingsSlinky.jws.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jws", "verify")
@js.native
object verify extends js.Object {
  
  def apply(signature: String, algorithm: Algorithm, secretOrKey: String): Boolean = js.native
  def apply(signature: String, algorithm: Algorithm, secretOrKey: Buffer): Boolean = js.native
}
