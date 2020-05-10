package typingsSlinky.officeJsPreview.Office

import typingsSlinky.officeJsPreview.Office.MailboxEnums.OWAView
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OneColumn
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeColumns
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TwoColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides diagnostic information to an Outlook add-in.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait Diagnostics extends js.Object {
  /**
    * Gets a string that represents the current view of Outlook on the web.
    *
    * The returned string can be one of the following values: `OneColumn`, `TwoColumns`, or `ThreeColumns`.
    *
    * If the host application is not Outlook on the web, then accessing this property results in undefined.
    *
    * Outlook on the web has three views that correspond to the width of the screen and the window, and the number of columns that can be displayed:
    *
    * - `OneColumn`, which is displayed when the screen is narrow. Outlook on the web uses this single-column layout on the entire screen of a 
    * smartphone.
    *
    * - `TwoColumns`, which is displayed when the screen is wider. Outlook on the web uses this view on most tablets.
    *
    * - `ThreeColumns`, which is displayed when the screen is wide. For example, Outlook on the web uses this view in a full screen window on a 
    * desktop computer.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var OWAView: typingsSlinky.officeJsPreview.Office.MailboxEnums.OWAView | OneColumn | TwoColumns | ThreeColumns = js.native
  /**
    * Gets a string that represents the name of the host application.
    *
    * A string that can be one of the following values: `Outlook`, `OutlookWebApp`, `OutlookIOS`, or `OutlookAndroid`.
    *
    * **Note**: The `Outlook` value is returned for Outlook on desktop clients (i.e., Windows and Mac).
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var hostName: String = js.native
  /**
    * Gets a string that represents the version of either the host application or the Exchange Server (e.g., "15.0.468.0").
    *
    * If the mail add-in is running in Outlook on a desktop or mobile client, the `hostVersion` property returns the version of the host 
    * application, Outlook. In Outlook on the web, the property returns the version of the Exchange Server.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var hostVersion: String = js.native
}

object Diagnostics {
  @scala.inline
  def apply(OWAView: OWAView | OneColumn | TwoColumns | ThreeColumns, hostName: String, hostVersion: String): Diagnostics = {
    val __obj = js.Dynamic.literal(OWAView = OWAView.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], hostVersion = hostVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostics]
  }
  @scala.inline
  implicit class DiagnosticsOps[Self <: Diagnostics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOWAView(value: OWAView | OneColumn | TwoColumns | ThreeColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OWAView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

