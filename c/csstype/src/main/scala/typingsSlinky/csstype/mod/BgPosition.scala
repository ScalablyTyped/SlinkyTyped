package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TLength
  - typingsSlinky.csstype.csstypeStrings.bottom
  - typingsSlinky.csstype.csstypeStrings.center
  - typingsSlinky.csstype.csstypeStrings.left
  - typingsSlinky.csstype.csstypeStrings.right
  - typingsSlinky.csstype.csstypeStrings.top
  - java.lang.String
*/
trait BgPosition[TLength]
  extends FinalBgLayer[TLength]
     with BackgroundPositionProperty[TLength]

object BgPosition {
  @scala.inline
  def bottom[TLength]: typingsSlinky.csstype.csstypeStrings.bottom = "bottom".asInstanceOf[typingsSlinky.csstype.csstypeStrings.bottom]
  @scala.inline
  def center[TLength]: typingsSlinky.csstype.csstypeStrings.center = "center".asInstanceOf[typingsSlinky.csstype.csstypeStrings.center]
  @scala.inline
  def left[TLength]: typingsSlinky.csstype.csstypeStrings.left = "left".asInstanceOf[typingsSlinky.csstype.csstypeStrings.left]
  @scala.inline
  def right[TLength]: typingsSlinky.csstype.csstypeStrings.right = "right".asInstanceOf[typingsSlinky.csstype.csstypeStrings.right]
  @scala.inline
  def top[TLength]: typingsSlinky.csstype.csstypeStrings.top = "top".asInstanceOf[typingsSlinky.csstype.csstypeStrings.top]
  @scala.inline
  implicit def apply[TLength](value: String): BgPosition[TLength] = value.asInstanceOf[BgPosition[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): BgPosition[TLength] = value.asInstanceOf[BgPosition[TLength]]
}

