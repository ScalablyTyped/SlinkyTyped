package typingsSlinky.mobx

import typingsSlinky.mobx.coreObservableMod.IObservable
import typingsSlinky.mobx.derivationMod.IDerivation
import typingsSlinky.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionMod {
  
  @JSImport("mobx/lib/core/reaction", "Reaction")
  @js.native
  class Reaction protected ()
    extends IDerivation
       with IReactionPublic {
    def this(name: String, onInvalidate: js.Function0[Unit]) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]
    ) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.UndefOr[scala.Nothing],
      requiresObservable: Boolean
    ) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit],
      requiresObservable: Boolean
    ) = this()
    
    var _isRunning: Boolean = js.native
    
    var _isScheduled: Boolean = js.native
    
    var _isTrackPending: Boolean = js.native
    
    var diffValue: Double = js.native
    
    var errorHandler: js.Any = js.native
    
    def getDisposer(): IReactionDisposer = js.native
    
    var isDisposed: Boolean = js.native
    
    def isScheduled(): Boolean = js.native
    
    @JSName("newObserving")
    var newObserving_Reaction: js.Array[IObservable] = js.native
    
    var onInvalidate: js.Any = js.native
    
    def reportExceptionInDerivation(error: js.Any): Unit = js.native
    
    @JSName("requiresObservable")
    var requiresObservable_Reaction: Boolean = js.native
    
    /**
      * internal, use schedule() if you intend to kick off a reaction
      */
    def runReaction(): Unit = js.native
    
    def schedule(): Unit = js.native
    
    def track(fn: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("mobx/lib/core/reaction", "isReaction")
  @js.native
  def isReaction(x: js.Any): /* is mobx.mobx/lib/core/reaction.Reaction */ Boolean = js.native
  
  @JSImport("mobx/lib/core/reaction", "onReactionError")
  @js.native
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = js.native
  
  @JSImport("mobx/lib/core/reaction", "runReactions")
  @js.native
  def runReactions(): Unit = js.native
  
  @JSImport("mobx/lib/core/reaction", "setReactionScheduler")
  @js.native
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = js.native
  
  @js.native
  trait IReactionDisposer extends StObject {
    
    def apply(): Unit = js.native
    
    @JSName("$mobx")
    var $mobx: Reaction = js.native
  }
  
  @js.native
  trait IReactionPublic extends StObject {
    
    def dispose(): Unit = js.native
    
    def trace(): Unit = js.native
    def trace(enterBreakPoint: Boolean): Unit = js.native
  }
}
