package typingsSlinky.firefoxDashWebextDashBrowser.browser.webNavigation

import typingsSlinky.firefoxDashWebextDashBrowser.Anon_ErrorOccurredFrameId
import typingsSlinky.firefoxDashWebextDashBrowser.Anon_TabIdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.webNavigation.getAllFrames")
@js.native
object getAllFrames extends js.Object {
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  def apply(details: Anon_TabIdNumber): js.Promise[js.Array[Anon_ErrorOccurredFrameId]] = js.native
}

