package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

/**
  *
  * Specifies the type of a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeType")
@js.native
object ShapeType extends js.Object {
  @js.native
  sealed trait geometricShape extends ShapeType
  
  @js.native
  sealed trait group extends ShapeType
  
  @js.native
  sealed trait image extends ShapeType
  
  @js.native
  sealed trait line extends ShapeType
  
  @js.native
  sealed trait unsupported extends ShapeType
  
  /* "GeometricShape" */ val geometricShape: typingsSlinky.officeDashJsDashPreview.Excel.ShapeType.geometricShape with String = js.native
  /* "Group" */ val group: typingsSlinky.officeDashJsDashPreview.Excel.ShapeType.group with String = js.native
  /* "Image" */ val image: typingsSlinky.officeDashJsDashPreview.Excel.ShapeType.image with String = js.native
  /* "Line" */ val line: typingsSlinky.officeDashJsDashPreview.Excel.ShapeType.line with String = js.native
  /* "Unsupported" */ val unsupported: typingsSlinky.officeDashJsDashPreview.Excel.ShapeType.unsupported with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeType with String] = js.native
}

