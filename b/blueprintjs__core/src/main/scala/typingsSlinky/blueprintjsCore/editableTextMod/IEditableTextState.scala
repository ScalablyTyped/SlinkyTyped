package typingsSlinky.blueprintjsCore.editableTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableTextState extends js.Object {
  /** Pixel height of the input, measured from span size */
  var inputHeight: js.UndefOr[Double] = js.native
  /** Pixel width of the input, measured from span size */
  var inputWidth: js.UndefOr[Double] = js.native
  /** Whether the value is currently being edited */
  var isEditing: js.UndefOr[Boolean] = js.native
  /** The last confirmed value */
  var lastValue: js.UndefOr[String] = js.native
  /** The controlled input value, may be different from prop during editing */
  var value: js.UndefOr[String] = js.native
}

object IEditableTextState {
  @scala.inline
  def apply(): IEditableTextState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableTextState]
  }
  @scala.inline
  implicit class IEditableTextStateOps[Self <: IEditableTextState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInputWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withLastValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

