package typingsSlinky.apolloEngineReporting.agentMod

import typingsSlinky.apolloEngineReporting.apolloEngineReportingBooleans.`false`
import typingsSlinky.apolloServerEnv.fetchMod.RequestAgent
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineReportingOptions[TContext] extends js.Object {
  var apiKey: js.UndefOr[String] = js.native
  var calculateSignature: js.UndefOr[js.Function2[/* ast */ DocumentNode, /* operationName */ String, String]] = js.native
  var debugPrintReports: js.UndefOr[Boolean] = js.native
  var endpointUrl: js.UndefOr[String] = js.native
  var generateClientInfo: js.UndefOr[GenerateClientInfo[TContext]] = js.native
  var handleSignals: js.UndefOr[Boolean] = js.native
  var maskErrorDetails: js.UndefOr[Boolean] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var maxUncompressedReportSize: js.UndefOr[Double] = js.native
  var minimumRetryDelayMs: js.UndefOr[Double] = js.native
  var privateHeaders: js.UndefOr[js.Array[String] | Boolean] = js.native
  var privateVariables: js.UndefOr[js.Array[String] | Boolean] = js.native
  var reportErrorFunction: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  var reportIntervalMs: js.UndefOr[Double] = js.native
  var requestAgent: js.UndefOr[RequestAgent | `false`] = js.native
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.native
  var schemaTag: js.UndefOr[String] = js.native
  var sendHeaders: js.UndefOr[SendValuesBaseOptions] = js.native
  var sendReportsImmediately: js.UndefOr[Boolean] = js.native
  var sendVariableValues: js.UndefOr[VariableValueOptions] = js.native
}

object EngineReportingOptions {
  @scala.inline
  def apply[TContext](): EngineReportingOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineReportingOptions[TContext]]
  }
  @scala.inline
  implicit class EngineReportingOptionsOps[Self[tcontext] <: EngineReportingOptions[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withApiKey(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateSignature(value: (/* ast */ DocumentNode, /* operationName */ String) => String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSignature")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCalculateSignature: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugPrintReports(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugPrintReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugPrintReports: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugPrintReports")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointUrl(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointUrl: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateClientInfo(value: /* requestContext */ GraphQLRequestContext[TContext] => ClientInfo): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateClientInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGenerateClientInfo: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateClientInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSignals(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSignals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSignals: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSignals")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskErrorDetails(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskErrorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskErrorDetails: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskErrorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUncompressedReportSize(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUncompressedReportSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUncompressedReportSize: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUncompressedReportSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRetryDelayMs(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRetryDelayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRetryDelayMs: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRetryDelayMs")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateHeaders(value: js.Array[String] | Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateHeaders: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateVariables(value: js.Array[String] | Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateVariables: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withReportErrorFunction(value: /* err */ js.Error => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportErrorFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportErrorFunction: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportErrorFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withReportIntervalMs(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportIntervalMs: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportIntervalMs")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestAgent(value: RequestAgent | `false`): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestAgent: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteError(value: /* err */ GraphQLError => GraphQLError | Null): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRewriteError: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteError")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaTag(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaTag: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaTag")(js.undefined)
        ret
    }
    @scala.inline
    def withSendHeaders(value: SendValuesBaseOptions): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendHeaders: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSendReportsImmediately(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendReportsImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendReportsImmediately: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendReportsImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withSendVariableValues(value: VariableValueOptions): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendVariableValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendVariableValues: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendVariableValues")(js.undefined)
        ret
    }
  }
  
}

