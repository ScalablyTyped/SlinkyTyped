package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routerMod {
  
  type AppComponent = slinky.core.ReactComponentClass[typingsSlinky.next.routerMod.AppProps]
  
  type AppProps = typingsSlinky.next.anon.PickCompletePrivateRouteI with typingsSlinky.next.anon.Router with (typingsSlinky.std.Record[java.lang.String, _])
  
  type BeforePopStateCallback = js.Function1[/* state */ typingsSlinky.next.routerMod.NextHistoryState, scala.Boolean]
  
  type ComponentLoadCancel = js.Function0[scala.Unit] | scala.Null
  
  type Subscription = js.Function2[
    /* data */ typingsSlinky.next.routerMod.PrivateRouteInfo, 
    /* App */ typingsSlinky.next.routerMod.AppComponent, 
    js.Promise[scala.Unit]
  ]
  
  type Url = typingsSlinky.node.urlMod.UrlObject | java.lang.String
}
