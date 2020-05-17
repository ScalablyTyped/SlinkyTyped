package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsInline extends js.Object {
  var isInline: Boolean = js.native
  var templateUrl: String | Null = js.native
}

object IsInline {
  @scala.inline
  def apply(isInline: Boolean): IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInline]
  }
  @scala.inline
  implicit class IsInlineOps[Self <: IsInline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(null)
        ret
    }
  }
  
}

