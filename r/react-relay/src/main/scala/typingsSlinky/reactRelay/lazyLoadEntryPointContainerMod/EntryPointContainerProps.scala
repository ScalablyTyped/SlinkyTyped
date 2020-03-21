package typingsSlinky.reactRelay.lazyLoadEntryPointContainerMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPoint
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps
import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.IEnvironmentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Readonly<{  entryPoint  :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EntryPoint<TEntryPointParams, react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EntryPointComponent<TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps>>,   entryPointParams  :TEntryPointParams,   environmentProvider ? :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.IEnvironmentProvider<react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions>,   props  :TRuntimeProps}>> */
trait EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val entryPoint: EntryPoint[
    TEntryPointParams, 
    ReactComponentClass[
      EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
    ]
  ]
  val entryPointParams: TEntryPointParams
  val environmentProvider: js.UndefOr[IEnvironmentProvider[EnvironmentProviderOptions]] = js.undefined
  val props: TRuntimeProps
}

object EntryPointContainerProps {
  @scala.inline
  def apply[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
    entryPoint: EntryPoint[
      TEntryPointParams, 
      ReactComponentClass[
        EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
      ]
    ],
    entryPointParams: TEntryPointParams,
    props: TRuntimeProps,
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions] = null
  ): EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (environmentProvider != null) __obj.updateDynamic("environmentProvider")(environmentProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
}

