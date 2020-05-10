package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackObject extends js.Object {
  /*Set this to true if you want to be able to call the callback more than once. (This is the case for signal
    * listeners, for example).*/
  var autoReset: Boolean = js.native
  /*Set to true after the callback has been called, and undefined otherwise. A callback will not be executed a
    * second time unless the callback’s reset() method is called first, or its autoReset property is set to true.
    */
  var called: Boolean = js.native
  /*An array containing the arguments to pass to the callback function when it is executed.*/
  var data: js.Array[_] = js.native
  /*The function to be called when the callback is executed.*/
  var hook: Double = js.native
  /*The object to use as this during the call to the callback function.*/
  var `object`: js.Any = js.native
  /*Clears the callback’s called property.*/
  def reset(): Unit = js.native
}

object CallbackObject {
  @scala.inline
  def apply(
    autoReset: Boolean,
    called: Boolean,
    data: js.Array[_],
    hook: Double,
    `object`: js.Any,
    reset: () => Unit
  ): CallbackObject = {
    val __obj = js.Dynamic.literal(autoReset = autoReset.asInstanceOf[js.Any], called = called.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackObject]
  }
  @scala.inline
  implicit class CallbackObjectOps[Self <: CallbackObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("called")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHook(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

