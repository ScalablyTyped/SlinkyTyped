package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
import typingsSlinky.lodashDecorators.commonMod.ResolvableFunction
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/wrap", JSImport.Namespace)
@js.native
object wrapMod extends js.Object {
  
  @JSName("Wrap")
  def Wrap_(): LodashMethodDecorator = js.native
  @JSName("Wrap")
  def Wrap_(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
  
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  
  def wrap(): LodashMethodDecorator = js.native
  def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
}
