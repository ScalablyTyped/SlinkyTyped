package typingsSlinky.meteor

import typingsSlinky.meteor.Meteor.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  var connection: Connection = js.native
  var userId: String = js.native
  def added(collection: String, id: String, fields: js.Object): Unit = js.native
  def changed(collection: String, id: String, fields: js.Object): Unit = js.native
  def error(error: js.Error): Unit = js.native
  def onStop(func: js.Function): Unit = js.native
  def ready(): Unit = js.native
  def removed(collection: String, id: String): Unit = js.native
  def stop(): Unit = js.native
}

object Subscription {
  @scala.inline
  def apply(
    added: (String, String, js.Object) => Unit,
    changed: (String, String, js.Object) => Unit,
    connection: Connection,
    error: js.Error => Unit,
    onStop: js.Function => Unit,
    ready: () => Unit,
    removed: (String, String) => Unit,
    stop: () => Unit,
    userId: String
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction3(added), changed = js.Any.fromFunction3(changed), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), onStop = js.Any.fromFunction1(onStop), ready = js.Any.fromFunction0(ready), removed = js.Any.fromFunction2(removed), stop = js.Any.fromFunction0(stop), userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: (String, String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withChanged(value: (String, String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStop(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoved(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

