package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.csstypeStrings.dashed
  - typingsSlinky.csstype.csstypeStrings.dotted
  - typingsSlinky.csstype.csstypeStrings.double
  - typingsSlinky.csstype.csstypeStrings.groove
  - typingsSlinky.csstype.csstypeStrings.hidden
  - typingsSlinky.csstype.csstypeStrings.inset
  - typingsSlinky.csstype.csstypeStrings.none
  - typingsSlinky.csstype.csstypeStrings.outset
  - typingsSlinky.csstype.csstypeStrings.ridge
  - typingsSlinky.csstype.csstypeStrings.solid
*/
trait LineStyle
  extends _BorderBlockEndProperty[js.Any]
     with _BorderBlockProperty[js.Any]
     with _BorderBlockStartProperty[js.Any]
     with _BorderBottomProperty[js.Any]
     with _BorderInlineEndProperty[js.Any]
     with _BorderInlineProperty[js.Any]
     with _BorderInlineStartProperty[js.Any]
     with _BorderLeftProperty[js.Any]
     with _BorderProperty[js.Any]
     with _BorderRightProperty[js.Any]
     with _BorderStyleProperty
     with _BorderTopProperty[js.Any]
     with _ColumnRuleProperty[js.Any]
     with _ColumnRuleStyleProperty
     with _OutlineProperty[js.Any]
     with _OutlineStyleProperty
     with _WebkitBorderBeforeProperty[js.Any]
     with _WebkitBorderBeforeStyleProperty

object LineStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typingsSlinky.csstype.csstypeStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typingsSlinky.csstype.csstypeStrings.dotted = this.cast("dotted")
  @scala.inline
  def double: typingsSlinky.csstype.csstypeStrings.double = this.cast("double")
  @scala.inline
  def groove: typingsSlinky.csstype.csstypeStrings.groove = this.cast("groove")
  @scala.inline
  def hidden: typingsSlinky.csstype.csstypeStrings.hidden = this.cast("hidden")
  @scala.inline
  def inset: typingsSlinky.csstype.csstypeStrings.inset = this.cast("inset")
  @scala.inline
  def none: typingsSlinky.csstype.csstypeStrings.none = this.cast("none")
  @scala.inline
  def outset: typingsSlinky.csstype.csstypeStrings.outset = this.cast("outset")
  @scala.inline
  def ridge: typingsSlinky.csstype.csstypeStrings.ridge = this.cast("ridge")
  @scala.inline
  def solid: typingsSlinky.csstype.csstypeStrings.solid = this.cast("solid")
}

