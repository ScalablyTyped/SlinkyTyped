package typingsSlinky.gapiClientDiscovery.gapi.client.discovery

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDiscovery.anon.Alt
import typingsSlinky.gapiClientDiscovery.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApisResource extends js.Object {
  
  /** Retrieve the description of a particular version of an api. */
  def getRest(): Request[RestDescription] = js.native
  def getRest(request: Alt): Request[RestDescription] = js.native
  
  /** Retrieve the list of APIs supported at this endpoint. */
  def list(): Request[DirectoryList] = js.native
  def list(request: Fields): Request[DirectoryList] = js.native
}
