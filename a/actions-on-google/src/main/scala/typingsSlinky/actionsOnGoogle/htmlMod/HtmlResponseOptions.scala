package typingsSlinky.actionsOnGoogle.htmlMod

import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlResponseOptions[TData /* <: JsonObject */] extends js.Object {
  /**
    * Communicate the following JSON object to the web app.
    *
    * Alias of `updatedState`
    * @public
    */
  var data: js.UndefOr[TData] = js.native
  /**
    * Configure if the mic is closed after this html response.
    *
    * Alias of `suppressMic`
    * @public
    */
  var suppress: js.UndefOr[Boolean] = js.native
  /**
    * The url of the web app.
    *
    * @public
    */
  var url: js.UndefOr[String] = js.native
}

object HtmlResponseOptions {
  @scala.inline
  def apply[TData](): HtmlResponseOptions[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlResponseOptions[TData]]
  }
  @scala.inline
  implicit class HtmlResponseOptionsOps[Self[tdata] <: HtmlResponseOptions[tdata], TData] (val x: Self[TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TData] with Other]
    @scala.inline
    def withData(value: TData): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppress(value: Boolean): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppress: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppress")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

