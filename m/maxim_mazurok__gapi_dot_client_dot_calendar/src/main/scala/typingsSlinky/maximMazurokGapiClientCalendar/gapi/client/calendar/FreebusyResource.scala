package typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCalendar.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCalendar.anon.OauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreebusyResource extends StObject {
  
  def query(request: FieldsKey, body: FreeBusyRequest): Request[FreeBusyResponse] = js.native
  /** Returns free/busy information for a set of calendars. */
  def query(request: OauthtokenPrettyPrint): Request[FreeBusyResponse] = js.native
}
