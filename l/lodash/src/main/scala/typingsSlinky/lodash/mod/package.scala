package typingsSlinky.lodash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Crazy typedef needed get _.omit to work properly with Dictionary and NumericDictionary
  type AnyKindOfDictionary = typingsSlinky.lodash.mod.Dictionary[js.Any] | typingsSlinky.lodash.mod.NumericDictionary[js.Any]
  
  type ArrayIterator[T, TResult] = js.Function3[/* value */ T, /* index */ scala.Double, /* collection */ js.Array[T], TResult]
  
  type AssignCustomizer = js.Function5[
    /* objectValue */ js.Any, 
    /* sourceValue */ js.Any, 
    /* key */ js.UndefOr[java.lang.String], 
    /* object */ js.UndefOr[js.Object], 
    /* source */ js.UndefOr[js.Object], 
    js.Any
  ]
  
  type CloneDeepWithCustomizer[TObject] = js.Function4[
    /* value */ js.Any, 
    /* key */ js.UndefOr[scala.Double | java.lang.String], 
    /* object */ js.UndefOr[TObject], 
    /* stack */ js.Any, 
    js.Any
  ]
  
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
  
  type ConformsPredicateObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends (arg : infer A): any? any : any}
    */ typingsSlinky.lodash.lodashStrings.ConformsPredicateObject with org.scalablytyped.runtime.TopLevel[T]
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type DictionaryIteratee[T] = typingsSlinky.lodash.mod.ObjectIteratee[typingsSlinky.lodash.mod.Dictionary[T]]
  
  type DictionaryIterator[T, TResult] = typingsSlinky.lodash.mod.ObjectIterator[typingsSlinky.lodash.mod.Dictionary[T], TResult]
  
  type DictionaryIteratorTypeGuard[T, S /* <: T */] = typingsSlinky.lodash.mod.ObjectIteratorTypeGuard[typingsSlinky.lodash.mod.Dictionary[T], S]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.lodash.mod.PrimitiveChain[T]
    - typingsSlinky.lodash.mod.ObjectChain[T]
    - typingsSlinky.lodash.mod.CollectionChain[js.Any]
    - typingsSlinky.lodash.mod.FunctionChain[T]
    - typingsSlinky.lodash.mod.StringNullableChain
    - typingsSlinky.lodash.mod.StringChain
    - typingsSlinky.lodash.mod.CollectionChain[_] with typingsSlinky.lodash.mod.FunctionChain[_] with typingsSlinky.lodash.mod.ObjectChain[_] with typingsSlinky.lodash.mod.PrimitiveChain[_] with typingsSlinky.lodash.mod.StringChain
  */
  type ExpChain[T] = typingsSlinky.lodash.mod._ExpChain[T] | typingsSlinky.lodash.mod.CollectionChain[js.Any] | (typingsSlinky.lodash.mod.CollectionChain[_] with typingsSlinky.lodash.mod.FunctionChain[_] with typingsSlinky.lodash.mod.ObjectChain[_] with typingsSlinky.lodash.mod.PrimitiveChain[_] with typingsSlinky.lodash.mod.StringChain)
  
  type Flat[T] = T
  
  type Function0[R] = js.Function0[R]
  
  type Function1[T1, R] = js.Function1[/* t1 */ T1, R]
  
  type Function2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  
  type Function3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  
  type Function4[T1, T2, T3, T4, R] = js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]
  
  type FunctionBase = typingsSlinky.lodash.GlobalFunction
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.lodash.mod.Primitive[T]
    - typingsSlinky.lodash.mod.Object[T]
    - typingsSlinky.lodash.mod.Collection[js.Any]
    - typingsSlinky.lodash.mod.Function[T]
    - typingsSlinky.lodash.mod.String
    - typingsSlinky.lodash.mod.Collection[_] with typingsSlinky.lodash.mod.Function[_] with typingsSlinky.lodash.mod.Object[_] with typingsSlinky.lodash.mod.Primitive[_] with typingsSlinky.lodash.mod.String
  */
  type ImpChain[T] = typingsSlinky.lodash.mod._ImpChain[T] | typingsSlinky.lodash.mod.Collection[js.Any] | (typingsSlinky.lodash.mod.Collection[_] with typingsSlinky.lodash.mod.Function[_] with typingsSlinky.lodash.mod.Object[_] with typingsSlinky.lodash.mod.Primitive[_] with typingsSlinky.lodash.mod.String)
  
  type IsEqualCustomizer = js.Function6[
    /* value */ js.Any, 
    /* other */ js.Any, 
    /* indexOrKey */ js.UndefOr[typingsSlinky.lodash.mod.PropertyName], 
    /* parent */ js.Any, 
    /* otherParent */ js.Any, 
    /* stack */ js.Any, 
    js.UndefOr[scala.Boolean]
  ]
  
  type IterateeShorthand[T] = typingsSlinky.lodash.mod.PropertyName | (js.Tuple2[typingsSlinky.lodash.mod.PropertyName, js.Any]) | typingsSlinky.lodash.mod.PartialShallow[T]
  
  /** Common interface between Arrays and jQuery objects */
  type List[T] = typingsSlinky.std.ArrayLike[T]
  
  type ListIteratee[T] = (typingsSlinky.lodash.mod.ListIterator[T, typingsSlinky.lodash.mod.NotVoid]) | typingsSlinky.lodash.mod.IterateeShorthand[T]
  
  type ListIterateeCustom[T, TResult] = (typingsSlinky.lodash.mod.ListIterator[T, TResult]) | typingsSlinky.lodash.mod.IterateeShorthand[T]
  
  type ListIterator[T, TResult] = js.Function3[
    /* value */ T, 
    /* index */ scala.Double, 
    /* collection */ typingsSlinky.lodash.mod.List[T], 
    TResult
  ]
  
  type ListIteratorTypeGuard[T, S /* <: T */] = js.Function3[
    /* value */ T, 
    /* index */ scala.Double, 
    /* collection */ typingsSlinky.lodash.mod.List[T], 
    /* is S */ scala.Boolean
  ]
  
  type ListOfRecursiveArraysOrValues[T] = typingsSlinky.lodash.mod.List[T | typingsSlinky.lodash.mod.RecursiveArray[T]]
  
  type LoDashExplicitArrayWrapper[T] = typingsSlinky.lodash.mod.LoDashExplicitWrapper[js.Array[T]]
  
  type LoDashExplicitNillableArrayWrapper[T] = typingsSlinky.lodash.mod.LoDashExplicitWrapper[js.UndefOr[js.Array[T] | scala.Null]]
  
  type LoDashExplicitNillableObjectWrapper[T] = typingsSlinky.lodash.mod.LoDashExplicitWrapper[js.UndefOr[T | scala.Null]]
  
  type LoDashExplicitNumberArrayWrapper = typingsSlinky.lodash.mod.LoDashExplicitWrapper[js.Array[scala.Double]]
  
  type LoDashExplicitObjectWrapper[T] = typingsSlinky.lodash.mod.LoDashExplicitWrapper[T]
  
  type LoDashExplicitStringWrapper = typingsSlinky.lodash.mod.LoDashExplicitWrapper[java.lang.String]
  
  // For backwards compatibility
  type LoDashImplicitArrayWrapper[T] = typingsSlinky.lodash.mod.LoDashImplicitWrapper[js.Array[T]]
  
  type LoDashImplicitNillableArrayWrapper[T] = typingsSlinky.lodash.mod.LoDashImplicitWrapper[js.UndefOr[js.Array[T] | scala.Null]]
  
  type LoDashImplicitNillableObjectWrapper[T] = typingsSlinky.lodash.mod.LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]
  
  type LoDashImplicitNumberArrayWrapper = typingsSlinky.lodash.mod.LoDashImplicitWrapper[js.Array[scala.Double]]
  
  type LoDashImplicitObjectWrapper[T] = typingsSlinky.lodash.mod.LoDashImplicitWrapper[T]
  
  type LoDashImplicitStringWrapper = typingsSlinky.lodash.mod.LoDashImplicitWrapper[java.lang.String]
  
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
    /* dict */ typingsSlinky.lodash.mod.Dictionary[T], 
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
  
  type MergeWithCustomizer = js.Function5[
    /* value */ js.Any, 
    /* srcValue */ js.Any, 
    /* key */ java.lang.String, 
    /* object */ js.Any, 
    /* source */ js.Any, 
    js.Any
  ]
  
  type NotVoid = js.Any
  
  type NumericDictionary[T] = org.scalablytyped.runtime.NumberDictionary[T]
  
  type NumericDictionaryIteratee[T] = (typingsSlinky.lodash.mod.NumericDictionaryIterator[T, typingsSlinky.lodash.mod.NotVoid]) | typingsSlinky.lodash.mod.IterateeShorthand[T]
  
  type NumericDictionaryIterateeCustom[T, TResult] = (typingsSlinky.lodash.mod.NumericDictionaryIterator[T, TResult]) | typingsSlinky.lodash.mod.IterateeShorthand[T]
  
  // NOTE: keys of objects at run time are always strings, even when a NumericDictionary is being iterated.
  type NumericDictionaryIterator[T, TResult] = js.Function3[
    /* value */ T, 
    /* key */ java.lang.String, 
    /* collection */ typingsSlinky.lodash.mod.NumericDictionary[T], 
    TResult
  ]
  
  type ObjectIteratee[TObject] = (typingsSlinky.lodash.mod.ObjectIterator[TObject, typingsSlinky.lodash.mod.NotVoid]) | (typingsSlinky.lodash.mod.IterateeShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ])
  
  type ObjectIterateeCustom[TObject, TResult] = (typingsSlinky.lodash.mod.ObjectIterator[TObject, TResult]) | (typingsSlinky.lodash.mod.IterateeShorthand[
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
  
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type PartialObject[T] = typingsSlinky.lodash.GlobalPartial[T]
  
  type PartialShallow[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends object? object : T[P]}
    */ typingsSlinky.lodash.lodashStrings.PartialShallow with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type PropertyName = java.lang.String | scala.Double | js.Symbol
  
  type PropertyPath = typingsSlinky.lodash.mod.Many[typingsSlinky.lodash.mod.PropertyName]
  
  type ReplaceFunction = js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  
  type SetWithCustomizer[T] = js.Function3[/* nsValue */ js.Any, /* key */ java.lang.String, /* nsObject */ T, js.Any]
  
  type StringIterator[TResult] = js.Function3[
    /* char */ java.lang.String, 
    /* index */ scala.Double, 
    /* string */ java.lang.String, 
    TResult
  ]
  
  type Truthy[T] = T
  
  type ValueIteratee[T] = (js.Function1[/* value */ T, typingsSlinky.lodash.mod.NotVoid]) | typingsSlinky.lodash.mod.IterateeShorthand[T]
  
  type ValueIterateeCustom[T, TResult] = (js.Function1[/* value */ T, TResult]) | typingsSlinky.lodash.mod.IterateeShorthand[T]
  
  type ValueIteratorTypeGuard[T, S /* <: T */] = js.Function1[/* value */ T, /* is S */ scala.Boolean]
  
  type ValueKeyIteratee[T] = (js.Function2[/* value */ T, /* key */ java.lang.String, typingsSlinky.lodash.mod.NotVoid]) | typingsSlinky.lodash.mod.IterateeShorthand[T]
  
  type ValueKeyIterateeTypeGuard[T, S /* <: T */] = js.Function2[/* value */ T, /* key */ java.lang.String, /* is S */ scala.Boolean]
  
  type __ = typingsSlinky.lodash.mod.LoDashStatic
  
  type isMatchWithCustomizer = js.Function5[
    /* value */ js.Any, 
    /* other */ js.Any, 
    /* indexOrKey */ typingsSlinky.lodash.mod.PropertyName, 
    /* object */ js.Object, 
    /* source */ js.Object, 
    js.UndefOr[scala.Boolean]
  ]
}
