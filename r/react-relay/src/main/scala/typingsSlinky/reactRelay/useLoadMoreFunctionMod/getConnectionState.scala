package typingsSlinky.reactRelay.useLoadMoreFunctionMod

import typingsSlinky.reactRelay.anon.Cursor
import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/useLoadMoreFunction", "getConnectionState")
@js.native
object getConnectionState extends js.Object {
  
  def apply(
    direction: Direction,
    fragmentNode: ReaderFragment,
    fragmentData: js.Any,
    connectionPathInFragmentData: js.Array[String | Double]
  ): Cursor = js.native
}
