package typingsSlinky.officeUiFabricReact.textFieldBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldSnapshot extends js.Object {
  /**
    * If set, the text field is changing between single- and multi-line, so we'll need to reset
    * selection/cursor after the change completes.
    */
  var selection: js.UndefOr[js.Tuple2[Double | Null, Double | Null]] = js.native
}

object ITextFieldSnapshot {
  @scala.inline
  def apply(): ITextFieldSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextFieldSnapshot]
  }
  @scala.inline
  implicit class ITextFieldSnapshotOps[Self <: ITextFieldSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelection(value: js.Tuple2[Double | Null, Double | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
  }
  
}

