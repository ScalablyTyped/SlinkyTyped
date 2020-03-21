package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/delay", JSImport.Namespace)
@js.native
object delayMod extends js.Object {
  @JSName("Delay")
  def Delay_(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def delay(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
}

