package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsHttpHealthCheck
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.HttpHealthCheckKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpHealthChecksResource extends js.Object {
  
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.HttpHealthCheck): Request[Operation] = js.native
  
  /** Returns the specified HttpHealthCheck resource. Gets a list of available HTTP health checks by making a list() request. */
  def get(): Request[HttpHealthCheck] = js.native
  def get(request: FieldsHttpHealthCheck): Request[HttpHealthCheck] = js.native
  
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AltFieldsKeyOauthtoken): Request[Operation] = js.native
  def insert(request: FieldsKey, body: HttpHealthCheck): Request[Operation] = js.native
  
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(): Request[HttpHealthCheckList] = js.native
  def list(request: MaxResults): Request[HttpHealthCheckList] = js.native
  
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and
    * processing rules.
    */
  def patch(request: HttpHealthCheckKey): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.HttpHealthCheck, body: HttpHealthCheck): Request[Operation] = js.native
  
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: HttpHealthCheckKey): Request[Operation] = js.native
  def update(request: typingsSlinky.maximMazurokGapiClientCompute.anon.HttpHealthCheck, body: HttpHealthCheck): Request[Operation] = js.native
}
