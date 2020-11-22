package typingsSlinky.maximMazurokGapiClientPlaycustomapp.gapi.client.playcustomapp

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientPlaycustomapp.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientPlaycustomapp.anon.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAppsResource extends js.Object {
  
  /** Creates a new custom app. */
  def create(request: Accesstoken): Request[CustomApp] = js.native
  def create(request: Account, body: CustomApp): Request[CustomApp] = js.native
}
