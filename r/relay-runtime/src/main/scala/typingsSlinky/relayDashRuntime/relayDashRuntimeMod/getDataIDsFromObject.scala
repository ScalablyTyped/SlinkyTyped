package typingsSlinky.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getDataIDsFromObject")
@js.native
object getDataIDsFromObject extends js.Object {
  def apply(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[DataID | js.Array[DataID]] = js.native
}

