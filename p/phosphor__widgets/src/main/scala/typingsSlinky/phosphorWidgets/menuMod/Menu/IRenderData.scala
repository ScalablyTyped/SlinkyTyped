package typingsSlinky.phosphorWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the data to render a menu item.
  */
@js.native
trait IRenderData extends js.Object {
  /**
    * Whether the item is the active item.
    */
  val active: Boolean = js.native
  /**
    * Whether the item should be collapsed.
    */
  val collapsed: Boolean = js.native
  /**
    * The item to be rendered.
    */
  val item: IItem = js.native
}

object IRenderData {
  @scala.inline
  def apply(active: Boolean, collapsed: Boolean, item: IItem): IRenderData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderData]
  }
  @scala.inline
  implicit class IRenderDataOps[Self <: IRenderData] (val x: Self) extends AnyVal {
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
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: IItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

