package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request and response header transformations that take effect before the
  * request is passed along to the selected backendService.
  */
@js.native
trait SchemaHttpHeaderAction extends js.Object {
  /**
    * Headers to add to a matching request prior to forwarding the request to
    * the backendService.
    */
  var requestHeadersToAdd: js.UndefOr[js.Array[SchemaHttpHeaderOption]] = js.native
  /**
    * A list of header names for headers that need to be removed from the
    * request prior to forwarding the request to the backendService.
    */
  var requestHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
  /**
    * Headers to add the response prior to sending the response back to the
    * client.
    */
  var responseHeadersToAdd: js.UndefOr[js.Array[SchemaHttpHeaderOption]] = js.native
  /**
    * A list of header names for headers that need to be removed from the
    * response prior to sending the response back to the client.
    */
  var responseHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
}

object SchemaHttpHeaderAction {
  @scala.inline
  def apply(): SchemaHttpHeaderAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderAction]
  }
  @scala.inline
  implicit class SchemaHttpHeaderActionOps[Self <: SchemaHttpHeaderAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestHeadersToAdd(value: js.Array[SchemaHttpHeaderOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeadersToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestHeadersToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeadersToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestHeadersToRemove(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeadersToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestHeadersToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeadersToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseHeadersToAdd(value: js.Array[SchemaHttpHeaderOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeadersToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseHeadersToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeadersToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseHeadersToRemove(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeadersToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseHeadersToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeadersToRemove")(js.undefined)
        ret
    }
  }
  
}

