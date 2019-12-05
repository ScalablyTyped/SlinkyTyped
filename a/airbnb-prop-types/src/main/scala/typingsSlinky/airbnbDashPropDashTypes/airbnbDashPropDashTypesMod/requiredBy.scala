package typingsSlinky.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import typingsSlinky.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "requiredBy")
@js.native
object requiredBy extends js.Object {
  def apply[P](requiredByPropName: String, propType: Validator[P]): Requireable[P] = js.native
  def apply[P](requiredByPropName: String, propType: Validator[P], defaultValue: js.Any): Requireable[P] = js.native
}

