package typingsSlinky.meteor.Blaze

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  @JSName("$")
  var $: js.Any = js.native
  var created: js.Function = js.native
  var destroyed: js.Function = js.native
  var head: Template = js.native
  var renderFunction: js.Function = js.native
  var rendered: js.Function = js.native
  var viewName: String = js.native
  def constructView(): View = js.native
  def events(eventsMap: EventsMap): Unit = js.native
  def find(selector: String): HTMLElement = js.native
  def findAll(selector: String): js.Array[HTMLElement] = js.native
  def helpers(helpersMap: HelpersMap): Unit = js.native
  def onCreated(cb: js.Function): Unit = js.native
  def onDestroyed(cb: js.Function): Unit = js.native
  def onRendered(cb: js.Function): Unit = js.native
}

object Template {
  @scala.inline
  def apply(
    $: js.Any,
    constructView: () => View,
    created: js.Function,
    destroyed: js.Function,
    events: EventsMap => Unit,
    find: String => HTMLElement,
    findAll: String => js.Array[HTMLElement],
    head: Template,
    helpers: HelpersMap => Unit,
    onCreated: js.Function => Unit,
    onDestroyed: js.Function => Unit,
    onRendered: js.Function => Unit,
    renderFunction: js.Function,
    rendered: js.Function,
    viewName: String
  ): Template = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], constructView = js.Any.fromFunction0(constructView), created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], events = js.Any.fromFunction1(events), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), head = head.asInstanceOf[js.Any], helpers = js.Any.fromFunction1(helpers), onCreated = js.Any.fromFunction1(onCreated), onDestroyed = js.Any.fromFunction1(onDestroyed), onRendered = js.Any.fromFunction1(onRendered), renderFunction = renderFunction.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructView(value: () => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreated(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyed(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: EventsMap => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.Any.fromFunction1(value))
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
    def withHead(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpers(value: HelpersMap => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCreated(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDestroyed(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroyed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRendered(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderFunction(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendered(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

