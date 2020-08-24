package typingsSlinky.nodePgMigrate.distTypesMod

import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationOptions extends js.Object {
  @JSName("literal")
  var literal_Original: Literal = js.native
  @JSName("schemalize")
  var schemalize_Original: Literal = js.native
  var typeShorthands: js.UndefOr[ColumnDefinitions] = js.native
  def literal(v: Name): String = js.native
  def schemalize(v: Name): String = js.native
}

