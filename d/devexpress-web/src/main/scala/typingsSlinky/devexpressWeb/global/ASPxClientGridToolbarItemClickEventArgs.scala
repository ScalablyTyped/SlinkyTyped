package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridBase.ToolbarItemClick event.
  */
@JSGlobal("ASPxClientGridToolbarItemClickEventArgs")
@js.native
class ASPxClientGridToolbarItemClickEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientGridToolbarItemClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridToolbarItemClickEventArgs class.
    * @param item An ASPxClientMenu object that should be clicked to fire the event.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(item: typingsSlinky.devexpressWeb.ASPxClientMenuItem, processOnServer: Boolean) = this()
}

