package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponseAymf extends js.Object {
  var items: js.Array[NewsRepositoryInboxResponseItemsItem] = js.native
  var more_available: Boolean = js.native
}

object NewsRepositoryInboxResponseAymf {
  @scala.inline
  def apply(items: js.Array[NewsRepositoryInboxResponseItemsItem], more_available: Boolean): NewsRepositoryInboxResponseAymf = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseAymf]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponseAymfOps[Self <: NewsRepositoryInboxResponseAymf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[NewsRepositoryInboxResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

