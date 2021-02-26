package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typingsSlinky.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typingsSlinky.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEntryPointLoaderMod {
  
  @JSImport("react-relay/lib/relay-experimental/useEntryPointLoader", "useEntryPointLoader")
  @js.native
  def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, _]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = js.native
  
  type UseEntryPointLoaderHookType[TEntryPoint] = js.Tuple3[
    js.UndefOr[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] | Null], 
    js.Function1[/* entryPointParams */ GetEntryPointParamsFromEntryPoint[TEntryPoint], Unit], 
    DisposeFn
  ]
}
