package typingsSlinky.reReselect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSelectorInstance extends js.Object {
  
  def apply[S1, R1, T](selector1: typingsSlinky.reselect.mod.Selector[S1, R1], combiner: js.Function1[/* res1 */ R1, T]): typingsSlinky.reselect.mod.OutputSelector[S1, T, js.Function1[/* res1 */ R1, T]] = js.native
  def apply[S, R1, T](
    selectors: js.Array[typingsSlinky.reselect.mod.Selector[S, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): typingsSlinky.reselect.mod.OutputSelector[S, T, js.Function1[/* res */ R1, T]] = js.native
  def apply[S, R1, R2, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): typingsSlinky.reselect.mod.OutputSelector[S, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def apply[S, R1, R2, T](
    selectors: js.Tuple2[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): typingsSlinky.reselect.mod.OutputSelector[S, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def apply[S, P, R1, T](
    selector: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    combiner: js.Function1[/* res */ R1, T]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[S, P, T, js.Function1[/* res */ R1, T]] = js.native
  def apply[S, P, R1, R2, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[S, P, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def apply[S, R1, R2, R3, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): typingsSlinky.reselect.mod.OutputSelector[S, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def apply[S, R1, R2, R3, T](
    selectors: js.Tuple3[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): typingsSlinky.reselect.mod.OutputSelector[S, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def apply[S, P, R1, R2, R3, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[S, P, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def apply[S, R1, R2, R3, R4, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): typingsSlinky.reselect.mod.OutputSelector[S, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def apply[S, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): typingsSlinky.reselect.mod.OutputSelector[S, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def apply[S, P, R1, R2, R3, R4, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[S, P, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def apply[S, R1, R2, R3, R4, R5, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    selector5: typingsSlinky.reselect.mod.Selector[S, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4], 
      typingsSlinky.reselect.mod.Selector[S, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def apply[S, P, R1, R2, R3, R4, R5, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    selector5: typingsSlinky.reselect.mod.ParametricSelector[S, P, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    selector5: typingsSlinky.reselect.mod.Selector[S, R5],
    selector6: typingsSlinky.reselect.mod.Selector[S, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4], 
      typingsSlinky.reselect.mod.Selector[S, R5], 
      typingsSlinky.reselect.mod.Selector[S, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def apply[S, P, R1, R2, R3, R4, R5, R6, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    selector5: typingsSlinky.reselect.mod.ParametricSelector[S, P, R5],
    selector6: typingsSlinky.reselect.mod.ParametricSelector[S, P, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    selector5: typingsSlinky.reselect.mod.Selector[S, R5],
    selector6: typingsSlinky.reselect.mod.Selector[S, R6],
    selector7: typingsSlinky.reselect.mod.Selector[S, R7],
    combiner: js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4], 
      typingsSlinky.reselect.mod.Selector[S, R5], 
      typingsSlinky.reselect.mod.Selector[S, R6], 
      typingsSlinky.reselect.mod.Selector[S, R7]
    ],
    combiner: js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ] = js.native
  def apply[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    selector5: typingsSlinky.reselect.mod.ParametricSelector[S, P, R5],
    selector6: typingsSlinky.reselect.mod.ParametricSelector[S, P, R6],
    selector7: typingsSlinky.reselect.mod.ParametricSelector[S, P, R7],
    combiner: js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    selector5: typingsSlinky.reselect.mod.Selector[S, R5],
    selector6: typingsSlinky.reselect.mod.Selector[S, R6],
    selector7: typingsSlinky.reselect.mod.Selector[S, R7],
    selector8: typingsSlinky.reselect.mod.Selector[S, R8],
    combiner: js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4], 
      typingsSlinky.reselect.mod.Selector[S, R5], 
      typingsSlinky.reselect.mod.Selector[S, R6], 
      typingsSlinky.reselect.mod.Selector[S, R7], 
      typingsSlinky.reselect.mod.Selector[S, R8]
    ],
    combiner: js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ] = js.native
  def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    selector5: typingsSlinky.reselect.mod.ParametricSelector[S, P, R5],
    selector6: typingsSlinky.reselect.mod.ParametricSelector[S, P, R6],
    selector7: typingsSlinky.reselect.mod.ParametricSelector[S, P, R7],
    selector8: typingsSlinky.reselect.mod.ParametricSelector[S, P, R8],
    combiner: js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    selector5: typingsSlinky.reselect.mod.Selector[S, R5],
    selector6: typingsSlinky.reselect.mod.Selector[S, R6],
    selector7: typingsSlinky.reselect.mod.Selector[S, R7],
    selector8: typingsSlinky.reselect.mod.Selector[S, R8],
    selector9: typingsSlinky.reselect.mod.Selector[S, R9],
    combiner: js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4], 
      typingsSlinky.reselect.mod.Selector[S, R5], 
      typingsSlinky.reselect.mod.Selector[S, R6], 
      typingsSlinky.reselect.mod.Selector[S, R7], 
      typingsSlinky.reselect.mod.Selector[S, R8], 
      typingsSlinky.reselect.mod.Selector[S, R9]
    ],
    combiner: js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ] = js.native
  def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    selector5: typingsSlinky.reselect.mod.ParametricSelector[S, P, R5],
    selector6: typingsSlinky.reselect.mod.ParametricSelector[S, P, R6],
    selector7: typingsSlinky.reselect.mod.ParametricSelector[S, P, R7],
    selector8: typingsSlinky.reselect.mod.ParametricSelector[S, P, R8],
    selector9: typingsSlinky.reselect.mod.ParametricSelector[S, P, R9],
    combiner: js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    selector5: typingsSlinky.reselect.mod.Selector[S, R5],
    selector6: typingsSlinky.reselect.mod.Selector[S, R6],
    selector7: typingsSlinky.reselect.mod.Selector[S, R7],
    selector8: typingsSlinky.reselect.mod.Selector[S, R8],
    selector9: typingsSlinky.reselect.mod.Selector[S, R9],
    selector10: typingsSlinky.reselect.mod.Selector[S, R10],
    combiner: js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4], 
      typingsSlinky.reselect.mod.Selector[S, R5], 
      typingsSlinky.reselect.mod.Selector[S, R6], 
      typingsSlinky.reselect.mod.Selector[S, R7], 
      typingsSlinky.reselect.mod.Selector[S, R8], 
      typingsSlinky.reselect.mod.Selector[S, R9], 
      typingsSlinky.reselect.mod.Selector[S, R10]
    ],
    combiner: js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ] = js.native
  def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    selector5: typingsSlinky.reselect.mod.ParametricSelector[S, P, R5],
    selector6: typingsSlinky.reselect.mod.ParametricSelector[S, P, R6],
    selector7: typingsSlinky.reselect.mod.ParametricSelector[S, P, R7],
    selector8: typingsSlinky.reselect.mod.ParametricSelector[S, P, R8],
    selector9: typingsSlinky.reselect.mod.ParametricSelector[S, P, R9],
    selector10: typingsSlinky.reselect.mod.ParametricSelector[S, P, R10],
    combiner: js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    selector5: typingsSlinky.reselect.mod.Selector[S, R5],
    selector6: typingsSlinky.reselect.mod.Selector[S, R6],
    selector7: typingsSlinky.reselect.mod.Selector[S, R7],
    selector8: typingsSlinky.reselect.mod.Selector[S, R8],
    selector9: typingsSlinky.reselect.mod.Selector[S, R9],
    selector10: typingsSlinky.reselect.mod.Selector[S, R10],
    selector11: typingsSlinky.reselect.mod.Selector[S, R11],
    combiner: js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4], 
      typingsSlinky.reselect.mod.Selector[S, R5], 
      typingsSlinky.reselect.mod.Selector[S, R6], 
      typingsSlinky.reselect.mod.Selector[S, R7], 
      typingsSlinky.reselect.mod.Selector[S, R8], 
      typingsSlinky.reselect.mod.Selector[S, R9], 
      typingsSlinky.reselect.mod.Selector[S, R10], 
      typingsSlinky.reselect.mod.Selector[S, R11]
    ],
    combiner: js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ] = js.native
  def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    selector5: typingsSlinky.reselect.mod.ParametricSelector[S, P, R5],
    selector6: typingsSlinky.reselect.mod.ParametricSelector[S, P, R6],
    selector7: typingsSlinky.reselect.mod.ParametricSelector[S, P, R7],
    selector8: typingsSlinky.reselect.mod.ParametricSelector[S, P, R8],
    selector9: typingsSlinky.reselect.mod.ParametricSelector[S, P, R9],
    selector10: typingsSlinky.reselect.mod.ParametricSelector[S, P, R10],
    selector11: typingsSlinky.reselect.mod.ParametricSelector[S, P, R11],
    combiner: js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: typingsSlinky.reselect.mod.Selector[S, R1],
    selector2: typingsSlinky.reselect.mod.Selector[S, R2],
    selector3: typingsSlinky.reselect.mod.Selector[S, R3],
    selector4: typingsSlinky.reselect.mod.Selector[S, R4],
    selector5: typingsSlinky.reselect.mod.Selector[S, R5],
    selector6: typingsSlinky.reselect.mod.Selector[S, R6],
    selector7: typingsSlinky.reselect.mod.Selector[S, R7],
    selector8: typingsSlinky.reselect.mod.Selector[S, R8],
    selector9: typingsSlinky.reselect.mod.Selector[S, R9],
    selector10: typingsSlinky.reselect.mod.Selector[S, R10],
    selector11: typingsSlinky.reselect.mod.Selector[S, R11],
    selector12: typingsSlinky.reselect.mod.Selector[S, R12],
    combiner: js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ] = js.native
  def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      typingsSlinky.reselect.mod.Selector[S, R1], 
      typingsSlinky.reselect.mod.Selector[S, R2], 
      typingsSlinky.reselect.mod.Selector[S, R3], 
      typingsSlinky.reselect.mod.Selector[S, R4], 
      typingsSlinky.reselect.mod.Selector[S, R5], 
      typingsSlinky.reselect.mod.Selector[S, R6], 
      typingsSlinky.reselect.mod.Selector[S, R7], 
      typingsSlinky.reselect.mod.Selector[S, R8], 
      typingsSlinky.reselect.mod.Selector[S, R9], 
      typingsSlinky.reselect.mod.Selector[S, R10], 
      typingsSlinky.reselect.mod.Selector[S, R11], 
      typingsSlinky.reselect.mod.Selector[S, R12]
    ],
    combiner: js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputSelector[
    S, 
    T, 
    js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ] = js.native
  def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: typingsSlinky.reselect.mod.ParametricSelector[S, P, R1],
    selector2: typingsSlinky.reselect.mod.ParametricSelector[S, P, R2],
    selector3: typingsSlinky.reselect.mod.ParametricSelector[S, P, R3],
    selector4: typingsSlinky.reselect.mod.ParametricSelector[S, P, R4],
    selector5: typingsSlinky.reselect.mod.ParametricSelector[S, P, R5],
    selector6: typingsSlinky.reselect.mod.ParametricSelector[S, P, R6],
    selector7: typingsSlinky.reselect.mod.ParametricSelector[S, P, R7],
    selector8: typingsSlinky.reselect.mod.ParametricSelector[S, P, R8],
    selector9: typingsSlinky.reselect.mod.ParametricSelector[S, P, R9],
    selector10: typingsSlinky.reselect.mod.ParametricSelector[S, P, R10],
    selector11: typingsSlinky.reselect.mod.ParametricSelector[S, P, R11],
    selector12: typingsSlinky.reselect.mod.ParametricSelector[S, P, R12],
    combiner: js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ): typingsSlinky.reselect.mod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ] = js.native
}
