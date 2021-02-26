package typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientIam.anon.Alt
import typingsSlinky.maximMazurokGapiClientIam.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionsResource extends StObject {
  
  def queryTestablePermissions(request: Alt, body: QueryTestablePermissionsRequest): Request[QueryTestablePermissionsResponse] = js.native
  /** Lists every permission that you can test on a resource. A permission is testable if you can check whether a member has that permission on the resource. */
  def queryTestablePermissions(request: Uploadprotocol): Request[QueryTestablePermissionsResponse] = js.native
}
