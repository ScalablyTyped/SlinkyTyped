package typingsSlinky.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the base class for events that can be canceled.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311009(v=vs.100).aspx}
  */
@js.native
trait CancelEventArgs extends EventArgs {
  /*
    * true to request that the event be canceled; otherwise, false. The default is false.
    * @return if the event is to be canceled; otherwise, false.
    */
  def get_cancel(): Boolean = js.native
  //#endregion
  //#region Properties
  /**
    * true to request that the event be canceled; otherwise, false. The default is false.
    */
  def set_cancel(value: Boolean): Unit = js.native
}

object CancelEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_cancel: () => Boolean, set_cancel: Boolean => Unit): CancelEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_cancel = js.Any.fromFunction0(get_cancel), set_cancel = js.Any.fromFunction1(set_cancel))
    __obj.asInstanceOf[CancelEventArgs]
  }
  @scala.inline
  implicit class CancelEventArgsOps[Self <: CancelEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_cancel(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_cancel(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_cancel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

