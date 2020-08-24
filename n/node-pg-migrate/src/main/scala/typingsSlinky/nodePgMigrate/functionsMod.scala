package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.functionsTypesMod.CreateFunction
import typingsSlinky.nodePgMigrate.functionsTypesMod.DropFunction
import typingsSlinky.nodePgMigrate.functionsTypesMod.RenameFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  def createFunction(mOptions: MigrationOptions): CreateFunction = js.native
  def dropFunction(mOptions: MigrationOptions): DropFunction = js.native
  def renameFunction(mOptions: MigrationOptions): RenameFunction = js.native
}

