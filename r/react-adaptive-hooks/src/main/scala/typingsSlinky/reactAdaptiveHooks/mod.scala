package typingsSlinky.reactAdaptiveHooks

import typingsSlinky.reactAdaptiveHooks.anon.EffectiveConnectionType
import typingsSlinky.reactAdaptiveHooks.anon.MediaCapabilities
import typingsSlinky.reactAdaptiveHooks.anon.NumberOfLogicalProcessors
import typingsSlinky.reactAdaptiveHooks.anon.SaveData
import typingsSlinky.reactAdaptiveHooks.anon.Unsupported
import typingsSlinky.reactAdaptiveHooks.anon.unsupportedfalseMemorySta
import typingsSlinky.reactAdaptiveHooks.mediaCapabilitiesMod.MediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adaptive-hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def useHardwareConcurrency(): NumberOfLogicalProcessors = js.native
  def useMediaCapabilities[T](mediaConfig: MediaConfiguration, initialMediaCapabilities: T): MediaCapabilities[T] = js.native
  def useMemoryStatus[T](): (Unsupported with T) | unsupportedfalseMemorySta = js.native
  def useMemoryStatus[T](initialMemoryStatus: T): (Unsupported with T) | unsupportedfalseMemorySta = js.native
  def useNetworkStatus(): EffectiveConnectionType = js.native
  def useNetworkStatus(
    initialEffectiveConnectionType: typingsSlinky.reactAdaptiveHooks.networkMod.EffectiveConnectionType
  ): EffectiveConnectionType = js.native
  def useSaveData(): SaveData = js.native
  def useSaveData(initialSaveDataStatus: Boolean): SaveData = js.native
}

