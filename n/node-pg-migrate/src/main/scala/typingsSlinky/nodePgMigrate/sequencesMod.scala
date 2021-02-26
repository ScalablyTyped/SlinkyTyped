package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.sequencesTypesMod.AlterSequence
import typingsSlinky.nodePgMigrate.sequencesTypesMod.CreateSequence
import typingsSlinky.nodePgMigrate.sequencesTypesMod.DropSequence
import typingsSlinky.nodePgMigrate.sequencesTypesMod.RenameSequence
import typingsSlinky.nodePgMigrate.sequencesTypesMod.SequenceOptions
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequencesMod {
  
  @JSImport("node-pg-migrate/dist/operations/sequences", "alterSequence")
  @js.native
  def alterSequence(mOptions: MigrationOptions): AlterSequence = js.native
  
  @JSImport("node-pg-migrate/dist/operations/sequences", "createSequence")
  @js.native
  def createSequence(mOptions: MigrationOptions): CreateSequence = js.native
  
  @JSImport("node-pg-migrate/dist/operations/sequences", "dropSequence")
  @js.native
  def dropSequence(mOptions: MigrationOptions): DropSequence = js.native
  
  @JSImport("node-pg-migrate/dist/operations/sequences", "parseSequenceOptions")
  @js.native
  def parseSequenceOptions(typeShorthands: js.UndefOr[scala.Nothing], options: SequenceOptions): js.Array[String] = js.native
  @JSImport("node-pg-migrate/dist/operations/sequences", "parseSequenceOptions")
  @js.native
  def parseSequenceOptions(typeShorthands: ColumnDefinitions, options: SequenceOptions): js.Array[String] = js.native
  
  @JSImport("node-pg-migrate/dist/operations/sequences", "renameSequence")
  @js.native
  def renameSequence(mOptions: MigrationOptions): RenameSequence = js.native
}
