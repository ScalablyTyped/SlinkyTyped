package typingsSlinky.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowChartConfig extends js.Object {
  /**
    * default: 'linear'
    */
  var curve: js.UndefOr[String] = js.native
  /**
    * **htmlLabels** - Flag for setting whether or not a html tag should be used for rendering labels
    * on the edges
    * default: true
    */
  var htmlLabels: js.UndefOr[Boolean] = js.native
}

object FlowChartConfig {
  @scala.inline
  def apply(): FlowChartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowChartConfig]
  }
  @scala.inline
  implicit class FlowChartConfigOps[Self <: FlowChartConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlLabels")(js.undefined)
        ret
    }
  }
  
}

