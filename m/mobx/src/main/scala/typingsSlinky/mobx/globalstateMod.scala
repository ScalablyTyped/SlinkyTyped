package typingsSlinky.mobx

import typingsSlinky.mobx.coreObservableMod.IObservable
import typingsSlinky.mobx.derivationMod.IDerivation
import typingsSlinky.mobx.internalMod.Reaction_
import typingsSlinky.mobx.mobxStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/core/globalstate", JSImport.Namespace)
@js.native
object globalstateMod extends js.Object {
  
  def getGlobal(): js.Any = js.native
  
  def getGlobalState(): js.Any = js.native
  
  var globalState: MobXGlobals = js.native
  
  def isolateGlobalState(): Unit = js.native
  
  def resetGlobalState(): Unit = js.native
  
  @js.native
  class MobXGlobals () extends js.Object {
    
    /**
      * globally unique token to signal unchanged
      */
    var UNCHANGED: IUNCHANGED = js.native
    
    /**
      * Is it allowed to change observables at this point?
      * In general, MobX doesn't allow that when running computations and React.render.
      * To ensure that those functions stay pure.
      */
    var allowStateChanges: Boolean = js.native
    
    /**
      * Is it allowed to read observables at this point?
      * Used to hold the state needed for `observableRequiresReaction`
      */
    var allowStateReads: Boolean = js.native
    
    /**
      * Are we running a computation currently? (not a reaction)
      */
    var computationDepth: Double = js.native
    
    /**
      * Allows overwriting of computed properties, useful in tests but not prod as it can cause
      * memory leaks. See https://github.com/mobxjs/mobx/issues/1867
      */
    var computedConfigurable: Boolean = js.native
    
    /**
      * Warn if computed values are accessed outside a reactive context
      */
    var computedRequiresReaction: Boolean = js.native
    
    var disableErrorBoundaries: Boolean = js.native
    
    /**
      * If strict mode is enabled, state changes are by default not allowed
      */
    var enforceActions: Boolean | strict = js.native
    
    /**
      * Globally attached error handlers that react specifically to errors in reactions
      */
    var globalReactionErrorHandlers: js.Array[js.Function2[/* error */ _, /* derivation */ IDerivation, Unit]] = js.native
    
    /**
      * Are we in a batch block? (and how many of them)
      */
    var inBatch: Double = js.native
    
    /**
      * Are we currently processing reactions?
      */
    var isRunningReactions: Boolean = js.native
    
    /**
      * 'guid' for general purpose. Will be persisted amongst resets.
      */
    var mobxGuid: Double = js.native
    
    /**
      * (Experimental)
      * Warn if observables are accessed outside a reactive context
      */
    var observableRequiresReaction: Boolean = js.native
    
    /**
      * List of scheduled, not yet executed, reactions.
      */
    var pendingReactions: js.Array[Reaction_] = js.native
    
    /**
      * Observables that don't have observers anymore, and are about to be
      * suspended, unless somebody else accesses it in the same batch
      *
      * @type {IObservable[]}
      */
    var pendingUnobservations: js.Array[IObservable] = js.native
    
    /**
      * (Experimental)
      * Warn if you try to create to derivation / reactive context without accessing any observable.
      */
    var reactionRequiresObservable: Boolean = js.native
    
    /**
      * Each time a derivation is tracked, it is assigned a unique run-id
      */
    var runId: Double = js.native
    
    /**
      * Spy callbacks
      */
    var spyListeners: js.Array[js.Function1[/* change */ _, Unit]] = js.native
    
    var suppressReactionErrors: Boolean = js.native
    
    /**
      * Currently running derivation
      */
    var trackingDerivation: IDerivation | Null = js.native
    
    /**
      * MobXGlobals version.
      * MobX compatiblity with other versions loaded in memory as long as this version matches.
      * It indicates that the global state still stores similar information
      *
      * N.B: this version is unrelated to the package version of MobX, and is only the version of the
      * internal state storage of MobX, and can be the same across many different package versions
      */
    var version: Double = js.native
  }
  
  type IUNCHANGED = js.Object
}
