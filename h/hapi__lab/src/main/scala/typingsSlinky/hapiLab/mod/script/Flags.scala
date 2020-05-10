package typingsSlinky.hapiLab.mod.script

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flags extends js.Object {
  /**
    * An object that is passed to `before` and `after` functions in addition to tests themselves.
    */
  val context: Record[String, _] = js.native
  /**
    * A property that can be assigned a cleanup function registered at runtime to be executed after the test completes.
    */
  var onCleanup: js.UndefOr[Action] = js.native
  /**
    * A property that can be assigned an override for global exception handling.
    */
  var onUncaughtException: js.UndefOr[ErrorHandler] = js.native
  /**
    * A property that can be assigned an override function for global rejection handling.
    */
  var onUnhandledRejection: js.UndefOr[ErrorHandler] = js.native
  /**
    * Sets a requirement that a function must be called a certain number of times.
    * 
    * @param func - the function to be called.
    * @param count - the number of required invocations.
    * 
    * @returns a wrapped function.
    */
  def mustCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, count: Double): T = js.native
  /**
    * Adds notes to the test log.
    * 
    * @param note - a string to be included in the console reporter at the end of the output.
    */
  def note(note: String): Unit = js.native
}

object Flags {
  @scala.inline
  def apply(context: Record[String, _], mustCall: (js.Any, Double) => js.Any, note: String => Unit): Flags = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mustCall = js.Any.fromFunction2(mustCall), note = js.Any.fromFunction1(note))
    __obj.asInstanceOf[Flags]
  }
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMustCall(value: (js.Any, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustCall")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNote(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCleanup(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUncaughtException(value: /* err */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUncaughtException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUncaughtException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUncaughtException")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnhandledRejection(value: /* err */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnhandledRejection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnhandledRejection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnhandledRejection")(js.undefined)
        ret
    }
  }
  
}

