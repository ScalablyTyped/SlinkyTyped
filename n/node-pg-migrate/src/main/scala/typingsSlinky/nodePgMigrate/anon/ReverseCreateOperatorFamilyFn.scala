package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorFamilyFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateOperatorFamilyFn extends js.Object {
  
  def reverse(
    operatorFamilyName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  def reverse(
    operatorFamilyName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    options: DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateOperatorFamilyFn = js.native
}
