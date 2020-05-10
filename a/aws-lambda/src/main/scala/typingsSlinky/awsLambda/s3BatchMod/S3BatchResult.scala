package typingsSlinky.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BatchResult extends js.Object {
  var invocationId: String = js.native
  var invocationSchemaVersion: String = js.native
  var results: js.Array[S3BatchResultResult] = js.native
  var treatMissingKeysAs: S3BatchResultResultCode = js.native
}

object S3BatchResult {
  @scala.inline
  def apply(
    invocationId: String,
    invocationSchemaVersion: String,
    results: js.Array[S3BatchResultResult],
    treatMissingKeysAs: S3BatchResultResultCode
  ): S3BatchResult = {
    val __obj = js.Dynamic.literal(invocationId = invocationId.asInstanceOf[js.Any], invocationSchemaVersion = invocationSchemaVersion.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], treatMissingKeysAs = treatMissingKeysAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BatchResult]
  }
  @scala.inline
  implicit class S3BatchResultOps[Self <: S3BatchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvocationSchemaVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationSchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[S3BatchResultResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreatMissingKeysAs(value: S3BatchResultResultCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatMissingKeysAs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

