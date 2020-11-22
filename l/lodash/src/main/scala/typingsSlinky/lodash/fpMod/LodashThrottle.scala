package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.DebouncedFunc
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashThrottle extends js.Object {
  
  def apply(wait: Double): LodashThrottle1x1 = js.native
  def apply[T /* <: js.Function1[/* args */ js.Any, _] */](wait: Double, func: T): DebouncedFunc[T] = js.native
  def apply[T /* <: js.Function1[/* args */ js.Any, _] */](wait: __, func: T): LodashThrottle1x2[T] = js.native
}
