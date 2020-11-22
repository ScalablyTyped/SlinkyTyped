package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typingsSlinky.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typingsSlinky.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/loadEntryPoint", JSImport.Namespace)
@js.native
object loadEntryPointMod extends js.Object {
  
  def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, _]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = js.native
}
