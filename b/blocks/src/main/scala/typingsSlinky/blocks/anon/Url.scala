package typingsSlinky.blocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Url extends js.Object {
  var url: js.UndefOr[String] = js.native
}

object Url {
  @scala.inline
  def apply(): Url = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Url]
  }
  @scala.inline
  implicit class UrlOps[Self <: Url] (val x: Self) extends AnyVal {
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
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

