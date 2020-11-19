package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.tablesTypesMod.AddColumns
import typingsSlinky.nodePgMigrate.tablesTypesMod.AlterColumn
import typingsSlinky.nodePgMigrate.tablesTypesMod.AlterTable
import typingsSlinky.nodePgMigrate.tablesTypesMod.CreateConstraint
import typingsSlinky.nodePgMigrate.tablesTypesMod.CreateTable
import typingsSlinky.nodePgMigrate.tablesTypesMod.DropColumns
import typingsSlinky.nodePgMigrate.tablesTypesMod.DropConstraint
import typingsSlinky.nodePgMigrate.tablesTypesMod.DropTable
import typingsSlinky.nodePgMigrate.tablesTypesMod.RenameColumn
import typingsSlinky.nodePgMigrate.tablesTypesMod.RenameConstraint
import typingsSlinky.nodePgMigrate.tablesTypesMod.RenameTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/tables", JSImport.Namespace)
@js.native
object tablesMod extends js.Object {
  
  def addColumns(mOptions: MigrationOptions): AddColumns = js.native
  
  def addConstraint(mOptions: MigrationOptions): CreateConstraint = js.native
  
  def alterColumn(mOptions: MigrationOptions): AlterColumn = js.native
  
  def alterTable(mOptions: MigrationOptions): AlterTable = js.native
  
  def createTable(mOptions: MigrationOptions): CreateTable = js.native
  
  def dropColumns(mOptions: MigrationOptions): DropColumns = js.native
  
  def dropConstraint(mOptions: MigrationOptions): DropConstraint = js.native
  
  def dropTable(mOptions: MigrationOptions): DropTable = js.native
  
  def renameColumn(mOptions: MigrationOptions): RenameColumn = js.native
  
  def renameConstraint(mOptions: MigrationOptions): RenameConstraint = js.native
  
  def renameTable(mOptions: MigrationOptions): RenameTable = js.native
}
