package typingsSlinky.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.`space-around`
  - typings.csstype.csstypeStrings.`space-between`
  - typings.csstype.csstypeStrings.`space-evenly`
  - typings.csstype.csstypeStrings.stretch
*/
trait ContentDistribution
  extends _AlignContentProperty
     with _JustifyContentProperty
     with _PlaceContentProperty

object ContentDistribution {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `space-around`: typingsSlinky.csstype.csstypeStrings.`space-around` = this.cast("space-around")
  @scala.inline
  def `space-between`: typingsSlinky.csstype.csstypeStrings.`space-between` = this.cast("space-between")
  @scala.inline
  def `space-evenly`: typingsSlinky.csstype.csstypeStrings.`space-evenly` = this.cast("space-evenly")
  @scala.inline
  def stretch: typingsSlinky.csstype.csstypeStrings.stretch = this.cast("stretch")
}

