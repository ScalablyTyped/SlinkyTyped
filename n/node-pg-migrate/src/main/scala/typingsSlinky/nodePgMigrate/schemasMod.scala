package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.schemasTypesMod.CreateSchema
import typingsSlinky.nodePgMigrate.schemasTypesMod.DropSchema
import typingsSlinky.nodePgMigrate.schemasTypesMod.RenameSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/schemas", JSImport.Namespace)
@js.native
object schemasMod extends js.Object {
  def createSchema(mOptions: MigrationOptions): CreateSchema = js.native
  def dropSchema(mOptions: MigrationOptions): DropSchema = js.native
  def renameSchema(mOptions: MigrationOptions): RenameSchema = js.native
}

