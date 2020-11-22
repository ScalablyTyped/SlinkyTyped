package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltDiskType
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionDiskTypesResource extends js.Object {
  
  /** Returns the specified regional disk type. Gets a list of available disk types by making a list() request. */
  def get(): Request[DiskType] = js.native
  def get(request: AltDiskType): Request[DiskType] = js.native
  
  /** Retrieves a list of regional disk types available to the specified project. */
  def list(): Request[RegionDiskTypeList] = js.native
  def list(request: Filter): Request[RegionDiskTypeList] = js.native
}
