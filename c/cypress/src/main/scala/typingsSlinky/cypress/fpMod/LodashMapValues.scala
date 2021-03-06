package typingsSlinky.cypress.fpMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cypress.lodashMod.Dictionary
import typingsSlinky.cypress.lodashMod.NumericDictionary
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapValues extends js.Object {
  def apply(iteratee: String): LodashMapValues6x1 = js.native
  def apply(iteratee: js.Object): LodashMapValues3x1 = js.native
  def apply[T](callbackOrIterateeOrIterateeOrIteratee: __, obj: Dictionary[T]): LodashMapValues1x2[T] = js.native
  def apply[T](callbackOrIterateeOrIterateeOrIteratee: __, obj: NumericDictionary[T]): LodashMapValues1x2[T] = js.native
  def apply[T /* <: js.Object */](callbackOrIterateeOrIteratee: __): LodashMapValues2x2[T] = js.native
  def apply[T /* <: js.Object */](callbackOrIterateeOrIteratee: __, obj: T): LodashMapValues2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: String, obj: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.cypress.cypressStrings.LodashMapValues with TopLevel[js.Any] = js.native
  def apply[T](iteratee: String, obj: Dictionary[T]): Dictionary[_] = js.native
  def apply[T](iteratee: String, obj: NumericDictionary[T]): Dictionary[_] = js.native
  def apply[T /* <: js.Object */](iteratee: js.Object, obj: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.cypress.cypressStrings.LodashMapValues with TopLevel[js.Any] = js.native
  def apply[T](iteratee: js.Object, obj: Dictionary[T]): Dictionary[Boolean] = js.native
  def apply[T](iteratee: js.Object, obj: NumericDictionary[T]): Dictionary[Boolean] = js.native
  def apply[T, TResult](callback: js.Function1[/* value */ T, TResult]): LodashMapValues1x1[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    obj: T
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsSlinky.cypress.cypressStrings.LodashMapValues with TopLevel[js.Any] = js.native
  def apply[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: Dictionary[T]): Dictionary[TResult] = js.native
  def apply[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: NumericDictionary[T]): Dictionary[TResult] = js.native
  def apply[T, TKey /* <: /* keyof T */ String */](iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def apply[T, TKey /* <: /* keyof T */ String */](iteratee: TKey, obj: Dictionary[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def apply[T, TKey /* <: /* keyof T */ String */](iteratee: TKey, obj: NumericDictionary[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
}

