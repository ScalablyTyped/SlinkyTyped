package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lodashMod {
  // Crazy typedef needed get _.omit to work properly with Dictionary and NumericDictionary
  type AnyKindOfDictionary = (typingsSlinky.cypress.lodashMod.Dictionary[js.UndefOr[js.Object | scala.Null]]) | (typingsSlinky.cypress.lodashMod.NumericDictionary[js.UndefOr[js.Object | scala.Null]])
  type ArrayIterator[T, TResult] = js.Function3[/* value */ T, /* index */ scala.Double, /* collection */ js.Array[T], TResult]
  // assignInWith
  type AssignCustomizer = js.Function5[
    /* objectValue */ js.Any, 
    /* sourceValue */ js.Any, 
    /* key */ js.UndefOr[java.lang.String], 
    /* object */ js.UndefOr[js.Object], 
    /* source */ js.UndefOr[js.Object], 
    js.Any
  ]
  // cloneDeepWith
  type CloneDeepWithCustomizer[TObject] = js.Function4[
    /* value */ js.Any, 
    /* key */ js.UndefOr[scala.Double | java.lang.String], 
    /* object */ js.UndefOr[TObject], 
    /* stack */ js.Any, 
    js.Any
  ]
  // cloneWith
  type CloneWithCustomizer[TValue, TResult] = js.Function4[
    /* value */ TValue, 
    /* key */ js.UndefOr[scala.Double | java.lang.String], 
    /* object */ js.Any, 
    /* stack */ js.Any, 
    TResult
  ]
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean]
  type Comparator2[T1, T2] = js.Function2[/* a */ T1, /* b */ T2, scala.Boolean]
  type CondPair[T, R] = js.Tuple2[js.Function1[/* val */ T, scala.Boolean], js.Function1[/* val */ T, R]]
  // conforms
  type ConformsPredicateObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? (val : T[P]): boolean}
    */ typingsSlinky.cypress.cypressStrings.ConformsPredicateObject with org.scalablytyped.runtime.TopLevel[T]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type DictionaryIteratee[T] = typingsSlinky.cypress.lodashMod.ObjectIteratee[typingsSlinky.cypress.lodashMod.Dictionary[T]]
  type DictionaryIterator[T, TResult] = typingsSlinky.cypress.lodashMod.ObjectIterator[typingsSlinky.cypress.lodashMod.Dictionary[T], TResult]
  type DictionaryIteratorTypeGuard[T, S /* <: T */] = typingsSlinky.cypress.lodashMod.ObjectIteratorTypeGuard[typingsSlinky.cypress.lodashMod.Dictionary[T], S]
  type Function0[R] = js.Function0[R]
  type Function1[T1, R] = js.Function1[/* t1 */ T1, R]
  type Function2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  type Function3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  type Function4[T1, T2, T3, T4, R] = js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]
  // isEqualWith
  type IsEqualCustomizer = js.Function6[
    /* value */ js.Any, 
    /* other */ js.Any, 
    /* indexOrKey */ js.UndefOr[typingsSlinky.cypress.lodashMod.PropertyName], 
    /* parent */ js.Any, 
    /* otherParent */ js.Any, 
    /* stack */ js.Any, 
    js.UndefOr[scala.Boolean]
  ]
  type IterateeShorthand[T] = typingsSlinky.cypress.lodashMod.PropertyName | (js.Tuple2[typingsSlinky.cypress.lodashMod.PropertyName, js.Any]) | typingsSlinky.cypress.lodashMod.PartialDeep[T]
  /** Common interface between Arrays and jQuery objects */
  type List[T] = typingsSlinky.std.ArrayLike[T]
  type ListIteratee[T] = (typingsSlinky.cypress.lodashMod.ListIterator[T, typingsSlinky.cypress.lodashMod.NotVoid]) | typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
  type ListIterateeCustom[T, TResult] = (typingsSlinky.cypress.lodashMod.ListIterator[T, TResult]) | typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
  type ListIterator[T, TResult] = js.Function3[
    /* value */ T, 
    /* index */ scala.Double, 
    /* collection */ typingsSlinky.cypress.lodashMod.List[T], 
    TResult
  ]
  type ListIteratorTypeGuard[T, S /* <: T */] = js.Function3[
    /* value */ T, 
    /* index */ scala.Double, 
    /* collection */ typingsSlinky.cypress.lodashMod.List[T], 
    /* is S */ scala.Boolean
  ]
  type ListOfRecursiveArraysOrValues[T] = typingsSlinky.cypress.lodashMod.List[T | typingsSlinky.cypress.lodashMod.RecursiveArray[T]]
  type LoDashExplicitArrayWrapper[T] = typingsSlinky.cypress.lodashMod.LoDashExplicitWrapper[js.Array[T]]
  type LoDashExplicitNillableArrayWrapper[T] = typingsSlinky.cypress.lodashMod.LoDashExplicitWrapper[js.UndefOr[js.Array[T] | scala.Null]]
  type LoDashExplicitNillableObjectWrapper[T] = typingsSlinky.cypress.lodashMod.LoDashExplicitWrapper[js.UndefOr[T | scala.Null]]
  type LoDashExplicitNumberArrayWrapper = typingsSlinky.cypress.lodashMod.LoDashExplicitWrapper[js.Array[scala.Double]]
  type LoDashExplicitObjectWrapper[T] = typingsSlinky.cypress.lodashMod.LoDashExplicitWrapper[T]
  type LoDashExplicitStringWrapper = typingsSlinky.cypress.lodashMod.LoDashExplicitWrapper[java.lang.String]
  // For backwards compatibility
  type LoDashImplicitArrayWrapper[T] = typingsSlinky.cypress.lodashMod.LoDashImplicitWrapper[js.Array[T]]
  type LoDashImplicitNillableArrayWrapper[T] = typingsSlinky.cypress.lodashMod.LoDashImplicitWrapper[js.UndefOr[js.Array[T] | scala.Null]]
  type LoDashImplicitNillableObjectWrapper[T] = typingsSlinky.cypress.lodashMod.LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]
  type LoDashImplicitNumberArrayWrapper = typingsSlinky.cypress.lodashMod.LoDashImplicitWrapper[js.Array[scala.Double]]
  type LoDashImplicitObjectWrapper[T] = typingsSlinky.cypress.lodashMod.LoDashImplicitWrapper[T]
  type LoDashImplicitStringWrapper = typingsSlinky.cypress.lodashMod.LoDashImplicitWrapper[java.lang.String]
  type Many[T] = T | js.Array[T]
  /** @deprecated Use MemoListIterator or MemoObjectIterator instead. */
  type MemoIterator[T, TResult] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* indexOrKey */ js.Any, 
    /* list */ js.Array[T], 
    TResult
  ]
  type MemoIteratorCapped[T, TResult] = js.Function2[/* prev */ TResult, /* curr */ T, TResult]
  type MemoIteratorCappedRight[T, TResult] = js.Function2[/* curr */ T, /* prev */ TResult, TResult]
  type MemoListIterator[T, TResult, TList] = js.Function4[/* prev */ TResult, /* curr */ T, /* index */ scala.Double, /* list */ TList, TResult]
  type MemoObjectIterator[T, TResult, TList] = js.Function4[/* prev */ TResult, /* curr */ T, /* key */ java.lang.String, /* list */ TList, TResult]
  type MemoVoidArrayIterator[T, TResult] = js.Function4[
    /* acc */ TResult, 
    /* curr */ T, 
    /* index */ scala.Double, 
    /* arr */ js.Array[T], 
    scala.Unit
  ]
  type MemoVoidDictionaryIterator[T, TResult] = js.Function4[
    /* acc */ TResult, 
    /* curr */ T, 
    /* key */ java.lang.String, 
    /* dict */ typingsSlinky.cypress.lodashMod.Dictionary[T], 
    scala.Unit
  ]
  /** @deprecated Use MemoVoidArrayIterator or MemoVoidDictionaryIterator instead. */
  type MemoVoidIterator[T, TResult] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* indexOrKey */ js.Any, 
    /* list */ js.Array[T], 
    scala.Unit
  ]
  type MemoVoidIteratorCapped[T, TResult] = js.Function2[/* acc */ TResult, /* curr */ T, scala.Unit]
  // mergeWith
  type MergeWithCustomizer = js.Function5[
    /* value */ js.Any, 
    /* srcValue */ js.Any, 
    /* key */ java.lang.String, 
    /* object */ js.Any, 
    /* source */ js.Any, 
    js.Any
  ]
  type NotVoid = js.UndefOr[js.Object | scala.Null]
  type NumericDictionary[T] = org.scalablytyped.runtime.NumberDictionary[T]
  type NumericDictionaryIteratee[T] = (typingsSlinky.cypress.lodashMod.NumericDictionaryIterator[T, typingsSlinky.cypress.lodashMod.NotVoid]) | typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
  type NumericDictionaryIterateeCustom[T, TResult] = (typingsSlinky.cypress.lodashMod.NumericDictionaryIterator[T, TResult]) | typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
  // NOTE: keys of objects at run time are always strings, even when a NumericDictionary is being iterated.
  type NumericDictionaryIterator[T, TResult] = js.Function3[
    /* value */ T, 
    /* key */ java.lang.String, 
    /* collection */ typingsSlinky.cypress.lodashMod.NumericDictionary[T], 
    TResult
  ]
  type ObjectIteratee[TObject] = (typingsSlinky.cypress.lodashMod.ObjectIterator[TObject, typingsSlinky.cypress.lodashMod.NotVoid]) | (typingsSlinky.cypress.lodashMod.IterateeShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ])
  type ObjectIterateeCustom[TObject, TResult] = (typingsSlinky.cypress.lodashMod.ObjectIterator[TObject, TResult]) | (typingsSlinky.cypress.lodashMod.IterateeShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ])
  // Note: key should be string, not keyof T, because the actual object may contain extra properties that were not specified in the type.
  type ObjectIterator[TObject, TResult] = js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* collection */ TObject, 
    TResult
  ]
  type ObjectIteratorTypeGuard[TObject, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any */] = js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* collection */ TObject, 
    /* is S */ scala.Boolean
  ]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never}[keyof T] */ js.Any
  ]
  type PartialDeep[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias cypress.cypress/types/lodash.PartialDeep<T[P]> * / object}
    */ typingsSlinky.cypress.cypressStrings.PartialDeep with org.scalablytyped.runtime.TopLevel[js.Any]
  type PartialObject[T] = typingsSlinky.cypress.GlobalPartial[T]
  type PropertyName = java.lang.String | scala.Double | js.Symbol
  type PropertyPath = typingsSlinky.cypress.lodashMod.Many[typingsSlinky.cypress.lodashMod.PropertyName]
  type ReplaceFunction = js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  // setWith
  type SetWithCustomizer[T] = js.Function3[/* nsValue */ js.Any, /* key */ java.lang.String, /* nsObject */ T, js.Any]
  type StringIterator[TResult] = js.Function3[
    /* char */ java.lang.String, 
    /* index */ scala.Double, 
    /* string */ java.lang.String, 
    TResult
  ]
  type ValueIteratee[T] = (js.Function1[/* value */ T, typingsSlinky.cypress.lodashMod.NotVoid]) | typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
  type ValueIterateeCustom[T, TResult] = (js.Function1[/* value */ T, TResult]) | typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
  type ValueIteratorTypeGuard[T, S /* <: T */] = js.Function1[/* value */ T, /* is S */ scala.Boolean]
  type ValueKeyIteratee[T] = (js.Function2[/* value */ T, /* key */ java.lang.String, typingsSlinky.cypress.lodashMod.NotVoid]) | typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
  type ValueKeyIterateeTypeGuard[T, S /* <: T */] = js.Function2[/* value */ T, /* key */ java.lang.String, /* is S */ scala.Boolean]
  /** The placeholder, to be used in curried functions */
  type __ = typingsSlinky.cypress.lodashMod.LoDashStatic
  // isMatch
  type isMatchCustomizer = js.Function3[
    /* value */ js.Any, 
    /* other */ js.Any, 
    /* indexOrKey */ js.UndefOr[typingsSlinky.cypress.lodashMod.PropertyName], 
    scala.Boolean
  ]
  // isMatchWith
  type isMatchWithCustomizer = js.Function5[
    /* value */ js.Any, 
    /* other */ js.Any, 
    /* indexOrKey */ typingsSlinky.cypress.lodashMod.PropertyName, 
    /* object */ js.Object, 
    /* source */ js.Object, 
    scala.Boolean
  ]
}
