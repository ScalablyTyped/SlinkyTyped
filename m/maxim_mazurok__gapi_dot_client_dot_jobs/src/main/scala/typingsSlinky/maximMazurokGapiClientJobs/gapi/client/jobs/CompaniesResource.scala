package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientJobs.anon.Alt
import typingsSlinky.maximMazurokGapiClientJobs.anon.Callback
import typingsSlinky.maximMazurokGapiClientJobs.anon.Fields
import typingsSlinky.maximMazurokGapiClientJobs.anon.Key
import typingsSlinky.maximMazurokGapiClientJobs.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompaniesResource extends StObject {
  
  def create(request: Alt, body: CreateCompanyRequest): Request[Company] = js.native
  /** Creates a new company entity. */
  def create(request: Callback): Request[Company] = js.native
  
  /** Deletes specified company. Prerequisite: The company has no jobs associated with it. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Retrieves specified company. */
  def get(): Request[Company] = js.native
  def get(request: Fields): Request[Company] = js.native
  
  /** Lists all companies associated with the service account. */
  def list(): Request[ListCompaniesResponse] = js.native
  def list(request: Key): Request[ListCompaniesResponse] = js.native
  
  def patch(request: Fields, body: UpdateCompanyRequest): Request[Company] = js.native
  /** Updates specified company. Company names can't be updated. To update a company name, delete the company and all jobs associated with it, and only then re-create them. */
  def patch(request: Name): Request[Company] = js.native
}
