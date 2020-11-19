package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorFn
import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorOptions
import typingsSlinky.nodePgMigrate.operatorsTypesMod.DropOperatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateOperatorFn extends js.Object {
  
  def reverse(
    operatorName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    options: CreateOperatorOptions with DropOperatorOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateOperatorFn = js.native
}
