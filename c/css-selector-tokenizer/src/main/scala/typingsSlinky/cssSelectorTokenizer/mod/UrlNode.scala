package typingsSlinky.cssSelectorTokenizer.mod

import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlNode
  extends ValueNodeType
     with BaseNode {
  var innerSpacingAfter: js.UndefOr[String] = js.native
  var innerSpacingBefore: js.UndefOr[String] = js.native
  var stringType: js.UndefOr[String] = js.native
  var `type`: url = js.native
  var url: String = js.native
}

object UrlNode {
  @scala.inline
  def apply(`type`: url, url: String): UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlNode]
  }
  @scala.inline
  implicit class UrlNodeOps[Self <: UrlNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerSpacingAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerSpacingAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerSpacingAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerSpacingAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerSpacingBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerSpacingBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerSpacingBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerSpacingBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withStringType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringType")(js.undefined)
        ret
    }
  }
  
}

