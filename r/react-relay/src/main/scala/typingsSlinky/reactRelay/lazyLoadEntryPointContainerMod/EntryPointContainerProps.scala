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
@js.native
trait EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val entryPoint: EntryPoint[
    TEntryPointParams, 
    ReactComponentClass[
      EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
    ]
  ] = js.native
  val entryPointParams: TEntryPointParams = js.native
  val environmentProvider: js.UndefOr[IEnvironmentProvider[EnvironmentProviderOptions]] = js.native
  val props: TRuntimeProps = js.native
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
    props: TRuntimeProps
  ): EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  @scala.inline
  implicit class EntryPointContainerPropsOps[Self[tentrypointparams, tpreloadedqueries, tpreloadedentrypoints, truntimeprops, textraprops] <: EntryPointContainerProps[tentrypointparams, tpreloadedqueries, tpreloadedentrypoints, truntimeprops, textraprops], TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] (val x: Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with Other]
    @scala.inline
    def withEntryPoint(
      value: EntryPoint[
          TEntryPointParams, 
          ReactComponentClass[
            EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
          ]
        ]
    ): Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryPointParams(value: TEntryPointParams): Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: TRuntimeProps): Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentProvider(value: IEnvironmentProvider[EnvironmentProviderOptions]): Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentProvider: Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentProvider")(js.undefined)
        ret
    }
  }
  
}

