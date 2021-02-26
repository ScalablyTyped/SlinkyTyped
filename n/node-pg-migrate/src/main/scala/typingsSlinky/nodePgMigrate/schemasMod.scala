package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.schemasTypesMod.CreateSchema
import typingsSlinky.nodePgMigrate.schemasTypesMod.DropSchema
import typingsSlinky.nodePgMigrate.schemasTypesMod.RenameSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemasMod {
  
  @JSImport("node-pg-migrate/dist/operations/schemas", "createSchema")
  @js.native
  def createSchema(mOptions: MigrationOptions): CreateSchema = js.native
  
  @JSImport("node-pg-migrate/dist/operations/schemas", "dropSchema")
  @js.native
  def dropSchema(mOptions: MigrationOptions): DropSchema = js.native
  
  @JSImport("node-pg-migrate/dist/operations/schemas", "renameSchema")
  @js.native
  def renameSchema(mOptions: MigrationOptions): RenameSchema = js.native
}
