package typingsSlinky.expressSitemapXml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeafObject extends js.Object {
  var changeFreq: js.UndefOr[String] = js.native
  var lastMod: js.UndefOr[String | js.Date] = js.native
  var url: String = js.native
}

object LeafObject {
  @scala.inline
  def apply(url: String): LeafObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafObject]
  }
  @scala.inline
  implicit class LeafObjectOps[Self <: LeafObject] (val x: Self) extends AnyVal {
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
    def withChangeFreq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFreq")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastMod(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastMod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMod")(js.undefined)
        ret
    }
  }
  
}

