package typingsSlinky.reactNavigationRouters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ActionCreators[Action /* <: typingsSlinky.reactNavigationRouters.typesMod.NavigationAction */] = org.scalablytyped.runtime.StringDictionary[js.Function1[/* args */ js.Any, Action]]
  
  type CommonNavigationAction = typingsSlinky.reactNavigationRouters.commonActionsMod.Action
  
  type NavigationRoute[ParamList /* <: typingsSlinky.reactNavigationRouters.typesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */] = (typingsSlinky.reactNavigationRouters.typesMod.Route[
    typingsSlinky.std.Extract[RouteName, java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]) with typingsSlinky.reactNavigationRouters.anon.State
  
  type ParamListBase = typingsSlinky.std.Record[java.lang.String, js.UndefOr[js.Object]]
  
  type PartialRoute[R /* <: typingsSlinky.reactNavigationRouters.typesMod.Route[java.lang.String, js.UndefOr[js.Object]] */] = (typingsSlinky.std.Omit[R, typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.key]) with typingsSlinky.reactNavigationRouters.anon.KeyState
  
  type PartialState[State /* <: typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase] */] = (typingsSlinky.std.Partial[
    typingsSlinky.std.Omit[
      State, 
      typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.stale | typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.routes
    ]
  ]) with typingsSlinky.reactNavigationRouters.anon.Routes[State]
  
  type Route[RouteName /* <: java.lang.String */, Params /* <: js.UndefOr[js.Object] */] = typingsSlinky.reactNavigationRouters.anon.KeyName[RouteName] with (typingsSlinky.reactNavigationRouters.anon.ParamsReadonly[Params] | typingsSlinky.reactNavigationRouters.anon.`2`[Params])
  
  type RouterFactory[State /* <: typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase] */, Action /* <: typingsSlinky.reactNavigationRouters.typesMod.NavigationAction */, RouterOptions /* <: typingsSlinky.reactNavigationRouters.typesMod.DefaultRouterOptions[java.lang.String] */] = js.Function1[
    /* options */ RouterOptions, 
    typingsSlinky.reactNavigationRouters.typesMod.Router[State, Action]
  ]
}
