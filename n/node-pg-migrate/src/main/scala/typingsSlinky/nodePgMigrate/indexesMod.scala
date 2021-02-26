package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndex
import typingsSlinky.nodePgMigrate.indexesTypesMod.DropIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexesMod {
  
  @JSImport("node-pg-migrate/dist/operations/indexes", "createIndex")
  @js.native
  def createIndex(mOptions: MigrationOptions): CreateIndex = js.native
  
  @JSImport("node-pg-migrate/dist/operations/indexes", "dropIndex")
  @js.native
  def dropIndex(mOptions: MigrationOptions): DropIndex = js.native
}
