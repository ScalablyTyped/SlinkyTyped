package typingsSlinky.lodashDecorators

import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/partial", JSImport.Namespace)
@js.native
object partialMod extends js.Object {
  @JSName("Partial")
  def Partial_(partials: js.Any*): PropertyDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def partial(partials: js.Any*): PropertyDecorator = js.native
}

