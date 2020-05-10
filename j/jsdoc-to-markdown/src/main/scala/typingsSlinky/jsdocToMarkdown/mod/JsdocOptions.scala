package typingsSlinky.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsdocOptions extends js.Object {
  /**
    * The path to the jsdoc configuration file.
    *  Default: path/to/jsdoc/conf.json.
    */
  var configure: js.UndefOr[String] = js.native
  /**
    * One or more filenames to process.
    * Accepts globs (e.g. *.js). Either files, source or data must be supplied.
    */
  var files: String | js.Array[String] = js.native
  /**
    * By default results are cached to speed up repeat invocations.
    * Set to true to disable this.
    */
  var noCache: js.UndefOr[Boolean] = js.native
  /**
    * A string containing source code to process.
    * Either files, source or data must be supplied.
    */
  var source: js.UndefOr[String] = js.native
}

object JsdocOptions {
  @scala.inline
  def apply(files: String | js.Array[String]): JsdocOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsdocOptions]
  }
  @scala.inline
  implicit class JsdocOptionsOps[Self <: JsdocOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

