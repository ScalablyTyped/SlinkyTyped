package typingsSlinky.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toolsMod {
  type Arity0Fn = js.Function0[js.Any]
  type Arity1Fn = js.Function1[/* a */ js.Any, js.Any]
  type Arity2Fn = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
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
  type Path = js.Array[scala.Double | java.lang.String]
  type Placeholder = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify A.x */ js.Any) with typingsSlinky.ramda.anon.Functionalplaceholder
  type Pred = js.Function1[/* repeated */ js.Any, scala.Boolean]
  type SafePred[A] = js.Function1[/* repeated */ A, scala.Boolean]
  type ValueOfRecord[R] = js.Any
}
