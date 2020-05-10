package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IPosition
import typingsSlinky.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContentWidgetPosition extends js.Object {
  /**
    * Desired position for the content widget.
    * `preference` will also affect the placement.
    */
  var position: IPosition | Null = js.native
  /**
    * Placement preference for position, in order of preference.
    */
  var preference: js.Array[ContentWidgetPositionPreference] = js.native
  /**
    * Optionally, a range can be provided to further
    * define the position of the content widget.
    */
  var range: js.UndefOr[IRange | Null] = js.native
}

object IContentWidgetPosition {
  @scala.inline
  def apply(preference: js.Array[ContentWidgetPositionPreference]): IContentWidgetPosition = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentWidgetPosition]
  }
  @scala.inline
  implicit class IContentWidgetPositionOps[Self <: IContentWidgetPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreference(value: js.Array[ContentWidgetPositionPreference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: IPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(null)
        ret
    }
    @scala.inline
    def withRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(null)
        ret
    }
  }
  
}

