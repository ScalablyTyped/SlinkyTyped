package typingsSlinky.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentCollection extends js.Object {
  var ConsumedCapacity: typingsSlinky.dynogels.mod.ConsumedCapacity = js.native
  var Count: Double = js.native
  var Items: js.Array[Document] = js.native
  var LastEvaluatedKey: js.UndefOr[js.Any] = js.native
  var ScannedCount: Double = js.native
}

object DocumentCollection {
  @scala.inline
  def apply(ConsumedCapacity: ConsumedCapacity, Count: Double, Items: js.Array[Document], ScannedCount: Double): DocumentCollection = {
    val __obj = js.Dynamic.literal(ConsumedCapacity = ConsumedCapacity.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], ScannedCount = ScannedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCollection]
  }
  @scala.inline
  implicit class DocumentCollectionOps[Self <: DocumentCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumedCapacity(value: ConsumedCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScannedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScannedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastEvaluatedKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEvaluatedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedKey")(js.undefined)
        ret
    }
  }
  
}

