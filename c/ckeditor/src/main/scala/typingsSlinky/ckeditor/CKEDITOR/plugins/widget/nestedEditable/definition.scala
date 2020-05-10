package typingsSlinky.ckeditor.CKEDITOR.plugins.widget.nestedEditable

import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import typingsSlinky.ckeditor.CKEDITOR.filter.disallowedContentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait definition extends js.Object {
  var allowedContent: js.UndefOr[allowedContentRules] = js.native
  var disallowedContent: js.UndefOr[disallowedContentRules] = js.native
  var pathName: js.UndefOr[String] = js.native
  var selector: js.UndefOr[String] = js.native
}

object definition {
  @scala.inline
  def apply(): definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[definition]
  }
  @scala.inline
  implicit class definitionOps[Self <: definition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedContent(value: allowedContentRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withDisallowedContent(value: disallowedContentRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallowedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPathName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

