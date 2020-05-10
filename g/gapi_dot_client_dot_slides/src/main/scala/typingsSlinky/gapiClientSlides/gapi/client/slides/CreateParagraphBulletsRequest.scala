package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParagraphBulletsRequest extends js.Object {
  /**
    * The kinds of bullet glyphs to be used. Defaults to the
    * `BULLET_DISC_CIRCLE_SQUARE` preset.
    */
  var bulletPreset: js.UndefOr[String] = js.native
  /**
    * The optional table cell location if the text to be modified is in a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  /** The object ID of the shape or table containing the text to add bullets to. */
  var objectId: js.UndefOr[String] = js.native
  /** The range of text to apply the bullet presets to, based on TextElement indexes. */
  var textRange: js.UndefOr[Range] = js.native
}

object CreateParagraphBulletsRequest {
  @scala.inline
  def apply(): CreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParagraphBulletsRequest]
  }
  @scala.inline
  implicit class CreateParagraphBulletsRequestOps[Self <: CreateParagraphBulletsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletPreset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletPreset")(js.undefined)
        ret
    }
    @scala.inline
    def withCellLocation(value: TableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRange")(js.undefined)
        ret
    }
  }
  
}

