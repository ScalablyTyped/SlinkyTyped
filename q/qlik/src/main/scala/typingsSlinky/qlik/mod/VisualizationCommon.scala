package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisualizationCommon extends js.Object {
  var footnote: String = js.native
  var qHyperCubeDef: HyperCubeDef = js.native
  var showTitles: Boolean = js.native
  var subtitle: String = js.native
  var title: String = js.native
}

object VisualizationCommon {
  @scala.inline
  def apply(
    footnote: String,
    qHyperCubeDef: HyperCubeDef,
    showTitles: Boolean,
    subtitle: String,
    title: String
  ): VisualizationCommon = {
    val __obj = js.Dynamic.literal(footnote = footnote.asInstanceOf[js.Any], qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any], showTitles = showTitles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualizationCommon]
  }
  @scala.inline
  implicit class VisualizationCommonOps[Self <: VisualizationCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFootnote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHyperCubeDef(value: HyperCubeDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHyperCubeDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTitles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

