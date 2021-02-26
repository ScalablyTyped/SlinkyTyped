package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRegionRequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionCommitmentsResource extends StObject {
  
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(): Request[CommitmentAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[CommitmentAggregatedList] = js.native
  
  /** Returns the specified commitment resource. Gets a list of available commitments by making a list() request. */
  def get(): Request[Commitment] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Commitment): Request[Commitment] = js.native
  
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: ProjectQuotaUserRegionRequestId): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: Commitment): Request[Operation] = js.native
  
  /** Retrieves a list of commitments contained within the specified region. */
  def list(): Request[CommitmentList] = js.native
  def list(request: Filter): Request[CommitmentList] = js.native
}
