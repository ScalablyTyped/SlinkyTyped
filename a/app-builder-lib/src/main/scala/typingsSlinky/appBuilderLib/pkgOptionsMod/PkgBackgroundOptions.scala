package typingsSlinky.appBuilderLib.pkgOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgBackgroundOptions extends js.Object {
  /**
    * Alignment of the background image.
    * Options are: center, left, right, top, bottom, topleft, topright, bottomleft, bottomright
    * @default center
    */
  var alignment: js.UndefOr[BackgroundAlignment | Null] = js.native
  /**
    * Path to the image to use as an installer background.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * Scaling of the background image.
    * Options are: tofit, none, proportional
    * @default tofit
    */
  var scaling: js.UndefOr[BackgroundScaling | Null] = js.native
}

object PkgBackgroundOptions {
  @scala.inline
  def apply(): PkgBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PkgBackgroundOptions]
  }
  @scala.inline
  implicit class PkgBackgroundOptionsOps[Self <: PkgBackgroundOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: BackgroundAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignmentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(null)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withScaling(value: BackgroundScaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(null)
        ret
    }
  }
  
}

