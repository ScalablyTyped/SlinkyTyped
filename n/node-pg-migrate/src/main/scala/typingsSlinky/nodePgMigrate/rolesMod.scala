package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.rolesTypesMod.AlterRole
import typingsSlinky.nodePgMigrate.rolesTypesMod.CreateRole
import typingsSlinky.nodePgMigrate.rolesTypesMod.DropRole
import typingsSlinky.nodePgMigrate.rolesTypesMod.RenameRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/roles", JSImport.Namespace)
@js.native
object rolesMod extends js.Object {
  def alterRole(mOptions: MigrationOptions): AlterRole = js.native
  def createRole(mOptions: MigrationOptions): CreateRole = js.native
  def dropRole(mOptions: MigrationOptions): DropRole = js.native
  def renameRole(mOptions: MigrationOptions): RenameRole = js.native
}

