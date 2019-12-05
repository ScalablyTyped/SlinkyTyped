package typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var block: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    block: typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

