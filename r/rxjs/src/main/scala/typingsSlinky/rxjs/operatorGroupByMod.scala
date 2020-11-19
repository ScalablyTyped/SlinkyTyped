package typingsSlinky.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/operator/groupBy", JSImport.Namespace)
@js.native
object operatorGroupByMod extends js.Object {
  
  def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any = js.native
  def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.UndefOr[scala.Nothing],
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ _
    ]
  ): js.Any = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ],
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ _
    ]
  ): js.Any = js.native
  def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): js.Any = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.UndefOr[scala.Nothing],
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ _
    ]
  ): js.Any = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ],
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ _
    ]
  ): js.Any = js.native
  @JSName("groupBy")
  def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): js.Any = js.native
}
