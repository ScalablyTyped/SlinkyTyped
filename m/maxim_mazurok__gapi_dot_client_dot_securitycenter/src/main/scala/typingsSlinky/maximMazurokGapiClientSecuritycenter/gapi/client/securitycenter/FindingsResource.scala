package typingsSlinky.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Alt
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Callback
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.FindingId
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Key
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Name
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Parent
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.UploadType
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingsResource extends StObject {
  
  /** Creates a finding. The corresponding source must exist for finding creation to succeed. */
  def create(request: FindingId): Request[Finding] = js.native
  def create(request: Parent, body: Finding): Request[Finding] = js.native
  
  def group(request: Alt, body: GroupFindingsRequest): Request[GroupFindingsResponse] = js.native
  /**
    * Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example:
    * /v1/organizations/{organization_id}/sources/-/findings
    */
  def group(request: typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Resource): Request[GroupFindingsResponse] = js.native
  
  /** Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings */
  def list(): Request[ListFindingsResponse] = js.native
  def list(request: Callback): Request[ListFindingsResponse] = js.native
  
  def patch(request: UpdateMask, body: Finding): Request[Finding] = js.native
  /** Creates or updates a finding. The corresponding source must exist for a finding creation to succeed. */
  def patch(request: UploadType): Request[Finding] = js.native
  
  def setState(request: PrettyPrint, body: SetFindingStateRequest): Request[Finding] = js.native
  /** Updates the state of a finding. */
  def setState(request: Uploadprotocol): Request[Finding] = js.native
  
  /** Updates security marks. */
  def updateSecurityMarks(request: Key): Request[SecurityMarks] = js.native
  def updateSecurityMarks(request: Name, body: SecurityMarks): Request[SecurityMarks] = js.native
}
