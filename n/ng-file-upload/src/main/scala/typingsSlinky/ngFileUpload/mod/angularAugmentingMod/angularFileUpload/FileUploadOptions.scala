package typingsSlinky.ngFileUpload.mod.angularAugmentingMod.angularFileUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadOptions extends js.Object {
  /**
    * Standard HTML accept attr, browser specific select popup window
    * @type {string}
    */
  var ngfAccept: js.UndefOr[String] = js.native
  /**
    * Default true, allow dropping files only for Chrome webkit browser
    * @type {boolean}
    */
  var ngfAllowDir: js.UndefOr[Boolean] = js.native
  /**
    * Default false, enable firefox image paste by making element contenteditable
    * @type {boolean}
    */
  var ngfEnableFirefoxPaste: js.UndefOr[Boolean] = js.native
  /**
    * Default false, hides element if file drag&drop is not
    * @type {boolean}
    */
  var ngfHideOnDropNotAvailable: js.UndefOr[Boolean] = js.native
  /**
    * Validate error name: maxDuration
    * @type {(number|string)}
    */
  var ngfMaxDuration: js.UndefOr[Double | String] = js.native
  /**
    * Maximum number of files allowed to be selected or dropped, validate error name: maxFiles
    * @type {number}
    */
  var ngfMaxFiles: js.UndefOr[Double] = js.native
  /**
    * Validate error name: maxSize
    * @type {(number|string)}
    */
  var ngfMaxSize: js.UndefOr[Double | String] = js.native
  /**
    * Validate error name: maxTotalSize
    * @type {(number|string)}
    */
  var ngfMaxTotalSize: js.UndefOr[Double | String] = js.native
  /**
    * Validate error name: minDuration
    * @type {(number|string)}
    */
  var ngfMinDuration: js.UndefOr[Double | String] = js.native
  /**
    * Validate error name: minRatio
    * @type {(number|string)}
    */
  var ngfMinRatio: js.UndefOr[Double | String] = js.native
  /**
    * Validate error name: minSize
    * @type {(number|string)}
    */
  var ngfMinSize: js.UndefOr[Double | String] = js.native
  /**
    * Allows selecting multiple files
    * @type {boolean}
    */
  var ngfMultiple: js.UndefOr[Boolean] = js.native
  /**
    * List of comma separated valid aspect ratio of images in float or 2:3 format
    * @type {string}
    */
  var ngfRatio: js.UndefOr[String] = js.native
  /**
    * Default false, whether to propagate drag/drop events.
    * @type {boolean}
    */
  var ngfStopPropagation: js.UndefOr[Boolean] = js.native
  /**
    * Default false, if true file.$error will be set if the dimension or duration
    * values for validations cannot be calculated for example image load error or unsupported video by the browser.
    * By default it would assume the file is valid if the duration or dimension cannot be calculated by the browser.
    * @type {boolean}
    */
  var ngfValidateForce: js.UndefOr[Boolean] = js.native
}

object FileUploadOptions {
  @scala.inline
  def apply(): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadOptions]
  }
  @scala.inline
  implicit class FileUploadOptionsOps[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNgfAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfAccept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfAllowDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfAllowDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfAllowDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfAllowDir")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfEnableFirefoxPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfEnableFirefoxPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfEnableFirefoxPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfEnableFirefoxPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfHideOnDropNotAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfHideOnDropNotAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfHideOnDropNotAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfHideOnDropNotAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfMaxDuration(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMaxDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfMaxDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMaxDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfMaxFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMaxFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfMaxFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMaxFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfMaxSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMaxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfMaxTotalSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMaxTotalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfMaxTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMaxTotalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfMinDuration(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMinDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfMinDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMinDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfMinRatio(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMinRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfMinRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMinRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfMinSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfStopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfStopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withNgfValidateForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfValidateForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgfValidateForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngfValidateForce")(js.undefined)
        ret
    }
  }
  
}

