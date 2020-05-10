package typingsSlinky.draftJs.mod.Draft.Model.Encoding

import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an inline style range.
  */
@js.native
trait RawDraftInlineStyleRange extends js.Object {
  var length: Double = js.native
  var offset: Double = js.native
  var style: DraftInlineStyleType = js.native
}

object RawDraftInlineStyleRange {
  @scala.inline
  def apply(length: Double, offset: Double, style: DraftInlineStyleType): RawDraftInlineStyleRange = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftInlineStyleRange]
  }
  @scala.inline
  implicit class RawDraftInlineStyleRangeOps[Self <: RawDraftInlineStyleRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: DraftInlineStyleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

