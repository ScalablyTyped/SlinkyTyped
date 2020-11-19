package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
import typingsSlinky.lodashDecorators.sharedMod.ThrottleOptions
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/throttleAll", JSImport.Namespace)
@js.native
object throttleAllMod extends js.Object {
  
  @JSName("ThrottleAll")
  def ThrottleAll_(): LodashMethodDecorator = js.native
  @JSName("ThrottleAll")
  def ThrottleAll_(wait: js.UndefOr[scala.Nothing], options: ThrottleOptions): LodashMethodDecorator = js.native
  @JSName("ThrottleAll")
  def ThrottleAll_(wait: Double): LodashMethodDecorator = js.native
  @JSName("ThrottleAll")
  def ThrottleAll_(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  
  def throttleAll(): LodashMethodDecorator = js.native
  def throttleAll(wait: js.UndefOr[scala.Nothing], options: ThrottleOptions): LodashMethodDecorator = js.native
  def throttleAll(wait: Double): LodashMethodDecorator = js.native
  def throttleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
}
