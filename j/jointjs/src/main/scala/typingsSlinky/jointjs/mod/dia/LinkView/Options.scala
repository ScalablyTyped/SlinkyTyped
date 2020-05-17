package typingsSlinky.jointjs.mod.dia.LinkView

import typingsSlinky.jointjs.mod.dia.Link
import typingsSlinky.jointjs.mod.mvc.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ViewOptions[Link] {
  var doubleLinkTools: js.UndefOr[Boolean] = js.native
  var doubleLinkToolsOffset: js.UndefOr[Double] = js.native
  var linkToolsOffset: js.UndefOr[Double] = js.native
  var longLinkLength: js.UndefOr[Double] = js.native
  var sampleInterval: js.UndefOr[Double] = js.native
  var shortLinkLength: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoubleLinkTools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleLinkTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleLinkTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleLinkTools")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleLinkToolsOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleLinkToolsOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleLinkToolsOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleLinkToolsOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkToolsOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkToolsOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkToolsOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkToolsOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLongLinkLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longLinkLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongLinkLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longLinkLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withShortLinkLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortLinkLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortLinkLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortLinkLength")(js.undefined)
        ret
    }
  }
  
}

