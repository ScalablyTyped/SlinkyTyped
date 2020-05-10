package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CustomXmlPartCollection object, for use in `customXmlPartCollection.set({ ... })`. */
@js.native
trait CustomXmlPartCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.native
}

object CustomXmlPartCollectionUpdateData {
  @scala.inline
  def apply(): CustomXmlPartCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartCollectionUpdateData]
  }
  @scala.inline
  implicit class CustomXmlPartCollectionUpdateDataOps[Self <: CustomXmlPartCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[CustomXmlPartData]): Self = {
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

