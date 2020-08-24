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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  def addTypeAttribute(mOptions: MigrationOptions): AddTypeAttribute = js.native
  def addTypeValue(mOptions: MigrationOptions): AddTypeValue = js.native
  def createType(mOptions: MigrationOptions): CreateType = js.native
  def dropType(mOptions: MigrationOptions): DropType = js.native
  def dropTypeAttribute(mOptions: MigrationOptions): DropTypeAttribute = js.native
  def renameType(mOptions: MigrationOptions): RenameType = js.native
  def renameTypeAttribute(mOptions: MigrationOptions): RenameTypeAttribute = js.native
  def renameTypeValue(mOptions: MigrationOptions): RenameTypeValue = js.native
  def setTypeAttribute(mOptions: MigrationOptions): SetTypeAttribute = js.native
}

