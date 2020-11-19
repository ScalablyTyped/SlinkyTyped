package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.triggersTypesMod.CreateTrigger
import typingsSlinky.nodePgMigrate.triggersTypesMod.DropTrigger
import typingsSlinky.nodePgMigrate.triggersTypesMod.RenameTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/triggers", JSImport.Namespace)
@js.native
object triggersMod extends js.Object {
  
  def createTrigger(mOptions: MigrationOptions): CreateTrigger = js.native
  
  def dropTrigger(mOptions: MigrationOptions): DropTrigger = js.native
  
  def renameTrigger(mOptions: MigrationOptions): RenameTrigger = js.native
}
