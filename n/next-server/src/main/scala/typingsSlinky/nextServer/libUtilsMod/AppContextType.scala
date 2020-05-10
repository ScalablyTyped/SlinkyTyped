package typingsSlinky.nextServer.libUtilsMod

import typingsSlinky.nextServer.routerMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppContextType[R /* <: NextRouter */] extends js.Object {
  var AppTree: AppType = js.native
  var Component: NextComponentType[NextPageContext, js.Object, js.Object] = js.native
  var ctx: NextPageContext = js.native
  var router: R = js.native
}

object AppContextType {
  @scala.inline
  def apply[R](
    AppTree: AppType,
    Component: NextComponentType[NextPageContext, js.Object, js.Object],
    ctx: NextPageContext,
    router: R
  ): AppContextType[R] = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContextType[R]]
  }
  @scala.inline
  implicit class AppContextTypeOps[Self[r] <: AppContextType[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withAppTree(value: AppType): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: NextComponentType[NextPageContext, js.Object, js.Object]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtx(value: NextPageContext): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouter(value: R): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

