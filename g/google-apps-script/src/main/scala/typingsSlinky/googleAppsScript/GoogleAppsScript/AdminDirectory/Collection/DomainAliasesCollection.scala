package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.DomainAlias
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.DomainAliases
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainAliasesCollection extends js.Object {
  
  // Retrieves a domain alias of the customer.
  def get(customer: String, domainAliasName: String): DomainAlias = js.native
  
  // Inserts a Domain alias of the customer.
  def insert(resource: DomainAlias, customer: String): DomainAlias = js.native
  
  // Lists the domain aliases of the customer.
  def list(customer: String): DomainAliases = js.native
  // Lists the domain aliases of the customer.
  def list(customer: String, optionalArgs: js.Object): DomainAliases = js.native
  
  // Deletes a Domain Alias of the customer.
  def remove(customer: String, domainAliasName: String): Unit = js.native
}
