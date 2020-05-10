package typingsSlinky.expressBrute.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  /**
    * @summary Allows you to override the value of failCallback for this middleware.
    * @type {Function}
    */
  var failCallback: js.UndefOr[js.Function] = js.native
  /**
    * @summary Disregard IP address when matching requests if set to true. Defaults to false.
    * @type {boolean}
    */
  var ignoreIP: js.UndefOr[Boolean] = js.native
  /**
    * @summary Key.
    * @type {any}
    */
  var key: js.UndefOr[js.Any] = js.native
}

object Middleware {
  @scala.inline
  def apply(): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Middleware]
  }
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreIP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIP")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

