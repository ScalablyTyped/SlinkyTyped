package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.rolesTypesMod.AlterRole
import typingsSlinky.nodePgMigrate.rolesTypesMod.CreateRole
import typingsSlinky.nodePgMigrate.rolesTypesMod.DropRole
import typingsSlinky.nodePgMigrate.rolesTypesMod.RenameRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rolesMod {
  
  @JSImport("node-pg-migrate/dist/operations/roles", "alterRole")
  @js.native
  def alterRole(mOptions: MigrationOptions): AlterRole = js.native
  
  @JSImport("node-pg-migrate/dist/operations/roles", "createRole")
  @js.native
  def createRole(mOptions: MigrationOptions): CreateRole = js.native
  
  @JSImport("node-pg-migrate/dist/operations/roles", "dropRole")
  @js.native
  def dropRole(mOptions: MigrationOptions): DropRole = js.native
  
  @JSImport("node-pg-migrate/dist/operations/roles", "renameRole")
  @js.native
  def renameRole(mOptions: MigrationOptions): RenameRole = js.native
}
