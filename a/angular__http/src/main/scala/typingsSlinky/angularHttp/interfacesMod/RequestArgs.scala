package typingsSlinky.angularHttp.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestArgs extends RequestOptionsArgs {
  @JSName("url")
  var url_RequestArgs: String | Null = js.native
}

object RequestArgs {
  @scala.inline
  def apply(): RequestArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestArgs]
  }
  @scala.inline
  implicit class RequestArgsOps[Self <: RequestArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(null)
        ret
    }
  }
  
}

