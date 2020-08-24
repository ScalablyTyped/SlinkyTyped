package typingsSlinky.graphqlToolsWrap.mod

import typingsSlinky.graphqlToolsUtils.interfacesMod.RenameTypesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap", "RenameTypes")
@js.native
class RenameTypes protected ()
  extends typingsSlinky.graphqlToolsWrap.transformsMod.RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameTypesOptions) = this()
}

