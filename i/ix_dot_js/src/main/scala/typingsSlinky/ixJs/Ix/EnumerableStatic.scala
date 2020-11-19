package typingsSlinky.ixJs.Ix

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumerableStatic
  extends Instantiable1[/* getEnumerator */ js.Function0[Enumerator[js.Object]], Enumerable[js.Object]] {
  
  def `case`[T](selector: js.Function0[Double], sources: NumberDictionary[Enumerable[T]]): Enumerable[T] = js.native
  def `case`[T](
    selector: js.Function0[Double],
    sources: NumberDictionary[Enumerable[T]],
    defaultSource: Enumerable[T]
  ): Enumerable[T] = js.native
  def `case`[T](selector: js.Function0[String], sources: StringDictionary[Enumerable[T]]): Enumerable[T] = js.native
  def `case`[T](
    selector: js.Function0[String],
    sources: StringDictionary[Enumerable[T]],
    defaultSource: Enumerable[T]
  ): Enumerable[T] = js.native
  
  def `catch`[T](sources: Enumerable[T]*): Enumerable[T] = js.native
  
  def catchException[T](sources: Enumerable[T]*): Enumerable[T] = js.native
  
  def concat[T](sources: Enumerable[T]*): Enumerable[T] = js.native
  
  def create[T](getEnumerator: js.Function0[Enumerator[T]]): Enumerable[T] = js.native
  
  def defer[T](enumerableFactory: js.Function0[Enumerable[T]]): Enumerable[T] = js.native
  
  def doWhile[T](source: Enumerable[T], condition: EnumerablePredicate[Enumerable[T]]): Enumerable[T] = js.native
  
  def empty[T](): Enumerable[T] = js.native
  
  def `for`[T, TResult](source: Enumerable[T], resultSelector: EnumerableFunc[T, TResult]): Enumerable[TResult] = js.native
  
  def forIn[T, TResult](source: Enumerable[T], resultSelector: EnumerableFunc[T, TResult]): Enumerable[TResult] = js.native
  
  def fromArray[T](array: js.Array[T]): Enumerable[T] = js.native
  
  def generate[TState, TResult](
    initialState: TState,
    condition: Predicate[TState],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult]
  ): Enumerable[TResult] = js.native
  
  def `if`[T](condition: js.Function0[Boolean], thenSource: Enumerable[T]): Enumerable[T] = js.native
  def `if`[T](condition: js.Function0[Boolean], thenSource: Enumerable[T], elseSource: Enumerable[T]): Enumerable[T] = js.native
  
  def ifThen[T](condition: js.Function0[Boolean], thenSource: Enumerable[T]): Enumerable[T] = js.native
  def ifThen[T](condition: js.Function0[Boolean], thenSource: Enumerable[T], elseSource: Enumerable[T]): Enumerable[T] = js.native
  
  def onErrorResumeNext[T](sources: Enumerable[T]*): Enumerable[T] = js.native
  
      // alias for <IE9
  def range(start: Double, count: Double): Enumerable[Double] = js.native
  
  def repeat[T](value: T): Enumerable[T] = js.native
  def repeat[T](value: T, repeatCount: Double): Enumerable[T] = js.native
  
  def `return`[T](value: T): Enumerable[T] = js.native
  
  def returnValue[T](value: T): Enumerable[T] = js.native
  
  def sequenceEqual[T](first: Enumerable[T], second: Enumerable[T]): Boolean = js.native
  def sequenceEqual[TFirst, TSecond](
    first: Enumerable[TFirst],
    second: Enumerable[TSecond],
    comparer: EqualityComparer[TFirst, TSecond]
  ): Boolean = js.native
  
  def switchCase[T](selector: js.Function0[Double], sources: NumberDictionary[Enumerable[T]]): Enumerable[T] = js.native
  def switchCase[T](
    selector: js.Function0[Double],
    sources: NumberDictionary[Enumerable[T]],
    defaultSource: Enumerable[T]
  ): Enumerable[T] = js.native
  def switchCase[T](selector: js.Function0[String], sources: StringDictionary[Enumerable[T]]): Enumerable[T] = js.native
  def switchCase[T](
    selector: js.Function0[String],
    sources: StringDictionary[Enumerable[T]],
    defaultSource: Enumerable[T]
  ): Enumerable[T] = js.native
  
  def `throw`[T](error: js.Error): Enumerable[T] = js.native
  
  def throwException[T](error: js.Error): Enumerable[T] = js.native
  
  def using[TResource /* <: Disposable */, T](
    resourceFactory: js.Function0[TResource],
    enumerableFactory: js.Function1[/* resource */ TResource, Enumerable[T]]
  ): Enumerable[T] = js.native
  
  def `while`[T](condition: EnumerablePredicate[Enumerable[T]], source: Enumerable[T]): Enumerable[T] = js.native
  
  def whileDo[T](condition: EnumerablePredicate[Enumerable[T]], source: Enumerable[T]): Enumerable[T] = js.native
}
