package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "floatingInk.toJSON()". */
@js.native
trait FloatingInkData extends js.Object {
  /**
    *
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the strokes of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[js.Array[InkStrokeData]] = js.native
}

object FloatingInkData {
  @scala.inline
  def apply(): FloatingInkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingInkData]
  }
  @scala.inline
  implicit class FloatingInkDataOps[Self <: FloatingInkData] (val x: Self) extends AnyVal {
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
    def withInkStrokes(value: js.Array[InkStrokeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkStrokes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInkStrokes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkStrokes")(js.undefined)
        ret
    }
  }
  
}

