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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/operators", JSImport.Namespace)
@js.native
object operatorsMod extends js.Object {
  
  def addToOperatorFamily(mOptions: MigrationOptions): AddToOperatorFamily = js.native
  
  def createOperator(mOptions: MigrationOptions): CreateOperator = js.native
  
  def createOperatorClass(mOptions: MigrationOptions): CreateOperatorClass = js.native
  
  def createOperatorFamily(mOptions: MigrationOptions): CreateOperatorFamily = js.native
  
  def dropOperator(mOptions: MigrationOptions): DropOperator = js.native
  
  def dropOperatorClass(mOptions: MigrationOptions): DropOperatorClass = js.native
  
  def dropOperatorFamily(mOptions: MigrationOptions): DropOperatorFamily = js.native
  
  def removeFromOperatorFamily(mOptions: MigrationOptions): RemoveFromOperatorFamily = js.native
  
  def renameOperatorClass(mOptions: MigrationOptions): RenameOperatorClass = js.native
  
  def renameOperatorFamily(mOptions: MigrationOptions): RenameOperatorFamily = js.native
}
