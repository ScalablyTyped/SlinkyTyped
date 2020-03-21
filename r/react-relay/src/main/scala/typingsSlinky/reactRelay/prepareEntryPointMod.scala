package typingsSlinky.reactRelay

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPoint
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps
import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/prepareEntryPoint", JSImport.Namespace)
@js.native
object prepareEntryPointMod extends js.Object {
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

