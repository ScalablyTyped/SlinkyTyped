package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TLength
  - typingsSlinky.csstype.csstypeStrings.auto
  - java.lang.String
*/
trait ViewportLength[TLength]
  extends ViewportHeightProperty[TLength]
     with ViewportWidthProperty[TLength]

object ViewportLength {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: String): ViewportLength[TLength] = value.asInstanceOf[ViewportLength[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): ViewportLength[TLength] = value.asInstanceOf[ViewportLength[TLength]]
}

