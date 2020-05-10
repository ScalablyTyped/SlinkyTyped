package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An optional Metadata to attach to any RPC request to tell the server about
  * an external context of the request. The server may use this for logging or
  * other purposes. To use it, the client attaches the header to the call using
  * the canonical proto serialization: name:
  * google.devtools.remoteexecution.v1test.requestmetadata-bin contents: the
  * base64 encoded binary RequestMetadata message.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata extends js.Object {
  /**
    * An identifier that ties multiple requests to the same action. For
    * example, multiple requests to the CAS, Action Cache, and Execution API
    * are used in order to compile foo.cc.
    */
  var actionId: js.UndefOr[String] = js.native
  /**
    * An identifier to tie multiple tool invocations together. For example,
    * runs of foo_test, bar_test and baz_test on a post-submit of a given
    * patch.
    */
  var correlatedInvocationsId: js.UndefOr[String] = js.native
  /**
    * The details for the tool invoking the requests.
    */
  var toolDetails: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails] = js.native
  /**
    * An identifier that ties multiple actions together to a final result. For
    * example, multiple actions are required to build and run foo_test.
    */
  var toolInvocationId: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadataOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrelatedInvocationsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlatedInvocationsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelatedInvocationsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlatedInvocationsId")(js.undefined)
        ret
    }
    @scala.inline
    def withToolDetails(value: SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withToolInvocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolInvocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolInvocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolInvocationId")(js.undefined)
        ret
    }
  }
  
}

