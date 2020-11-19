package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.MemoVoidIteratorCapped
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform1x4[T] extends js.Object {
  
  def apply[TResult](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]]): LodashTransform1x5[TResult] = js.native
  def apply[TResult](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]], accumulator: js.Array[TResult]): js.Array[TResult] = js.native
  def apply[TResult](iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]], accumulator: Dictionary[TResult]): Dictionary[TResult] = js.native
  def apply[TResult](iteratee: __, accumulator: js.Array[TResult]): LodashTransform1x6[T, TResult] = js.native
  def apply[TResult](iteratee: __, accumulator: Dictionary[TResult]): LodashTransform2x6[T, TResult] = js.native
}
