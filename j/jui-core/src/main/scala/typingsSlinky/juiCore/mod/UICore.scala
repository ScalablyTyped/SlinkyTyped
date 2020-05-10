package typingsSlinky.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UICore extends js.Object {
  var event: js.UndefOr[js.Any] = js.native
  var root: js.UndefOr[js.Any] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
  /**
    * Check the parameter type of a UI method and generates an alarm when a wrong value is entered
    *
    * @param name Method name
    * @param params Parameters
    */
  def addValid(name: String, params: js.Array[_]): Unit = js.native
  /**
    * Sets a callback function that is called after a UI method is run
    *
    * @param name Method name
    */
  def callAfter(name: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Sets a callback function that is called before a UI method is run
    *
    * @param name Method name
    */
  def callBefore(name: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Sets a callback function and the delay time before/after a UI method is run
    *
    * @param name Method name
    */
  def callDelay(name: String, callObj: js.Function0[Unit]): Unit = js.native
  def destroy(): Unit = js.native
  /**
    * Generates a custom event. The first parameter is the type of a custom event. A function defined as an option or on method is called
    *
    * @param type Event type
    * @param args Event Arguments
    */
  def emit(`type`: String, args: js.Function0[Unit]): js.Any = js.native
  /**
    * Removes a custom event of an applicable type or callback handler
    *
    * @param type Event type
    */
  def off(`type`: String): Unit = js.native
  /**
    * A callback function defined as an on method is run when an emit method is called
    *
    * @param type Event type
    */
  def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Dynamically defines the options of a UI
    */
  def setOption(key: String, value: js.Any): Unit = js.native
  /**
    * Dynamically defines the template method of a UI
    *
    * @param name Template name
    * @param html Template markup
    */
  def setTpl(name: String, html: String): Unit = js.native
}

object UICore {
  @scala.inline
  def apply(
    addValid: (String, js.Array[_]) => Unit,
    callAfter: (String, js.Function0[Unit]) => Unit,
    callBefore: (String, js.Function0[Unit]) => Unit,
    callDelay: (String, js.Function0[Unit]) => Unit,
    destroy: () => Unit,
    emit: (String, js.Function0[Unit]) => js.Any,
    off: String => Unit,
    on: (String, js.Function0[Unit]) => Unit,
    setOption: (String, js.Any) => Unit,
    setTpl: (String, String) => Unit
  ): UICore = {
    val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
    __obj.asInstanceOf[UICore]
  }
  @scala.inline
  implicit class UICoreOps[Self <: UICore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddValid(value: (String, js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addValid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallAfter(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callAfter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallBefore(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallDelay(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callDelay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmit(value: (String, js.Function0[Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOff(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetOption(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTpl(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTpl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
  }
  
}

