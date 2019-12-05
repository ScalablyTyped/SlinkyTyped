package typingsSlinky.atHigButton.atHigButtonMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atHigButton.atHigButtonStrings.flat
import typingsSlinky.atHigButton.atHigButtonStrings.outline
import typingsSlinky.atHigButton.atHigButtonStrings.primary
import typingsSlinky.atHigButton.atHigButtonStrings.secondary
import typingsSlinky.atHigButton.atHigButtonStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var FLAT: flat
  var OUTLINE: outline
  /** @deprecated */
  var PRIMARY: primary
  /** @deprecated */
  var SECONDARY: secondary
  var SOLID: solid
}

object Types {
  @scala.inline
  def apply(FLAT: flat, OUTLINE: outline, PRIMARY: primary, SECONDARY: secondary, SOLID: solid): Types = {
    val __obj = js.Dynamic.literal(FLAT = FLAT.asInstanceOf[js.Any], OUTLINE = OUTLINE.asInstanceOf[js.Any], PRIMARY = PRIMARY.asInstanceOf[js.Any], SECONDARY = SECONDARY.asInstanceOf[js.Any], SOLID = SOLID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Types]
  }
}

@JSImport("@hig/button", "types")
@js.native
object types extends TopLevel[Types]

