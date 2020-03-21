package typingsSlinky.jestUtil

import typingsSlinky.jestUtil.deepCyclicCopyMod.DeepCyclicCopyOptions
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallValueOptionsCycles extends js.Object {
  def apply[T](value: T): T = js.native
  def apply[T](value: T, options: DeepCyclicCopyOptions): T = js.native
  def apply[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
}

