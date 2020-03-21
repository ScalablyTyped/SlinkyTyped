package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.csstypeStrings.`fill-box`
  - typingsSlinky.csstype.csstypeStrings.`margin-box`
  - typingsSlinky.csstype.csstypeStrings.`stroke-box`
  - typingsSlinky.csstype.csstypeStrings.`view-box`
  - typingsSlinky.csstype.csstypeStrings.`border-box`
  - typingsSlinky.csstype.csstypeStrings.`content-box`
  - typingsSlinky.csstype.csstypeStrings.`padding-box`
*/
trait GeometryBox
  extends _MaskLayer[js.Any]
     with _ClipPathProperty
     with _MaskClipProperty
     with _MaskOriginProperty
     with _OffsetPathProperty
     with _OffsetProperty[js.Any]

object GeometryBox {
  @scala.inline
  def `border-box`: typingsSlinky.csstype.csstypeStrings.`border-box` = this.cast("border-box")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `content-box`: typingsSlinky.csstype.csstypeStrings.`content-box` = this.cast("content-box")
  @scala.inline
  def `fill-box`: typingsSlinky.csstype.csstypeStrings.`fill-box` = this.cast("fill-box")
  @scala.inline
  def `margin-box`: typingsSlinky.csstype.csstypeStrings.`margin-box` = this.cast("margin-box")
  @scala.inline
  def `padding-box`: typingsSlinky.csstype.csstypeStrings.`padding-box` = this.cast("padding-box")
  @scala.inline
  def `stroke-box`: typingsSlinky.csstype.csstypeStrings.`stroke-box` = this.cast("stroke-box")
  @scala.inline
  def `view-box`: typingsSlinky.csstype.csstypeStrings.`view-box` = this.cast("view-box")
}

