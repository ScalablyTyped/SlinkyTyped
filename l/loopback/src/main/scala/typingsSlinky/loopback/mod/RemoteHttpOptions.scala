package typingsSlinky.loopback.mod

import typingsSlinky.loopback.loopbackStrings.all
import typingsSlinky.loopback.loopbackStrings.del
import typingsSlinky.loopback.loopbackStrings.get
import typingsSlinky.loopback.loopbackStrings.patch
import typingsSlinky.loopback.loopbackStrings.post
import typingsSlinky.loopback.loopbackStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @interface
  * @property {string} path HTTP path (relative to the model) at which the method is exposed.
  * @property {'get' | 'post' | 'patch' | 'put' | 'del' | 'all'} verb HTTP method (verb) at which the method is available.
  * @property {number} status	Default HTTP status set when the callback is called without an error.
  * @property {number} errorStatus	Default HTTP status set when the callback is called with an error.
  */
@js.native
trait RemoteHttpOptions extends js.Object {
  /**
    * errorStatus	Default HTTP status set when the callback is called with an error.
    * ```
    * {errorStatus: 400}
    * ```
    */
  var errorStatus: js.UndefOr[Double] = js.native
  /**
    * HTTP path (relative to the model) at which the method is exposed.
    * ```
    * http: {path: '/sayhi'}
    * ```
    */
  var path: String = js.native
  /**
    * status	Default HTTP status set when the callback is called without an error.
    * ```
    * {status: 201}
    * ```
    */
  var status: js.UndefOr[Double] = js.native
  /**
    * HTTP method (verb) at which the method is available.
    * ```
    * http: {path: '/sayhi', verb: 'get'}
    * ```
    * default = post
    */
  var verb: get | post | patch | put | del | all = js.native
}

object RemoteHttpOptions {
  @scala.inline
  def apply(path: String, verb: get | post | patch | put | del | all): RemoteHttpOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteHttpOptions]
  }
  @scala.inline
  implicit class RemoteHttpOptionsOps[Self <: RemoteHttpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerb(value: get | post | patch | put | del | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

