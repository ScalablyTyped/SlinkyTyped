package typingsSlinky.googleapis.redisV1beta1Mod.redisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Operations.ListOperations.
  */
@js.native
trait SchemaListOperationsResponse extends js.Object {
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of operations that matches the specified filter in the request.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
}

object SchemaListOperationsResponse {
  @scala.inline
  def apply(): SchemaListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOperationsResponse]
  }
  @scala.inline
  implicit class SchemaListOperationsResponseOps[Self <: SchemaListOperationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: js.Array[SchemaOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
  }
  
}

