package typingsSlinky.pino

import typingsSlinky.pino.mod.Bindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBindings extends js.Object {
  /**
    * Changes the shape of the bindings.
    * The default shape is { pid, hostname }.
    * The function takes a single argument, the bindings object.
    * It will be called every time a child logger is created.
    */
  var bindings: js.UndefOr[js.Function1[/* bindings */ Bindings, js.Object]] = js.native
  /**
    * Changes the shape of the log level.
    * The default shape is { level: number }.
    * The function takes two arguments, the label of the level (e.g. 'info') and the numeric value (e.g. 30).
    */
  var level: js.UndefOr[js.Function2[/* level */ String, /* number */ Double, js.Object]] = js.native
  /**
    * Changes the shape of the log object.
    * This function will be called every time one of the log methods (such as .info) is called.
    * All arguments passed to the log method, except the message, will be pass to this function.
    * By default it does not change the shape of the log object.
    */
  var log: js.UndefOr[js.Function1[/* object */ js.Object, js.Object]] = js.native
}

object AnonBindings {
  @scala.inline
  def apply(): AnonBindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBindings]
  }
  @scala.inline
  implicit class AnonBindingsOps[Self <: AnonBindings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: /* bindings */ Bindings => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: (/* level */ String, /* number */ Double) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: /* object */ js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
  }
  
}

