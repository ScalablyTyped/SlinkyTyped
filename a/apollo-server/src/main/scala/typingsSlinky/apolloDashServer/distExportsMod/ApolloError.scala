package typingsSlinky.apolloDashServer.distExportsMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "ApolloError")
@js.native
class ApolloError protected ()
  extends typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreMod.ApolloError {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: String, extensions: Record[String, _]) = this()
}

