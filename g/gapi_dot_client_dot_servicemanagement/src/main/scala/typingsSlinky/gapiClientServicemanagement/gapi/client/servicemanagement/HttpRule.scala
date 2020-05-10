package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRule extends js.Object {
  /**
    * Additional HTTP bindings for the selector. Nested bindings must
    * not contain an `additional_bindings` field themselves (that is,
    * the nesting may only be one level deep).
    */
  var additionalBindings: js.UndefOr[js.Array[HttpRule]] = js.native
  /**
    * The name of the request field whose value is mapped to the HTTP body, or
    * `&#42;` for mapping all fields not captured by the path pattern to the HTTP
    * body. NOTE: the referred field must not be a repeated field and must be
    * present at the top-level of request message type.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * The custom pattern is used for specifying an HTTP method that is not
    * included in the `pattern` field, such as HEAD, or "&#42;" to leave the
    * HTTP method unspecified for this rule. The wild-card rule is useful
    * for services that provide content to Web (HTML) clients.
    */
  var custom: js.UndefOr[CustomHttpPattern] = js.native
  /** Used for deleting a resource. */
  var delete: js.UndefOr[String] = js.native
  /** Used for listing and getting information about resources. */
  var get: js.UndefOr[String] = js.native
  /**
    * Use this only for Scotty Requests. Do not use this for bytestream methods.
    * For media support, add instead [][google.bytestream.RestByteStream] as an
    * API to your configuration.
    */
  var mediaDownload: js.UndefOr[MediaDownload] = js.native
  /**
    * Use this only for Scotty Requests. Do not use this for media support using
    * Bytestream, add instead
    * [][google.bytestream.RestByteStream] as an API to your
    * configuration for Bytestream methods.
    */
  var mediaUpload: js.UndefOr[MediaUpload] = js.native
  /** Used for updating a resource. */
  var patch: js.UndefOr[String] = js.native
  /** Used for creating a resource. */
  var post: js.UndefOr[String] = js.native
  /** Used for updating a resource. */
  var put: js.UndefOr[String] = js.native
  /**
    * The name of the response field whose value is mapped to the HTTP body of
    * response. Other response fields are ignored. This field is optional. When
    * not set, the response message will be used as HTTP body of response.
    * NOTE: the referred field must be not a repeated field and must be present
    * at the top-level of response message type.
    */
  var responseBody: js.UndefOr[String] = js.native
  /**
    * Selects methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object HttpRule {
  @scala.inline
  def apply(): HttpRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRule]
  }
  @scala.inline
  implicit class HttpRuleOps[Self <: HttpRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalBindings(value: js.Array[HttpRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: CustomHttpPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaDownload(value: MediaDownload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaUpload(value: MediaUpload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withPatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBody")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

