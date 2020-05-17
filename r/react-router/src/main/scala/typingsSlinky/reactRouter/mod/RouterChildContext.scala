package typingsSlinky.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reactRouter.anon.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterChildContext[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.RouterChildContext with TopLevel[js.Any] */] extends js.Object {
  var router: History[Params] = js.native
}

object RouterChildContext {
  @scala.inline
  def apply[Params](router: History[Params]): RouterChildContext[Params] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterChildContext[Params]]
  }
  @scala.inline
  implicit class RouterChildContextOps[Self[params] <: RouterChildContext[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withRouter(value: History[Params]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

