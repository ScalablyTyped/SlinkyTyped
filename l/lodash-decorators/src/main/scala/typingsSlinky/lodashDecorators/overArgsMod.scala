package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overArgsMod {
  
  @JSImport("lodash-decorators/overArgs", JSImport.Default)
  @js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  
  @JSImport("lodash-decorators/overArgs", "OverArgs")
  @js.native
  def OverArgs_(transforms: js.Function*): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators/overArgs", "overArgs")
  @js.native
  def overArgs(transforms: js.Function*): LodashMethodDecorator = js.native
}
