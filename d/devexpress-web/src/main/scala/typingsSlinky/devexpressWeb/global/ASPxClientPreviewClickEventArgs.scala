package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.PreviewClick and ASPxClientReportDesigner.PreviewClick events.
  */
@JSGlobal("ASPxClientPreviewClickEventArgs")
@js.native
class ASPxClientPreviewClickEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientPreviewClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPreviewClickEventArgs class with the specified settings.
    * @param pageIndex An integer value that specifies the zero-based index of the page that has been clicked. This value is assigned to the ASPxClientPreviewClickEventArgs.PageIndex property.
    * @param brick An object that provides information on a visual brick representing the content of a report control that has been clicked. This value is assigned to the ASPxClientPreviewClickEventArgs.Brick property.
    */
  def this(pageIndex: Double, brick: typingsSlinky.devexpressWeb.ASPxClientWebDocumentViewerBrick) = this()
}
