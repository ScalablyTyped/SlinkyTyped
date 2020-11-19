package typingsSlinky.rxjs.rxMod

import typingsSlinky.rxjs.anon.FnCall
import typingsSlinky.rxjs.typesMod.SchedulerLike
import typingsSlinky.rxjs.typesMod.SubscribableOrPromise
import typingsSlinky.rxjs.typesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/Rx", "Observable")
@js.native
/**
  * @constructor
  * @param {Function} subscribe the function that is called when the Observable is
  * initially subscribed to. This function is given a Subscriber, to which new values
  * can be `next`ed, or an `error` method can be called to raise an error, or
  * `complete` can be called to notify of a successful completion.
  */
class Observable[T] ()
  extends typingsSlinky.rxjs.internalObservableMod.Observable[T] {
  def this(subscribe: js.ThisFunction1[
        /* this */ typingsSlinky.rxjs.internalObservableMod.Observable[T], 
        /* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], 
        TeardownLogic
      ]) = this()
}
/* static members */
@JSImport("rxjs/internal/Rx", "Observable")
@js.native
object Observable extends js.Object {
  
  /**
    * Creates a new cold Observable by calling the Observable constructor
    * @static true
    * @owner Observable
    * @method create
    * @param {Function} subscribe? the subscriber function to be passed to the Observable constructor
    * @return {Observable} a new cold observable
    * @nocollapse
    * @deprecated use new Observable() instead
    */
  var create: js.Function = js.native
  
  /**
    * @nocollapse
    * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
    */
  def `if`[T, F](condition: js.Function0[Boolean]): typingsSlinky.rxjs.internalObservableMod.Observable[T | F] = js.native
  def `if`[T, F](
    condition: js.Function0[Boolean],
    trueResult: js.UndefOr[SubscribableOrPromise[T]],
    falseResult: SubscribableOrPromise[F]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | F] = js.native
  def `if`[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): typingsSlinky.rxjs.internalObservableMod.Observable[T | F] = js.native
  /**
    * @nocollapse
    * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
    */
  @JSName("if")
  var if_Original: FnCall = js.native
  
  /**
    * @nocollapse
    * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
    */
  def `throw`(error: js.Any): typingsSlinky.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def `throw`(error: js.Any, scheduler: SchedulerLike): typingsSlinky.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  /**
    * @nocollapse
    * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
    */
  @JSName("throw")
  var throw_Original: js.Function2[
    /* error */ js.Any, 
    /* scheduler */ js.UndefOr[SchedulerLike], 
    typingsSlinky.rxjs.internalObservableMod.Observable[scala.Nothing]
  ] = js.native
}
