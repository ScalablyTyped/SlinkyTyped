package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "contentControlCollection.toJSON()". */
@js.native
trait ContentControlCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ContentControlData]] = js.native
}

object ContentControlCollectionData {
  @scala.inline
  def apply(): ContentControlCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlCollectionData]
  }
  @scala.inline
  implicit class ContentControlCollectionDataOps[Self <: ContentControlCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ContentControlData]): Self = {
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

