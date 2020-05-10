package typingsSlinky.fineUploader.coreMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.std.MimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasWrapper extends js.Object {
  /**
    * the `<canvas>` to be converted to a file & then uploaded
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  /**
    * the name to assign to the created file
    */
  var name: js.UndefOr[String] = js.native
  /**
    * `1`-`100` value indicating the desired quality of the converted file (only for `image/jpeg`)
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * MIME type of the file to create from this `<canvas>`
    */
  var `type`: js.UndefOr[MimeType] = js.native
}

object CanvasWrapper {
  @scala.inline
  def apply(): CanvasWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasWrapper]
  }
  @scala.inline
  implicit class CanvasWrapperOps[Self <: CanvasWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
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
    def withType(value: MimeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

