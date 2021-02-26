package typingsSlinky.rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Rx {
  
  type Accumulator[T, TAcc] = js.Function2[/* acc */ TAcc, /* value */ T, TAcc]
  
  type AnonymousObservable[T] = typingsSlinky.rx.Rx.Observable[T]
  
  type AnonymousSubject[T] = typingsSlinky.rx.Rx.Subject[T]
  
  type ArrayLike[T] = js.Array[T] | typingsSlinky.rx.anon.Dictindex[T]
  
  type ArrayOrIterable[T] = typingsSlinky.rx.Rx.ArrayLike[T] with (typingsSlinky.rx.Rx.ArrayLike[T] | typingsSlinky.rx.Iterable[T])
  
  type AsyncSubject[T] = typingsSlinky.rx.Rx.Subject[T]
  
  type Comparer[T, TResult] = js.Function2[/* value1 */ T, /* value2 */ T, TResult]
  
  type HistoricalScheduler = typingsSlinky.rx.Rx.VirtualTimeScheduler[scala.Double, scala.Double]
  
  type Predicate[T] = typingsSlinky.rx.Rx.Selector[T, scala.Boolean]
  
  type ReplaySubject[T] = typingsSlinky.rx.Rx.Subject[T]
  
  type Selector[T, TResult] = js.Function3[
    /* value */ T, 
    /* index */ scala.Double, 
    /* observable */ typingsSlinky.rx.Rx.Observable[T], 
    TResult
  ]
  
  type ValueOrSelector[T, TResult] = TResult | (typingsSlinky.rx.Rx.Selector[T, TResult])
}
