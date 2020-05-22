package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Gradient object.
  */
@JSGlobal("paper.Gradient")
@js.native
class Gradient ()
  extends typingsSlinky.paper.paper.Gradient {
  /** 
    * Specifies whether the gradient is radial or linear.
    */
  /* CompleteClass */
  override var radial: Boolean = js.native
  /** 
    * The gradient stops on the gradient ramp.
    */
  /* CompleteClass */
  override var stops: js.Array[typingsSlinky.paper.paper.GradientStop] = js.native
  /** 
    * Checks whether the gradient is equal to the supplied gradient.
    * 
    * @return true if they are equal
    */
  /* CompleteClass */
  override def equals(gradient: typingsSlinky.paper.paper.Gradient): Boolean = js.native
}

