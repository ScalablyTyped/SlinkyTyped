package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTypesResource extends js.Object {
  
  /** Retrieves an aggregated list of node types. */
  def aggregatedList(): Request[NodeTypeAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[NodeTypeAggregatedList] = js.native
  
  /** Returns the specified node type. Gets a list of available node types by making a list() request. */
  def get(): Request[NodeType] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientCompute.anon.NodeType): Request[NodeType] = js.native
  
  /** Retrieves a list of node types available to the specified project. */
  def list(): Request[NodeTypeList] = js.native
  def list(request: Fields): Request[NodeTypeList] = js.native
}
