package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.sequencesTypesMod.AlterSequence
import typingsSlinky.nodePgMigrate.sequencesTypesMod.CreateSequence
import typingsSlinky.nodePgMigrate.sequencesTypesMod.DropSequence
import typingsSlinky.nodePgMigrate.sequencesTypesMod.RenameSequence
import typingsSlinky.nodePgMigrate.sequencesTypesMod.SequenceOptions
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/sequences", JSImport.Namespace)
@js.native
object sequencesMod extends js.Object {
  
  def alterSequence(mOptions: MigrationOptions): AlterSequence = js.native
  
  def createSequence(mOptions: MigrationOptions): CreateSequence = js.native
  
  def dropSequence(mOptions: MigrationOptions): DropSequence = js.native
  
  def parseSequenceOptions(typeShorthands: js.UndefOr[scala.Nothing], options: SequenceOptions): js.Array[String] = js.native
  def parseSequenceOptions(typeShorthands: ColumnDefinitions, options: SequenceOptions): js.Array[String] = js.native
  
  def renameSequence(mOptions: MigrationOptions): RenameSequence = js.native
}
