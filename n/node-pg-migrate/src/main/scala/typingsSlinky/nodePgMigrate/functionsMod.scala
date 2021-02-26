package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.functionsTypesMod.CreateFunction
import typingsSlinky.nodePgMigrate.functionsTypesMod.DropFunction
import typingsSlinky.nodePgMigrate.functionsTypesMod.RenameFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("node-pg-migrate/dist/operations/functions", "createFunction")
  @js.native
  def createFunction(mOptions: MigrationOptions): CreateFunction = js.native
  
  @JSImport("node-pg-migrate/dist/operations/functions", "dropFunction")
  @js.native
  def dropFunction(mOptions: MigrationOptions): DropFunction = js.native
  
  @JSImport("node-pg-migrate/dist/operations/functions", "renameFunction")
  @js.native
  def renameFunction(mOptions: MigrationOptions): RenameFunction = js.native
}
