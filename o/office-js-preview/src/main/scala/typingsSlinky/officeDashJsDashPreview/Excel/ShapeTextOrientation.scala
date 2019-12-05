package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextOrientation extends js.Object

/**
  *
  * Specifies the orientation for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextOrientation")
@js.native
object ShapeTextOrientation extends js.Object {
  @js.native
  sealed trait eastAsianVertical extends ShapeTextOrientation
  
  @js.native
  sealed trait horizontal extends ShapeTextOrientation
  
  @js.native
  sealed trait mongolianVertical extends ShapeTextOrientation
  
  @js.native
  sealed trait vertical extends ShapeTextOrientation
  
  @js.native
  sealed trait vertical270 extends ShapeTextOrientation
  
  @js.native
  sealed trait wordArtVertical extends ShapeTextOrientation
  
  @js.native
  sealed trait wordArtVerticalRTL extends ShapeTextOrientation
  
  /* "EastAsianVertical" */ val eastAsianVertical: typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextOrientation.eastAsianVertical with String = js.native
  /* "Horizontal" */ val horizontal: typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextOrientation.horizontal with String = js.native
  /* "MongolianVertical" */ val mongolianVertical: typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextOrientation.mongolianVertical with String = js.native
  /* "Vertical" */ val vertical: typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextOrientation.vertical with String = js.native
  /* "Vertical270" */ val vertical270: typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextOrientation.vertical270 with String = js.native
  /* "WordArtVertical" */ val wordArtVertical: typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextOrientation.wordArtVertical with String = js.native
  /* "WordArtVerticalRTL" */ val wordArtVerticalRTL: typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextOrientation.wordArtVerticalRTL with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextOrientation with String] = js.native
}

