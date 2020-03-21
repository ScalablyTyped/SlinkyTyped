package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getDataIDsFromFragment")
@js.native
object getDataIDsFromFragment extends js.Object {
  def apply(fragment: ReaderFragment, item: js.Any): DataID | js.Array[DataID] = js.native
  def apply(fragment: ReaderFragment, item: js.Array[_]): DataID | js.Array[DataID] = js.native
}

