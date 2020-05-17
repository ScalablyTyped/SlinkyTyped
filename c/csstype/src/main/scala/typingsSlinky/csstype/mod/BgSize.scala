package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TLength
  - typingsSlinky.csstype.csstypeStrings.auto
  - typingsSlinky.csstype.csstypeStrings.contain
  - typingsSlinky.csstype.csstypeStrings.cover
  - java.lang.String
*/
trait BgSize[TLength]
  extends BackgroundSizeProperty[TLength]
     with MaskSizeProperty[TLength]
     with WebkitMaskSizeProperty[TLength]

object BgSize {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  def contain[TLength]: typingsSlinky.csstype.csstypeStrings.contain = "contain".asInstanceOf[typingsSlinky.csstype.csstypeStrings.contain]
  @scala.inline
  def cover[TLength]: typingsSlinky.csstype.csstypeStrings.cover = "cover".asInstanceOf[typingsSlinky.csstype.csstypeStrings.cover]
  @scala.inline
  implicit def apply[TLength](value: String): BgSize[TLength] = value.asInstanceOf[BgSize[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): BgSize[TLength] = value.asInstanceOf[BgSize[TLength]]
}

