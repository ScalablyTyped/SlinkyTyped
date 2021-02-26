package typingsSlinky.reduxLittleRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def BLOCK_ : /* "ROUTER_BLOCK" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BLOCK").asInstanceOf[/* "ROUTER_BLOCK" */ java.lang.String]
  
  type BlockCallback = js.Function2[
    /* location */ typingsSlinky.reduxLittleRouter.mod.Location, 
    /* action */ js.UndefOr[typingsSlinky.reduxLittleRouter.mod.HistoryAction], 
    java.lang.String
  ]
  
  @scala.inline
  def DID_REPLACE_ROUTES: /* "ROUTER_DID_REPLACE_ROUTES" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DID_REPLACE_ROUTES").asInstanceOf[/* "ROUTER_DID_REPLACE_ROUTES" */ java.lang.String]
  
  @scala.inline
  def GO_ : /* "ROUTER_GO" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GO").asInstanceOf[/* "ROUTER_GO" */ java.lang.String]
  
  @scala.inline
  def GO_BACK: /* "ROUTER_GO_BACK" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GO_BACK").asInstanceOf[/* "ROUTER_GO_BACK" */ java.lang.String]
  
  @scala.inline
  def GO_FORWARD: /* "ROUTER_GO_FORWARD" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GO_FORWARD").asInstanceOf[/* "ROUTER_GO_FORWARD" */ java.lang.String]
  
  type Href = java.lang.String | typingsSlinky.reduxLittleRouter.mod.Location
  
  @scala.inline
  def LOCATION_CHANGED: /* "ROUTER_LOCATION_CHANGED" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LOCATION_CHANGED").asInstanceOf[/* "ROUTER_LOCATION_CHANGED" */ java.lang.String]
  
  type ListenCallback = js.Function2[
    /* location */ typingsSlinky.reduxLittleRouter.mod.Location, 
    /* action */ js.UndefOr[typingsSlinky.reduxLittleRouter.mod.HistoryAction], 
    scala.Unit
  ]
  
  type ObjectLiteral[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  @scala.inline
  def POP: /* "ROUTER_POP" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("POP").asInstanceOf[/* "ROUTER_POP" */ java.lang.String]
  
  @scala.inline
  def PUSH_ : /* "ROUTER_PUSH" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PUSH").asInstanceOf[/* "ROUTER_PUSH" */ java.lang.String]
  
  type Params = typingsSlinky.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]
  
  type Query = typingsSlinky.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]
  
  @scala.inline
  def REPLACE_ : /* "ROUTER_REPLACE" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("REPLACE").asInstanceOf[/* "ROUTER_REPLACE" */ java.lang.String]
  
  @scala.inline
  def REPLACE_ROUTES: /* "ROUTER_REPLACE_ROUTES" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("REPLACE_ROUTES").asInstanceOf[/* "ROUTER_REPLACE_ROUTES" */ java.lang.String]
  
  type Routes = typingsSlinky.reduxLittleRouter.mod.ObjectLiteral[typingsSlinky.reduxLittleRouter.mod.ObjectLiteral[js.Any]]
  
  @scala.inline
  def UNBLOCK_ : /* "ROUTER_UNBLOCK" */ java.lang.String = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("UNBLOCK").asInstanceOf[/* "ROUTER_UNBLOCK" */ java.lang.String]
  
  type Unsubscribe = js.Function0[scala.Unit]
  
  @scala.inline
  def block(historyShouldBlock: typingsSlinky.reduxLittleRouter.mod.BlockCallback): typingsSlinky.reduxLittleRouter.mod.BlockAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("block")(historyShouldBlock.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.BlockAction]
  
  @scala.inline
  def go(index: scala.Double): typingsSlinky.reduxLittleRouter.mod.GoAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("go")(index.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.GoAction]
  
  @scala.inline
  def goBack(): typingsSlinky.reduxLittleRouter.mod.GoBackAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[typingsSlinky.reduxLittleRouter.mod.GoBackAction]
  
  @scala.inline
  def goForward(): typingsSlinky.reduxLittleRouter.mod.GoForwardAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[typingsSlinky.reduxLittleRouter.mod.GoForwardAction]
  
  @scala.inline
  def immutableRouterForBrowser(options: typingsSlinky.reduxLittleRouter.mod.BrowserRouterArgs): typingsSlinky.reduxLittleRouter.mod.Router = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.Router]
  
  @scala.inline
  def immutableRouterForExpress(options: typingsSlinky.reduxLittleRouter.mod.ExpressRouterArgs): typingsSlinky.reduxLittleRouter.mod.Router = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForExpress")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.Router]
  
  @scala.inline
  def immutableRouterForHapi(options: typingsSlinky.reduxLittleRouter.mod.HapiRouterArgs): typingsSlinky.reduxLittleRouter.mod.Router = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForHapi")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.Router]
  
  @scala.inline
  def immutableRouterForHash(options: typingsSlinky.reduxLittleRouter.mod.HashRouterArgs): typingsSlinky.reduxLittleRouter.mod.Router = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForHash")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.Router]
  
  @scala.inline
  def initializeCurrentLocation(location: typingsSlinky.reduxLittleRouter.mod.Location): typingsSlinky.reduxLittleRouter.mod.LocationChangedAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initializeCurrentLocation")(location.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.LocationChangedAction]
  
  @scala.inline
  def push(href: typingsSlinky.reduxLittleRouter.mod.Href): typingsSlinky.reduxLittleRouter.mod.PushAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.PushAction]
  @scala.inline
  def push(
    href: typingsSlinky.reduxLittleRouter.mod.Href,
    options: typingsSlinky.reduxLittleRouter.mod.LocationOptions
  ): typingsSlinky.reduxLittleRouter.mod.PushAction = (typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.PushAction]
  
  @scala.inline
  def replace(href: typingsSlinky.reduxLittleRouter.mod.Href): typingsSlinky.reduxLittleRouter.mod.ReplaceAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.ReplaceAction]
  @scala.inline
  def replace(
    href: typingsSlinky.reduxLittleRouter.mod.Href,
    options: typingsSlinky.reduxLittleRouter.mod.LocationOptions
  ): typingsSlinky.reduxLittleRouter.mod.ReplaceAction = (typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.ReplaceAction]
  
  @scala.inline
  def replaceRoutes(routes: typingsSlinky.reduxLittleRouter.mod.Routes): typingsSlinky.reduxLittleRouter.mod.ReplaceRoutesAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replaceRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.ReplaceRoutesAction]
  
  @scala.inline
  def routerForBrowser(options: typingsSlinky.reduxLittleRouter.mod.BrowserRouterArgs): typingsSlinky.reduxLittleRouter.mod.Router = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("routerForBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.Router]
  
  @scala.inline
  def routerForExpress(options: typingsSlinky.reduxLittleRouter.mod.ExpressRouterArgs): typingsSlinky.reduxLittleRouter.mod.Router = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("routerForExpress")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.Router]
  
  @scala.inline
  def routerForHapi(options: typingsSlinky.reduxLittleRouter.mod.HapiRouterArgs): typingsSlinky.reduxLittleRouter.mod.Router = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("routerForHapi")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.Router]
  
  @scala.inline
  def routerForHash(options: typingsSlinky.reduxLittleRouter.mod.HashRouterArgs): typingsSlinky.reduxLittleRouter.mod.Router = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("routerForHash")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxLittleRouter.mod.Router]
  
  @scala.inline
  def unblock(): typingsSlinky.reduxLittleRouter.mod.UnblockAction = typingsSlinky.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unblock")().asInstanceOf[typingsSlinky.reduxLittleRouter.mod.UnblockAction]
}
