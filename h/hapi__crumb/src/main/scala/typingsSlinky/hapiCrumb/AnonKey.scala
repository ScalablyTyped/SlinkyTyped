package typingsSlinky.hapiCrumb

import typingsSlinky.hapiCrumb.hapiCrumbStrings.payload
import typingsSlinky.hapiCrumb.hapiCrumbStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKey extends js.Object {
  /**
    * The name of the cookie to store the CSRF crumb into.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Override for the server's 'restful' setting
    */
  var restful: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how the crumb will be sent in requests.
    *
    * @default 'payload'
    */
  var source: js.UndefOr[payload | query] = js.native
}

object AnonKey {
  @scala.inline
  def apply(): AnonKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonKey]
  }
  @scala.inline
  implicit class AnonKeyOps[Self <: AnonKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
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
    @scala.inline
    def withRestful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restful")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: payload | query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

