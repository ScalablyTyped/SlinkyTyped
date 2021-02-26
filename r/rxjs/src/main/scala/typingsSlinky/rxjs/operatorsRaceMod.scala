package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsRaceMod {
  
  @JSImport("rxjs/internal/operators/race", "race")
  @js.native
  def race[T](observables: (Observable[T] | js.Array[Observable[T]])*): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/race", "race")
  @js.native
  def race[T](observables: js.Array[Observable[T]]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/race", "race")
  @js.native
  def race_TR_OperatorFunction[T, R](observables: (Observable[_] | js.Array[Observable[_]])*): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators/race", "race")
  @js.native
  def race_TR_OperatorFunction[T, R](observables: js.Array[Observable[T]]): OperatorFunction[T, R] = js.native
}
