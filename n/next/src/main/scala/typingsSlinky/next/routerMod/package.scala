package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routerMod {
  
  type BeforePopStateCallback = js.Function1[/* state */ js.Any, scala.Boolean]
  
  type ComponentLoadCancel = js.Function0[scala.Unit] | scala.Null
  
  type Subscription = js.Function2[
    /* data */ typingsSlinky.next.routerMod.RouteInfo, 
    /* App */ js.UndefOr[slinky.core.ReactComponentClass[js.Object]], 
    js.Promise[scala.Unit]
  ]
  
  type Url = typingsSlinky.node.urlMod.UrlObject | java.lang.String
}
