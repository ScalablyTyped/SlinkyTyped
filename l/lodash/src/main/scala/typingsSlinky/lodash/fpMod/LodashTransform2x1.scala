package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform2x1[T, TResult] extends js.Object {
  
  def apply(accumulator: Dictionary[TResult]): LodashTransform2x3[T, TResult] = js.native
  def apply(accumulator: Dictionary[TResult], `object`: js.Array[T]): Dictionary[TResult] = js.native
  def apply(accumulator: Dictionary[TResult], `object`: Dictionary[T]): Dictionary[TResult] = js.native
  def apply(accumulator: __, `object`: js.Array[T]): LodashTransform2x5[TResult] = js.native
  def apply(accumulator: __, `object`: Dictionary[T]): LodashTransform3x5[TResult] = js.native
}
