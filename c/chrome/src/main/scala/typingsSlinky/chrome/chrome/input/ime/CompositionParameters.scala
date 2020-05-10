package typingsSlinky.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositionParameters extends js.Object {
  /** ID of the context where the composition text will be set */
  var contextID: Double = js.native
  /** Position in the text of the cursor. */
  var cursor: Double = js.native
  /** Optional. List of segments and their associated types. */
  var segments: js.Array[CompositionParameterSegment] = js.native
  /** Optional. Position in the text that the selection ends at. */
  var selectionEnd: js.UndefOr[Double] = js.native
  /** Optional. Position in the text that the selection starts at. */
  var selectionStart: js.UndefOr[Double] = js.native
  /** Text to set */
  var text: String = js.native
}

object CompositionParameters {
  @scala.inline
  def apply(contextID: Double, cursor: Double, segments: js.Array[CompositionParameterSegment], text: String): CompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameters]
  }
  @scala.inline
  implicit class CompositionParametersOps[Self <: CompositionParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[CompositionParameterSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(js.undefined)
        ret
    }
  }
  
}

