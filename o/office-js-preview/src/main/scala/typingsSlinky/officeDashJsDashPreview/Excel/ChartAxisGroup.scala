package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisGroup extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisGroup")
@js.native
object ChartAxisGroup extends js.Object {
  @js.native
  sealed trait primary extends ChartAxisGroup
  
  @js.native
  sealed trait secondary extends ChartAxisGroup
  
  /* "Primary" */ val primary: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisGroup.primary with String = js.native
  /* "Secondary" */ val secondary: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisGroup.secondary with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisGroup with String] = js.native
}

