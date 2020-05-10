package typingsSlinky.reactNativeSortableGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableGridItemProps extends js.Object {
  /**
    * Flag to mark a child node as being inactive. If set, no touch events
    * will be fired when users interact with the node.
    */
  var inactive: js.UndefOr[Boolean] = js.native
  var key: String = js.native
  /**
    * Function that is executed when the block is double tapped within a
    * timeframe of doubleTapTreshold (default 150ms). Assigning this will
    * delay the execution of onTap. Omitting this will cause all taps to be
    * handled as single taps, regardless of their frequency.
    */
  var onDoubleTap: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function that is executed when the block is tapped once, but not pressed
    *  for long enough to activate the drag.
    */
  var onTap: js.UndefOr[js.Function0[Unit]] = js.native
}

object SortableGridItemProps {
  @scala.inline
  def apply(key: String): SortableGridItemProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableGridItemProps]
  }
  @scala.inline
  implicit class SortableGridItemPropsOps[Self <: SortableGridItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.undefined)
        ret
    }
  }
  
}

