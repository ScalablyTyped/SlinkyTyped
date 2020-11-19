package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.extensionsTypesMod.CreateExtension
import typingsSlinky.nodePgMigrate.extensionsTypesMod.DropExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/extensions", JSImport.Namespace)
@js.native
object extensionsMod extends js.Object {
  
  def createExtension(mOptions: MigrationOptions): CreateExtension = js.native
  
  def dropExtension(mOptions: MigrationOptions): DropExtension = js.native
}
