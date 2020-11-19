package typingsSlinky.reactCircularProgressbar

import slinky.core.facade.ReactElement
import typingsSlinky.reactCircularProgressbar.anon.BackgroundColor
import typingsSlinky.reactCircularProgressbar.circularProgressbarMod.default
import typingsSlinky.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-circular-progressbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): ReactElement = js.native
  
  def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: BackgroundColor
  ): CircularProgressbarStyles = js.native
  
  @js.native
  class CircularProgressbar () extends default
  /* static members */
  @js.native
  object CircularProgressbar extends js.Object {
    
    var defaultProps: CircularProgressbarDefaultProps = js.native
  }
}
