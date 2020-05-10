package typingsSlinky.browserImageCompression.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Default to be the exif orientation from the image file */
  var exifOrientation: js.UndefOr[Double] = js.native
  /** Default to be the original mime type from the image file */
  var fileType: js.UndefOr[String] = js.native
  /** @default 10 */
  var maxIteration: js.UndefOr[Double] = js.native
  /** @default Number.POSITIVE_INFINITY */
  var maxSizeMB: js.UndefOr[Double] = js.native
  /** @default undefined */
  var maxWidthOrHeight: js.UndefOr[Double] = js.native
  /** A function takes one progress argument (progress from 0 to 100) */
  var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.native
  /** @default false */
  var useWebWorker: js.UndefOr[Boolean] = js.native
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
    def withExifOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exifOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExifOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exifOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIteration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSizeMB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizeMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSizeMB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizeMB")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidthOrHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidthOrHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidthOrHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidthOrHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* progress */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWebWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWebWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWebWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWebWorker")(js.undefined)
        ret
    }
  }
  
}

