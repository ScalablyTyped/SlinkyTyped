package typingsSlinky.reactWindowInfiniteLoader

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactWindow.mod.ListOnItemsRenderedProps
import typingsSlinky.reactWindowInfiniteLoader.mod.OnItemsRendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnItemsRendered extends js.Object {
  var onItemsRendered: OnItemsRendered = js.native
  var ref: Ref[_] = js.native
}

object AnonOnItemsRendered {
  @scala.inline
  def apply(onItemsRendered: /* props */ ListOnItemsRenderedProps => js.Any): AnonOnItemsRendered = {
    val __obj = js.Dynamic.literal(onItemsRendered = js.Any.fromFunction1(onItemsRendered))
    __obj.asInstanceOf[AnonOnItemsRendered]
  }
  @scala.inline
  implicit class AnonOnItemsRenderedOps[Self <: AnonOnItemsRendered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnItemsRendered(value: /* props */ ListOnItemsRenderedProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
  }
  
}

