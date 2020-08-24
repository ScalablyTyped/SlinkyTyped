package typingsSlinky.ethersprojectTransactions.mod

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectBytes.mod.SignatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/transactions", "recoverAddress")
@js.native
object recoverAddress extends js.Object {
  def apply(digest: BytesLike, signature: SignatureLike): String = js.native
}

