package typingsSlinky.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object toolsMod {
  
  type Arity0Fn = js.Function0[js.Any]
  
  type Arity1Fn = js.Function1[/* a */ js.Any, js.Any]
  
  type Arity2Fn = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
  
  type ComposeWithFns[V0, R] = (js.Array[js.Function1[/* x0 */ V0, R]]) | (js.Tuple2[js.Function1[/* x */ js.Any, R], js.Function1[/* x */ V0, js.Any]]) | (js.Tuple3[
    js.Function1[/* x */ js.Any, R], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple4[
    js.Function1[/* x */ js.Any, R], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple5[
    js.Function1[/* x */ js.Any, R], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple6[
    js.Function1[/* x */ js.Any, R], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple7[
    js.Function1[/* x */ js.Any, R], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple8[
    js.Function1[/* x */ js.Any, R], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple9[
    js.Function1[/* x */ js.Any, R], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple10[
    js.Function1[/* x */ js.Any, R], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ])
  
  type Dictionary[A] = org.scalablytyped.runtime.StringDictionary[A]
  
  type Evolvable[E /* <: typingsSlinky.ramda.toolsMod.Evolver[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? ramda.ramda/tools.Evolved<E[P]>}
    */ typingsSlinky.ramda.ramdaStrings.Evolvable with org.scalablytyped.runtime.TopLevel[E]
  
  type Evolve[O /* <: typingsSlinky.ramda.toolsMod.Evolvable[E] */, E /* <: typingsSlinky.ramda.toolsMod.Evolver[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof O ]: P extends keyof E? ramda.ramda/tools.EvolveValue<O[P], E[P]> : O[P]}
    */ typingsSlinky.ramda.ramdaStrings.Evolve with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /**
    * <needs description>
    * @param O
    * @param E
    */
  type EvolveNestedValue[O, E /* <: typingsSlinky.ramda.toolsMod.Evolver[_] */] = typingsSlinky.ramda.toolsMod.Evolve[O, E]
  
  /**
    * <needs description>
    * @param V
    * @param E
    */
  type EvolveValue[V, E] = (typingsSlinky.ramda.toolsMod.EvolveNestedValue[V, E]) | typingsSlinky.std.ReturnType[E]
  
  /**
    * <needs description>
    * @param A
    */
  type Evolved[A] = typingsSlinky.ramda.toolsMod.Evolvable[A]
  
  type Evolver[T /* <: typingsSlinky.ramda.toolsMod.Evolvable[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof std.Partial<T> ]: (value : T[key]): T[key] | T[key] extends ramda.ramda/tools.Evolvable<any>? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ramda.ramda/tools.Evolver<T[key]> * / object : never}
    */ typingsSlinky.ramda.ramdaStrings.Evolver with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /**
    * <needs description>
    * @param A
    */
  type FilterOnceApplied[A] = js.Function1[
    /* source */ js.Array[A] | typingsSlinky.ramda.toolsMod.Dictionary[A], 
    typingsSlinky.ramda.toolsMod.Dictionary[js.Any] | js.Array[js.Any]
  ]
  
  type KeyValuePair[K, V] = js.Tuple2[K, V]
  
  type Merge[O1 /* <: js.Object */, O2 /* <: js.Object */, Depth /* <: typingsSlinky.ramda.ramdaStrings.flat | typingsSlinky.ramda.ramdaStrings.deep */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify O.MergeUp<T.ObjectOf<O1>, T.ObjectOf<O2>, Depth> */ js.Any
  
  type MergeAll[Os /* <: js.Array[js.Object] */] = js.Any
  
  type ObjPred = js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Boolean]
  
  type Ord = scala.Double | java.lang.String | scala.Boolean | js.Date
  
  type Path = js.Array[scala.Double | java.lang.String]
  
  type PipeWithFns[V0, R] = (js.Array[js.Function1[/* x0 */ V0, R]]) | (js.Tuple2[js.Function1[/* x0 */ V0, js.Any], js.Function1[/* x */ js.Any, R]]) | (js.Tuple3[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, R]
  ]) | (js.Tuple4[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, R]
  ]) | (js.Tuple5[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, R]
  ]) | (js.Tuple6[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, R]
  ]) | (js.Tuple7[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, R]
  ]) | (js.Tuple8[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, R]
  ]) | (js.Tuple9[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, R]
  ]) | (js.Tuple10[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, R]
  ])
  
  type Placeholder = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify A.x */ js.Any) with typingsSlinky.ramda.anon.Functionalplaceholder
  
  type Pred = js.Function1[/* repeated */ js.Any, scala.Boolean]
  
  type SafePred[A] = js.Function1[/* repeated */ A, scala.Boolean]
  
  type ValueOfRecord[R] = js.Any
}
