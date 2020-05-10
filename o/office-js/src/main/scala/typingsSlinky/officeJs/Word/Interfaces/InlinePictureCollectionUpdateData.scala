package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InlinePictureCollection object, for use in "inlinePictureCollection.set({ ... })". */
@js.native
trait InlinePictureCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InlinePictureData]] = js.native
}

object InlinePictureCollectionUpdateData {
  @scala.inline
  def apply(): InlinePictureCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureCollectionUpdateData]
  }
  @scala.inline
  implicit class InlinePictureCollectionUpdateDataOps[Self <: InlinePictureCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[InlinePictureData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

