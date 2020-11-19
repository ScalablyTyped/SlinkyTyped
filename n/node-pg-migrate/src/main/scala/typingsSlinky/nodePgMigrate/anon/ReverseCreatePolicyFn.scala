package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption
import typingsSlinky.nodePgMigrate.policiesTypesMod.CreatePolicyFn
import typingsSlinky.nodePgMigrate.policiesTypesMod.CreatePolicyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreatePolicyFn extends js.Object {
  
  def reverse(tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name, policyName: String): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    policyName: String,
    options: CreatePolicyOptions with IfExistsOption
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreatePolicyFn = js.native
}
