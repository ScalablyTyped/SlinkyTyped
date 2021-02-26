package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.operatorsTypesMod.AddToOperatorFamily
import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperator
import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorClass
import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorFamily
import typingsSlinky.nodePgMigrate.operatorsTypesMod.DropOperator
import typingsSlinky.nodePgMigrate.operatorsTypesMod.DropOperatorClass
import typingsSlinky.nodePgMigrate.operatorsTypesMod.DropOperatorFamily
import typingsSlinky.nodePgMigrate.operatorsTypesMod.RemoveFromOperatorFamily
import typingsSlinky.nodePgMigrate.operatorsTypesMod.RenameOperatorClass
import typingsSlinky.nodePgMigrate.operatorsTypesMod.RenameOperatorFamily
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMod {
  
  @JSImport("node-pg-migrate/dist/operations/operators", "addToOperatorFamily")
  @js.native
  def addToOperatorFamily(mOptions: MigrationOptions): AddToOperatorFamily = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "createOperator")
  @js.native
  def createOperator(mOptions: MigrationOptions): CreateOperator = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "createOperatorClass")
  @js.native
  def createOperatorClass(mOptions: MigrationOptions): CreateOperatorClass = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "createOperatorFamily")
  @js.native
  def createOperatorFamily(mOptions: MigrationOptions): CreateOperatorFamily = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "dropOperator")
  @js.native
  def dropOperator(mOptions: MigrationOptions): DropOperator = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "dropOperatorClass")
  @js.native
  def dropOperatorClass(mOptions: MigrationOptions): DropOperatorClass = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "dropOperatorFamily")
  @js.native
  def dropOperatorFamily(mOptions: MigrationOptions): DropOperatorFamily = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "removeFromOperatorFamily")
  @js.native
  def removeFromOperatorFamily(mOptions: MigrationOptions): RemoveFromOperatorFamily = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "renameOperatorClass")
  @js.native
  def renameOperatorClass(mOptions: MigrationOptions): RenameOperatorClass = js.native
  
  @JSImport("node-pg-migrate/dist/operations/operators", "renameOperatorFamily")
  @js.native
  def renameOperatorFamily(mOptions: MigrationOptions): RenameOperatorFamily = js.native
}
