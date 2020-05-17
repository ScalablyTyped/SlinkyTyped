package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.googleCloudCommon.anon.ContentType
import typingsSlinky.googleCloudCommon.anon.OnAuthenticated
import typingsSlinky.teenyRequest.mod.Options
import typingsSlinky.teenyRequest.mod.OptionsWithUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeWritableStreamOptions extends js.Object {
  /**
    * A connection instance used to get a token with and send the request
    * through.
    */
  var connection: js.UndefOr[js.Object] = js.native
  /**
    * Metadata to send at the head of the request.
    */
  var metadata: js.UndefOr[ContentType] = js.native
  /**
    * Request object, in the format of a standard Node.js http.request() object.
    */
  var request: js.UndefOr[Options] = js.native
  def makeAuthenticatedRequest(reqOpts: OptionsWithUri, fnobj: OnAuthenticated): Unit = js.native
}

object MakeWritableStreamOptions {
  @scala.inline
  def apply(makeAuthenticatedRequest: (OptionsWithUri, OnAuthenticated) => Unit): MakeWritableStreamOptions = {
    val __obj = js.Dynamic.literal(makeAuthenticatedRequest = js.Any.fromFunction2(makeAuthenticatedRequest))
    __obj.asInstanceOf[MakeWritableStreamOptions]
  }
  @scala.inline
  implicit class MakeWritableStreamOptionsOps[Self <: MakeWritableStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMakeAuthenticatedRequest(value: (OptionsWithUri, OnAuthenticated) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeAuthenticatedRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConnection(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
  }
  
}

