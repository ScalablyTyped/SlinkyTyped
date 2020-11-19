package typingsSlinky.rxjs.groupByMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/groupBy", "groupBy")
@js.native
object groupBy extends js.Object {
  
  def apply[T, K](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = js.native
  def apply[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.UndefOr[scala.Nothing],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  def apply[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.UndefOr[scala.Nothing],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
}
