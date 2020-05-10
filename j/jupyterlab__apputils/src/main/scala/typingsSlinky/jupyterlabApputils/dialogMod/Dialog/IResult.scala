package typingsSlinky.jupyterlabApputils.dialogMod.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a dialog.
  */
@js.native
trait IResult[T] extends js.Object {
  /**
    * The button that was pressed.
    */
  var button: IButton = js.native
  /**
    * The value retrieved from `.getValue()` if given on the widget.
    */
  var value: T | Null = js.native
}

object IResult {
  @scala.inline
  def apply[T](button: IButton): IResult[T] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
  @scala.inline
  implicit class IResultOps[Self[t] <: IResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withButton(value: IButton): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

