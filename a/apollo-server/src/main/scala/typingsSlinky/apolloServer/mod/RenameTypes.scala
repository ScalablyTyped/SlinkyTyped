package typingsSlinky.apolloServer.mod

import typingsSlinky.graphqlToolsUtils.interfacesMod.RenameTypesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "RenameTypes")
@js.native
class RenameTypes protected ()
  extends typingsSlinky.apolloServer.exportsMod.RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameTypesOptions) = this()
}
