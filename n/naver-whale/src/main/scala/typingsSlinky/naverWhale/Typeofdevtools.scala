package typingsSlinky.naverWhale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdevtools extends js.Object {
  ////////////////////
  // Dev Tools - Inspected Window
  ////////////////////
  /**
    * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    * Availability: Since Chrome 18.
    */
  val inspectedWindow: TypeofinspectedWindow = js.native
  ////////////////////
  // Dev Tools - Network
  ////////////////////
  /**
    * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    * Availability: Since Chrome 18.
    */
  val network: Typeofnetwork = js.native
  ////////////////////
  // Dev Tools - Panels
  ////////////////////
  /**
    * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    * Availability: Since Chrome 18.
    */
  val panels: Typeofpanels = js.native
}

object Typeofdevtools {
  @scala.inline
  def apply(inspectedWindow: TypeofinspectedWindow, network: Typeofnetwork, panels: Typeofpanels): Typeofdevtools = {
    val __obj = js.Dynamic.literal(inspectedWindow = inspectedWindow.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdevtools]
  }
  @scala.inline
  implicit class TypeofdevtoolsOps[Self <: Typeofdevtools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInspectedWindow(value: TypeofinspectedWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectedWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetwork(value: Typeofnetwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanels(value: Typeofpanels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

