package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-top`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-top`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-left`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-right`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.bottom
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/position", JSImport.Namespace)
@js.native
object positionMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-top`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-top`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-right`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-left`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.bottom
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.top
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
  */
  trait Position extends js.Object
  
  def getPositionIgnoreAngles(position: Position): left | right | bottom | top = js.native
  def isPositionHorizontal(position: Position): Boolean = js.native
  def isPositionVertical(position: Position): Boolean = js.native
  @js.native
  object Position extends js.Object {
    var BOTTOM: bottom = js.native
    var BOTTOM_LEFT: `bottom-left` = js.native
    var BOTTOM_RIGHT: `bottom-right` = js.native
    var LEFT: left = js.native
    var LEFT_BOTTOM: `left-bottom` = js.native
    var LEFT_TOP: `left-top` = js.native
    var RIGHT: right = js.native
    var RIGHT_BOTTOM: `right-bottom` = js.native
    var RIGHT_TOP: `right-top` = js.native
    var TOP: top = js.native
    var TOP_LEFT: `top-left` = js.native
    var TOP_RIGHT: `top-right` = js.native
  }
  
}

