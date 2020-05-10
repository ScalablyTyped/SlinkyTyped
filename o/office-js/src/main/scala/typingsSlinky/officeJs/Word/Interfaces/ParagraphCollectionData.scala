package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "paragraphCollection.toJSON()". */
@js.native
trait ParagraphCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ParagraphData]] = js.native
}

object ParagraphCollectionData {
  @scala.inline
  def apply(): ParagraphCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphCollectionData]
  }
  @scala.inline
  implicit class ParagraphCollectionDataOps[Self <: ParagraphCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ParagraphData]): Self = {
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

