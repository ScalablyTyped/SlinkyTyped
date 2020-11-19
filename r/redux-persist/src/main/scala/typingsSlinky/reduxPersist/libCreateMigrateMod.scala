package typingsSlinky.reduxPersist

import typingsSlinky.reduxPersist.createMigrateMod.MigrationConfig
import typingsSlinky.reduxPersist.typesMod.MigrationManifest
import typingsSlinky.reduxPersist.typesMod.PersistMigrate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-persist/lib/createMigrate", JSImport.Namespace)
@js.native
object libCreateMigrateMod extends js.Object {
  
  def default(migrations: MigrationManifest): PersistMigrate = js.native
  def default(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
}
