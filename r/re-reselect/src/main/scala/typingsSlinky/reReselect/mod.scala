package typingsSlinky.reReselect

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reReselect.anon.Cache
import typingsSlinky.reReselect.anon.CacheSize
import typingsSlinky.reReselect.anon.ClearCache
import typingsSlinky.reReselect.anon.Dependencies
import typingsSlinky.reReselect.anon.InputSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*
    * Homogeneous selectors, array argument
    */
  /* one selector */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, T](selectors: js.Array[Selector[S, R1]], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]] = js.native
  /*
    * Heterogeneous selectors, parameter types
    */
  /* one selector */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S1, R1, T](selector: Selector[S1, R1], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]] = js.native
  /* two selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ] = js.native
  /* two selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, T](
    selectors: js.Tuple2[Selector[S, R1], Selector[S, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, T](selector: ParametricSelector[S, P, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ] = js.native
  /* three selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ] = js.native
  /* three selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, T](
    selectors: js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ] = js.native
  /* four selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ] = js.native
  /* four selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, T](
    selectors: js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ] = js.native
  /* five selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ] = js.native
  /* five selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, R5, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ] = js.native
  /* six selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ] = js.native
  /* six selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ] = js.native
  /* seven selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple7[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ] = js.native
  /* seven selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple7[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple7[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ] = js.native
  /* eight selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple8[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ] = js.native
  /* eight selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple8[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple8[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ] = js.native
  /* nine selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
    selector9: Selector[S, R9],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple9[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ] = js.native
  /* nine selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple9[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
    selector9: ParametricSelector[S, P, R9],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple9[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ] = js.native
  /* ten selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
    selector9: Selector[S, R9],
    selector10: Selector[S, R10],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple10[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10]
    ]
  ] = js.native
  /* ten selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple10[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
    selector9: ParametricSelector[S, P, R9],
    selector10: ParametricSelector[S, P, R10],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple10[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ] = js.native
  /* eleven selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
    selector9: Selector[S, R9],
    selector10: Selector[S, R10],
    selector11: Selector[S, R11],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple11[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11]
    ]
  ] = js.native
  /* eleven selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple11[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
    selector9: ParametricSelector[S, P, R9],
    selector10: ParametricSelector[S, P, R10],
    selector11: ParametricSelector[S, P, R11],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple11[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ] = js.native
  /* twelve selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
    selector9: Selector[S, R9],
    selector10: Selector[S, R10],
    selector11: Selector[S, R11],
    selector12: Selector[S, R12],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple12[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11], 
      Selector[S, R12]
    ]
  ] = js.native
  /* twelve selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11], 
      Selector[S, R12]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple12[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11], 
      Selector[S, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
    selector9: ParametricSelector[S, P, R9],
    selector10: ParametricSelector[S, P, R10],
    selector11: ParametricSelector[S, P, R11],
    selector12: ParametricSelector[S, P, R12],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple12[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ] = js.native
  
  @JSImport("re-reselect", "FifoMapCache")
  @js.native
  class FifoMapCache protected () extends ICacheObject {
    def this(options: CacheSize) = this()
  }
  
  @JSImport("re-reselect", "FifoObjectCache")
  @js.native
  class FifoObjectCache protected () extends ICacheObject {
    def this(options: CacheSize) = this()
    
    def get(key: ObjectCacheKey): js.Any = js.native
    
    @JSName("isValidCacheKey")
    def isValidCacheKey_MFifoObjectCache(key: ObjectCacheKey): Boolean = js.native
    
    def remove(key: ObjectCacheKey): Unit = js.native
    
    def set(key: ObjectCacheKey, selectorFn: js.Any): Unit = js.native
  }
  
  @JSImport("re-reselect", "FlatMapCache")
  @js.native
  class FlatMapCache () extends ICacheObject
  
  @JSImport("re-reselect", "FlatObjectCache")
  @js.native
  class FlatObjectCache () extends ICacheObject {
    
    def get(key: ObjectCacheKey): js.Any = js.native
    
    @JSName("isValidCacheKey")
    def isValidCacheKey_MFlatObjectCache(key: ObjectCacheKey): Boolean = js.native
    
    def remove(key: ObjectCacheKey): Unit = js.native
    
    def set(key: ObjectCacheKey, selectorFn: js.Any): Unit = js.native
  }
  
  @JSImport("re-reselect", "LruMapCache")
  @js.native
  class LruMapCache protected () extends ICacheObject {
    def this(options: CacheSize) = this()
  }
  
  @JSImport("re-reselect", "LruObjectCache")
  @js.native
  class LruObjectCache protected () extends ICacheObject {
    def this(options: CacheSize) = this()
    
    def get(key: ObjectCacheKey): js.Any = js.native
    
    @JSName("isValidCacheKey")
    def isValidCacheKey_MLruObjectCache(key: ObjectCacheKey): Boolean = js.native
    
    def remove(key: ObjectCacheKey): Unit = js.native
    
    def set(key: ObjectCacheKey, selectorFn: js.Any): Unit = js.native
  }
  
  /*
    * Homogeneous selectors, array argument
    */
  /* one selector */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, T](selectors: js.Array[Selector[S, R1]], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]] = js.native
  /*
    * Heterogeneous selectors, parameter types
    */
  /* one selector */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S1, R1, T](selector: Selector[S1, R1], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]] = js.native
  /* two selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ] = js.native
  /* two selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, T](
    selectors: js.Tuple2[Selector[S, R1], Selector[S, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, T](selector: ParametricSelector[S, P, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ] = js.native
  /* three selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ] = js.native
  /* three selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, T](
    selectors: js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ] = js.native
  /* four selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ] = js.native
  /* four selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, T](
    selectors: js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ] = js.native
  /* five selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ] = js.native
  /* five selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, R5, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ] = js.native
  /* six selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ] = js.native
  /* six selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ] = js.native
  /* seven selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple7[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ] = js.native
  /* seven selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple7[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple7[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ] = js.native
  /* eight selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple8[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ] = js.native
  /* eight selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple8[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple8[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ] = js.native
  /* nine selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
    selector9: Selector[S, R9],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple9[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ] = js.native
  /* nine selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple9[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
    selector9: ParametricSelector[S, P, R9],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple9[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ] = js.native
  /* ten selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
    selector9: Selector[S, R9],
    selector10: Selector[S, R10],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple10[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10]
    ]
  ] = js.native
  /* ten selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple10[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
    selector9: ParametricSelector[S, P, R9],
    selector10: ParametricSelector[S, P, R10],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple10[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ] = js.native
  /* eleven selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
    selector9: Selector[S, R9],
    selector10: Selector[S, R10],
    selector11: Selector[S, R11],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple11[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11]
    ]
  ] = js.native
  /* eleven selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple11[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
    selector9: ParametricSelector[S, P, R9],
    selector10: ParametricSelector[S, P, R10],
    selector11: ParametricSelector[S, P, R11],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple11[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ] = js.native
  /* twelve selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    selector7: Selector[S, R7],
    selector8: Selector[S, R8],
    selector9: Selector[S, R9],
    selector10: Selector[S, R10],
    selector11: Selector[S, R11],
    selector12: Selector[S, R12],
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple12[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11], 
      Selector[S, R12]
    ]
  ] = js.native
  /* twelve selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11], 
      Selector[S, R12]
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
  ): OutputCachedSelector[
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
    ], 
    js.Tuple12[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9], 
      Selector[S, R10], 
      Selector[S, R11], 
      Selector[S, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    selector7: ParametricSelector[S, P, R7],
    selector8: ParametricSelector[S, P, R8],
    selector9: ParametricSelector[S, P, R9],
    selector10: ParametricSelector[S, P, R10],
    selector11: ParametricSelector[S, P, R11],
    selector12: ParametricSelector[S, P, R12],
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple12[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1P1R1T[S1, P1, R1, T](selector: ParametricSelector[S1, P1, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1P1R1T_OutputParametricCachedSelector[S1, P1, R1, T](selectors: js.Array[ParametricSelector[S1, P1, R1]], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]] = js.native
  /*
    * Heterogeneous selectors, array argument
    */
  /* one selector */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1R1T[S1, R1, T](selectors: js.Array[Selector[S1, R1]], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2P1P2R1R2T[S1, S2, P1, P2, R1, R2, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S1 with S2, 
    P1 with P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2P1P2R1R2T_OutputParametricCachedSelector[S1, S2, P1, P2, R1, R2, T](
    selectors: js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S1 with S2, 
    P1 with P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ] = js.native
  /* two selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2R1R2T[S1, S2, R1, R2, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S1 with S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ] = js.native
  /* two selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2R1R2T[S1, S2, R1, R2, T](
    selectors: js.Tuple2[Selector[S1, R1], Selector[S2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S1 with S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3P1P2P3R1R2R3T[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3, 
    P1 with P2 with P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3P1P2P3R1R2R3T_OutputParametricCachedSelector[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selectors: js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3, 
    P1 with P2 with P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ] = js.native
  /* three selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S1 with S2 with S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ] = js.native
  /* three selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selectors: js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S1 with S2 with S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4P1P2P3P4R1R2R3R4T[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4, 
    P1 with P2 with P3 with P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4P1P2P3P4R1R2R3R4T_OutputParametricCachedSelector[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4, 
    P1 with P2 with P3 with P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ] = js.native
  /* four selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ] = js.native
  /* four selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    P1 with P2 with P3 with P4 with P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    P1 with P2 with P3 with P4 with P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ] = js.native
  /* five selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ] = js.native
  /* five selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    P1 with P2 with P3 with P4 with P5 with P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    P1 with P2 with P3 with P4 with P5 with P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ] = js.native
  /* six selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ] = js.native
  /* six selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7, 
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
    ], 
    js.Tuple7[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7, 
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
    ], 
    js.Tuple7[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ] = js.native
  /* seven selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
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
    ], 
    js.Tuple7[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ] = js.native
  /* seven selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
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
    ], 
    js.Tuple7[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8, 
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
    ], 
    js.Tuple8[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8, 
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
    ], 
    js.Tuple8[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ] = js.native
  /* eight selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
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
    ], 
    js.Tuple8[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ] = js.native
  /* eight selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
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
    ], 
    js.Tuple8[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9PR1R2R3R4R5R6R7R8R9T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9, 
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
    ], 
    js.Tuple9[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9, 
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
    ], 
    js.Tuple9[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ] = js.native
  /* nine selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
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
    ], 
    js.Tuple9[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ] = js.native
  /* nine selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
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
    ], 
    js.Tuple9[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10, 
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
    ], 
    js.Tuple10[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10, 
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
    ], 
    js.Tuple10[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ] = js.native
  /* ten selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
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
    ], 
    js.Tuple10[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ] = js.native
  /* ten selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
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
    ], 
    js.Tuple10[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
    selector11: ParametricSelector[S11, P11, R11],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11, 
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
    ], 
    js.Tuple11[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11, 
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
    ], 
    js.Tuple11[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ] = js.native
  /* eleven selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
    selector11: Selector[S11, R11],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
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
    ], 
    js.Tuple11[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ] = js.native
  /* eleven selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
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
    ], 
    js.Tuple11[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
    selector11: ParametricSelector[S11, P11, R11],
    selector12: ParametricSelector[S12, P12, R12],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11 with P12, 
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
    ], 
    js.Tuple12[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11 with P12, 
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
    ], 
    js.Tuple12[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ] = js.native
  /* twelve selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
    selector11: Selector[S11, R11],
    selector12: Selector[S12, R12],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
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
    ], 
    js.Tuple12[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ] = js.native
  /* twelve selectors */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
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
    ], 
    js.Tuple12[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4R5R6R7R8R9R10R11R12T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple12[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4R5R6R7R8R9R10R11T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple11[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4R5R6R7R8R9R10T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple10[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4R5R6R7R8R9T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple9[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4R5R6R7R8T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple8[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4R5R6R7T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple7[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4R5R6T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4R5T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3R4T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2R3T_OutputParametricCachedSelector[S, P, R1, R2, R3, T](
    selectors: js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1R2T_OutputParametricCachedSelector[S, P, R1, R2, T](
    selectors: js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPR1T_OutputParametricCachedSelector[S, P, R1, T](selectors: js.Array[ParametricSelector[S, P, R1]], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]] = js.native
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SPRT_OutputParametricCachedSelector[S, P, R, T](selectors: js.Array[ParametricSelector[S, P, R]], combiner: js.Function1[/* repeated */ R, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* repeated */ R, T], js.Array[ParametricSelector[S, P, R]]] = js.native
  /*
    * Homogeneous selectors, parameter types
    */
  /* one selector */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SR1T[S, R1, T](selector: Selector[S, R1], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]] = js.native
  /*
    * Any number of uniform selectors
    */
  @JSImport("re-reselect", "createCachedSelector")
  @js.native
  def createCachedSelector_SRT[S, R, T](selectors: js.Array[Selector[S, R]], combiner: js.Function1[/* repeated */ R, T]): OutputCachedSelector[S, T, js.Function1[/* repeated */ R, T], js.Array[Selector[S, R]]] = js.native
  
  @JSImport("re-reselect", "createStructuredCachedSelector")
  @js.native
  def createStructuredCachedSelector[T /* <: StringDictionary[js.Function1[/* state */ js.Any, _]] */, S, R](selectors: T): OutputCachedSelector[S, R, js.Function1[/* repeated */ Values[R], R], js.Array[Selector[S, Values[R]]]] = js.native
  @JSImport("re-reselect", "createStructuredCachedSelector")
  @js.native
  def createStructuredCachedSelector_T_StringDictionaryFunction3AnyAnyAnyWildcardSPR_OutputParametricCachedSelector[T /* <: StringDictionary[js.Function3[/* state */ js.Any, /* props */ js.Any, /* repeated */ js.Any, _]] */, S, P, R](selectors: T): OutputParametricCachedSelector[
    S, 
    P, 
    R, 
    js.Function1[/* repeated */ Values[R], R], 
    js.Array[ParametricSelector[S, P, Values[R]]]
  ] = js.native
  
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1P1R1T[S1, P1, R1, T](selector: ParametricSelector[S1, P1, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1P1R1T_OutputParametricCachedSelector[S1, P1, R1, T](selectors: js.Array[ParametricSelector[S1, P1, R1]], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]] = js.native
  /*
    * Heterogeneous selectors, array argument
    */
  /* one selector */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1R1T[S1, R1, T](selectors: js.Array[Selector[S1, R1]], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2P1P2R1R2T[S1, S2, P1, P2, R1, R2, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S1 with S2, 
    P1 with P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2P1P2R1R2T_OutputParametricCachedSelector[S1, S2, P1, P2, R1, R2, T](
    selectors: js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S1 with S2, 
    P1 with P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ] = js.native
  /* two selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2R1R2T[S1, S2, R1, R2, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S1 with S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ] = js.native
  /* two selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2R1R2T[S1, S2, R1, R2, T](
    selectors: js.Tuple2[Selector[S1, R1], Selector[S2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S1 with S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3P1P2P3R1R2R3T[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3, 
    P1 with P2 with P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3P1P2P3R1R2R3T_OutputParametricCachedSelector[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selectors: js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3, 
    P1 with P2 with P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ] = js.native
  /* three selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S1 with S2 with S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ] = js.native
  /* three selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selectors: js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S1 with S2 with S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4P1P2P3P4R1R2R3R4T[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4, 
    P1 with P2 with P3 with P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4P1P2P3P4R1R2R3R4T_OutputParametricCachedSelector[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4, 
    P1 with P2 with P3 with P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ] = js.native
  /* four selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ] = js.native
  /* four selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    P1 with P2 with P3 with P4 with P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    P1 with P2 with P3 with P4 with P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ] = js.native
  /* five selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ] = js.native
  /* five selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    P1 with P2 with P3 with P4 with P5 with P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    P1 with P2 with P3 with P4 with P5 with P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ] = js.native
  /* six selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ] = js.native
  /* six selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7, 
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
    ], 
    js.Tuple7[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7, 
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
    ], 
    js.Tuple7[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ] = js.native
  /* seven selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
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
    ], 
    js.Tuple7[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ] = js.native
  /* seven selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
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
    ], 
    js.Tuple7[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8, 
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
    ], 
    js.Tuple8[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8, 
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
    ], 
    js.Tuple8[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ] = js.native
  /* eight selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
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
    ], 
    js.Tuple8[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ] = js.native
  /* eight selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
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
    ], 
    js.Tuple8[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9PR1R2R3R4R5R6R7R8R9T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9, 
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
    ], 
    js.Tuple9[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9, 
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
    ], 
    js.Tuple9[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ] = js.native
  /* nine selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
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
    ], 
    js.Tuple9[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ] = js.native
  /* nine selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
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
    ], 
    js.Tuple9[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10, 
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
    ], 
    js.Tuple10[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10, 
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
    ], 
    js.Tuple10[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ] = js.native
  /* ten selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
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
    ], 
    js.Tuple10[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ] = js.native
  /* ten selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
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
    ], 
    js.Tuple10[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
    selector11: ParametricSelector[S11, P11, R11],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11, 
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
    ], 
    js.Tuple11[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11, 
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
    ], 
    js.Tuple11[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ] = js.native
  /* eleven selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
    selector11: Selector[S11, R11],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
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
    ], 
    js.Tuple11[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ] = js.native
  /* eleven selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
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
    ], 
    js.Tuple11[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
    selector11: ParametricSelector[S11, P11, R11],
    selector12: ParametricSelector[S12, P12, R12],
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11 with P12, 
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
    ], 
    js.Tuple12[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
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
  ): OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11 with P12, 
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
    ], 
    js.Tuple12[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ] = js.native
  /* twelve selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
    selector11: Selector[S11, R11],
    selector12: Selector[S12, R12],
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
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
    ], 
    js.Tuple12[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ] = js.native
  /* twelve selectors */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
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
  ): OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
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
    ], 
    js.Tuple12[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4R5R6R7R8R9R10R11R12T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple12[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4R5R6R7R8R9R10R11T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple11[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4R5R6R7R8R9R10T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple10[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4R5R6R7R8R9T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple9[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4R5R6R7R8T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple8[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4R5R6R7T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
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
  ): OutputParametricCachedSelector[
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
    ], 
    js.Tuple7[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4R5R6T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4R5T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3R4T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2R3T_OutputParametricCachedSelector[S, P, R1, R2, R3, T](
    selectors: js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1R2T_OutputParametricCachedSelector[S, P, R1, R2, T](
    selectors: js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPR1T_OutputParametricCachedSelector[S, P, R1, T](selectors: js.Array[ParametricSelector[S, P, R1]], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]] = js.native
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SPRT_OutputParametricCachedSelector[S, P, R, T](selectors: js.Array[ParametricSelector[S, P, R]], combiner: js.Function1[/* repeated */ R, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* repeated */ R, T], js.Array[ParametricSelector[S, P, R]]] = js.native
  /*
    * Homogeneous selectors, parameter types
    */
  /* one selector */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SR1T[S, R1, T](selector: Selector[S, R1], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]] = js.native
  /*
    * Any number of uniform selectors
    */
  @JSImport("re-reselect", JSImport.Default)
  @js.native
  def default_SRT[S, R, T](selectors: js.Array[Selector[S, R]], combiner: js.Function1[/* repeated */ R, T]): OutputCachedSelector[S, T, js.Function1[/* repeated */ R, T], js.Array[Selector[S, R]]] = js.native
  
  @js.native
  trait CreateSelectorInstance extends StObject {
    
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
  
  @js.native
  trait ICacheObject extends StObject {
    
    def clear(): Unit = js.native
    
    def get(key: js.Any): js.Any = js.native
    
    var isValidCacheKey: js.UndefOr[js.Function1[/* key */ js.Any, Boolean]] = js.native
    
    def remove(key: js.Any): Unit = js.native
    
    def set(key: js.Any, selectorFn: js.Any): Unit = js.native
  }
  object ICacheObject {
    
    @scala.inline
    def apply(clear: () => Unit, get: js.Any => js.Any, remove: js.Any => Unit, set: (js.Any, js.Any) => Unit): ICacheObject = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[ICacheObject]
    }
    
    @scala.inline
    implicit class ICacheObjectMutableBuilder[Self <: ICacheObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValidCacheKey(value: /* key */ js.Any => Boolean): Self = StObject.set(x, "isValidCacheKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValidCacheKeyUndefined: Self = StObject.set(x, "isValidCacheKey", js.undefined)
      
      @scala.inline
      def setRemove(value: js.Any => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type KeySelector[S] = js.Function2[/* state */ S, /* repeated */ js.Any, js.Any]
  
  type KeySelectorCreator[S, C, D] = js.Function1[/* selectorInputs */ InputSelectors[D, C, S], KeySelector[S]]
  
  type ObjectCacheKey = String | Double
  
  @js.native
  trait Options[S, C, D] extends StObject {
    
    var cacheObject: js.UndefOr[ICacheObject] = js.native
    
    var keySelector: js.UndefOr[KeySelector[S]] = js.native
    
    var keySelectorCreator: js.UndefOr[KeySelectorCreator[S, C, D]] = js.native
    
    var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[S, C, D](): Options[S, C, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[S, C, D]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _, _], S, C, D] (val x: Self with (Options[S, C, D])) extends AnyVal {
      
      @scala.inline
      def setCacheObject(value: ICacheObject): Self = StObject.set(x, "cacheObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheObjectUndefined: Self = StObject.set(x, "cacheObject", js.undefined)
      
      @scala.inline
      def setKeySelector(value: (S, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "keySelector", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeySelectorCreator(value: /* selectorInputs */ InputSelectors[D, C, S] => KeySelector[S]): Self = StObject.set(x, "keySelectorCreator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeySelectorCreatorUndefined: Self = StObject.set(x, "keySelectorCreator", js.undefined)
      
      @scala.inline
      def setKeySelectorUndefined: Self = StObject.set(x, "keySelector", js.undefined)
      
      @scala.inline
      def setSelectorCreator(value: CreateSelectorInstance): Self = StObject.set(x, "selectorCreator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorCreatorUndefined: Self = StObject.set(x, "selectorCreator", js.undefined)
    }
  }
  
  type OutputCachedSelector[S, R, C, D] = js.Function1[
    /* options */ KeySelector[S] | (Options[S, C, D]), 
    (OutputSelector[S, R, C, D]) with (Cache[S, R, C, D])
  ]
  
  type OutputParametricCachedSelector[S, P, R, C, D] = js.Function1[
    /* options */ (ParametricKeySelector[S, P]) | (ParametricOptions[S, P, C, D]), 
    (OutputParametricSelector[S, P, R, C, D]) with (ClearCache[S, P, R, C, D])
  ]
  
  type OutputParametricSelector[S, P, R, C, D] = (ParametricSelector[S, P, R]) with (Dependencies[C, D])
  
  type OutputSelector[S, R, C, D] = (Selector[S, R]) with (Dependencies[C, D])
  
  type ParametricKeySelector[S, P] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, js.Any]
  
  type ParametricKeySelectorCreator[S, P, C, D] = js.Function1[
    /* selectorInputs */ typingsSlinky.reReselect.anon.KeySelector[D, C, S, P], 
    ParametricKeySelector[S, P]
  ]
  
  @js.native
  trait ParametricOptions[S, P, C, D] extends StObject {
    
    var cacheObject: js.UndefOr[ICacheObject] = js.native
    
    var keySelector: js.UndefOr[ParametricKeySelector[S, P]] = js.native
    
    var keySelectorCreator: js.UndefOr[ParametricKeySelectorCreator[S, P, C, D]] = js.native
    
    var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.native
  }
  object ParametricOptions {
    
    @scala.inline
    def apply[S, P, C, D](): ParametricOptions[S, P, C, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParametricOptions[S, P, C, D]]
    }
    
    @scala.inline
    implicit class ParametricOptionsMutableBuilder[Self <: ParametricOptions[_, _, _, _], S, P, C, D] (val x: Self with (ParametricOptions[S, P, C, D])) extends AnyVal {
      
      @scala.inline
      def setCacheObject(value: ICacheObject): Self = StObject.set(x, "cacheObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheObjectUndefined: Self = StObject.set(x, "cacheObject", js.undefined)
      
      @scala.inline
      def setKeySelector(value: (S, P, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "keySelector", js.Any.fromFunction3(value))
      
      @scala.inline
      def setKeySelectorCreator(
        value: /* selectorInputs */ typingsSlinky.reReselect.anon.KeySelector[D, C, S, P] => ParametricKeySelector[S, P]
      ): Self = StObject.set(x, "keySelectorCreator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeySelectorCreatorUndefined: Self = StObject.set(x, "keySelectorCreator", js.undefined)
      
      @scala.inline
      def setKeySelectorUndefined: Self = StObject.set(x, "keySelector", js.undefined)
      
      @scala.inline
      def setSelectorCreator(value: CreateSelectorInstance): Self = StObject.set(x, "selectorCreator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorCreatorUndefined: Self = StObject.set(x, "selectorCreator", js.undefined)
    }
  }
  
  type ParametricSelector[S, P, R] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, R]
  
  type Selector[S, R] = js.Function1[/* state */ S, R]
  
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
