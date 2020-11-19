package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.HyperlinkClick event.
  */
@JSGlobal("ASPxClientRichEditHyperlinkClickEventArgs")
@js.native
class ASPxClientRichEditHyperlinkClickEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientRichEditHyperlinkClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditHyperlinkClickEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    * @param targetUri The target URI.
    * @param hyperlinkType The document link type.
    */
  def this(
    htmlEvent: js.Any,
    handled: Boolean,
    targetUri: String,
    hyperlinkType: typingsSlinky.devexpressWeb.ASPxClientOfficeDocumentLinkType
  ) = this()
}
