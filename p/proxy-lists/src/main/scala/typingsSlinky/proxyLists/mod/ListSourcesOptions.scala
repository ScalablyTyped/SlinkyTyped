package typingsSlinky.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSourcesOptions extends js.Object {
  var sourcesBlackList: js.UndefOr[js.Array[String]] = js.native
  var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.native
}

object ListSourcesOptions {
  @scala.inline
  def apply(): ListSourcesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourcesOptions]
  }
  @scala.inline
  implicit class ListSourcesOptionsOps[Self <: ListSourcesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourcesBlackList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesBlackList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcesBlackList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesBlackList")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcesWhiteList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesWhiteList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcesWhiteList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesWhiteList")(js.undefined)
        ret
    }
  }
  
}

