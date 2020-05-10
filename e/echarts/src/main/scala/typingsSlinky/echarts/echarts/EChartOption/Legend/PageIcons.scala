package typingsSlinky.echarts.echarts.EChartOption.Legend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageIcons extends js.Object {
  /**
    * The icons of page buttons when legend.orient is 'horizontal'.
    * It should be an array, [previous page button, next page button], ['M0,0L12,-10L12,10z', 'M0,0L-12,-10L-12,10z'] by default.
    *
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons.horizontal
    */
  var horizontal: js.UndefOr[js.Array[String]] = js.native
  /**
    * The icons of page buttons when legend.orient is 'vertical'.
    * It should be an array, [previous page button, next page button], ['M0,0L20,0L10,-20z', 'M0,0L20,0L10,20z'] by default.
    *
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons.vertical
    */
  var vertical: js.UndefOr[js.Array[String]] = js.native
}

object PageIcons {
  @scala.inline
  def apply(): PageIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIcons]
  }
  @scala.inline
  implicit class PageIconsOps[Self <: PageIcons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

