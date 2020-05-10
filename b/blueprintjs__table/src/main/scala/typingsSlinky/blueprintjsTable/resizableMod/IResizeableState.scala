package typingsSlinky.blueprintjsTable.resizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeableState extends js.Object {
  /**
    * The dimensional size, respecting minimum and maximum constraints.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * The dimensional size, ignoring minimum and maximum constraints.
    */
  var unclampedSize: js.UndefOr[Double] = js.native
}

object IResizeableState {
  @scala.inline
  def apply(): IResizeableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizeableState]
  }
  @scala.inline
  implicit class IResizeableStateOps[Self <: IResizeableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withUnclampedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclampedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnclampedSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclampedSize")(js.undefined)
        ret
    }
  }
  
}

