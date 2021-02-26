package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.policiesTypesMod.RenamePolicyFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenamePolicyFn extends StObject {
  
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    policyName: String,
    newPolicyName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenamePolicyFn = js.native
}
