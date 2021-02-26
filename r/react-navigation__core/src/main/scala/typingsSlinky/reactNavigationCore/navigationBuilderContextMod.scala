package typingsSlinky.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigationCore.anon.Handled
import typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.action
import typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.focus
import typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.getState
import typingsSlinky.reactNavigationCore.typesMod.NavigationHelpers
import typingsSlinky.reactNavigationRouters.typesMod.NavigationAction
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationBuilderContextMod extends Shortcut {
  
  /**
    * Context which holds the required helpers needed to build nested navigators.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationBuilderContext", JSImport.Default)
  @js.native
  val default: Context[typingsSlinky.reactNavigationCore.anon.AddKeyedListener] = js.native
  
  type AddKeyedListener = js.Function3[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, 
    /* key */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any, 
    Unit
  ]
  
  type AddListener = js.Function2[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, 
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any, 
    Unit
  ]
  
  type ChildActionListener = js.Function2[
    /* action */ NavigationAction, 
    /* visitedNavigators */ js.UndefOr[Set[String]], 
    Boolean
  ]
  
  type ChildBeforeRemoveListener = js.Function1[/* action */ NavigationAction, Boolean]
  
  type FocusedNavigationCallback[T] = js.Function1[/* navigation */ NavigationHelpers[ParamListBase, js.Object], T]
  
  type FocusedNavigationListener = js.Function1[/* callback */ FocusedNavigationCallback[js.Any], Handled[js.Any]]
  
  type GetStateListener = js.Function0[NavigationState[ParamListBase]]
  
  @js.native
  trait KeyedListenerMap extends StObject {
    
    var beforeRemove: ChildBeforeRemoveListener = js.native
    
    var getState: GetStateListener = js.native
  }
  object KeyedListenerMap {
    
    @scala.inline
    def apply(
      beforeRemove: /* action */ NavigationAction => Boolean,
      getState: () => NavigationState[ParamListBase]
    ): KeyedListenerMap = {
      val __obj = js.Dynamic.literal(beforeRemove = js.Any.fromFunction1(beforeRemove), getState = js.Any.fromFunction0(getState))
      __obj.asInstanceOf[KeyedListenerMap]
    }
    
    @scala.inline
    implicit class KeyedListenerMapMutableBuilder[Self <: KeyedListenerMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeRemove(value: /* action */ NavigationAction => Boolean): Self = StObject.set(x, "beforeRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetState(value: () => NavigationState[ParamListBase]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ListenerMap extends StObject {
    
    var action: ChildActionListener = js.native
    
    var focus: FocusedNavigationListener = js.native
  }
  object ListenerMap {
    
    @scala.inline
    def apply(
      action: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean,
      focus: /* callback */ FocusedNavigationCallback[js.Any] => Handled[js.Any]
    ): ListenerMap = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), focus = js.Any.fromFunction1(focus))
      __obj.asInstanceOf[ListenerMap]
    }
    
    @scala.inline
    implicit class ListenerMapMutableBuilder[Self <: ListenerMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocus(value: /* callback */ FocusedNavigationCallback[js.Any] => Handled[js.Any]): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[typingsSlinky.reactNavigationCore.anon.AddKeyedListener]
  
  /* This means you don't have to write `default`, but can instead just say `navigationBuilderContextMod.foo` */
  override def _to: Context[typingsSlinky.reactNavigationCore.anon.AddKeyedListener] = default
}
