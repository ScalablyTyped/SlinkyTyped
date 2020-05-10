package typingsSlinky.phosphorWidgets.commandpaletteMod.CommandPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The render data for a command palette item.
  */
@js.native
trait IItemRenderData extends js.Object {
  /**
    * Whether the item is the active item.
    */
  val active: Boolean = js.native
  /**
    * The indices of the matched characters in the label.
    */
  val indices: js.Array[Double] | Null = js.native
  /**
    * The command palette item to render.
    */
  val item: IItem = js.native
}

object IItemRenderData {
  @scala.inline
  def apply(active: Boolean, item: IItem): IItemRenderData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRenderData]
  }
  @scala.inline
  implicit class IItemRenderDataOps[Self <: IItemRenderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: IItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(null)
        ret
    }
  }
  
}

