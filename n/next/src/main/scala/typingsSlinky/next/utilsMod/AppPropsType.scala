package typingsSlinky.next.utilsMod

import typingsSlinky.next.routerMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/next-server/lib/utils.AppInitialProps & {  Component  :next.next/dist/next-server/lib/utils.NextComponentType<next.next/dist/next-server/lib/utils.NextPageContext, any, P>,   router  :R,   __N_SSG ? :boolean,   __N_SSP ? :boolean} */
@js.native
trait AppPropsType[R /* <: NextRouter */, P] extends js.Object {
  var Component: NextComponentType[NextPageContext, _, P] = js.native
  var __N_SSG: js.UndefOr[Boolean] = js.native
  var __N_SSP: js.UndefOr[Boolean] = js.native
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
    @scala.inline
    def with__N_SSG(value: Boolean): Self[R, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__N_SSG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__N_SSG: Self[R, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__N_SSG")(js.undefined)
        ret
    }
    @scala.inline
    def with__N_SSP(value: Boolean): Self[R, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__N_SSP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__N_SSP: Self[R, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__N_SSP")(js.undefined)
        ret
    }
  }
  
}

