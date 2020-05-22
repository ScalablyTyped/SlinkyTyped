package typingsSlinky.devexpressWeb.global

import typingsSlinky.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * Specifies whether or not the event was handled.
    */
  /* CompleteClass */
  override var Handled: Boolean = js.native
  /**
    * Specifies the JQuery Deferred object, which when resolved, forces the report tab to be closed.
    */
  /* CompleteClass */
  override var ReadyToClose: JQueryDeferred[_] = js.native
  /**
    * Specifies the report tab currently being processed.
    */
  /* CompleteClass */
  override var Tab: typingsSlinky.devexpressWeb.ASPxDesignerNavigateTab = js.native
}

