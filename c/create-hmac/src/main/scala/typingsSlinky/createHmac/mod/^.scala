package typingsSlinky.createHmac.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.Hmac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("create-hmac", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(algo: Algorithm, key: String): Hmac = js.native
  def apply(algo: Algorithm, key: Buffer): Hmac = js.native
}
