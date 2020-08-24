package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "applyResultTransforms")
@js.native
object applyResultTransforms extends js.Object {
  def apply(originalResult: js.Any, transforms: js.Array[Transform[Record[String, _]]]): js.Any = js.native
}

