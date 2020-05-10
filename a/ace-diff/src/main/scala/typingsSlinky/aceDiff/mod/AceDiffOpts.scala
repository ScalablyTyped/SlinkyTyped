package typingsSlinky.aceDiff.mod

import typingsSlinky.aceDiff.AnonConnector
import typingsSlinky.aceDiff.aceDiffStrings.broad
import typingsSlinky.aceDiff.aceDiffStrings.specific
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AceDiffOpts extends js.Object {
  var classes: js.UndefOr[AnonConnector] = js.native
  var diffGranularity: js.UndefOr[specific | broad] = js.native
  var left: js.UndefOr[AceDiffLROpts] = js.native
  var maxDiffs: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var right: js.UndefOr[AceDiffLROpts] = js.native
  var showConnectors: js.UndefOr[Boolean] = js.native
  var showDiffs: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object AceDiffOpts {
  @scala.inline
  def apply(): AceDiffOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AceDiffOpts]
  }
  @scala.inline
  implicit class AceDiffOptsOps[Self <: AceDiffOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: AnonConnector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffGranularity(value: specific | broad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffGranularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffGranularity")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: AceDiffLROpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDiffs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDiffs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDiffs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDiffs")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: AceDiffLROpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withShowConnectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConnectors")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDiffs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDiffs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDiffs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDiffs")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

