package typingsSlinky.nodePgMigrate.distTypesMod

import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationOptions extends js.Object {
  
  def literal(v: Name): String = js.native
  @JSName("literal")
  var literal_Original: Literal = js.native
  
  var logger: Logger = js.native
  
  def schemalize(v: Name): String = js.native
  @JSName("schemalize")
  var schemalize_Original: Literal = js.native
  
  var typeShorthands: js.UndefOr[ColumnDefinitions] = js.native
}
