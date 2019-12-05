package typingsSlinky.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRelayDashExperimentalEntryPointTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typingsSlinky.reactDashRelay.Anon_EntryPoint
  import typingsSlinky.reactDashRelay.Anon_EntryPointParams
  import typingsSlinky.reactDashRelay.Anon_EntryPoints
  import typingsSlinky.reactDashRelay.Anon_EntryPointsExtraProps
  import typingsSlinky.reactDashRelay.Anon_EntryPointsExtraPropsGetComponent
  import typingsSlinky.reactDashRelay.Anon_EnvironmentProviderOptions
  import typingsSlinky.reactDashRelay.reactDashRelayStrings.entryPoints
  import typingsSlinky.reactDashRelay.reactDashRelayStrings.extraProps
  import typingsSlinky.reactDashRelay.reactDashRelayStrings.props
  import typingsSlinky.reactDashRelay.reactDashRelayStrings.queries
  import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType

  type EntryPoint[TEntryPointParams, TEntryPointComponent] = InternalEntryPointRepresentation[
    TEntryPointParams, 
    LibraryManagedAttributes[TEntryPointComponent, queries], 
    LibraryManagedAttributes[TEntryPointComponent, entryPoints], 
    LibraryManagedAttributes[TEntryPointComponent, props], 
    LibraryManagedAttributes[TEntryPointComponent, extraProps]
  ]
  type EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = ReactComponentClass[
    EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ]
  type EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = Anon_EntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries]
  type EnvironmentProviderOptions = StringDictionary[js.Any]
  type ExtractEntryPointTypeHelper[TEntryPointParams] = js.Function1[
    /* entryPoint */ js.UndefOr[PreloadedEntryPoint[js.Any] | Null], 
    js.UndefOr[
      (ThinNestedEntryPointParams[TEntryPointParams, EntryPoint[TEntryPointParams, js.Any]]) | Null
    ]
  ]
  type ExtractQueryTypeHelper[TEnvironmentProviderOptions] = js.Function1[
    /* query */ PreloadedQuery[OperationType, EnvironmentProviderOptions], 
    ThinQueryParams[OperationType, TEnvironmentProviderOptions]
  ]
  type InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = Anon_EntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
  type PreloadProps[TPreloadParams, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions] = Anon_EntryPointsExtraProps[
    TPreloadParams, 
    TPreloadedEntryPoints, 
    TExtraProps, 
    TEnvironmentProviderOptions, 
    TPreloadedQueries
  ]
  type PreloadableConcreteRequest[TQuery /* <: OperationType */] = js.Object
  type PreloadedEntryPoint[TEntryPointComponent] = Anon_EntryPointsExtraPropsGetComponent[TEntryPointComponent]
  type ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] = Anon_EntryPoint[TEntryPoint, TEntryPointParams]
  type ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions] = Anon_EnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery]
}
