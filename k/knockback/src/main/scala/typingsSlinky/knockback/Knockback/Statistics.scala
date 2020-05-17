package typingsSlinky.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statistics extends js.Object {
  def addModelEvent(event: String): js.Any = js.native
  def clear(): js.Any = js.native
  def modelEventsStatsString(): js.Any = js.native
  def register(key: String, obj: js.Any): js.Any = js.native
  def registeredCount(`type`: js.Any): Double = js.native
  def registeredStatsString(success_message: String): String = js.native
  def unregister(key: String, obj: js.Any): js.Any = js.native
}

object Statistics {
  @scala.inline
  def apply(
    addModelEvent: String => js.Any,
    clear: () => js.Any,
    modelEventsStatsString: () => js.Any,
    register: (String, js.Any) => js.Any,
    registeredCount: js.Any => Double,
    registeredStatsString: String => String,
    unregister: (String, js.Any) => js.Any
  ): Statistics = {
    val __obj = js.Dynamic.literal(addModelEvent = js.Any.fromFunction1(addModelEvent), clear = js.Any.fromFunction0(clear), modelEventsStatsString = js.Any.fromFunction0(modelEventsStatsString), register = js.Any.fromFunction2(register), registeredCount = js.Any.fromFunction1(registeredCount), registeredStatsString = js.Any.fromFunction1(registeredStatsString), unregister = js.Any.fromFunction2(unregister))
    __obj.asInstanceOf[Statistics]
  }
  @scala.inline
  implicit class StatisticsOps[Self <: Statistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddModelEvent(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addModelEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModelEventsStatsString(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEventsStatsString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegister(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisteredCount(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisteredStatsString(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredStatsString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregister(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

