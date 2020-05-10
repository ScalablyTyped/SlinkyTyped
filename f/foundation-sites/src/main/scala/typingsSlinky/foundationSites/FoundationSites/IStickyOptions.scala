package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStickyOptions extends js.Object {
  var anchor: js.UndefOr[String] = js.native
  var btmAnchor: js.UndefOr[String] = js.native
  var checkEvery: js.UndefOr[Double] = js.native
  var container: js.UndefOr[String] = js.native
  var containerClass: js.UndefOr[String] = js.native
  var marginBottom: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
  var stickTo: js.UndefOr[String] = js.native
  var stickyClass: js.UndefOr[String] = js.native
  var stickyOn: js.UndefOr[String] = js.native
  var topAnchor: js.UndefOr[String] = js.native
}

object IStickyOptions {
  @scala.inline
  def apply(): IStickyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStickyOptions]
  }
  @scala.inline
  implicit class IStickyOptionsOps[Self <: IStickyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withBtmAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btmAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtmAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btmAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckEvery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkEvery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckEvery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkEvery")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withStickTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickTo")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyClass")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyOn")(js.undefined)
        ret
    }
    @scala.inline
    def withTopAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topAnchor")(js.undefined)
        ret
    }
  }
  
}

