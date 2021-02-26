package typingsSlinky.mobxReactLite

import typingsSlinky.mobx.mod.Reaction_
import typingsSlinky.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionCleanupTrackingCommonMod {
  
  @JSImport("mobx-react-lite/dist/utils/reactionCleanupTrackingCommon", "CLEANUP_LEAKED_REACTIONS_AFTER_MILLIS")
  @js.native
  val CLEANUP_LEAKED_REACTIONS_AFTER_MILLIS: /* 10000 */ Double = js.native
  
  @JSImport("mobx-react-lite/dist/utils/reactionCleanupTrackingCommon", "CLEANUP_TIMER_LOOP_MILLIS")
  @js.native
  val CLEANUP_TIMER_LOOP_MILLIS: /* 10000 */ Double = js.native
  
  @JSImport("mobx-react-lite/dist/utils/reactionCleanupTrackingCommon", "createTrackingData")
  @js.native
  def createTrackingData(reaction: Reaction_): IReactionTracking = js.native
  
  @js.native
  trait IReactionTracking extends StObject {
    
    /**
      * Whether the observables that the component is tracking changed between
      * the first render and the first useEffect.
      */
    var changedBeforeMount: Boolean = js.native
    
    /**
      * The time (in ticks) at which point we should dispose of the reaction
      * if this component hasn't yet been fully mounted.
      */
    var cleanAt: Double = js.native
    
    /**
      * In case we are using finalization registry based cleanup,
      * this will hold the cleanup token associated with this reaction
      */
    var finalizationRegistryCleanupToken: js.UndefOr[Double] = js.native
    
    /**
      * Whether the component has yet completed mounting (for us, whether
      * its useEffect has run)
      */
    var mounted: Boolean = js.native
    
    /** The Reaction created during first render, which may be leaked */
    var reaction: Reaction_ = js.native
  }
  object IReactionTracking {
    
    @scala.inline
    def apply(changedBeforeMount: Boolean, cleanAt: Double, mounted: Boolean, reaction: Reaction_): IReactionTracking = {
      val __obj = js.Dynamic.literal(changedBeforeMount = changedBeforeMount.asInstanceOf[js.Any], cleanAt = cleanAt.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any], reaction = reaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReactionTracking]
    }
    
    @scala.inline
    implicit class IReactionTrackingMutableBuilder[Self <: IReactionTracking] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedBeforeMount(value: Boolean): Self = StObject.set(x, "changedBeforeMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanAt(value: Double): Self = StObject.set(x, "cleanAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalizationRegistryCleanupToken(value: Double): Self = StObject.set(x, "finalizationRegistryCleanupToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalizationRegistryCleanupTokenUndefined: Self = StObject.set(x, "finalizationRegistryCleanupToken", js.undefined)
      
      @scala.inline
      def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaction(value: Reaction_): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactionCleanupTracking extends StObject {
    
    /**
      *
      * @param reaction The reaction to cleanup
      * @param objectRetainedByReact This will be in actual use only when FinalizationRegister is in use
      */
    def addReactionToTrack(
      reactionTrackingRef: MutableRefObject[IReactionTracking | Null],
      reaction: Reaction_,
      objectRetainedByReact: js.Object
    ): IReactionTracking = js.native
    
    def forceCleanupTimerToRunNowForTests(): Unit = js.native
    
    def recordReactionAsCommitted(reactionRef: MutableRefObject[IReactionTracking | Null]): Unit = js.native
    
    def resetCleanupScheduleForTests(): Unit = js.native
  }
  object ReactionCleanupTracking {
    
    @scala.inline
    def apply(
      addReactionToTrack: (MutableRefObject[IReactionTracking | Null], Reaction_, js.Object) => IReactionTracking,
      forceCleanupTimerToRunNowForTests: () => Unit,
      recordReactionAsCommitted: MutableRefObject[IReactionTracking | Null] => Unit,
      resetCleanupScheduleForTests: () => Unit
    ): ReactionCleanupTracking = {
      val __obj = js.Dynamic.literal(addReactionToTrack = js.Any.fromFunction3(addReactionToTrack), forceCleanupTimerToRunNowForTests = js.Any.fromFunction0(forceCleanupTimerToRunNowForTests), recordReactionAsCommitted = js.Any.fromFunction1(recordReactionAsCommitted), resetCleanupScheduleForTests = js.Any.fromFunction0(resetCleanupScheduleForTests))
      __obj.asInstanceOf[ReactionCleanupTracking]
    }
    
    @scala.inline
    implicit class ReactionCleanupTrackingMutableBuilder[Self <: ReactionCleanupTracking] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddReactionToTrack(value: (MutableRefObject[IReactionTracking | Null], Reaction_, js.Object) => IReactionTracking): Self = StObject.set(x, "addReactionToTrack", js.Any.fromFunction3(value))
      
      @scala.inline
      def setForceCleanupTimerToRunNowForTests(value: () => Unit): Self = StObject.set(x, "forceCleanupTimerToRunNowForTests", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRecordReactionAsCommitted(value: MutableRefObject[IReactionTracking | Null] => Unit): Self = StObject.set(x, "recordReactionAsCommitted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResetCleanupScheduleForTests(value: () => Unit): Self = StObject.set(x, "resetCleanupScheduleForTests", js.Any.fromFunction0(value))
    }
  }
}
