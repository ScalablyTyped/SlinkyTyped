package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("airbnb-prop-types", "requiredBy")
@js.native
object requiredBy extends js.Object {
  
  def apply[P](requiredByPropName: String, propType: Validator[P]): Requireable[P] = js.native
  def apply[P](requiredByPropName: String, propType: Validator[P], defaultValue: js.Any): Requireable[P] = js.native
}
