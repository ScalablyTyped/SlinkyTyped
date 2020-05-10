package typingsSlinky.phosphorWidgets.focustrackerMod.FocusTracker

import typingsSlinky.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the changed signals.
  */
@js.native
trait IChangedArgs[T /* <: Widget */] extends js.Object {
  /**
    * The new value for the widget.
    */
  var newValue: T | Null = js.native
  /**
    * The old value for the widget.
    */
  var oldValue: T | Null = js.native
}

object IChangedArgs {
  @scala.inline
  def apply[T](): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChangedArgs[T]]
  }
  @scala.inline
  implicit class IChangedArgsOps[Self[t] <: IChangedArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNewValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(null)
        ret
    }
    @scala.inline
    def withOldValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(null)
        ret
    }
  }
  
}

