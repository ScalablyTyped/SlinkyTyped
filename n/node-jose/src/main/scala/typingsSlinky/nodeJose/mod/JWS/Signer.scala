package typingsSlinky.nodeJose.mod.JWS

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signer extends js.Object {
  
  def `final`(): js.Promise[CreateSignResult] = js.native
  
  def update(input: String): this.type = js.native
  def update(input: String, encoding: String): this.type = js.native
  def update(input: Buffer): this.type = js.native
  def update(input: Buffer, encoding: String): this.type = js.native
}
