package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowSearch extends js.Object {
  var dataSource: js.Array[scala.Nothing] = js.native
  var showSearch: Boolean = js.native
  var titleText: String = js.native
}

object ShowSearch {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], showSearch: Boolean, titleText: String): ShowSearch = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowSearch]
  }
  @scala.inline
  implicit class ShowSearchOps[Self <: ShowSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

