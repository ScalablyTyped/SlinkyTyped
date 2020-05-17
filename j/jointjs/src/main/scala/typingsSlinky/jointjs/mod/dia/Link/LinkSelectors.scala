package typingsSlinky.jointjs.mod.dia.Link

import typingsSlinky.jointjs.mod.attributes.SVGAttributes
import typingsSlinky.jointjs.mod.attributes.SVGPathAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkSelectors extends Selectors {
  @JSName(".connection")
  var Dotconnection: js.UndefOr[SVGPathAttributes] = js.native
  @JSName(".connection-wrap")
  var `Dotconnection-wrap`: js.UndefOr[SVGPathAttributes] = js.native
  @JSName(".labels")
  var Dotlabels: js.UndefOr[SVGAttributes] = js.native
  @JSName(".link-tools")
  var `Dotlink-tools`: js.UndefOr[SVGAttributes] = js.native
  @JSName(".marker-arrowheads")
  var `Dotmarker-arrowheads`: js.UndefOr[SVGAttributes] = js.native
  @JSName(".marker-source")
  var `Dotmarker-source`: js.UndefOr[SVGPathAttributes] = js.native
  @JSName(".marker-target")
  var `Dotmarker-target`: js.UndefOr[SVGPathAttributes] = js.native
  @JSName(".marker-vertices")
  var `Dotmarker-vertices`: js.UndefOr[SVGAttributes] = js.native
}

object LinkSelectors {
  @scala.inline
  def apply(): LinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkSelectors]
  }
  @scala.inline
  implicit class LinkSelectorsOps[Self <: LinkSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotconnection(value: SVGPathAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotconnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".connection")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotconnection-wrap`(value: SVGPathAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".connection-wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotconnection-wrap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".connection-wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withDotlabels(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotlabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".labels")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotlink-tools`(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".link-tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotlink-tools`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".link-tools")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotmarker-arrowheads`(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".marker-arrowheads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotmarker-arrowheads`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".marker-arrowheads")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotmarker-source`(value: SVGPathAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".marker-source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotmarker-source`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".marker-source")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotmarker-target`(value: SVGPathAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".marker-target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotmarker-target`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".marker-target")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotmarker-vertices`(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".marker-vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotmarker-vertices`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".marker-vertices")(js.undefined)
        ret
    }
  }
  
}

