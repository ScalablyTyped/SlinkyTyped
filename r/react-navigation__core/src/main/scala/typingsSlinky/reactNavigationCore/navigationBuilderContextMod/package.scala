package typingsSlinky.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object navigationBuilderContextMod {
  
  type AddKeyedListener = js.Function3[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.getState | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.beforeRemove, 
    /* key */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any, 
    scala.Unit
  ]
  
  type AddListener = js.Function2[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.action | typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.focus, 
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any, 
    scala.Unit
  ]
  
  type ChildActionListener = js.Function2[
    /* action */ typingsSlinky.reactNavigationRouters.typesMod.NavigationAction, 
    /* visitedNavigators */ js.UndefOr[typingsSlinky.std.Set[java.lang.String]], 
    scala.Boolean
  ]
  
  type ChildBeforeRemoveListener = js.Function1[
    /* action */ typingsSlinky.reactNavigationRouters.typesMod.NavigationAction, 
    scala.Boolean
  ]
  
  type FocusedNavigationCallback[T] = js.Function1[
    /* navigation */ typingsSlinky.reactNavigationCore.typesMod.NavigationHelpers[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase, js.Object], 
    T
  ]
  
  type FocusedNavigationListener = js.Function1[
    /* callback */ typingsSlinky.reactNavigationCore.navigationBuilderContextMod.FocusedNavigationCallback[js.Any], 
    typingsSlinky.reactNavigationCore.anon.Handled[js.Any]
  ]
  
  type GetStateListener = js.Function0[
    typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase]
  ]
}
