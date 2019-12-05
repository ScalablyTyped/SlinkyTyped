package typingsSlinky.lodashDashDecorators

import typingsSlinky.lodashDashDecorators.factoryCommonMod.LodashMethodDecorator
import typingsSlinky.lodashDashDecorators.sharedMod.ThrottleOptions
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/throttleAll", JSImport.Namespace)
@js.native
object throttleAllMod extends js.Object {
  def ThrottleAll(): LodashMethodDecorator = js.native
  def ThrottleAll(wait: Double): LodashMethodDecorator = js.native
  def ThrottleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def throttleAll(): LodashMethodDecorator = js.native
  def throttleAll(wait: Double): LodashMethodDecorator = js.native
  def throttleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
}

