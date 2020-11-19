package typingsSlinky.jestUtil.deepCyclicCopyMod

import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-util/build/deepCyclicCopy", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[T](value: T): T = js.native
  def apply[T](value: T, options: js.UndefOr[scala.Nothing], cycles: WeakMap[_, _]): T = js.native
  def apply[T](value: T, options: DeepCyclicCopyOptions): T = js.native
  def apply[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
}
