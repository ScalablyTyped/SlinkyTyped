package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentUnorderedList
  extends ContentBase
     with Content {
  var `type`: js.UndefOr[UnorderedListType] = js.native
  var ul: js.Array[UnorderedListElement] = js.native
}

object ContentUnorderedList {
  @scala.inline
  def apply(ul: js.Array[UnorderedListElement]): ContentUnorderedList = {
    val __obj = js.Dynamic.literal(ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentUnorderedList]
  }
  @scala.inline
  implicit class ContentUnorderedListOps[Self <: ContentUnorderedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUl(value: js.Array[UnorderedListElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: UnorderedListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

