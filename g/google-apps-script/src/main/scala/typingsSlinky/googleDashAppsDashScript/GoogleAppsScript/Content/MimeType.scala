package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MimeType extends js.Object

/**
  * An enum for mime types that can be served from a script.
  */
@JSGlobal("GoogleAppsScript.Content.MimeType")
@js.native
object MimeType extends js.Object {
  @js.native
  sealed trait ATOM extends MimeType
  
  @js.native
  sealed trait CSV extends MimeType
  
  @js.native
  sealed trait ICAL extends MimeType
  
  @js.native
  sealed trait JAVASCRIPT extends MimeType
  
  @js.native
  sealed trait JSON extends MimeType
  
  @js.native
  sealed trait RSS extends MimeType
  
  @js.native
  sealed trait TEXT extends MimeType
  
  @js.native
  sealed trait VCARD extends MimeType
  
  @js.native
  sealed trait XML extends MimeType
  
  /* 0 */ val ATOM: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.ATOM with Double = js.native
  /* 1 */ val CSV: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.CSV with Double = js.native
  /* 2 */ val ICAL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.ICAL with Double = js.native
  /* 3 */ val JAVASCRIPT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.JAVASCRIPT with Double = js.native
  /* 4 */ val JSON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.JSON with Double = js.native
  /* 5 */ val RSS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.RSS with Double = js.native
  /* 6 */ val TEXT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.TEXT with Double = js.native
  /* 7 */ val VCARD: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.VCARD with Double = js.native
  /* 8 */ val XML: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MimeType with Double] = js.native
}

