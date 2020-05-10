package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.airbnbPropTypes.AnonStripHOCs
import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "componentWithName")
@js.native
object componentWithName extends js.Object {
  def apply[T](name: String): Requireable[T] = js.native
  def apply[T](name: String, options: AnonStripHOCs): Requireable[T] = js.native
  def apply[T](name: js.RegExp): Requireable[T] = js.native
  def apply[T](name: js.RegExp, options: AnonStripHOCs): Requireable[T] = js.native
}

