package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/bindCallback", JSImport.Namespace)
@js.native
object bindCallbackMod extends js.Object {
  
  def bindCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[_], _]): js.Function0[Observable[Unit]] = js.native
  def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[_], _], scheduler: SchedulerLike): js.Function0[Observable[Unit]] = js.native
  def bindCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  def bindCallback(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  def bindCallback(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  def bindCallback[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[_], _]): js.Function1[/* arg1 */ A1, Observable[Unit]] = js.native
  def bindCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = js.native
  def bindCallback[A1, A2](callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[_], _]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = js.native
  def bindCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = js.native
  def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[_], _]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = js.native
  def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = js.native
  def bindCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function0[_], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = js.native
  def bindCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function0[_], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = js.native
  def bindCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function0[_], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = js.native
  def bindCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function0[_], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2R3R4[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2R3R4[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* res1 */ R1, _], _]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1[A1, R1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, _], _]): js.Function1[/* arg1 */ A1, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_AR_Function1[A, R](callbackFunc: js.Function1[A | (js.Function1[/* result */ R, _]), _]): js.Function1[/* repeated */ A, Observable[R]] = js.native
  @JSName("bindCallback")
  def bindCallback_AR_Function1[A, R](callbackFunc: js.Function1[A | (js.Function1[/* result */ R, _]), _], scheduler: SchedulerLike): js.Function1[/* repeated */ A, Observable[R]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1[R1](callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, _], _]): js.Function0[Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2[R1, R2](callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _]): js.Function0[Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], _]
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function0[Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Array[_]]] = js.native
}
