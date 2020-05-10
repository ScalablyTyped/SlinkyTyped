package typingsSlinky.karmaJsonToFileReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON messages logged via console.log(_) will be filtered
  * and saved to local json file you specified in config.
  */
@js.native
trait JsonToFileReporterOptions extends js.Object {
  /**
    * File name pattern. You can use wildcards:
    * `*timestamp*` - for current karma run timestamp.
    * `*index*` - for log entry index: 1, 2, 3, etc.
    * @default 'logFile_start-timestamp.json'
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * Filter for json objects. This option can be:
    * - string - filter JSONs by field on the root level
    * - predicate function
    */
  var filter: js.UndefOr[String | (js.Function1[/* obj */ js.Object, Boolean])] = js.native
  /** Path for your json output file. By default it will save your files in the root of your project. */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * Set it true to overwrite files if it already exists. If false, log entries will be added to the end
    */
  var overwrite: js.UndefOr[Boolean] = js.native
}

object JsonToFileReporterOptions {
  @scala.inline
  def apply(): JsonToFileReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonToFileReporterOptions]
  }
  @scala.inline
  implicit class JsonToFileReporterOptionsOps[Self <: JsonToFileReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(value: /* obj */ js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: String | (js.Function1[/* obj */ js.Object, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
  }
  
}

