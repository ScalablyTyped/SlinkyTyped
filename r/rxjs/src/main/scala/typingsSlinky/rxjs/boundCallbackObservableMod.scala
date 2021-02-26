package typingsSlinky.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundCallbackObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable")
  @js.native
  class BoundCallbackObservable[T] ()
    extends typingsSlinky.rxjsCompat.boundCallbackObservableMod.BoundCallbackObservable[T]
  /* static members */
  object BoundCallbackObservable {
    
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create(callbackFunc: js.Function1[/* callback */ js.Function0[_], _]): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<void> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create(
      callbackFunc: js.Function1[/* callback */ js.Function0[_], _],
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<void> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create(callbackFunc: js.Function1[/* callback */ js.Function0[_], _], selector: Unit): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<void> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create(
      callbackFunc: js.Function1[/* callback */ js.Function0[_], _],
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<void> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T](callbackFunc: js.Function): js.Function1[
        /* repeated */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[R](
      callbackFunc: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], _],
      selector: js.Function1[/* repeated */ js.Any, R]
    ): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[R](
      callbackFunc: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], _],
      selector: js.Function1[/* repeated */ js.Any, R],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T](
      callbackFunc: js.Function,
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function1[
        /* repeated */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T](callbackFunc: js.Function, selector: js.Function1[/* repeated */ js.Any, T]): js.Function1[
        /* repeated */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T](
      callbackFunc: js.Function,
      selector: js.Function1[/* repeated */ js.Any, T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function1[
        /* repeated */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T](callbackFunc: js.Function, selector: Unit): js.Function1[
        /* repeated */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T](
      callbackFunc: js.Function,
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function1[
        /* repeated */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, R](callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function1[/* result */ R, _], _]): js.Function1[
        /* v1 */ T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, R](
      callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function1[/* result */ R, _], _],
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function1[
        /* v1 */ T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, R](
      callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function1[/* repeated */ js.Any, _], _],
      selector: js.Function1[/* repeated */ js.Any, R]
    ): js.Function1[
        /* v1 */ T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, R](
      callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function1[/* repeated */ js.Any, _], _],
      selector: js.Function1[/* repeated */ js.Any, R],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function1[
        /* v1 */ T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, R](
      callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function1[/* result */ R, _], _],
      selector: Unit
    ): js.Function1[
        /* v1 */ T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, R](
      callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function1[/* result */ R, _], _],
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function1[
        /* v1 */ T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, R](
      callbackFunc: js.Function3[/* v1 */ T, /* v2 */ T2, /* callback */ js.Function1[/* result */ R, _], _]
    ): js.Function2[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, R](
      callbackFunc: js.Function3[/* v1 */ T, /* v2 */ T2, /* callback */ js.Function1[/* result */ R, _], _],
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function2[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, R](
      callbackFunc: js.Function3[/* v1 */ T, /* v2 */ T2, /* callback */ js.Function1[/* repeated */ js.Any, _], _],
      selector: js.Function1[/* repeated */ js.Any, R]
    ): js.Function2[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, R](
      callbackFunc: js.Function3[/* v1 */ T, /* v2 */ T2, /* callback */ js.Function1[/* repeated */ js.Any, _], _],
      selector: js.Function1[/* repeated */ js.Any, R],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function2[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, R](
      callbackFunc: js.Function3[/* v1 */ T, /* v2 */ T2, /* callback */ js.Function1[/* result */ R, _], _],
      selector: Unit
    ): js.Function2[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, R](
      callbackFunc: js.Function3[/* v1 */ T, /* v2 */ T2, /* callback */ js.Function1[/* result */ R, _], _],
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function2[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, R](
      callbackFunc: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* callback */ js.Function1[/* result */ R, _], _]
    ): js.Function3[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, R](
      callbackFunc: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* callback */ js.Function1[/* result */ R, _], _],
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function3[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, R](
      callbackFunc: js.Function4[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* callback */ js.Function1[/* repeated */ js.Any, _], 
          _
        ],
      selector: js.Function1[/* repeated */ js.Any, R]
    ): js.Function3[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, R](
      callbackFunc: js.Function4[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* callback */ js.Function1[/* repeated */ js.Any, _], 
          _
        ],
      selector: js.Function1[/* repeated */ js.Any, R],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function3[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, R](
      callbackFunc: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* callback */ js.Function1[/* result */ R, _], _],
      selector: Unit
    ): js.Function3[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, R](
      callbackFunc: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* callback */ js.Function1[/* result */ R, _], _],
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function3[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ]
    ): js.Function4[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function4[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function1[/* repeated */ js.Any, _], 
          _
        ],
      selector: js.Function1[/* repeated */ js.Any, R]
    ): js.Function4[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function1[/* repeated */ js.Any, _], 
          _
        ],
      selector: js.Function1[/* repeated */ js.Any, R],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function4[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: Unit
    ): js.Function4[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function4[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ]
    ): js.Function5[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function5[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function1[/* repeated */ js.Any, _], 
          _
        ],
      selector: js.Function1[/* repeated */ js.Any, R]
    ): js.Function5[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function1[/* repeated */ js.Any, _], 
          _
        ],
      selector: js.Function1[/* repeated */ js.Any, R],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function5[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: Unit
    ): js.Function5[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function5[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ]
    ): js.Function6[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* v6 */ T6, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function6[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* v6 */ T6, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function1[/* repeated */ js.Any, _], 
          _
        ],
      selector: js.Function1[/* repeated */ js.Any, R]
    ): js.Function6[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* v6 */ T6, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function1[/* repeated */ js.Any, _], 
          _
        ],
      selector: js.Function1[/* repeated */ js.Any, R],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function6[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* v6 */ T6, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: Unit
    ): js.Function6[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* v6 */ T6, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function1[/* result */ R, _], 
          _
        ],
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function6[
        /* v1 */ T, 
        /* v2 */ T2, 
        /* v3 */ T3, 
        /* v4 */ T4, 
        /* v5 */ T5, 
        /* v6 */ T6, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create_R[R](callbackFunc: js.Function1[/* callback */ js.Function1[/* result */ R, _], _]): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create_R[R](
      callbackFunc: js.Function1[/* callback */ js.Function1[/* result */ R, _], _],
      selector: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create_R[R](callbackFunc: js.Function1[/* callback */ js.Function1[/* result */ R, _], _], selector: Unit): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
    @JSImport("rxjs/observable/BoundCallbackObservable", "BoundCallbackObservable.create")
    @js.native
    def create_R[R](
      callbackFunc: js.Function1[/* callback */ js.Function1[/* result */ R, _], _],
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
      ] = js.native
  }
}
