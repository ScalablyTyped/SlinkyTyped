package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedURLOptions extends js.Object {
  /**
    * HTTP request headers.
    */
  var headers: js.UndefOr[Headers] = js.undefined
  /**
    * Either json or default, see the README for more information.
    */
  var serverType: js.UndefOr[String] = js.undefined
  var url: String
}

object FeedURLOptions {
  @scala.inline
  def apply(url: String): FeedURLOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedURLOptions]
  }
  @scala.inline
  implicit class FeedURLOptionsOps[Self <: FeedURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setServerType(value: String): Self = this.set("serverType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerType: Self = this.set("serverType", js.undefined)
  }
  
}

