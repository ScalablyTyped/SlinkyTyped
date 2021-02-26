package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorClassFn
import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorClassOptions
import typingsSlinky.nodePgMigrate.operatorsTypesMod.OperatorListDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateOperatorClassFn extends StObject {
  
  def reverse(
    operatorClassName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    `type`: typingsSlinky.nodePgMigrate.generalTypesMod.Type,
    indexMethod: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    operatorList: js.Array[OperatorListDefinition],
    options: CreateOperatorClassOptions with DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateOperatorClassFn = js.native
}
