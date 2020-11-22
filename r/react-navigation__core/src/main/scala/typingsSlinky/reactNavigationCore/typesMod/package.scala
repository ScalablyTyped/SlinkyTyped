package typingsSlinky.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CompositeNavigationProp[A /* <: typingsSlinky.reactNavigationCore.typesMod.NavigationProp[
    typingsSlinky.reactNavigationRouters.typesMod.ParamListBase, 
    java.lang.String, 
    _, 
    _, 
    js.Object
  ] */, B /* <: typingsSlinky.reactNavigationCore.typesMod.NavigationHelpersCommon[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase, _] */] = (typingsSlinky.std.Omit[
    A with B, 
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, string, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> */ typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.dispatch | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.navigate_ | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.reset | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.goBack | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.isFocused | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.canGoBack | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.dangerouslyGetParent | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.dangerouslyGetState | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings._empty | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.setParams | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.setOptions | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.addListener | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.removeListener
  ]) with (typingsSlinky.reactNavigationCore.typesMod.NavigationProp[
    js.Any, 
    java.lang.String, 
    typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase], 
    js.Object, 
    js.Object
  ])
  
  type EventArg[EventName /* <: java.lang.String */, CanPreventDefault /* <: js.UndefOr[scala.Boolean] */, Data] = typingsSlinky.reactNavigationCore.anon.Target[EventName] with (js.Object | typingsSlinky.reactNavigationCore.anon.DefaultPrevented) with (typingsSlinky.reactNavigationCore.anon.DataReadonly[Data] | typingsSlinky.reactNavigationCore.anon.`1`[Data])
  
  type EventListenerCallback[EventMap /* <: typingsSlinky.reactNavigationCore.typesMod.EventMapBase */, EventName /* <: /* keyof EventMap */ java.lang.String */] = js.Function1[
    /* e */ typingsSlinky.reactNavigationCore.typesMod.EventArg[
      typingsSlinky.std.Extract[EventName, java.lang.String], 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ], 
    scala.Unit
  ]
  
  type EventMapBase = typingsSlinky.std.Record[java.lang.String, typingsSlinky.reactNavigationCore.anon.CanPreventDefault]
  
  type NavigatorScreenParams[ParamList, State /* <: typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase] */] = typingsSlinky.reactNavigationCore.anon.Initial[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ RouteName in keyof ParamList ]: undefined extends ParamList[RouteName]? {  screen :RouteName,   params :ParamList[RouteName] | undefined,   initial :boolean | undefined,   state :never | undefined} : {  screen :RouteName,   params :ParamList[RouteName],   initial :boolean | undefined,   state :never | undefined}}[keyof ParamList] */ js.Any)
  
  type RouteConfig[ParamList /* <: typingsSlinky.reactNavigationRouters.typesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */, State /* <: typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: typingsSlinky.reactNavigationCore.typesMod.EventMapBase */] = (typingsSlinky.reactNavigationCore.anon.InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]) with (typingsSlinky.reactNavigationCore.anon.Children | typingsSlinky.reactNavigationCore.anon.Component | (typingsSlinky.reactNavigationCore.anon.GetComponent[ParamList, RouteName]))
  
  type RouteProp[ParamList /* <: typingsSlinky.reactNavigationRouters.typesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */] = typingsSlinky.reactNavigationRouters.typesMod.Route[
    typingsSlinky.std.Extract[RouteName, java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]
  
  type ScreenListeners[State /* <: typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase] */, EventMap /* <: typingsSlinky.reactNavigationCore.typesMod.EventMapBase */] = typingsSlinky.std.Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ EventName in keyof EventMap & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<State> ]: @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventListenerCallback<EventMap, EventName>}
    */ typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.ScreenListeners with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
}
