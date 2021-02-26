package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationsResource extends StObject {
  
  /** Gets info about an application. */
  def get(): Request[Application] = js.native
  def get(request: Accesstoken): Request[Application] = js.native
}
