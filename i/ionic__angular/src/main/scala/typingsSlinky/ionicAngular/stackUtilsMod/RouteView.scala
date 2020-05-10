package typingsSlinky.ionicAngular.stackUtilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ComponentRef
import typingsSlinky.angularRouter.mod.NavigationExtras
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteView extends js.Object {
  var element: HTMLElement = js.native
  var id: Double = js.native
  var ref: ComponentRef[_] = js.native
  var savedData: js.UndefOr[js.Any] = js.native
  var savedExtras: js.UndefOr[NavigationExtras] = js.native
  var stackId: js.UndefOr[String] = js.native
  var url: String = js.native
  def unlistenEvents(): Unit = js.native
}

object RouteView {
  @scala.inline
  def apply(element: HTMLElement, id: Double, ref: ComponentRef[_], unlistenEvents: () => Unit, url: String): RouteView = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], unlistenEvents = js.Any.fromFunction0(unlistenEvents), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteView]
  }
  @scala.inline
  implicit class RouteViewOps[Self <: RouteView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: ComponentRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlistenEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlistenEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavedData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedData")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedExtras(value: NavigationExtras): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedExtras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedExtras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedExtras")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(js.undefined)
        ret
    }
  }
  
}

