package typingsSlinky.ionicCore.interfaceMod

import typingsSlinky.ionicCore.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavOutlet extends js.Object {
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  def setRouteId(id: String, params: js.UndefOr[ComponentProps[Null]], direction: RouterDirection): js.Promise[RouteWrite] = js.native
}

object NavOutlet {
  @scala.inline
  def apply(
    getRouteId: () => js.Promise[js.UndefOr[RouteID]],
    setRouteId: (String, js.UndefOr[ComponentProps[Null]], RouterDirection) => js.Promise[RouteWrite]
  ): NavOutlet = {
    val __obj = js.Dynamic.literal(getRouteId = js.Any.fromFunction0(getRouteId), setRouteId = js.Any.fromFunction3(setRouteId))
    __obj.asInstanceOf[NavOutlet]
  }
  @scala.inline
  implicit class NavOutletOps[Self <: NavOutlet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRouteId(value: () => js.Promise[js.UndefOr[RouteID]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRouteId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetRouteId(value: (String, js.UndefOr[ComponentProps[Null]], RouterDirection) => js.Promise[RouteWrite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRouteId")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

