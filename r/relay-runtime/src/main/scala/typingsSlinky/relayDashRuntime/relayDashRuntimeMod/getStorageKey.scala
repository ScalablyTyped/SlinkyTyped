package typingsSlinky.relayDashRuntime.relayDashRuntimeMod

import typingsSlinky.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationField
import typingsSlinky.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationHandle
import typingsSlinky.relayDashRuntime.libUtilReaderNodeMod.ReaderField
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getStorageKey")
@js.native
object getStorageKey extends js.Object {
  def apply(field: NormalizationField, variables: Variables): String = js.native
  def apply(field: NormalizationHandle, variables: Variables): String = js.native
  def apply(field: ReaderField, variables: Variables): String = js.native
}

