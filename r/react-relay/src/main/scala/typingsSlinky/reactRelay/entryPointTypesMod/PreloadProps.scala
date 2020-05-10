package typingsSlinky.reactRelay.entryPointTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints ? :{[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>},   extraProps ? :TExtraProps,   queries ? :{[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}}> */
@js.native
trait PreloadProps[TPreloadParams, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions] extends js.Object {
  val entryPoints: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
    */ typingsSlinky.reactRelay.reactRelayStrings.PreloadProps with TopLevel[js.Any]
  ] = js.native
  val extraProps: js.UndefOr[TExtraProps] = js.native
  val queries: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
    */ typingsSlinky.reactRelay.reactRelayStrings.PreloadProps with TopLevel[js.Any]
  ] = js.native
}

object PreloadProps {
  @scala.inline
  def apply[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps, TEnvironmentProviderOptions](): PreloadProps[
    TPreloadParams, 
    TPreloadedQueries, 
    TPreloadedEntryPoints, 
    TExtraProps, 
    TEnvironmentProviderOptions
  ] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreloadProps[
      TPreloadParams, 
      TPreloadedQueries, 
      TPreloadedEntryPoints, 
      TExtraProps, 
      TEnvironmentProviderOptions
    ]]
  }
  @scala.inline
  implicit class PreloadPropsOps[Self[tpreloadparams, tpreloadedqueries, tpreloadedentrypoints, textraprops, tenvironmentprovideroptions] <: PreloadProps[
    tpreloadparams, 
    tpreloadedqueries, 
    tpreloadedentrypoints, 
    textraprops, 
    tenvironmentprovideroptions
  ], TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps, TEnvironmentProviderOptions] (val x: Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ]) extends AnyVal {
    @scala.inline
    def duplicate: Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ]) with Other]
    @scala.inline
    def withEntryPoints(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
      */ typingsSlinky.reactRelay.reactRelayStrings.PreloadProps with TopLevel[js.Any]
    ): Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPoints: Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraProps(value: TExtraProps): Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraProps: Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
      */ typingsSlinky.reactRelay.reactRelayStrings.PreloadProps with TopLevel[js.Any]
    ): Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
  }
  
}

