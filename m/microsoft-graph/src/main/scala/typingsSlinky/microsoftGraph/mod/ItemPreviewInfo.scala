package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemPreviewInfo extends js.Object {
  var getUrl: js.UndefOr[String] = js.native
  var postParameters: js.UndefOr[String] = js.native
  var postUrl: js.UndefOr[String] = js.native
}

object ItemPreviewInfo {
  @scala.inline
  def apply(): ItemPreviewInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemPreviewInfo]
  }
  @scala.inline
  implicit class ItemPreviewInfoOps[Self <: ItemPreviewInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPostParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPostUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postUrl")(js.undefined)
        ret
    }
  }
  
}

