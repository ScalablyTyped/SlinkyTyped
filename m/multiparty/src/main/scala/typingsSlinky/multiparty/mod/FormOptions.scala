package typingsSlinky.multiparty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormOptions extends js.Object {
  /**
    * Enables field events and disables part events for fields.
    * This is automatically set to true if you add a field listener.
    */
  var autoFields: js.UndefOr[Boolean] = js.native
  /**
    * Enables file events and disables part events for files.
    * This is automatically set to true if you add a file listener.
    */
  var autoFiles: js.UndefOr[Boolean] = js.native
  /**
    * sets encoding for the incoming form fields. Defaults to utf8.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Limits the number of fields that will be parsed before emitting an error event.
    * A file counts as a field in this case. Defaults to 1000.
    */
  var maxFields: js.UndefOr[Double] = js.native
  /**
    * Limits the amount of memory all fields (not files) can allocate in bytes.
    * If this value is exceeded, an error event is emitted. The default size is 2MB.
    */
  var maxFieldsSize: js.UndefOr[Double] = js.native
  /**
    * Only relevant when autoFiles is true.
    * Limits the total bytes accepted for all files combined.
    * If this value is exceeded, an error event is emitted.
    * The default is Infinity.
    */
  var maxFilesSize: js.UndefOr[Double] = js.native
  /**
    * Only relevant when autoFiles is true.
    * The directory for placing file uploads in.
    * You can move them later using fs.rename(). Defaults to os.tmpDir().
    */
  var uploadDir: js.UndefOr[String] = js.native
}

object FormOptions {
  @scala.inline
  def apply(): FormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions]
  }
  @scala.inline
  implicit class FormOptionsOps[Self <: FormOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFields")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFields(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFields")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFieldsSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFieldsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFieldsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFieldsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFilesSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFilesSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFilesSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFilesSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDir")(js.undefined)
        ret
    }
  }
  
}

