package typingsSlinky.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.CommandExecuted event.
  */
@JSGlobal("ASPxClientRibbonCommandExecutedEventArgs")
@js.native
class ASPxClientRibbonCommandExecutedEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientRibbonCommandExecutedEventArgs {
  /**
    * Initializes a new object of the ASPxClientRibbonCommandExecutedEventArgs type with the specified settings.
    * @param item An ASPxClientRibbonItem object, manipulations on which forced the event to be raised.
    * @param parameter A string value containing additional information about the processed command.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(
    item: typingsSlinky.devexpressWeb.ASPxClientRibbonItem,
    parameter: String,
    processOnServer: Boolean
  ) = this()
}
