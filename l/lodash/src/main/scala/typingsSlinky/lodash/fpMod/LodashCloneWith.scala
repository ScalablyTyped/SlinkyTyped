package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashMod.CloneWithCustomizer
import typingsSlinky.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCloneWith extends js.Object {
  def apply[T](customizer: __, value: T): LodashCloneWith1x2[T] = js.native
  def apply[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]]): LodashCloneWith2x1[T, TResult] = js.native
  def apply[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]], value: T): TResult | T = js.native
}

