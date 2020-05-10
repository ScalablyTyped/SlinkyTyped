package typingsSlinky.jupyterlabStatusbar.tokensMod.IStatusBar

import typingsSlinky.phosphorSignaling.mod.ISignal
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for status bar items.
  */
@js.native
trait IItem extends js.Object {
  /**
    * A signal that is fired when the item active state changes.
    */
  var activeStateChanged: js.UndefOr[ISignal[_, Unit]] = js.native
  /**
    * Which side to place item.
    * Permanent items are intended for the right and left side,
    * with more transient items in the middle.
    */
  var align: js.UndefOr[Alignment] = js.native
  /**
    * Whether the item is shown or hidden.
    */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * The item to add to the status bar.
    */
  var item: Widget = js.native
  /**
    *  Ordering of Items -- higher rank items are closer to the middle.
    */
  var rank: js.UndefOr[Double] = js.native
}

object IItem {
  @scala.inline
  def apply(item: Widget): IItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
  @scala.inline
  implicit class IItemOps[Self <: IItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveStateChanged(value: ISignal[_, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
  }
  
}

