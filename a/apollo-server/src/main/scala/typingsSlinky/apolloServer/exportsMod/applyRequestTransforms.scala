package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "applyRequestTransforms")
@js.native
object applyRequestTransforms extends js.Object {
  def apply(originalRequest: Request, transforms: js.Array[Transform[Record[String, _]]]): Request = js.native
}

