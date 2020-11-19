package typingsSlinky.rxjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rxjs.anon.Fn0
import typingsSlinky.rxjs.anon.FnCallMarblesValuesError
import typingsSlinky.rxjs.anon.ToBe
import typingsSlinky.rxjs.anon.ToBeSubscriptionLogsToBeFn
import typingsSlinky.rxjs.coldObservableMod.ColdObservable
import typingsSlinky.rxjs.hotObservableMod.HotObservable
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.subscriptionLogMod.SubscriptionLog
import typingsSlinky.rxjs.testMessageMod.TestMessage
import typingsSlinky.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/testing/TestScheduler", JSImport.Namespace)
@js.native
object testSchedulerMod extends js.Object {
  
  @js.native
  trait RunHelpers extends js.Object {
    
    def cold[T](marbles: String): ColdObservable[T] = js.native
    def cold[T](marbles: String, values: js.UndefOr[scala.Nothing], error: js.Any): ColdObservable[T] = js.native
    def cold[T](marbles: String, values: StringDictionary[T]): ColdObservable[T] = js.native
    def cold[T](marbles: String, values: StringDictionary[T], error: js.Any): ColdObservable[T] = js.native
    @JSName("cold")
    var cold_Original: FnCallMarblesValuesError = js.native
    
    def expectObservable(observable: Observable[_]): ToBe = js.native
    def expectObservable(observable: Observable[_], subscriptionMarbles: String): ToBe = js.native
    @JSName("expectObservable")
    var expectObservable_Original: js.Function2[/* observable */ Observable[_], /* subscriptionMarbles */ js.UndefOr[String], ToBe] = js.native
    
    def expectSubscriptions(actualSubscriptionLogs: js.Array[SubscriptionLog]): ToBeSubscriptionLogsToBeFn = js.native
    @JSName("expectSubscriptions")
    var expectSubscriptions_Original: js.Function1[/* actualSubscriptionLogs */ js.Array[SubscriptionLog], ToBeSubscriptionLogsToBeFn] = js.native
    
    def flush(): Unit = js.native
    @JSName("flush")
    var flush_Original: js.Function0[Unit] = js.native
    
    def hot[T](marbles: String): HotObservable[T] = js.native
    def hot[T](marbles: String, values: js.UndefOr[scala.Nothing], error: js.Any): HotObservable[T] = js.native
    def hot[T](marbles: String, values: StringDictionary[T]): HotObservable[T] = js.native
    def hot[T](marbles: String, values: StringDictionary[T], error: js.Any): HotObservable[T] = js.native
    @JSName("hot")
    var hot_Original: Fn0 = js.native
  }
  
  @js.native
  class TestScheduler protected () extends VirtualTimeScheduler {
    def this(assertDeepEqual: js.Function2[/* actual */ js.Any, /* expected */ js.Any, Boolean | Unit]) = this()
    
    def assertDeepEqual(actual: js.Any, expected: js.Any): Boolean | Unit = js.native
    
    val coldObservables: js.Array[ColdObservable[_]] = js.native
    
    /**
      * @param marbles A diagram in the marble DSL. Letters map to keys in `values` if provided.
      * @param values Values to use for the letters in `marbles`. If ommitted, the letters themselves are used.
      * @param error The error to use for the `#` marble (if present).
      */
    def createColdObservable[T](marbles: String): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: js.UndefOr[scala.Nothing], error: js.Any): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: StringDictionary[T]): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: StringDictionary[T], error: js.Any): ColdObservable[T] = js.native
    
    /**
      * @param marbles A diagram in the marble DSL. Letters map to keys in `values` if provided.
      * @param values Values to use for the letters in `marbles`. If ommitted, the letters themselves are used.
      * @param error The error to use for the `#` marble (if present).
      */
    def createHotObservable[T](marbles: String): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: js.UndefOr[scala.Nothing], error: js.Any): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: StringDictionary[T]): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: StringDictionary[T], error: js.Any): HotObservable[T] = js.native
    
    def createTime(marbles: String): Double = js.native
    
    def expectObservable(observable: Observable[_]): ToBe = js.native
    def expectObservable(observable: Observable[_], subscriptionMarbles: String): ToBe = js.native
    
    def expectSubscriptions(actualSubscriptionLogs: js.Array[SubscriptionLog]): ToBeSubscriptionLogsToBeFn = js.native
    
    var flushTests: js.Any = js.native
    
    val hotObservables: js.Array[HotObservable[_]] = js.native
    
    var materializeInnerObservable: js.Any = js.native
    
    def run[T](callback: js.Function1[/* helpers */ RunHelpers, T]): T = js.native
    
    var runMode: js.Any = js.native
  }
  /* static members */
  @js.native
  object TestScheduler extends js.Object {
    
    /** @nocollapse */
    def parseMarbles(marbles: String): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(marbles: String, values: js.UndefOr[scala.Nothing], errorValue: js.Any): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(marbles: String, values: js.Any): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    
    /** @nocollapse */
    def parseMarblesAsSubscriptions(marbles: String): SubscriptionLog = js.native
    def parseMarblesAsSubscriptions(marbles: String, runMode: Boolean): SubscriptionLog = js.native
  }
  
  type observableToBeFn = js.Function3[
    /* marbles */ String, 
    /* values */ js.UndefOr[js.Any], 
    /* errorValue */ js.UndefOr[js.Any], 
    Unit
  ]
  
  type subscriptionLogsToBeFn = js.Function1[/* marbles */ String | js.Array[String], Unit]
}
