package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.MoreButtonClicked client-side event.
  */
@JSGlobal("MoreButtonClickedEventArgs")
@js.native
class MoreButtonClickedEventArgs protected ()
  extends typingsSlinky.devexpressWeb.MoreButtonClickedEventArgs {
  /**
    * Initializes a new instance of MoreButtonClickedEventArgs class with the specified parameters.
    * @param dateTime A DateTime value which corresponds to the top visible time of the target view.
    * @param resource A Resource associated with the time cell where the "More" button is located.
    */
  def this(dateTime: js.Date, resource: String) = this()
}
