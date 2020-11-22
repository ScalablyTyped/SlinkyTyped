package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform1x1[T, TResult] extends js.Object {
  
  def apply(accumulator: TResult): LodashTransform1x3[T, TResult] = js.native
  def apply(accumulator: TResult, `object`: js.Array[T]): TResult = js.native
  def apply(accumulator: TResult, `object`: Dictionary[T]): TResult = js.native
  def apply(accumulator: __, `object`: js.Array[T]): LodashTransform1x5[TResult] = js.native
  def apply(accumulator: __, `object`: Dictionary[T]): LodashTransform2x5[TResult] = js.native
}
