package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.AlterMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.DropMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/viewsMaterialized", JSImport.Namespace)
@js.native
object viewsMaterializedMod extends js.Object {
  def alterMaterializedView(mOptions: MigrationOptions): AlterMaterializedView = js.native
  def createMaterializedView(mOptions: MigrationOptions): CreateMaterializedView = js.native
  def dropMaterializedView(mOptions: MigrationOptions): DropMaterializedView = js.native
  def refreshMaterializedView(mOptions: MigrationOptions): RefreshMaterializedView = js.native
  def renameMaterializedView(mOptions: MigrationOptions): RenameMaterializedView = js.native
  def renameMaterializedViewColumn(mOptions: MigrationOptions): RenameMaterializedViewColumn = js.native
}

