package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the event object used for client-side events.
  */
@js.native
trait ASPxClientEvent[T] extends js.Object {
  /**
    * Dynamically connects the event with an appropriate event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def AddHandler(handler: T): Unit = js.native
  /**
    * Dynamically disconnects the event from all the associated event handler functions.
    */
  def ClearHandlers(): Unit = js.native
  /**
    * For internal use only.
    */
  def FireEvent(source: js.Any, e: ASPxClientEventArgs): Unit = js.native
  /**
    * Dynamically disconnects the event from the associated event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def RemoveHandler(handler: T): Unit = js.native
}

object ASPxClientEvent {
  @scala.inline
  def apply[T](
    AddHandler: T => Unit,
    ClearHandlers: () => Unit,
    FireEvent: (js.Any, ASPxClientEventArgs) => Unit,
    RemoveHandler: T => Unit
  ): ASPxClientEvent[T] = {
    val __obj = js.Dynamic.literal(AddHandler = js.Any.fromFunction1(AddHandler), ClearHandlers = js.Any.fromFunction0(ClearHandlers), FireEvent = js.Any.fromFunction2(FireEvent), RemoveHandler = js.Any.fromFunction1(RemoveHandler))
    __obj.asInstanceOf[ASPxClientEvent[T]]
  }
  @scala.inline
  implicit class ASPxClientEventOps[Self[t] <: ASPxClientEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddHandler(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearHandlers(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearHandlers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFireEvent(value: (js.Any, ASPxClientEventArgs) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FireEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveHandler(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveHandler")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

