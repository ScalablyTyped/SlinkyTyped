package typingsSlinky.lodashDashDecorators

import typingsSlinky.lodashDashDecorators.factoryCommonMod.LodashMethodDecorator
import typingsSlinky.lodashDashDecorators.factoryCommonMod.ResolvableFunction
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/wrap", JSImport.Namespace)
@js.native
object wrapMod extends js.Object {
  def Wrap(): LodashMethodDecorator = js.native
  def Wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def wrap(): LodashMethodDecorator = js.native
  def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
}

