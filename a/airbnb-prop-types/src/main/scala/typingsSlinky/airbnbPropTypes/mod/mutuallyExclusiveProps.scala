package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("airbnb-prop-types", "mutuallyExclusiveProps")
@js.native
object mutuallyExclusiveProps extends js.Object {
  
  def apply[T](propType: Requireable[T], propNames: String*): Requireable[T] = js.native
  def apply[T](// tslint:disable-next-line:unified-signatures
  propType: Validator[T], propNames: String*): Requireable[T] = js.native
}
