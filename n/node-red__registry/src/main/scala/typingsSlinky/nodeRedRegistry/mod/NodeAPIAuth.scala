package typingsSlinky.nodeRedRegistry.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeAPIAuth extends StObject {
  
  /**
    * Returns an Express middleware function that ensures the user making a request has the necessary permission.
    */
  def needsPermission(permission: String): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}
object NodeAPIAuth {
  
  @scala.inline
  def apply(
    needsPermission: String => js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      Unit
    ]
  ): NodeAPIAuth = {
    val __obj = js.Dynamic.literal(needsPermission = js.Any.fromFunction1(needsPermission))
    __obj.asInstanceOf[NodeAPIAuth]
  }
  
  @scala.inline
  implicit class NodeAPIAuthMutableBuilder[Self <: NodeAPIAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNeedsPermission(
      value: String => js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* res */ Response_[_], 
          /* next */ NextFunction, 
          Unit
        ]
    ): Self = StObject.set(x, "needsPermission", js.Any.fromFunction1(value))
  }
}
