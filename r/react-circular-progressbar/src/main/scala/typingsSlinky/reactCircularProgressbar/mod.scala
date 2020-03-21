package typingsSlinky.reactCircularProgressbar

import slinky.core.facade.ReactElement
import typingsSlinky.reactCircularProgressbar.circularProgressbarMod.default
import typingsSlinky.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-circular-progressbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CircularProgressbar () extends default
  
  def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): ReactElement = js.native
  def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: AnonBackgroundColor
  ): CircularProgressbarStyles = js.native
  /* static members */
  @js.native
  object CircularProgressbar extends js.Object {
    var defaultProps: CircularProgressbarDefaultProps = js.native
  }
  
}

