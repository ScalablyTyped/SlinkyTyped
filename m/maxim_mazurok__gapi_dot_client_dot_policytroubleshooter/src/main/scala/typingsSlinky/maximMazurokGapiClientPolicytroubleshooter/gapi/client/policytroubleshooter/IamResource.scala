package typingsSlinky.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientPolicytroubleshooter.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientPolicytroubleshooter.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamResource extends js.Object {
  
  /** Checks whether a member has a specific permission for a specific resource, and explains why the member does or does not have that permission. */
  def troubleshoot(request: Accesstoken): Request[GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] = js.native
  def troubleshoot(request: Alt, body: GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest): Request[GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] = js.native
}
