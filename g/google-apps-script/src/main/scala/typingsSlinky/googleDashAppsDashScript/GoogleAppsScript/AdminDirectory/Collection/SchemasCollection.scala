package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Collection

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schemas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemasCollection extends js.Object {
  // Retrieve schema
  def get(customerId: String, schemaKey: String): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema
  // Create schema.
  def insert(
    resource: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema,
    customerId: String
  ): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema
  // Retrieve all schemas for a customer
  def list(customerId: String): Schemas
  // Update schema. This method supports patch semantics.
  def patch(
    resource: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema,
    customerId: String,
    schemaKey: String
  ): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema
  // Delete schema
  def remove(customerId: String, schemaKey: String): Unit
  // Update schema
  def update(
    resource: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema,
    customerId: String,
    schemaKey: String
  ): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema
}

object SchemasCollection {
  @scala.inline
  def apply(
    get: (String, String) => typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema,
    insert: (typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema, String) => typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema,
    list: String => Schemas,
    patch: (typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema, String, String) => typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema,
    remove: (String, String) => Unit,
    update: (typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema, String, String) => typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Schema
  ): SchemasCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[SchemasCollection]
  }
}

