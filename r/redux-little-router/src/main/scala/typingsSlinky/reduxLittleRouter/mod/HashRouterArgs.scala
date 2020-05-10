package typingsSlinky.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashRouterArgs extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var hashType: js.UndefOr[String] = js.native
  var history: js.UndefOr[History] = js.native
  var routes: Routes = js.native
}

object HashRouterArgs {
  @scala.inline
  def apply(routes: Routes): HashRouterArgs = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashRouterArgs]
  }
  @scala.inline
  implicit class HashRouterArgsOps[Self <: HashRouterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoutes(value: Routes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(js.undefined)
        ret
    }
    @scala.inline
    def withHashType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: History): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
  }
  
}

