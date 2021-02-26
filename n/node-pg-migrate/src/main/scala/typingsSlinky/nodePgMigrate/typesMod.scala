package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.typesTypesMod.AddTypeAttribute
import typingsSlinky.nodePgMigrate.typesTypesMod.AddTypeValue
import typingsSlinky.nodePgMigrate.typesTypesMod.CreateType
import typingsSlinky.nodePgMigrate.typesTypesMod.DropType
import typingsSlinky.nodePgMigrate.typesTypesMod.DropTypeAttribute
import typingsSlinky.nodePgMigrate.typesTypesMod.RenameType
import typingsSlinky.nodePgMigrate.typesTypesMod.RenameTypeAttribute
import typingsSlinky.nodePgMigrate.typesTypesMod.RenameTypeValue
import typingsSlinky.nodePgMigrate.typesTypesMod.SetTypeAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("node-pg-migrate/dist/operations/types", "addTypeAttribute")
  @js.native
  def addTypeAttribute(mOptions: MigrationOptions): AddTypeAttribute = js.native
  
  @JSImport("node-pg-migrate/dist/operations/types", "addTypeValue")
  @js.native
  def addTypeValue(mOptions: MigrationOptions): AddTypeValue = js.native
  
  @JSImport("node-pg-migrate/dist/operations/types", "createType")
  @js.native
  def createType(mOptions: MigrationOptions): CreateType = js.native
  
  @JSImport("node-pg-migrate/dist/operations/types", "dropType")
  @js.native
  def dropType(mOptions: MigrationOptions): DropType = js.native
  
  @JSImport("node-pg-migrate/dist/operations/types", "dropTypeAttribute")
  @js.native
  def dropTypeAttribute(mOptions: MigrationOptions): DropTypeAttribute = js.native
  
  @JSImport("node-pg-migrate/dist/operations/types", "renameType")
  @js.native
  def renameType(mOptions: MigrationOptions): RenameType = js.native
  
  @JSImport("node-pg-migrate/dist/operations/types", "renameTypeAttribute")
  @js.native
  def renameTypeAttribute(mOptions: MigrationOptions): RenameTypeAttribute = js.native
  
  @JSImport("node-pg-migrate/dist/operations/types", "renameTypeValue")
  @js.native
  def renameTypeValue(mOptions: MigrationOptions): RenameTypeValue = js.native
  
  @JSImport("node-pg-migrate/dist/operations/types", "setTypeAttribute")
  @js.native
  def setTypeAttribute(mOptions: MigrationOptions): SetTypeAttribute = js.native
}
