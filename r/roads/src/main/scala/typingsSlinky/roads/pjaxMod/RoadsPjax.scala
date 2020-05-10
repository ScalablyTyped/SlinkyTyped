package typingsSlinky.roads.pjaxMod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.std.Document_
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoadsPjax extends js.Object {
  var _container_element: HTMLElement = js.native
  var _page_title: js.UndefOr[String] = js.native
  var _road: typingsSlinky.roads.roadMod.default = js.native
  var _window: Window_ = js.native
  /**
    * Handles all click events, and directs
    * @param {MouseEvent} event
    */
  /* protected */ def _pjaxEventMonitor(event: MouseEvent): Unit = js.native
  /**
    * Submits the form and re-renders the UI
    *
    * @param {HTMLFormElement} form
    */
  /* protected */ def _roadsFormEvent(form: HTMLFormElement): Unit = js.native
  /**
    * Follows the link and renders the UI
    *
    * @param  {HTMLAnchorElement} link
    */
  /* protected */ def _roadsLinkEvent(link: HTMLAnchorElement): Unit = js.native
  /**
    * Assigns the cookie middlware to the road to properly handle cookies
    *
    * @param {Document} document - The pages document object to properly parse and set cookies
    * @returns {RoadsPjax} this object, useful for chaining
    */
  def addCookieMiddleware(document: Document_): RoadsPjax = js.native
  /**
    * Adds middleware to the assigned road whcih will adds setTitle to the PJAX object (as opposed to the request object like the setTitle middlweare does).
    * This allows you to easily update the page title.
    *
    * @returns {RoadsPjax} this, useful for chaining
    */
  def addTitleMiddleware(): RoadsPjax = js.native
  /**
    * Hooks up the PJAX functionality to the information provided via the constructor.
    */
  def register(): Unit = js.native
  /**
    *
    * @param {HTMLAnchorElement} element
    */
  def registerAdditionalElement(element: HTMLAnchorElement): Unit = js.native
  /**
    * The response from the roads request
    *
    * @param {Response} response_object
    */
  def render(response_object: typingsSlinky.roads.responseMod.default): Unit = js.native
}

object RoadsPjax {
  @scala.inline
  def apply(
    _container_element: HTMLElement,
    _pjaxEventMonitor: MouseEvent => Unit,
    _road: typingsSlinky.roads.roadMod.default,
    _roadsFormEvent: HTMLFormElement => Unit,
    _roadsLinkEvent: HTMLAnchorElement => Unit,
    _window: Window_,
    addCookieMiddleware: Document_ => RoadsPjax,
    addTitleMiddleware: () => RoadsPjax,
    register: () => Unit,
    registerAdditionalElement: HTMLAnchorElement => Unit,
    render: typingsSlinky.roads.responseMod.default => Unit
  ): RoadsPjax = {
    val __obj = js.Dynamic.literal(_container_element = _container_element.asInstanceOf[js.Any], _pjaxEventMonitor = js.Any.fromFunction1(_pjaxEventMonitor), _road = _road.asInstanceOf[js.Any], _roadsFormEvent = js.Any.fromFunction1(_roadsFormEvent), _roadsLinkEvent = js.Any.fromFunction1(_roadsLinkEvent), _window = _window.asInstanceOf[js.Any], addCookieMiddleware = js.Any.fromFunction1(addCookieMiddleware), addTitleMiddleware = js.Any.fromFunction0(addTitleMiddleware), register = js.Any.fromFunction0(register), registerAdditionalElement = js.Any.fromFunction1(registerAdditionalElement), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[RoadsPjax]
  }
  @scala.inline
  implicit class RoadsPjaxOps[Self <: RoadsPjax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_container_element(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_container_element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pjaxEventMonitor(value: MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pjaxEventMonitor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_road(value: typingsSlinky.roads.roadMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_road")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_roadsFormEvent(value: HTMLFormElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_roadsFormEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_roadsLinkEvent(value: HTMLAnchorElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_roadsLinkEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_window(value: Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddCookieMiddleware(value: Document_ => RoadsPjax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCookieMiddleware")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddTitleMiddleware(value: () => RoadsPjax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTitleMiddleware")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegister(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterAdditionalElement(value: HTMLAnchorElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAdditionalElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRender(value: typingsSlinky.roads.responseMod.default => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_page_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_page_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_page_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_page_title")(js.undefined)
        ret
    }
  }
  
}

