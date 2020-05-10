package typingsSlinky.nextServer.libUtilsMod

import typingsSlinky.nextServer.routerMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/utils.AppInitialProps & {  Component  :next-server.next-server/dist/lib/utils.NextComponentType<next-server.next-server/dist/lib/utils.NextPageContext, any, P>,   router  :R} */
@js.native
trait AppPropsType[R /* <: NextRouter */, P] extends js.Object {
  var Component: NextComponentType[NextPageContext, _, P] = js.native
  var pageProps: js.Any = js.native
  var router: R = js.native
}

object AppPropsType {
  @scala.inline
  def apply[R, P](Component: NextComponentType[NextPageContext, _, P], pageProps: js.Any, router: R): AppPropsType[R, P] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageProps = pageProps.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPropsType[R, P]]
  }
  @scala.inline
  implicit class AppPropsTypeOps[Self[r, p] <: AppPropsType[r, p], R, P] (val x: Self[R, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, P]) with Other]
    @scala.inline
    def withComponent(value: NextComponentType[NextPageContext, _, P]): Self[R, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageProps(value: js.Any): Self[R, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouter(value: R): Self[R, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

