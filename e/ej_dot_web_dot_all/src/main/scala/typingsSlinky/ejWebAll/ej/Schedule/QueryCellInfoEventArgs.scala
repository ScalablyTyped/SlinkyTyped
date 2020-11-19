package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryCellInfoEventArgs extends js.Object {
  
  /** Returns the current appointment data.
    */
  var appointment: js.UndefOr[js.Any] = js.native
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the currently rendering cell information.
    */
  var cell: js.UndefOr[js.Any] = js.native
  
  /** Returns the cell type which is currently rendering on the Scheduler.
    */
  var cellType: js.UndefOr[String] = js.native
  
  /** Returns the start date of the currently rendering appointment.
    */
  var currentAppointmentDate: js.UndefOr[js.Any] = js.native
  
  /** Returns the currently rendering date information.
    */
  var currentDay: js.UndefOr[js.Any] = js.native
  
  /** Returns the currently rendering DOM element.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the name of the currently rendering element on the scheduler.
    */
  var requestType: js.UndefOr[String] = js.native
  
  /** Returns the currently rendering resource details.
    */
  var resource: js.UndefOr[js.Any] = js.native
}
object QueryCellInfoEventArgs {
  
  @scala.inline
  def apply(): QueryCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCellInfoEventArgs]
  }
  
  @scala.inline
  implicit class QueryCellInfoEventArgsOps[Self <: QueryCellInfoEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppointment(value: js.Any): Self = this.set("appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointment: Self = this.set("appointment", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setCellType(value: String): Self = this.set("cellType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellType: Self = this.set("cellType", js.undefined)
    
    @scala.inline
    def setCurrentAppointmentDate(value: js.Any): Self = this.set("currentAppointmentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentAppointmentDate: Self = this.set("currentAppointmentDate", js.undefined)
    
    @scala.inline
    def setCurrentDay(value: js.Any): Self = this.set("currentDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDay: Self = this.set("currentDay", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    
    @scala.inline
    def setResource(value: js.Any): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
