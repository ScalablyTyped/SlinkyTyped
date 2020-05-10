package typingsSlinky.draftJs.mod.Draft.Model.Encoding

import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftBlockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of a ContentBlock, with all style and entity
  * attribution repackaged as range objects.
  */
@js.native
trait RawDraftContentBlock extends js.Object {
  var data: js.UndefOr[js.Object] = js.native
  var depth: Double = js.native
  var entityRanges: js.Array[RawDraftEntityRange] = js.native
  var inlineStyleRanges: js.Array[RawDraftInlineStyleRange] = js.native
  var key: String = js.native
  var text: String = js.native
  var `type`: DraftBlockType = js.native
}

object RawDraftContentBlock {
  @scala.inline
  def apply(
    depth: Double,
    entityRanges: js.Array[RawDraftEntityRange],
    inlineStyleRanges: js.Array[RawDraftInlineStyleRange],
    key: String,
    text: String,
    `type`: DraftBlockType
  ): RawDraftContentBlock = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], entityRanges = entityRanges.asInstanceOf[js.Any], inlineStyleRanges = inlineStyleRanges.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftContentBlock]
  }
  @scala.inline
  implicit class RawDraftContentBlockOps[Self <: RawDraftContentBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityRanges(value: js.Array[RawDraftEntityRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineStyleRanges(value: js.Array[RawDraftInlineStyleRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineStyleRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DraftBlockType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

