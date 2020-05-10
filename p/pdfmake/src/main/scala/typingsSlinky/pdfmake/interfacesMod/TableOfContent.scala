package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOfContent extends js.Object {
  var id: js.UndefOr[String] = js.native
  var numberStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
  var textMargin: js.UndefOr[Margins] = js.native
  var textStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
  var title: js.UndefOr[Content] = js.native
}

object TableOfContent {
  @scala.inline
  def apply(): TableOfContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOfContent]
  }
  @scala.inline
  implicit class TableOfContentOps[Self <: TableOfContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberStyle(value: String | js.Array[String] | Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextMargin(value: Margins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: String | js.Array[String] | Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

