package typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCalendar.anon.FieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorsResource extends StObject {
  
  /** Returns the color definitions for calendars and events. */
  def get(): Request[Colors] = js.native
  def get(request: FieldsKey): Request[Colors] = js.native
}
