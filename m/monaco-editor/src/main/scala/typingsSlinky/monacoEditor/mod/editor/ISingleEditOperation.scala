package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISingleEditOperation extends js.Object {
  /**
    * This indicates that this operation has "insert" semantics.
    * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
    */
  var forceMoveMarkers: js.UndefOr[Boolean] = js.native
  /**
    * The range to replace. This can be empty to emulate a simple insert.
    */
  var range: IRange = js.native
  /**
    * The text to replace with. This can be null to emulate a simple delete.
    */
  var text: String | Null = js.native
}

object ISingleEditOperation {
  @scala.inline
  def apply(range: IRange): ISingleEditOperation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleEditOperation]
  }
  @scala.inline
  implicit class ISingleEditOperationOps[Self <: ISingleEditOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceMoveMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMoveMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceMoveMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMoveMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}

