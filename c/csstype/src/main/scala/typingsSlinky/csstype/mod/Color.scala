package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.NamedColor
  - typingsSlinky.csstype.mod.DeprecatedSystemColor
  - typingsSlinky.csstype.csstypeStrings.currentcolor_
  - java.lang.String
*/
trait Color
  extends Paint
     with BackgroundColorProperty
     with BorderBlockColorProperty
     with BorderBlockEndColorProperty
     with BorderBlockEndProperty[js.Any]
     with BorderBlockProperty[js.Any]
     with BorderBlockStartColorProperty
     with BorderBlockStartProperty[js.Any]
     with BorderBottomColorProperty
     with BorderBottomProperty[js.Any]
     with BorderColorProperty
     with BorderInlineColorProperty
     with BorderInlineEndColorProperty
     with BorderInlineEndProperty[js.Any]
     with BorderInlineProperty[js.Any]
     with BorderInlineStartColorProperty
     with BorderInlineStartProperty[js.Any]
     with BorderLeftColorProperty
     with BorderLeftProperty[js.Any]
     with BorderProperty[js.Any]
     with BorderRightColorProperty
     with BorderRightProperty[js.Any]
     with BorderTopColorProperty
     with BorderTopProperty[js.Any]
     with CaretColorProperty
     with ColorProperty
     with ColumnRuleColorProperty
     with ColumnRuleProperty[js.Any]
     with FinalBgLayer[js.Any]
     with FloodColorProperty
     with LightingColorProperty
     with MozBorderBottomColorsProperty
     with MozBorderLeftColorsProperty
     with MozBorderRightColorsProperty
     with MozBorderTopColorsProperty
     with MsScrollbar3dlightColorProperty
     with MsScrollbarArrowColorProperty
     with MsScrollbarBaseColorProperty
     with MsScrollbarDarkshadowColorProperty
     with MsScrollbarFaceColorProperty
     with MsScrollbarHighlightColorProperty
     with MsScrollbarShadowColorProperty
     with MsScrollbarTrackColorProperty
     with OutlineColorProperty
     with OutlineProperty[js.Any]
     with ScrollbarColorProperty
     with StopColorProperty
     with TextDecorationColorProperty
     with TextDecorationProperty
     with TextEmphasisColorProperty
     with TextEmphasisProperty
     with WebkitBorderBeforeColorProperty
     with WebkitBorderBeforeProperty[js.Any]
     with WebkitTapHighlightColorProperty
     with WebkitTextFillColorProperty
     with WebkitTextStrokeColorProperty
     with WebkitTextStrokeProperty[js.Any]

object Color {
  @scala.inline
  def currentcolor_ : typingsSlinky.csstype.csstypeStrings.currentcolor_ = "currentcolor".asInstanceOf[typingsSlinky.csstype.csstypeStrings.currentcolor_]
  @scala.inline
  implicit def apply(value: DeprecatedSystemColor): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: NamedColor): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
}

