package typingsSlinky.dkimDashSigner.dkimDashSignerMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dkim-signer", "DKIMSign")
@js.native
object DKIMSign extends js.Object {
  def apply(email: String, options: DKIMSignOptions): String = js.native
  def apply(email: Buffer, options: DKIMSignOptions): String = js.native
}

