package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphqlToolsDelegate.anon.Dehoist
import typingsSlinky.graphqlToolsUtils.interfacesMod.IFieldResolver
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "createMergedResolver")
@js.native
object createMergedResolver extends js.Object {
  def apply(hasFromPathDehoistDelimeter: Dehoist): IFieldResolver[_, _, Record[String, _], _] = js.native
}

