package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorTypesResource extends js.Object {
  
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(): Request[AcceleratorTypeAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[AcceleratorTypeAggregatedList] = js.native
  
  /** Returns the specified accelerator type. */
  def get(): Request[AcceleratorType] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientCompute.anon.AcceleratorType): Request[AcceleratorType] = js.native
  
  /** Retrieves a list of accelerator types that are available to the specified project. */
  def list(): Request[AcceleratorTypeList] = js.native
  def list(request: Fields): Request[AcceleratorTypeList] = js.native
}
