package typingsSlinky.reactRelay.entryPointTypesMod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  environmentProviderOptions ? :TEnvironmentProviderOptions | null,   options ? :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadOptions | null,   parameters  :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadableConcreteRequest<TQuery>,   variables  :TQuery['variables']}> */
@js.native
trait ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends js.Object {
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions] = js.native
  val options: js.UndefOr[PreloadOptions] = js.native
  val parameters: PreloadableConcreteRequest[TQuery] = js.native
  val variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any = js.native
}

object ThinQueryParams {
  @scala.inline
  def apply[TQuery, TEnvironmentProviderOptions](
    parameters: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): ThinQueryParams[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinQueryParams[TQuery, TEnvironmentProviderOptions]]
  }
  @scala.inline
  implicit class ThinQueryParamsOps[Self[tquery, tenvironmentprovideroptions] <: ThinQueryParams[tquery, tenvironmentprovideroptions], TQuery, TEnvironmentProviderOptions] (val x: Self[TQuery, TEnvironmentProviderOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TQuery, TEnvironmentProviderOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TQuery, TEnvironmentProviderOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TQuery, TEnvironmentProviderOptions]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TQuery, TEnvironmentProviderOptions]) with Other]
    @scala.inline
    def withParameters(value: PreloadableConcreteRequest[TQuery]): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
    ): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentProviderOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentProviderOptions: Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentProviderOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: PreloadOptions): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

