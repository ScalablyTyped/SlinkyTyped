package typingsSlinky.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ruleOptions extends js.Object {
  var applyToAll: js.UndefOr[Boolean] = js.native
  var excludeNestedEditable: js.UndefOr[Boolean] = js.native
}

object ruleOptions {
  @scala.inline
  def apply(): ruleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ruleOptions]
  }
  @scala.inline
  implicit class ruleOptionsOps[Self <: ruleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyToAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyToAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToAll")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeNestedEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNestedEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeNestedEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNestedEditable")(js.undefined)
        ret
    }
  }
  
}

