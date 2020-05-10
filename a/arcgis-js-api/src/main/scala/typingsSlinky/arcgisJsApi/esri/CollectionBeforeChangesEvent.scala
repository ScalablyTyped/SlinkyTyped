package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionBeforeChangesEvent extends js.Object {
  var cancellable: Boolean = js.native
  var defaultPrevented: Boolean = js.native
  var item: js.Any = js.native
  var preventDefault: js.Function = js.native
}

object CollectionBeforeChangesEvent {
  @scala.inline
  def apply(cancellable: Boolean, defaultPrevented: Boolean, item: js.Any, preventDefault: js.Function): CollectionBeforeChangesEvent = {
    val __obj = js.Dynamic.literal(cancellable = cancellable.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionBeforeChangesEvent]
  }
  @scala.inline
  implicit class CollectionBeforeChangesEventOps[Self <: CollectionBeforeChangesEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

