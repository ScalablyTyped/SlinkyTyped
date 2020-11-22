package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LinkedDataTypeRefreshModeChanged
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Local
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Manual
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OnLoad
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Periodic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Remote
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents information about a newly added linked data type, such as source and ID.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait RefreshModeChangedEventArgs extends js.Object {
  
  /**
    *
    * The linked data type refresh mode.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshMode: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic = js.native
  
  /**
    *
    * The unique id of the object whose refresh mode was changed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: Double = js.native
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: LinkedDataTypeRefreshModeChanged = js.native
}
object RefreshModeChangedEventArgs {
  
  @scala.inline
  def apply(
    refreshMode: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic,
    serviceId: Double,
    source: EventSource | Local | Remote,
    `type`: LinkedDataTypeRefreshModeChanged
  ): RefreshModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(refreshMode = refreshMode.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshModeChangedEventArgs]
  }
  
  @scala.inline
  implicit class RefreshModeChangedEventArgsOps[Self <: RefreshModeChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRefreshMode(value: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic): Self = this.set("refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: Double): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LinkedDataTypeRefreshModeChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
