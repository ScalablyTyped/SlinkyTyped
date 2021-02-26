package typingsSlinky.mobxStateTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hookMod {
  
  @js.native
  sealed trait Hook extends StObject
  @JSImport("mobx-state-tree/dist/core/node/Hook", "Hook")
  @js.native
  object Hook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Hook with String] = js.native
    
    @js.native
    sealed trait afterAttach extends Hook
    /* "afterAttach" */ val afterAttach: typingsSlinky.mobxStateTree.hookMod.Hook.afterAttach with String = js.native
    
    @js.native
    sealed trait afterCreate extends Hook
    /* "afterCreate" */ val afterCreate: typingsSlinky.mobxStateTree.hookMod.Hook.afterCreate with String = js.native
    
    @js.native
    sealed trait afterCreationFinalization extends Hook
    /* "afterCreationFinalization" */ val afterCreationFinalization: typingsSlinky.mobxStateTree.hookMod.Hook.afterCreationFinalization with String = js.native
    
    @js.native
    sealed trait beforeDestroy extends Hook
    /* "beforeDestroy" */ val beforeDestroy: typingsSlinky.mobxStateTree.hookMod.Hook.beforeDestroy with String = js.native
    
    @js.native
    sealed trait beforeDetach extends Hook
    /* "beforeDetach" */ val beforeDetach: typingsSlinky.mobxStateTree.hookMod.Hook.beforeDetach with String = js.native
  }
  
  @js.native
  trait IHooks extends StObject
  
  type IHooksGetter[T] = js.Function1[/* self */ T, IHooks]
}
