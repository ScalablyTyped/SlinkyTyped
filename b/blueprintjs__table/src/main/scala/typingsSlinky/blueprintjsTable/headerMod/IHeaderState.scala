package typingsSlinky.blueprintjsTable.headerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderState extends js.Object {
  /**
    * Whether the component has a valid selection specified either via props
    * (i.e. controlled mode) or via a completed drag-select interaction. When
    * true, DragReorderable will know that it can override the click-and-drag
    * interactions that would normally be reserved for drag-select behavior.
    */
  var hasValidSelection: js.UndefOr[Boolean] = js.native
}

object IHeaderState {
  @scala.inline
  def apply(): IHeaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderState]
  }
  @scala.inline
  implicit class IHeaderStateOps[Self <: IHeaderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasValidSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValidSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasValidSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValidSelection")(js.undefined)
        ret
    }
  }
  
}

