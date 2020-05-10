package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schemas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemasCollection extends js.Object {
  // Retrieve schema
  def get(customerId: String, schemaKey: String): Schema = js.native
  // Create schema.
  def insert(resource: Schema, customerId: String): Schema = js.native
  // Retrieve all schemas for a customer
  def list(customerId: String): Schemas = js.native
  // Update schema. This method supports patch semantics.
  def patch(resource: Schema, customerId: String, schemaKey: String): Schema = js.native
  // Delete schema
  def remove(customerId: String, schemaKey: String): Unit = js.native
  // Update schema
  def update(resource: Schema, customerId: String, schemaKey: String): Schema = js.native
}

object SchemasCollection {
  @scala.inline
  def apply(
    get: (String, String) => Schema,
    insert: (Schema, String) => Schema,
    list: String => Schemas,
    patch: (Schema, String, String) => Schema,
    remove: (String, String) => Unit,
    update: (Schema, String, String) => Schema
  ): SchemasCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[SchemasCollection]
  }
  @scala.inline
  implicit class SchemasCollectionOps[Self <: SchemasCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, String) => Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Schema, String) => Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => Schemas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: (Schema, String, String) => Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemove(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Schema, String, String) => Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

