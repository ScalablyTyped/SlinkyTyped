package typingsSlinky.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.anon.Callback
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.anon.Key
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends js.Object {
  
  def generate(request: Callback, body: ReportRequest): Request[Report] = js.native
  /** Generates and returns a report immediately. */
  def generate(request: Key): Request[Report] = js.native
  
  /** Polls for the status of a report request. */
  def get(): Request[Report] = js.native
  def get(request: Oauthtoken): Request[Report] = js.native
  
  /** Downloads a report file encoded in UTF-8. */
  def getFile(): Request[Unit] = js.native
  def getFile(request: PrettyPrint): Request[Unit] = js.native
  
  def request(request: Callback, body: ReportRequest): Request[Report] = js.native
  /** Inserts a report request into the reporting system. */
  def request(request: Key): Request[Report] = js.native
}
