package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typingsSlinky.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typingsSlinky.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadEntryPointMod {
  
  @JSImport("react-relay/lib/relay-experimental/loadEntryPoint", "loadEntryPoint")
  @js.native
  def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, _]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = js.native
}
