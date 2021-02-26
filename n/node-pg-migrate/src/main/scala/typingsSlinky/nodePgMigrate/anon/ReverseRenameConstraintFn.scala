package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.tablesTypesMod.RenameConstraintFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameConstraintFn extends StObject {
  
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    oldConstraintName: String,
    newConstraintName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameConstraintFn = js.native
}
