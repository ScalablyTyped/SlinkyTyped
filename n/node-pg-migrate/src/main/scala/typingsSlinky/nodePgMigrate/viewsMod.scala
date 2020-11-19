package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.viewsTypesMod.AlterView
import typingsSlinky.nodePgMigrate.viewsTypesMod.AlterViewColumn
import typingsSlinky.nodePgMigrate.viewsTypesMod.CreateView
import typingsSlinky.nodePgMigrate.viewsTypesMod.DropView
import typingsSlinky.nodePgMigrate.viewsTypesMod.RenameView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/views", JSImport.Namespace)
@js.native
object viewsMod extends js.Object {
  
  def alterView(mOptions: MigrationOptions): AlterView = js.native
  
  def alterViewColumn(mOptions: MigrationOptions): AlterViewColumn = js.native
  
  def createView(mOptions: MigrationOptions): CreateView = js.native
  
  def dropView(mOptions: MigrationOptions): DropView = js.native
  
  def renameView(mOptions: MigrationOptions): RenameView = js.native
}
