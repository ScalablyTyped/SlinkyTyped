package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeOptions extends js.Object {
  /**
    * Defaults to the image's height.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The desired quality of the resize image. Possible values are good, better or
    * best. The default is best. These values express a desired quality/speed
    * tradeoff. They are translated into an algorithm-specific method that depends on
    * the capabilities (CPU, GPU) of the underlying platform. It is possible for all
    * three methods to be mapped to the same algorithm on a given platform.
    */
  var quality: js.UndefOr[String] = js.native
  /**
    * Defaults to the image's width.
    */
  var width: js.UndefOr[Double] = js.native
}

object ResizeOptions {
  @scala.inline
  def apply(): ResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeOptions]
  }
  @scala.inline
  implicit class ResizeOptionsOps[Self <: ResizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

