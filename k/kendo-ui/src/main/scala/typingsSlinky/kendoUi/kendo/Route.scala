package typingsSlinky.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends Class {
  var route: js.RegExp = js.native
  def callback(url: String): Unit = js.native
  def worksWith(url: String): Unit = js.native
}

object Route {
  @scala.inline
  def apply(callback: String => Unit, route: js.RegExp, worksWith: String => Unit): Route = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), route = route.asInstanceOf[js.Any], worksWith = js.Any.fromFunction1(worksWith))
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoute(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorksWith(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksWith")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

