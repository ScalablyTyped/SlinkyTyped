package typingsSlinky.agDashGrid.distLibFilterDateFilterMod

import typingsSlinky.agDashGrid.distLibRenderingDateComponentMod.IDate
import typingsSlinky.agDashGrid.distLibRenderingDateComponentMod.IDateParams
import typingsSlinky.agDashGrid.distLibWidgetsComponentMod.Component
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

