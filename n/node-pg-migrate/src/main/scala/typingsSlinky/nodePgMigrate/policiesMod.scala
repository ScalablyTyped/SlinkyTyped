package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.policiesTypesMod.AlterPolicy
import typingsSlinky.nodePgMigrate.policiesTypesMod.CreatePolicy
import typingsSlinky.nodePgMigrate.policiesTypesMod.DropPolicy
import typingsSlinky.nodePgMigrate.policiesTypesMod.RenamePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/policies", JSImport.Namespace)
@js.native
object policiesMod extends js.Object {
  
  def alterPolicy(mOptions: MigrationOptions): AlterPolicy = js.native
  
  def createPolicy(mOptions: MigrationOptions): CreatePolicy = js.native
  
  def dropPolicy(mOptions: MigrationOptions): DropPolicy = js.native
  
  def renamePolicy(mOptions: MigrationOptions): RenamePolicy = js.native
}
