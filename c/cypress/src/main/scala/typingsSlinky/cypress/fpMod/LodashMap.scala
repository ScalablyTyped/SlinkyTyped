package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Dictionary
import typingsSlinky.cypress.lodashMod.List
import typingsSlinky.cypress.lodashMod.NumericDictionary
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMap extends js.Object {
  def apply(iteratee: String): LodashMap5x1 = js.native
  def apply(iteratee: js.Object): LodashMap6x1 = js.native
  def apply[T](iteratee: String, collection: Dictionary[T]): js.Array[_] = js.native
  def apply[T](iteratee: String, collection: List[T]): js.Array[_] = js.native
  def apply[T](iteratee: String, collection: NumericDictionary[T]): js.Array[_] = js.native
  def apply[T](iteratee: js.Object, collection: Dictionary[T]): js.Array[Boolean] = js.native
  def apply[T](iteratee: js.Object, collection: List[T]): js.Array[Boolean] = js.native
  def apply[T](iteratee: js.Object, collection: NumericDictionary[T]): js.Array[Boolean] = js.native
  def apply[T](iteratee: __): LodashMap1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashMap3x2[T] = js.native
  def apply[T](iteratee: __, collection: js.Array[T]): LodashMap1x2[T] = js.native
  def apply[T](iteratee: __, collection: Dictionary[T]): LodashMap4x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMap4x2[T] = js.native
  def apply[T](iteratee: __, collection: NumericDictionary[T]): LodashMap4x2[T] = js.native
  def apply[T, K /* <: /* keyof T */ String */](iteratee: K): LodashMap4x1[T, K] = js.native
  def apply[T, K /* <: /* keyof T */ String */](iteratee: K, collection: Dictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def apply[T, K /* <: /* keyof T */ String */](iteratee: K, collection: List[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def apply[T, K /* <: /* keyof T */ String */](iteratee: K, collection: NumericDictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): js.Array[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: js.Array[T]): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: List[T]): js.Array[TResult] = js.native
}

