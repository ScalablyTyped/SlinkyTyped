package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.ContentDistribution
  - typingsSlinky.csstype.mod.ContentPosition
  - typingsSlinky.csstype.csstypeStrings.baseline
  - typingsSlinky.csstype.csstypeStrings.normal
  - java.lang.String
*/
trait AlignContentProperty extends js.Object

object AlignContentProperty {
  @scala.inline
  def baseline: typingsSlinky.csstype.csstypeStrings.baseline = "baseline".asInstanceOf[typingsSlinky.csstype.csstypeStrings.baseline]
  @scala.inline
  def normal: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  implicit def apply(value: ContentDistribution): AlignContentProperty = value.asInstanceOf[AlignContentProperty]
  @scala.inline
  implicit def apply(value: ContentPosition): AlignContentProperty = value.asInstanceOf[AlignContentProperty]
  @scala.inline
  implicit def apply(value: Globals): AlignContentProperty = value.asInstanceOf[AlignContentProperty]
  @scala.inline
  implicit def apply(value: String): AlignContentProperty = value.asInstanceOf[AlignContentProperty]
}

