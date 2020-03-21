package typingsSlinky.loadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttrFn = js.Function1[/* chunk */ typingsSlinky.loadableServer.mod.Chunk, js.Object]
  type ChunkExtractorOptions = typingsSlinky.loadableServer.AnonEntrypoints with (typingsSlinky.loadableServer.AnonStatsFile | typingsSlinky.loadableServer.AnonStats)
}
