package typingsSlinky.mobx

import typingsSlinky.mobx.comparerMod.IEqualsComparer
import typingsSlinky.mobx.coreObservableMod.IObservable
import typingsSlinky.mobx.derivationMod.IDerivationState
import typingsSlinky.mobx.derivationMod.TraceMode
import typingsSlinky.mobx.internalMod.CaughtException
import typingsSlinky.mobx.observablevalueMod.IValueDidChange
import typingsSlinky.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computedvalueMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.mobx.coreObservableMod.IDepTreeNode because Already inherited
  - typingsSlinky.mobx.derivationMod.IDerivation because var conflicts: name, observing. Inlined newObserving, dependenciesState, runId, unboundDepsCount, __mapid, onBecomeStale, isTracing, requiresObservable */ @JSImport("mobx/lib/core/computedvalue", "ComputedValue")
  @js.native
  class ComputedValue[T] protected ()
    extends IObservable
       with IComputedValue[T] {
    /**
      * Create a new computed value based on a function expression.
      *
      * The `name` property is for debug purposes only.
      *
      * The `equals` property specifies the comparer function to use to determine if a newly produced
      * value differs from the previous value. Two comparers are provided in the library; `defaultComparer`
      * compares based on identity comparison (===), and `structualComparer` deeply compares the structure.
      * Structural comparison can be convenient if you always produce a new aggregated object and
      * don't want to notify observers if it is structurally the same.
      * This is useful for working with vectors, mouse coordinates etc.
      */
    def this(options: IComputedValueOptions[T]) = this()
    
    var __mapid: String = js.native
    
    def computeValue(track: Boolean): T | CaughtException = js.native
    
    var dependenciesState: IDerivationState = js.native
    
    def derivation(): T = js.native
    
    @JSName("equals")
    var equals_FComputedValue: js.Any = js.native
    
    var isComputing: Boolean = js.native
    
    var isRunningSetter: Boolean = js.native
    
    var isTracing: TraceMode = js.native
    
    var keepAlive: js.Any = js.native
    
    var newObserving: js.Array[IObservable] | Null = js.native
    
    @JSName("observing")
    var observing_ComputedValue: js.Array[IObservable] = js.native
    
    def onBecomeStale(): Unit = js.native
    
    def peek(): T = js.native
    
    /**
      *  warn if the derivation has no dependencies after creation/update
      */
    var requiresObservable: js.UndefOr[Boolean] = js.native
    
    var requiresReaction: js.Any = js.native
    
    var runId: Double = js.native
    
    var scope: js.UndefOr[js.Object] = js.native
    
    var setter: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
    
    def suspend(): Unit = js.native
    
    def toJSON(): T = js.native
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function0[T] = js.native
    
    var trackAndCompute: js.Any = js.native
    
    var triggeredBy: js.UndefOr[String] = js.native
    
    var unboundDepsCount: Double = js.native
    
    var value: js.UndefOr[T | CaughtException] = js.native
    
    def warnAboutUntrackedRead(): Unit = js.native
  }
  
  @JSImport("mobx/lib/core/computedvalue", "isComputedValue")
  @js.native
  def isComputedValue(x: js.Any): /* is mobx.mobx/lib/core/computedvalue.ComputedValue<unknown> */ Boolean = js.native
  
  @js.native
  trait IComputedValue[T] extends StObject {
    
    def get(): T = js.native
    
    def observe(listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
    def observe(listener: js.Function1[/* change */ IValueDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def set(value: T): Unit = js.native
  }
  
  @js.native
  trait IComputedValueOptions[T] extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    @JSName("equals")
    var equals_FIComputedValueOptions: js.UndefOr[IEqualsComparer[T]] = js.native
    
    var get: js.UndefOr[js.Function0[T]] = js.native
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var requiresReaction: js.UndefOr[Boolean] = js.native
    
    var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  }
  object IComputedValueOptions {
    
    @scala.inline
    def apply[T](): IComputedValueOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComputedValueOptions[T]]
    }
    
    @scala.inline
    implicit class IComputedValueOptionsMutableBuilder[Self <: IComputedValueOptions[_], T] (val x: Self with IComputedValueOptions[T]) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEquals_(value: (T, T) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequiresReaction(value: Boolean): Self = StObject.set(x, "requiresReaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresReactionUndefined: Self = StObject.set(x, "requiresReaction", js.undefined)
      
      @scala.inline
      def setSet(value: /* value */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
}
