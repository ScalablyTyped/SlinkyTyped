package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.triggersTypesMod.CreateTrigger
import typingsSlinky.nodePgMigrate.triggersTypesMod.DropTrigger
import typingsSlinky.nodePgMigrate.triggersTypesMod.RenameTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggersMod {
  
  @JSImport("node-pg-migrate/dist/operations/triggers", "createTrigger")
  @js.native
  def createTrigger(mOptions: MigrationOptions): CreateTrigger = js.native
  
  @JSImport("node-pg-migrate/dist/operations/triggers", "dropTrigger")
  @js.native
  def dropTrigger(mOptions: MigrationOptions): DropTrigger = js.native
  
  @JSImport("node-pg-migrate/dist/operations/triggers", "renameTrigger")
  @js.native
  def renameTrigger(mOptions: MigrationOptions): RenameTrigger = js.native
}
