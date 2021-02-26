package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.AlterMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.DropMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedView
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMaterializedMod {
  
  @JSImport("node-pg-migrate/dist/operations/viewsMaterialized", "alterMaterializedView")
  @js.native
  def alterMaterializedView(mOptions: MigrationOptions): AlterMaterializedView = js.native
  
  @JSImport("node-pg-migrate/dist/operations/viewsMaterialized", "createMaterializedView")
  @js.native
  def createMaterializedView(mOptions: MigrationOptions): CreateMaterializedView = js.native
  
  @JSImport("node-pg-migrate/dist/operations/viewsMaterialized", "dropMaterializedView")
  @js.native
  def dropMaterializedView(mOptions: MigrationOptions): DropMaterializedView = js.native
  
  @JSImport("node-pg-migrate/dist/operations/viewsMaterialized", "refreshMaterializedView")
  @js.native
  def refreshMaterializedView(mOptions: MigrationOptions): RefreshMaterializedView = js.native
  
  @JSImport("node-pg-migrate/dist/operations/viewsMaterialized", "renameMaterializedView")
  @js.native
  def renameMaterializedView(mOptions: MigrationOptions): RenameMaterializedView = js.native
  
  @JSImport("node-pg-migrate/dist/operations/viewsMaterialized", "renameMaterializedViewColumn")
  @js.native
  def renameMaterializedViewColumn(mOptions: MigrationOptions): RenameMaterializedViewColumn = js.native
}
