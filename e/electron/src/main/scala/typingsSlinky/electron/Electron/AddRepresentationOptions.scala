package typingsSlinky.electron.Electron

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRepresentationOptions extends js.Object {
  /**
    * The buffer containing the raw image data.
    */
  var buffer: js.UndefOr[Buffer] = js.native
  /**
    * The data URL containing either a base 64 encoded PNG or JPEG image.
    */
  var dataURL: js.UndefOr[String] = js.native
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as buffer.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The scale factor to add the image representation for.
    */
  var scaleFactor: Double = js.native
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as buffer.
    */
  var width: js.UndefOr[Double] = js.native
}

object AddRepresentationOptions {
  @scala.inline
  def apply(scaleFactor: Double): AddRepresentationOptions = {
    val __obj = js.Dynamic.literal(scaleFactor = scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRepresentationOptions]
  }
  @scala.inline
  implicit class AddRepresentationOptionsOps[Self <: AddRepresentationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withDataURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataURL")(js.undefined)
        ret
    }
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

