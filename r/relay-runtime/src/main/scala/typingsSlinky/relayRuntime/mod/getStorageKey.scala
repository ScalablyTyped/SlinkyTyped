package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationField
import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationHandle
import typingsSlinky.relayRuntime.readerNodeMod.ReaderField
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime", "getStorageKey")
@js.native
object getStorageKey extends js.Object {
  
  def apply(field: NormalizationField, variables: Variables): String = js.native
  def apply(field: NormalizationHandle, variables: Variables): String = js.native
  def apply(field: ReaderField, variables: Variables): String = js.native
}
