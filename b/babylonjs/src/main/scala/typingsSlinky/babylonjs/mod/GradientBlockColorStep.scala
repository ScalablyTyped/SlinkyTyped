package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "GradientBlockColorStep")
@js.native
class GradientBlockColorStep protected ()
  extends typingsSlinky.babylonjs.legacyMod.GradientBlockColorStep {
  /**
    * Creates a new GradientBlockColorStep
    * @param step defines a value indicating which step this color is associated with (between 0 and 1)
    * @param color defines the color associated with this step
    */
  def this(
    /**
    * Gets or sets a value indicating which step this color is associated with (between 0 and 1)
    */
  step: Double,
    /**
    * Gets or sets the color associated with this step
    */
  color: typingsSlinky.babylonjs.mathColorMod.Color3
  ) = this()
}
