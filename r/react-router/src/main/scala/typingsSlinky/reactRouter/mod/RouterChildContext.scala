package typingsSlinky.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reactRouter.anon.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterChildContext[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.RouterChildContext with TopLevel[js.Any] */] extends js.Object {
  
  var router: History[Params] = js.native
}
object RouterChildContext {
  
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.RouterChildContext with TopLevel[js.Any] */](router: History[Params]): RouterChildContext[Params] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterChildContext[Params]]
  }
  
  @scala.inline
  implicit class RouterChildContextOps[Self <: RouterChildContext[_], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.RouterChildContext with TopLevel[js.Any] */] (val x: Self with RouterChildContext[Params]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRouter(value: History[Params]): Self = this.set("router", value.asInstanceOf[js.Any])
  }
}
