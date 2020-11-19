package typingsSlinky.eccrypto.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eccrypto", "sign")
@js.native
object sign extends js.Object {
  
  def apply(key: Buffer, msg: Buffer): js.Promise[Buffer] = js.native
  def apply(publicKey: Buffer, msg: Buffer, sig: Buffer): js.Promise[Null] = js.native
}
