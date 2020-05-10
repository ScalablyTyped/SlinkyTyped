package typingsSlinky.prosemirrorView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineDecorationSpec extends js.Object {
  /**
    * Determines how the right side of the decoration is mapped.
    */
  var inclusiveEnd: js.UndefOr[Boolean | Null] = js.native
  /**
    * Determines how the left side of the decoration is
    * [mapped](#transform.Position_Mapping) when content is
    * inserted directly at that position. By default, the decoration
    * won't include the new content, but you can set this to `true`
    * to make it inclusive.
    */
  var inclusiveStart: js.UndefOr[Boolean | Null] = js.native
}

object InlineDecorationSpec {
  @scala.inline
  def apply(): InlineDecorationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineDecorationSpec]
  }
  @scala.inline
  implicit class InlineDecorationSpecOps[Self <: InlineDecorationSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclusiveEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusiveEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusiveEndNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveEnd")(null)
        ret
    }
    @scala.inline
    def withInclusiveStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusiveStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveStart")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusiveStartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveStart")(null)
        ret
    }
  }
  
}

