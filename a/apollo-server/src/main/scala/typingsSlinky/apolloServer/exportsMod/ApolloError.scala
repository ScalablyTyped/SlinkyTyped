package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "ApolloError")
@js.native
class ApolloError protected ()
  extends typingsSlinky.apolloServerCore.mod.ApolloError {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: js.UndefOr[scala.Nothing], extensions: Record[String, _]) = this()
  def this(message: String, code: String, extensions: Record[String, _]) = this()
}
