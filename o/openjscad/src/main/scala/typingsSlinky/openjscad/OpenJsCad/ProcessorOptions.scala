package typingsSlinky.openjscad.OpenJsCad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessorOptions extends IViewerOptions {
  var verbose: js.UndefOr[Boolean] = js.native
  var viewerheight: js.UndefOr[Double] = js.native
  var viewerheightratio: js.UndefOr[Double] = js.native
  var viewerwidth: js.UndefOr[Double] = js.native
}

object ProcessorOptions {
  @scala.inline
  def apply(): ProcessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessorOptions]
  }
  @scala.inline
  implicit class ProcessorOptionsOps[Self <: ProcessorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withViewerheight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerheight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewerheight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerheight")(js.undefined)
        ret
    }
    @scala.inline
    def withViewerheightratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerheightratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewerheightratio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerheightratio")(js.undefined)
        ret
    }
    @scala.inline
    def withViewerwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewerwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerwidth")(js.undefined)
        ret
    }
  }
  
}

