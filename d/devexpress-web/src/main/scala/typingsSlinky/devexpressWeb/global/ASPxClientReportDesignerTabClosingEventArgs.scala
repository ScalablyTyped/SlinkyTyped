package typingsSlinky.devexpressWeb.global

import typingsSlinky.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosing event.
  */
@JSGlobal("ASPxClientReportDesignerTabClosingEventArgs")
@js.native
class ASPxClientReportDesignerTabClosingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientReportDesignerTabClosingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerTabClosingEventArgs class with the specified settings.
    * @param tab An object that specifies the report tab. This value is assigned to the ASPxClientReportDesignerTabEventArgs.Tab property.
    * @param readyToClose A JQuery Deferred object, which when resolved, forces the report tab to be closed. This value is assigned to the ASPxClientReportDesignerTabClosingEventArgs.ReadyToClose property.
    */
  def this(tab: typingsSlinky.devexpressWeb.ASPxDesignerNavigateTab, readyToClose: JQueryDeferred[_]) = this()
}
