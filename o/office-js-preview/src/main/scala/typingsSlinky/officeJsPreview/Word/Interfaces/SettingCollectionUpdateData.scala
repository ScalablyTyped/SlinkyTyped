package typingsSlinky.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SettingCollection object, for use in "settingCollection.set({ ... })". */
@js.native
trait SettingCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SettingData]] = js.native
}

object SettingCollectionUpdateData {
  @scala.inline
  def apply(): SettingCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingCollectionUpdateData]
  }
  @scala.inline
  implicit class SettingCollectionUpdateDataOps[Self <: SettingCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SettingData]): Self = {
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

