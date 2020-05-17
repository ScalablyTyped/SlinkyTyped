package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.event
import typingsSlinky.devextreme.mod.global.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReachedRight[T] extends js.Object {
  var component: js.UndefOr[T] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.event] = js.native
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var reachedBottom: js.UndefOr[Boolean] = js.native
  var reachedLeft: js.UndefOr[Boolean] = js.native
  var reachedRight: js.UndefOr[Boolean] = js.native
  var reachedTop: js.UndefOr[Boolean] = js.native
  var scrollOffset: js.UndefOr[js.Any] = js.native
}

object ReachedRight {
  @scala.inline
  def apply[T](): ReachedRight[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachedRight[T]]
  }
  @scala.inline
  implicit class ReachedRightOps[Self[t] <: ReachedRight[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComponent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: dxElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: event): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withJQueryEvent(value: JQueryEventObject): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jQueryEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJQueryEvent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jQueryEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withReachedBottom(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachedBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachedBottom: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachedBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withReachedLeft(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachedLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachedLeft: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachedLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withReachedRight(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachedRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachedRight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachedRight")(js.undefined)
        ret
    }
    @scala.inline
    def withReachedTop(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachedTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachedTop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachedTop")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOffset(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOffset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(js.undefined)
        ret
    }
  }
  
}

