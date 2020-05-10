package typingsSlinky.apolloEngineReporting.agentMod

import typingsSlinky.apolloEngineReportingProtobuf.mod.Trace
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTraceArgs extends js.Object {
  var documentAST: js.UndefOr[DocumentNode] = js.native
  var operationName: String = js.native
  var queryHash: String = js.native
  var queryString: js.UndefOr[String] = js.native
  var schemaHash: String = js.native
  var trace: Trace = js.native
}

object AddTraceArgs {
  @scala.inline
  def apply(operationName: String, queryHash: String, schemaHash: String, trace: Trace): AddTraceArgs = {
    val __obj = js.Dynamic.literal(operationName = operationName.asInstanceOf[js.Any], queryHash = queryHash.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTraceArgs]
  }
  @scala.inline
  implicit class AddTraceArgsOps[Self <: AddTraceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrace(value: Trace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentAST(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentAST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentAST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentAST")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(js.undefined)
        ret
    }
  }
  
}

