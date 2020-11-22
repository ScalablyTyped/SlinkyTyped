package typingsSlinky.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGmailpostmastertools.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientGmailpostmastertools.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficStatsResource extends js.Object {
  
  /** Get traffic statistics for a domain on a specific date. Returns PERMISSION_DENIED if user does not have permission to access TrafficStats for the domain. */
  def get(): Request[TrafficStats] = js.native
  def get(request: Accesstoken): Request[TrafficStats] = js.native
  
  /** List traffic statistics for all available days. Returns PERMISSION_DENIED if user does not have permission to access TrafficStats for the domain. */
  def list(): Request[ListTrafficStatsResponse] = js.native
  def list(request: Alt): Request[ListTrafficStatsResponse] = js.native
}
