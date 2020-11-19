package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.MemoIteratorCapped
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduce extends LodashConvertible {
  
  def apply[TResult](callback: __, accumulator: TResult): LodashReduce1x2[TResult] = js.native
  def apply[T](callback: __, accumulator: __): LodashReduce1x4[T] = js.native
  def apply[T /* <: js.Object */](callback: __, accumulator: __, collection: T): LodashReduce3x4[T] = js.native
  def apply[T](callback: __, accumulator: __, collection: js.Array[T]): LodashReduce1x4[T] = js.native
  def apply[T](callback: __, accumulator: __, collection: List[T]): LodashReduce2x4[T] = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult]): LodashReduce1x1[T, TResult] = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult): LodashReduce1x3[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult, collection: List[T]): TResult = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __
  ): LodashReduce3x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __,
    collection: T
  ): LodashReduce3x5[TResult] = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __, collection: js.Array[T]): LodashReduce1x5[TResult] = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __, collection: List[T]): LodashReduce2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](callback: __, accumulator: TResult, collection: T): LodashReduce3x6[T, TResult] = js.native
  def apply[T, TResult](callback: __, accumulator: TResult, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def apply[T, TResult](callback: __, accumulator: TResult, collection: List[T]): LodashReduce2x6[T, TResult] = js.native
}
