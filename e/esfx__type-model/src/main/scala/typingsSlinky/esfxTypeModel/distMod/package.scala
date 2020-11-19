package typingsSlinky.esfxTypeModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object distMod {
  
  type AnyExclude[T, U] = typingsSlinky.std.Exclude[T, U]
  
  type AnyExtract[T, U] = typingsSlinky.std.Extract[T, U]
  
  type AnyKeyof[T] = /* keyof T */ java.lang.String
  
  type Assign[A /* <: js.Object */, B /* <: js.Object */] = typingsSlinky.esfxTypeModel.distMod.Reshape[(typingsSlinky.esfxTypeModel.distMod.Diff[A, B]) with B]
  
  type Conjoin[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in @esfx/type-model.@esfx/type-model/dist.AnyKeyof<T> ]: @esfx/type-model.@esfx/type-model/dist.AnyExtract<T, {readonly [ U in P ]: unknown}>[P]}
    */ typingsSlinky.esfxTypeModel.esfxTypeModelStrings.Conjoin with (org.scalablytyped.runtime.TopLevel[
    typingsSlinky.esfxTypeModel.distMod.AnyExtract[
      T, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ U in P ]: unknown}
    */ typingsSlinky.esfxTypeModel.esfxTypeModelStrings.Conjoin with org.scalablytyped.runtime.TopLevel[js.Any]
    ]
  ])
  
  type Constructor[T, A /* <: js.Array[_] */] = org.scalablytyped.runtime.Instantiable1[/* args */ A, T]
  
  type Diff[A /* <: js.Object */, B /* <: js.Object */] = typingsSlinky.esfxTypeModel.distMod.Omit[A, /* keyof B */ java.lang.String]
  
  type Disjoin[T /* <: js.Object */] = typingsSlinky.esfxTypeModel.distMod.DisjoinRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: {[ P in K ]: T[P]}}[keyof T] */ js.Any
  ]
  
  type DisjoinOverlaps[A, B] = typingsSlinky.esfxTypeModel.distMod.Overlaps[
    A | typingsSlinky.esfxTypeModel.distMod.Disjoin[A], 
    B | typingsSlinky.esfxTypeModel.distMod.Disjoin[B]
  ]
  
  type DisjoinRest[T] = T | js.Object
  
  type Every[L /* <: js.Array[scala.Boolean] */] = typingsSlinky.esfxTypeModel.distMod.EveryRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends false? 'false' : never}[number] */ js.Any
  ]
  
  type EveryRest[R] = scala.Boolean | typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typingsSlinky.esfxTypeModel.esfxTypeModelNumbers.`0`
    - typingsSlinky.esfxTypeModel.esfxTypeModelStrings._empty
  */
  type Falsey = js.UndefOr[typingsSlinky.esfxTypeModel.distMod._Falsey | scala.Null]
  
  type FunctionKeys[T, F /* <: js.Function */] = typingsSlinky.esfxTypeModel.distMod.MatchingKeys[T, F]
  
  type GeneratorNextType[T] = js.Any
  
  type GeneratorReturnType[T] = scala.Unit
  
  type Intersect[A /* <: js.Object */, B /* <: js.Object */] = typingsSlinky.std.Pick[
    A with B, 
    typingsSlinky.std.Extract[/* keyof A */ java.lang.String, /* keyof B */ java.lang.String]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`
    - scala.Boolean
  */
  type IsCallable[T] = typingsSlinky.esfxTypeModel.distMod._IsCallable[T] | scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`
    - scala.Boolean
  */
  type IsConstructable[T] = typingsSlinky.esfxTypeModel.distMod._IsConstructable[T] | scala.Boolean
  
  type IsEmpty[T /* <: js.Object */] = typingsSlinky.esfxTypeModel.distMod.IsNever[/* keyof T */ java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.esfxTypeModel.distMod._IsSubsetOf[Sub, Super]
    - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
    - scala.Boolean
  */
  type IsProperSubsetOf[Sub, Super] = (typingsSlinky.esfxTypeModel.distMod._IsProperSubsetOf[Sub, Super]) | scala.Boolean
  
  type IsProperSupersetOf[Super, Sub] = typingsSlinky.esfxTypeModel.distMod.IsProperSubsetOf[Sub, Super]
  
  type IsSubsetOf[Sub, Super] = (typingsSlinky.esfxTypeModel.distMod._IsSubsetOf[Sub, Super]) | scala.Boolean
  
  type IsSupersetOf[Super, Sub] = typingsSlinky.esfxTypeModel.distMod.IsSubsetOf[Sub, Super]
  
  type IsSupertypeOf[Super, Sub] = typingsSlinky.esfxTypeModel.distMod.IsSubtypeOf[Sub, Super]
  
  type IsUnion[T] = (typingsSlinky.esfxTypeModel.distMod.IsUnionRest[T, js.Array[T]]) | typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
  
  type IsUnionRest[T, Q] = typingsSlinky.esfxTypeModel.distMod.Not[typingsSlinky.esfxTypeModel.distMod.SameType[js.Array[T], Q]]
  
  type IteratedType[T] = js.Any
  
  type MatchingKeys[T, TMatch] = typingsSlinky.esfxTypeModel.distMod._MatchingKeys[T, TMatch, /* keyof T */ java.lang.String]
  
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typingsSlinky.esfxTypeModel.esfxTypeModelStrings.Mutable with org.scalablytyped.runtime.TopLevel[T]
  
  type NonFunctionKeys[T, F /* <: js.Function */] = typingsSlinky.esfxTypeModel.distMod.NonMatchingKeys[T, F]
  
  type NonMatchingKeys[T, TMatch] = typingsSlinky.std.Exclude[
    /* keyof T */ java.lang.String, 
    typingsSlinky.esfxTypeModel.distMod.MatchingKeys[T, TMatch]
  ]
  
  type NonOptional[T] = T
  
  type Nullable[T] = js.UndefOr[T | scala.Null]
  
  type Omit[T, K /* <: typingsSlinky.std.PropertyKey */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type One[L /* <: js.Array[scala.Boolean] */] = typingsSlinky.esfxTypeModel.distMod.OneRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? [P] : never}[number] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`
    - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
    - scala.Boolean
  */
  type OneRest[R] = typingsSlinky.esfxTypeModel.distMod._OneRest[R] | scala.Boolean
  
  type Optional[T] = js.UndefOr[T]
  
  type Primitive = java.lang.String | js.Symbol | scala.Boolean | scala.Double | js.BigInt
  
  type PromisedType[T] = js.Any
  
  type Reshape[T /* <: js.Object */] = typingsSlinky.std.Pick[T, /* keyof T */ java.lang.String]
  
  type SameTypes[L /* <: js.Array[_] */] = typingsSlinky.esfxTypeModel.distMod.SameType[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.SameType<L[P], L[number]>}[number] */ js.Any, 
    typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`
  ]
  
  type Some[L /* <: js.Array[scala.Boolean] */] = typingsSlinky.esfxTypeModel.distMod.SomeRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? 'true' : never}[number] */ js.Any
  ]
  
  type SomeRest[R] = scala.Boolean | typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`
  
  type XOr[A /* <: scala.Boolean */, B /* <: scala.Boolean */] = typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false` | (typingsSlinky.esfxTypeModel.distMod.Not[A | B])
  
  type _MatchingKeys[T, TSuper, K /* <: /* keyof T */ java.lang.String */] = K
}
