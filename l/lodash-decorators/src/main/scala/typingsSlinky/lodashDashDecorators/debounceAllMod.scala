package typingsSlinky.lodashDashDecorators

import typingsSlinky.lodashDashDecorators.factoryCommonMod.LodashMethodDecorator
import typingsSlinky.lodashDashDecorators.sharedMod.DebounceOptions
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/debounceAll", JSImport.Namespace)
@js.native
object debounceAllMod extends js.Object {
  def DebounceAll(): LodashMethodDecorator = js.native
  def DebounceAll(wait: Double): LodashMethodDecorator = js.native
  def DebounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def debounceAll(): LodashMethodDecorator = js.native
  def debounceAll(wait: Double): LodashMethodDecorator = js.native
  def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
}

