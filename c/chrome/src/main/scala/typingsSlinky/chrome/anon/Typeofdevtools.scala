package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdevtools extends StObject {
  
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
  implicit class TypeofdevtoolsMutableBuilder[Self <: Typeofdevtools] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInspectedWindow(value: TypeofinspectedWindow): Self = StObject.set(x, "inspectedWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: Typeofnetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanels(value: Typeofpanels): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
  }
}
