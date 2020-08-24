package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.othersTypesMod.Sql
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/other", JSImport.Namespace)
@js.native
object otherMod extends js.Object {
  def sql(mOptions: MigrationOptions): Sql = js.native
}

