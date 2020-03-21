package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "disallowedIf")
@js.native
object disallowedIf extends js.Object {
  def apply[T](propType: Requireable[T], otherPropName: String, otherPropType: Validator[_]): Requireable[T] = js.native
}

