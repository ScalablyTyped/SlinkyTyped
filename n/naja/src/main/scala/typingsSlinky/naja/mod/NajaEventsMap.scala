package typingsSlinky.naja.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NajaEventsMap extends js.Object {
  var abort: NajaEventListener[AbortEvent] = js.native
  var before: NajaEventListener[BeforeEvent[RequestData]] = js.native
  var complete: NajaEventListener[CompleteEvent[_]] = js.native
  var error: NajaEventListener[ErrorEvent[_]] = js.native
  var init: NajaEventListener[InitEvent] = js.native
  var interaction: NajaEventListener[InteractionEvent] = js.native
  var load: NajaEventListener[Event] = js.native
  var start: NajaEventListener[StartEvent] = js.native
  var success: NajaEventListener[SuccessEvent[_]] = js.native
}

object NajaEventsMap {
  @scala.inline
  def apply(
    abort: NajaEventListener[AbortEvent],
    before: NajaEventListener[BeforeEvent[RequestData]],
    complete: NajaEventListener[CompleteEvent[_]],
    error: NajaEventListener[ErrorEvent[_]],
    init: NajaEventListener[InitEvent],
    interaction: NajaEventListener[InteractionEvent],
    load: NajaEventListener[Event],
    start: NajaEventListener[StartEvent],
    success: NajaEventListener[SuccessEvent[_]]
  ): NajaEventsMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[NajaEventsMap]
  }
  @scala.inline
  implicit class NajaEventsMapOps[Self <: NajaEventsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortFunction1(value: AbortEvent => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAbort(value: NajaEventListener[AbortEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeFunction1(value: BeforeEvent[RequestData] => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBefore(value: NajaEventListener[BeforeEvent[RequestData]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleteFunction1(value: CompleteEvent[_] => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComplete(value: NajaEventListener[CompleteEvent[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorFunction1(value: ErrorEvent[_] => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: NajaEventListener[ErrorEvent[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitFunction1(value: InitEvent => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInit(value: NajaEventListener[InitEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractionFunction1(value: InteractionEvent => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInteraction(value: NajaEventListener[InteractionEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadFunction1(value: Event => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad(value: NajaEventListener[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartFunction1(value: StartEvent => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: NajaEventListener[StartEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessFunction1(value: SuccessEvent[_] => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: NajaEventListener[SuccessEvent[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

