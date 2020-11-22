package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRegionUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionsResource extends js.Object {
  
  /** Returns the specified Region resource. Gets a list of available regions by making a list() request. */
  def get(): Request[Region] = js.native
  def get(request: PrettyPrintProjectQuotaUserRegionUserIp): Request[Region] = js.native
  
  /** Retrieves the list of region resources available to the specified project. */
  def list(): Request[RegionList] = js.native
  def list(request: MaxResults): Request[RegionList] = js.native
}
