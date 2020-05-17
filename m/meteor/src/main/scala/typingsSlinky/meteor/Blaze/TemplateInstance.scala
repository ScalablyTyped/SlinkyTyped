package typingsSlinky.meteor.Blaze

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.meteor.Meteor.SubscriptionHandle
import typingsSlinky.meteor.Tracker.Computation
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateInstance extends js.Object {
  var data: Record[String, _] = js.native
  var firstNode: js.Object = js.native
  var lastNode: js.Object = js.native
  var view: js.Object = js.native
  @JSName("$")
  def $(selector: String): js.Any = js.native
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  def find(selector: String): HTMLElement = js.native
  def findAll(selector: String): js.Array[HTMLElement] = js.native
  def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
  def subscriptionsReady(): Boolean = js.native
}

object TemplateInstance {
  @scala.inline
  def apply(
    $: String => js.Any,
    autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
    data: Record[String, _],
    find: String => HTMLElement,
    findAll: String => js.Array[HTMLElement],
    firstNode: js.Object,
    lastNode: js.Object,
    subscribe: (String, /* repeated */ js.Any) => SubscriptionHandle,
    subscriptionsReady: () => Boolean,
    view: js.Object
  ): TemplateInstance = {
    val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), autorun = js.Any.fromFunction1(autorun), data = data.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), firstNode = firstNode.asInstanceOf[js.Any], lastNode = lastNode.asInstanceOf[js.Any], subscribe = js.Any.fromFunction2(subscribe), subscriptionsReady = js.Any.fromFunction0(subscriptionsReady), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateInstance]
  }
  @scala.inline
  implicit class TemplateInstanceOps[Self <: TemplateInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorun")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFind(value: String => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindAll(value: String => js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstNode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastNode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribe(value: (String, /* repeated */ js.Any) => SubscriptionHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubscriptionsReady(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionsReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withView(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

