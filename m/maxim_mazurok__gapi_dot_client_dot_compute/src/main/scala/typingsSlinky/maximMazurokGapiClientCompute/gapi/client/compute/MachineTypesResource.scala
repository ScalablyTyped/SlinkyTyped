package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MachineTypesResource extends js.Object {
  
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(): Request[MachineTypeAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[MachineTypeAggregatedList] = js.native
  
  /** Returns the specified machine type. Gets a list of available machine types by making a list() request. */
  def get(): Request[MachineType] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientCompute.anon.MachineType): Request[MachineType] = js.native
  
  /** Retrieves a list of machine types available to the specified project. */
  def list(): Request[MachineTypeList] = js.native
  def list(request: Fields): Request[MachineTypeList] = js.native
}
