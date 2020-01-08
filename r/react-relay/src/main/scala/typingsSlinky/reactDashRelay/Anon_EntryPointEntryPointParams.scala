package typingsSlinky.reactDashRelay

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPoint
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPointProps
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.IEnvironmentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPointEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  var entryPoint: EntryPoint[
    TEntryPointParams, 
    ReactComponentClass[
      EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
    ]
  ]
  var entryPointParams: TEntryPointParams
  var environmentProvider: js.UndefOr[IEnvironmentProvider[EnvironmentProviderOptions]] = js.undefined
  var props: TRuntimeProps
}

object Anon_EntryPointEntryPointParams {
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
  ): Anon_EntryPointEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (environmentProvider != null) __obj.updateDynamic("environmentProvider")(environmentProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EntryPointEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
}

