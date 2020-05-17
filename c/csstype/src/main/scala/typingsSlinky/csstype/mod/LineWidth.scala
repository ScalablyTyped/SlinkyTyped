package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TLength
  - typingsSlinky.csstype.csstypeStrings.medium
  - typingsSlinky.csstype.csstypeStrings.thick
  - typingsSlinky.csstype.csstypeStrings.thin
*/
trait LineWidth[TLength]
  extends BorderBlockEndProperty[TLength]
     with BorderBlockEndWidthProperty[TLength]
     with BorderBlockProperty[TLength]
     with BorderBlockStartProperty[TLength]
     with BorderBlockStartWidthProperty[TLength]
     with BorderBlockWidthProperty[TLength]
     with BorderBottomProperty[TLength]
     with BorderBottomWidthProperty[TLength]
     with BorderInlineEndProperty[TLength]
     with BorderInlineEndWidthProperty[TLength]
     with BorderInlineProperty[TLength]
     with BorderInlineStartProperty[TLength]
     with BorderInlineStartWidthProperty[TLength]
     with BorderInlineWidthProperty[TLength]
     with BorderLeftProperty[TLength]
     with BorderLeftWidthProperty[TLength]
     with BorderProperty[TLength]
     with BorderRightProperty[TLength]
     with BorderRightWidthProperty[TLength]
     with BorderTopProperty[TLength]
     with BorderTopWidthProperty[TLength]
     with BorderWidthProperty[TLength]
     with ColumnRuleProperty[TLength]
     with ColumnRuleWidthProperty[TLength]
     with OutlineProperty[TLength]
     with OutlineWidthProperty[TLength]
     with WebkitBorderBeforeProperty[TLength]
     with WebkitBorderBeforeWidthProperty[TLength]

object LineWidth {
  @scala.inline
  def medium[TLength]: typingsSlinky.csstype.csstypeStrings.medium = "medium".asInstanceOf[typingsSlinky.csstype.csstypeStrings.medium]
  @scala.inline
  def thick[TLength]: typingsSlinky.csstype.csstypeStrings.thick = "thick".asInstanceOf[typingsSlinky.csstype.csstypeStrings.thick]
  @scala.inline
  def thin[TLength]: typingsSlinky.csstype.csstypeStrings.thin = "thin".asInstanceOf[typingsSlinky.csstype.csstypeStrings.thin]
  @scala.inline
  implicit def apply[TLength](value: TLength): LineWidth[TLength] = value.asInstanceOf[LineWidth[TLength]]
}

