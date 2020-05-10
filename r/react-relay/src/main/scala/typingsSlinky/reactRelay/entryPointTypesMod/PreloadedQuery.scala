package typingsSlinky.reactRelay.entryPointTypesMod

import typingsSlinky.relayRuntime.mod.Observable
import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreloadedQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends js.Object {
  val environment: Environment = js.native
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.native
  val fetchKey: js.UndefOr[String | Double | Null] = js.native
  val fetchPolicy: PreloadFetchPolicy = js.native
  val name: String = js.native
  val source: js.UndefOr[Observable[GraphQLResponse] | Null] = js.native
  val variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any = js.native
}

object PreloadedQuery {
  @scala.inline
  def apply[TQuery, TEnvironmentProviderOptions](
    environment: Environment,
    fetchPolicy: PreloadFetchPolicy,
    name: String,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  }
  @scala.inline
  implicit class PreloadedQueryOps[Self[tquery, tenvironmentprovideroptions] <: PreloadedQuery[tquery, tenvironmentprovideroptions], TQuery, TEnvironmentProviderOptions] (val x: Self[TQuery, TEnvironmentProviderOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TQuery, TEnvironmentProviderOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TQuery, TEnvironmentProviderOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TQuery, TEnvironmentProviderOptions]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TQuery, TEnvironmentProviderOptions]) with Other]
    @scala.inline
    def withEnvironment(value: Environment): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchPolicy(value: PreloadFetchPolicy): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withEnvironmentProviderOptionsNull: Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentProviderOptions")(null)
        ret
    }
    @scala.inline
    def withFetchKey(value: String | Double): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchKey: Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchKeyNull: Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchKey")(null)
        ret
    }
    @scala.inline
    def withSource(value: Observable[GraphQLResponse]): Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceNull: Self[TQuery, TEnvironmentProviderOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(null)
        ret
    }
  }
  
}

