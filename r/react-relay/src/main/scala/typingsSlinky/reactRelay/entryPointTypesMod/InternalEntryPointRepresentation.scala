package typingsSlinky.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{getPreloadProps (entryPointParams : TEntryPointParams): react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadProps<TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps, react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions>,   root  :unknown}> */
@js.native
trait InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val getPreloadProps: js.Function1[
    /* entryPointParams */ TEntryPointParams, 
    PreloadProps[
      TEntryPointParams, 
      TPreloadedQueries, 
      TPreloadedEntryPoints, 
      TExtraProps, 
      EnvironmentProviderOptions
    ]
  ] = js.native
  val root: js.Any = js.native
}

object InternalEntryPointRepresentation {
  @scala.inline
  def apply[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
    getPreloadProps: /* entryPointParams */ TEntryPointParams => PreloadProps[
      TEntryPointParams, 
      TPreloadedQueries, 
      TPreloadedEntryPoints, 
      TExtraProps, 
      EnvironmentProviderOptions
    ],
    root: js.Any
  ): InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  @scala.inline
  implicit class InternalEntryPointRepresentationOps[Self[tentrypointparams, tpreloadedqueries, tpreloadedentrypoints, truntimeprops, textraprops] <: InternalEntryPointRepresentation[tentrypointparams, tpreloadedqueries, tpreloadedentrypoints, truntimeprops, textraprops], TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] (val x: Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with Other]
    @scala.inline
    def withGetPreloadProps(
      value: /* entryPointParams */ TEntryPointParams => PreloadProps[
          TEntryPointParams, 
          TPreloadedQueries, 
          TPreloadedEntryPoints, 
          TExtraProps, 
          EnvironmentProviderOptions
        ]
    ): Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreloadProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

