package typingsSlinky.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictedItem extends js.Object {
  /**
    * The recommended item ID.
    */
  var itemId: js.UndefOr[ItemID] = js.native
}

object PredictedItem {
  @scala.inline
  def apply(): PredictedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictedItem]
  }
  @scala.inline
  implicit class PredictedItemOps[Self <: PredictedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemId(value: ItemID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
  }
  
}

