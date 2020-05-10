package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTocItem
  extends ContentBase
     with _Content {
  var text: String | ContentTocItem = js.native
  var tocItem: Boolean | String | js.Array[String] = js.native
  var tocMargin: js.UndefOr[Margins] = js.native
  var tocNumberStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
  var tocStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
}

object ContentTocItem {
  @scala.inline
  def apply(text: String | ContentTocItem, tocItem: Boolean | String | js.Array[String]): ContentTocItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tocItem = tocItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTocItem]
  }
  @scala.inline
  implicit class ContentTocItemOps[Self <: ContentTocItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String | ContentTocItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocItem(value: Boolean | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocMargin(value: Margins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTocMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTocNumberStyle(value: String | js.Array[String] | Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocNumberStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTocNumberStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocNumberStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTocStyle(value: String | js.Array[String] | Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTocStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocStyle")(js.undefined)
        ret
    }
  }
  
}

