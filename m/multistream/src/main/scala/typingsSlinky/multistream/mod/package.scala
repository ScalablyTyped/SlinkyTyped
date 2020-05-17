package typingsSlinky.multistream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FactoryStream = js.Function1[/* cb */ typingsSlinky.multistream.mod.FactoryStreamCallback, scala.Unit]
  type LazyStream = js.Function0[typingsSlinky.node.streamMod.Stream]
}
