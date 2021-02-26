package typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientLogging.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientLogging.anon.Alt
import typingsSlinky.maximMazurokGapiClientLogging.anon.Callback
import typingsSlinky.maximMazurokGapiClientLogging.anon.Fields
import typingsSlinky.maximMazurokGapiClientLogging.anon.Key
import typingsSlinky.maximMazurokGapiClientLogging.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewsResource extends StObject {
  
  /** Creates a view over logs in a bucket. A bucket may contain a maximum of 50 views. */
  def create(request: Alt): Request[LogView] = js.native
  def create(request: Callback, body: LogView): Request[LogView] = js.native
  
  /** Deletes a view from a bucket. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets a view. */
  def get(): Request[LogView] = js.native
  def get(request: Accesstoken): Request[LogView] = js.native
  
  /** Lists views on a bucket. */
  def list(): Request[ListViewsResponse] = js.native
  def list(request: Fields): Request[ListViewsResponse] = js.native
  
  /** Updates a view. This method replaces the following fields in the existing view with values from the new view: filter. */
  def patch(request: Key): Request[LogView] = js.native
  def patch(request: Name, body: LogView): Request[LogView] = js.native
}
