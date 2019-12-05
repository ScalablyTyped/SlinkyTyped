package typingsSlinky.reactDashRelay

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPoint
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPointProps
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/prepareEntryPoint", JSImport.Namespace)
@js.native
object libRelayDashExperimentalPrepareEntryPointMod extends js.Object {
  def prepareEntryPoint[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: ReactComponentClass[
    EntryPointProps[
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]
  ] */, // tslint:disable-next-line no-unnecessary-generics
  TEntryPoint /* <: EntryPoint[TEntryPointParams, TEntryPointComponent] */](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions],
    // tslint:disable-next-line no-unnecessary-generics
  entryPoint: TEntryPoint,
    entryPointParams: TEntryPointParams
  ): PreloadedEntryPoint[TEntryPointComponent] = js.native
}

