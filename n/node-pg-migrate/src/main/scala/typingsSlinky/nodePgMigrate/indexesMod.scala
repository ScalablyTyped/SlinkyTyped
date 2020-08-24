package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndex
import typingsSlinky.nodePgMigrate.indexesTypesMod.DropIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/indexes", JSImport.Namespace)
@js.native
object indexesMod extends js.Object {
  def createIndex(mOptions: MigrationOptions): CreateIndex = js.native
  def dropIndex(mOptions: MigrationOptions): DropIndex = js.native
}

