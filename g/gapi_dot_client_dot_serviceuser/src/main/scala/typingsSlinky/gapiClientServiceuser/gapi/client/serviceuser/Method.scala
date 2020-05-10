package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  /** The simple name of this method. */
  var name: js.UndefOr[String] = js.native
  /** Any metadata attached to the method. */
  var options: js.UndefOr[js.Array[Option]] = js.native
  /** If true, the request is streamed. */
  var requestStreaming: js.UndefOr[Boolean] = js.native
  /** A URL of the input message type. */
  var requestTypeUrl: js.UndefOr[String] = js.native
  /** If true, the response is streamed. */
  var responseStreaming: js.UndefOr[Boolean] = js.native
  /** The URL of the output message type. */
  var responseTypeUrl: js.UndefOr[String] = js.native
  /** The source syntax of this method. */
  var syntax: js.UndefOr[String] = js.native
}

object Method {
  @scala.inline
  def apply(): Method = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Method]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[Option]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStreaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStreaming")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTypeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTypeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTypeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTypeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStreaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStreaming")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTypeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTypeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTypeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTypeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.undefined)
        ret
    }
  }
  
}

