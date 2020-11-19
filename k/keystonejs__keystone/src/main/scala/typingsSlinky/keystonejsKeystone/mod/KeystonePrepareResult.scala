package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeystonePrepareResult extends js.Object {
  
  var middlewares: js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}
object KeystonePrepareResult {
  
  @scala.inline
  def apply(middlewares: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): KeystonePrepareResult = {
    val __obj = js.Dynamic.literal(middlewares = middlewares.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystonePrepareResult]
  }
  
  @scala.inline
  implicit class KeystonePrepareResultOps[Self <: KeystonePrepareResult] (val x: Self) extends AnyVal {
    
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
    def setMiddlewaresVarargs(value: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): Self = this.set("middlewares", js.Array(value :_*))
    
    @scala.inline
    def setMiddlewares(value: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): Self = this.set("middlewares", value.asInstanceOf[js.Any])
  }
}
