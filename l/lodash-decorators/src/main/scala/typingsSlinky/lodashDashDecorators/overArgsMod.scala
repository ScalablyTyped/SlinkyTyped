package typingsSlinky.lodashDashDecorators

import typingsSlinky.lodashDashDecorators.factoryCommonMod.LodashMethodDecorator
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/overArgs", JSImport.Namespace)
@js.native
object overArgsMod extends js.Object {
  def OverArgs(transforms: js.Function*): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def overArgs(transforms: js.Function*): LodashMethodDecorator = js.native
}

