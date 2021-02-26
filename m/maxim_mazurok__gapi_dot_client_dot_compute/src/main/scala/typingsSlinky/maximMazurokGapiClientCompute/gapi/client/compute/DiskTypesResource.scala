package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskTypesResource extends StObject {
  
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(): Request[DiskTypeAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[DiskTypeAggregatedList] = js.native
  
  /** Returns the specified disk type. Gets a list of available disk types by making a list() request. */
  def get(): Request[DiskType] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientCompute.anon.DiskType): Request[DiskType] = js.native
  
  /** Retrieves a list of disk types available to the specified project. */
  def list(): Request[DiskTypeList] = js.native
  def list(request: Fields): Request[DiskTypeList] = js.native
}
