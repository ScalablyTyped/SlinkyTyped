package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayStoreTypesMod.PluralReaderSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getPluralSelector")
@js.native
object getPluralSelector extends js.Object {
  def apply(fragment: ReaderFragment, items: js.Array[_]): PluralReaderSelector = js.native
}

