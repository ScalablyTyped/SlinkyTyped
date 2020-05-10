package typingsSlinky.readmoreJs.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.readmoreJs.readmoreJsStrings.after
import typingsSlinky.readmoreJs.readmoreJsStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
   // called once per block during initilization after Readmore.js has processed the block
  var afterToggle: js.UndefOr[
    js.Function3[/* trigger */ Element, /* element */ Element, /* expanded */ Boolean, Unit]
  ] = js.native
  var beforeToggle: js.UndefOr[
    js.Function3[/* trigger */ Element, /* element */ Element, /* expanded */ Boolean, Unit]
  ] = js.native
   // insert required CSS dynamically, set this to false if you include the necessary CSS in a stylesheet
  var blockCSS: js.UndefOr[String] = js.native
   // called after a more or less link is clicked, but before the block is collapsed or expanded
  var blockProcessed: js.UndefOr[js.Function2[/* element */ Element, /* collapsable */ Boolean, Unit]] = js.native
   // 100 in milliseconds
  var collapsedHeight: js.UndefOr[Double] = js.native
   // HTML string for the "less" toggle link; also accepts a callback function that returns an HTML string
  var embedCSS: js.UndefOr[Boolean] = js.native
   // 200 in pixels
  var heightMargin: js.UndefOr[Double] = js.native
   // HTML string for the "more" toggle link; also accepts a callback function that returns an HTML string
  var lessLink: js.UndefOr[(js.Function1[/* element */ Element, String]) | String] = js.native
   // 16 in pixels, avoids collapsing blocks that are only slightly larger than collapsedHeight
  var moreLink: js.UndefOr[(js.Function1[/* element */ Element, String]) | String] = js.native
  var sourceOrder: js.UndefOr[after | before] = js.native
  var speed: js.UndefOr[Double] = js.native
   // sets the styling of the blocks, ignored if embedCSS is false
  var startOpen: js.UndefOr[Boolean] = js.native
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
    def withAfterToggle(value: (/* trigger */ Element, /* element */ Element, /* expanded */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterToggle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeToggle(value: (/* trigger */ Element, /* element */ Element, /* expanded */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeToggle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockCSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockProcessed(value: (/* element */ Element, /* collapsable */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockProcessed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBlockProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbedCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLessLinkFunction1(value: /* element */ Element => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLessLink(value: (js.Function1[/* element */ Element, String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessLink")(js.undefined)
        ret
    }
    @scala.inline
    def withMoreLinkFunction1(value: /* element */ Element => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoreLink(value: (js.Function1[/* element */ Element, String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceOrder(value: after | before): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(js.undefined)
        ret
    }
  }
  
}

