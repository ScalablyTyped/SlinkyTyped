package typingsSlinky.reactAdaptiveHooks

import typingsSlinky.reactAdaptiveHooks.anon.EffectiveConnectionType
import typingsSlinky.reactAdaptiveHooks.anon.MediaCapabilities
import typingsSlinky.reactAdaptiveHooks.anon.NumberOfLogicalProcessors
import typingsSlinky.reactAdaptiveHooks.anon.SaveData
import typingsSlinky.reactAdaptiveHooks.anon.Unsupported
import typingsSlinky.reactAdaptiveHooks.anon.unsupportedfalseMemorySta
import typingsSlinky.reactAdaptiveHooks.mediaCapabilitiesMod.MediaConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-adaptive-hooks", "useHardwareConcurrency")
  @js.native
  def useHardwareConcurrency(): NumberOfLogicalProcessors = js.native
  
  @JSImport("react-adaptive-hooks", "useMediaCapabilities")
  @js.native
  def useMediaCapabilities[T](mediaConfig: MediaConfiguration, initialMediaCapabilities: T): MediaCapabilities[T] = js.native
  
  @JSImport("react-adaptive-hooks", "useMemoryStatus")
  @js.native
  def useMemoryStatus[T](): (Unsupported with T) | unsupportedfalseMemorySta = js.native
  @JSImport("react-adaptive-hooks", "useMemoryStatus")
  @js.native
  def useMemoryStatus[T](initialMemoryStatus: T): (Unsupported with T) | unsupportedfalseMemorySta = js.native
  
  @JSImport("react-adaptive-hooks", "useNetworkStatus")
  @js.native
  def useNetworkStatus(): EffectiveConnectionType = js.native
  @JSImport("react-adaptive-hooks", "useNetworkStatus")
  @js.native
  def useNetworkStatus(
    initialEffectiveConnectionType: typingsSlinky.reactAdaptiveHooks.networkMod.EffectiveConnectionType
  ): EffectiveConnectionType = js.native
  
  @JSImport("react-adaptive-hooks", "useSaveData")
  @js.native
  def useSaveData(): SaveData = js.native
  @JSImport("react-adaptive-hooks", "useSaveData")
  @js.native
  def useSaveData(initialSaveDataStatus: Boolean): SaveData = js.native
}
