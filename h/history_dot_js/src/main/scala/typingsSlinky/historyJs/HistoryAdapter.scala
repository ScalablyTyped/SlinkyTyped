package typingsSlinky.historyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryAdapter extends js.Object {
  def bind(element: js.Any, event: String, callback: js.Function0[Unit]): Unit = js.native
  def onDomLoad(callback: js.Function0[Unit]): Unit = js.native
  def trigger(element: js.Any, event: String): Unit = js.native
}

object HistoryAdapter {
  @scala.inline
  def apply(
    bind: (js.Any, String, js.Function0[Unit]) => Unit,
    onDomLoad: js.Function0[Unit] => Unit,
    trigger: (js.Any, String) => Unit
  ): HistoryAdapter = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), onDomLoad = js.Any.fromFunction1(onDomLoad), trigger = js.Any.fromFunction2(trigger))
    __obj.asInstanceOf[HistoryAdapter]
  }
  @scala.inline
  implicit class HistoryAdapterOps[Self <: HistoryAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: (js.Any, String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnDomLoad(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrigger(value: (js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

