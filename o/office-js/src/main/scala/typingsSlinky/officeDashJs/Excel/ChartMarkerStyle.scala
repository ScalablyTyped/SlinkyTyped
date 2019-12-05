package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMarkerStyle extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartMarkerStyle")
@js.native
object ChartMarkerStyle extends js.Object {
  @js.native
  sealed trait automatic extends ChartMarkerStyle
  
  @js.native
  sealed trait circle extends ChartMarkerStyle
  
  @js.native
  sealed trait dash extends ChartMarkerStyle
  
  @js.native
  sealed trait diamond extends ChartMarkerStyle
  
  @js.native
  sealed trait dot extends ChartMarkerStyle
  
  @js.native
  sealed trait invalid extends ChartMarkerStyle
  
  @js.native
  sealed trait none extends ChartMarkerStyle
  
  @js.native
  sealed trait picture extends ChartMarkerStyle
  
  @js.native
  sealed trait plus extends ChartMarkerStyle
  
  @js.native
  sealed trait square extends ChartMarkerStyle
  
  @js.native
  sealed trait star extends ChartMarkerStyle
  
  @js.native
  sealed trait triangle extends ChartMarkerStyle
  
  @js.native
  sealed trait x extends ChartMarkerStyle
  
  /* "Automatic" */ val automatic: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.automatic with String = js.native
  /* "Circle" */ val circle: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.circle with String = js.native
  /* "Dash" */ val dash: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.dash with String = js.native
  /* "Diamond" */ val diamond: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.diamond with String = js.native
  /* "Dot" */ val dot: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.dot with String = js.native
  /* "Invalid" */ val invalid: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.invalid with String = js.native
  /* "None" */ val none: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.none with String = js.native
  /* "Picture" */ val picture: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.picture with String = js.native
  /* "Plus" */ val plus: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.plus with String = js.native
  /* "Square" */ val square: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.square with String = js.native
  /* "Star" */ val star: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.star with String = js.native
  /* "Triangle" */ val triangle: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.triangle with String = js.native
  /* "X" */ val x: typingsSlinky.officeDashJs.Excel.ChartMarkerStyle.x with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMarkerStyle with String] = js.native
}

