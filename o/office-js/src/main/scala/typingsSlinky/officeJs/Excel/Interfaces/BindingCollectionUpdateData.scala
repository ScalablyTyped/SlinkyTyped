package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the BindingCollection object, for use in `bindingCollection.set({ ... })`. */
@js.native
trait BindingCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[BindingData]] = js.native
}

object BindingCollectionUpdateData {
  @scala.inline
  def apply(): BindingCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingCollectionUpdateData]
  }
  @scala.inline
  implicit class BindingCollectionUpdateDataOps[Self <: BindingCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[BindingData]): Self = {
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

