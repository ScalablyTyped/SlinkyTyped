package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnSizingMode extends StObject
@JSImport("azdata", "ColumnSizingMode")
@js.native
object ColumnSizingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnSizingMode with Double] = js.native
  
  // all columns will be sized to fit in viewable space, no horiz scroll bar
  @js.native
  sealed trait AutoFit extends ColumnSizingMode
  /* 1 */ val AutoFit: typingsSlinky.azdata.mod.ColumnSizingMode.AutoFit with Double = js.native
  
  // columns will be ForceFit up to a certain number; currently 3.  At 4 or more the behavior will switch to NO force fit
  @js.native
  sealed trait DataFit extends ColumnSizingMode
  /* 2 */ val DataFit: typingsSlinky.azdata.mod.ColumnSizingMode.DataFit with Double = js.native
  
  @js.native
  sealed trait ForceFit extends ColumnSizingMode
  /* 0 */ val ForceFit: typingsSlinky.azdata.mod.ColumnSizingMode.ForceFit with Double = js.native
}
