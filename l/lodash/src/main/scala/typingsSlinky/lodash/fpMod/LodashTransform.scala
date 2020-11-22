package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.MemoVoidIteratorCapped
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform extends js.Object {
  
  def apply[TResult](iteratee: __, accumulator: TResult): LodashTransform1x2[TResult] = js.native
  def apply[T](iteratee: __, accumulator: __, `object`: js.Array[T]): LodashTransform1x4[T] = js.native
  def apply[T](iteratee: __, accumulator: __, `object`: Dictionary[T]): LodashTransform2x4[T] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult]): LodashTransform1x1[T, TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult): LodashTransform1x3[T, TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult, `object`: js.Array[T]): TResult = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult, `object`: Dictionary[T]): TResult = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: __, `object`: js.Array[T]): LodashTransform1x5[TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: __, `object`: Dictionary[T]): LodashTransform2x5[TResult] = js.native
  def apply[T, TResult](iteratee: __, accumulator: TResult, `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def apply[T, TResult](iteratee: __, accumulator: TResult, `object`: Dictionary[T]): LodashTransform2x6[T, TResult] = js.native
}
