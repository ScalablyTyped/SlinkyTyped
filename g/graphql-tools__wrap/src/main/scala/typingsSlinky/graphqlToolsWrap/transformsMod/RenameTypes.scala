package typingsSlinky.graphqlToolsWrap.transformsMod

import typingsSlinky.graphqlToolsUtils.interfacesMod.RenameTypesOptions
import typingsSlinky.graphqlToolsWrap.renameTypesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "RenameTypes")
@js.native
class RenameTypes protected () extends default {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameTypesOptions) = this()
}

