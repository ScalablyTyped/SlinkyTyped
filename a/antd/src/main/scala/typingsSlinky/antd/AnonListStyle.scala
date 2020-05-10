package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonListStyle extends js.Object {
  var dataSource: js.Array[scala.Nothing] = js.native
  var showSearch: Boolean = js.native
  def listStyle(): Unit = js.native
}

object AnonListStyle {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], listStyle: () => Unit, showSearch: Boolean): AnonListStyle = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = js.Any.fromFunction0(listStyle), showSearch = showSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListStyle]
  }
  @scala.inline
  implicit class AnonListStyleOps[Self <: AnonListStyle] (val x: Self) extends AnyVal {
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
    def withListStyle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

