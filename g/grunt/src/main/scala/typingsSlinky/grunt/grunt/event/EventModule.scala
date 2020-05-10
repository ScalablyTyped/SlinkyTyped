package typingsSlinky.grunt.grunt.event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/hij1nx/EventEmitter2}
  */
@js.native
trait EventModule extends js.Object {
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    */
  def addListener(event: String, listener: js.Function): EventModule = js.native
  /**
    * Execute each of the listeners that may be listening for the specified event name
    * in order with the list of arguments.
    */
  def emit(event: String, args: js.Any*): js.Any = js.native
  /**
    * Returns an array of listeners for the specified event.
    * This array can be manipulated, e.g. to remove listeners.
    */
  def listeners(event: String): js.Array[js.Function] = js.native
  /**
    * Returns an array of listeners that are listening for any event that is specified.
    * This array can be manipulated, e.g. to remove listeners.
    */
  def listenersAny(): js.Array[js.Function] = js.native
  /**
    * Adds a listener that will execute n times for the event before being removed.
    * The listener is invoked only the first time the event is fired, after which it is removed.
    */
  def many(event: String, timesToListen: Double, listener: js.Function): EventModule = js.native
  def off(event: String, listener: js.Function): EventModule = js.native
  /**
    * Removes the listener that will be fired when any event is emitted.
    */
  def offAny(listener: js.Function): EventModule = js.native
  def on(event: String, listener: js.Function): EventModule = js.native
  /**
    * Adds a listener that will be fired when any event is emitted.
    */
  def onAny(listener: js.Function): EventModule = js.native
  /**
    * Adds a one time listener for the event.
    * The listener is invoked only the first time the event is fired, after which it is removed.
    */
  def once(event: String, listener: js.Function): EventModule = js.native
  /**
    * Removes all listeners, or those of the specified event.
    */
  def removeAllListeners(event: String): EventModule = js.native
  /**
    * Remove a listener from the listener array for the specified event.
    * Caution: changes array indices in the listener array behind the listener.
    */
  def removeListener(event: String, listener: js.Function): EventModule = js.native
  /**
    * By default EventEmitters will print a warning if more than 10 listeners are added to it.
    * This is a useful default which helps finding memory leaks. Obviously not all Emitters
    * should be limited to 10. This function allows that to be increased.
    *
    * Set to zero for unlimited.
    */
  def setMaxListener(n: Double): Unit = js.native
}

object EventModule {
  @scala.inline
  def apply(
    addListener: (String, js.Function) => EventModule,
    emit: (String, /* repeated */ js.Any) => js.Any,
    listeners: String => js.Array[js.Function],
    listenersAny: () => js.Array[js.Function],
    many: (String, Double, js.Function) => EventModule,
    off: (String, js.Function) => EventModule,
    offAny: js.Function => EventModule,
    on: (String, js.Function) => EventModule,
    onAny: js.Function => EventModule,
    once: (String, js.Function) => EventModule,
    removeAllListeners: String => EventModule,
    removeListener: (String, js.Function) => EventModule,
    setMaxListener: Double => Unit
  ): EventModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), listeners = js.Any.fromFunction1(listeners), listenersAny = js.Any.fromFunction0(listenersAny), many = js.Any.fromFunction3(many), off = js.Any.fromFunction2(off), offAny = js.Any.fromFunction1(offAny), on = js.Any.fromFunction2(on), onAny = js.Any.fromFunction1(onAny), once = js.Any.fromFunction2(once), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), setMaxListener = js.Any.fromFunction1(setMaxListener))
    __obj.asInstanceOf[EventModule]
  }
  @scala.inline
  implicit class EventModuleOps[Self <: EventModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: (String, js.Function) => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmit(value: (String, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListeners(value: String => js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListenersAny(value: () => js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenersAny")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMany(value: (String, Double, js.Function) => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("many")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOff(value: (String, js.Function) => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOffAny(value: js.Function => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offAny")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function) => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnAny(value: js.Function => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAny")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnce(value: (String, js.Function) => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAllListeners(value: String => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: (String, js.Function) => EventModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMaxListener(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

