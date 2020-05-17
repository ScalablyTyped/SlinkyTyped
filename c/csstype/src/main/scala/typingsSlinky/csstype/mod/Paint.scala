package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Color
  - typingsSlinky.csstype.csstypeStrings.child
  - typingsSlinky.csstype.csstypeStrings.`context-fill`
  - typingsSlinky.csstype.csstypeStrings.`context-stroke`
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait Paint
  extends FillProperty
     with StrokeProperty

object Paint {
  @scala.inline
  def child: typingsSlinky.csstype.csstypeStrings.child = "child".asInstanceOf[typingsSlinky.csstype.csstypeStrings.child]
  @scala.inline
  def `context-fill`: typingsSlinky.csstype.csstypeStrings.`context-fill` = "context-fill".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`context-fill`]
  @scala.inline
  def `context-stroke`: typingsSlinky.csstype.csstypeStrings.`context-stroke` = "context-stroke".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`context-stroke`]
  @scala.inline
  def none: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply(value: Color): Paint = value.asInstanceOf[Paint]
  @scala.inline
  implicit def apply(value: String): Paint = value.asInstanceOf[Paint]
}

