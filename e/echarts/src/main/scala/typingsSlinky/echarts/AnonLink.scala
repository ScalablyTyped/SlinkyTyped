package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLink extends js.Object {
  /**
    * child nodes, recursive definition, configurations are the
    * same as
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.children
    */
  var children: js.UndefOr[js.Array[_]] = js.native
  /**
    * Enable hyperlink jump when clicking on node.
    * It is avaliable when
    * [series-treemap.nodeClick](https://echarts.apache.org/en/option.html#series-treemap.nodeClick)
    * is `'link'`.
    *
    * See
    * [series-treemap.data.target](https://echarts.apache.org/en/option.html#series-treemap.data.target)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.link
    */
  var link: js.UndefOr[String] = js.native
  /**
    * The same meaning as `target` in `html` `<a>` label, See
    * [series-treemap.data.link](https://echarts.apache.org/en/option.html#series-treemap.data.link)
    * . Option values are: `'blank'` or `'self'`.
    *
    *
    * @default
    * "blank"
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.target
    */
  var target: js.UndefOr[String] = js.native
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.native
}

object AnonLink {
  @scala.inline
  def apply(): AnonLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLink]
  }
  @scala.inline
  implicit class AnonLinkOps[Self <: AnonLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: AnonExtraCssText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

