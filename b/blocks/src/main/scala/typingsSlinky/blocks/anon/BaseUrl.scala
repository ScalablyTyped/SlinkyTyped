package typingsSlinky.blocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var create: js.UndefOr[Url] = js.native
  var destroy: js.UndefOr[Url] = js.native
  var idAttr: js.UndefOr[String] = js.native
  var read: js.UndefOr[Url] = js.native
  var update: js.UndefOr[Url] = js.native
}

object BaseUrl {
  @scala.inline
  def apply(): BaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseUrl]
  }
  @scala.inline
  implicit class BaseUrlOps[Self <: BaseUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withIdAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

