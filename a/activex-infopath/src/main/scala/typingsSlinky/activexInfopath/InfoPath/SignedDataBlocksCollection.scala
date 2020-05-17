package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedDataBlocksCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.SignedDataBlocksCollection_typekey")
  var InfoPathDotSignedDataBlocksCollection_typekey: SignedDataBlocksCollection = js.native
  def Item(varIndex: js.Any): SignedDataBlockObject = js.native
}

object SignedDataBlocksCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotSignedDataBlocksCollection_typekey: SignedDataBlocksCollection,
    Item: js.Any => SignedDataBlockObject
  ): SignedDataBlocksCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignedDataBlocksCollection_typekey")(InfoPathDotSignedDataBlocksCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataBlocksCollection]
  }
  @scala.inline
  implicit class SignedDataBlocksCollectionOps[Self <: SignedDataBlocksCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotSignedDataBlocksCollection_typekey(value: SignedDataBlocksCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.SignedDataBlocksCollection_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => SignedDataBlockObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

