package typingsSlinky.agGrid.dateFilterMod

import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.dateComponentMod.IDate
import typingsSlinky.agGrid.dateComponentMod.IDateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/dateFilter", "DefaultDateComponent")
@js.native
class DefaultDateComponent ()
  extends Component
     with IDate {
  var eDateInput: js.Any = js.native
  var listener: js.Any = js.native
  /** Returns the current date represented by this editor */
  /* CompleteClass */
  override def getDate(): js.Date = js.native
  @JSName("init")
  def init_MDefaultDateComponent(params: IDateParams): Unit = js.native
  /** Sets the date represented by this component */
  /* CompleteClass */
  override def setDate(date: js.Date): Unit = js.native
}

