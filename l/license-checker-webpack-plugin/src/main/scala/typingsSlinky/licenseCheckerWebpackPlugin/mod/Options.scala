package typingsSlinky.licenseCheckerWebpackPlugin.mod

import typingsSlinky.licenseCheckerWebpackPlugin.anon.PartialDependency
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * SPDX expression with allowed licenses.
    *
    * Default: `"(Apache-2.0 OR BSD-2-Clause OR BSD-3-Clause OR MIT)"`
    */
  var allow: String = js.native
  /**
    * Whether to emit errors instead of warnings.
    *
    * Default: `false`
    */
  var emitError: Boolean = js.native
  /**
    * Regular expression that matches the file paths of dependencies to check.
    */
  var filter: js.RegExp = js.native
  /**
    * Array of dependencies to ignore, in the format `["<dependency name>@<version range>"]`.
    * For example, `["assignment@^2.0.0"]`.
    *
    * Default: `[]`
    */
  var ignore: js.Array[String] = js.native
  /**
    * Name of the third-party notices file with all licensing information.
    *
    * Default: `"ThirdPartyNotices.txt"`
    */
  var outputFilename: String = js.native
  /**
    * Path to a `.ejs` template, or function that will generate the contents
    * of the third-party notices file.
    */
  var outputWriter: String | OutputWriter = js.native
  /**
    * Object of dependencies to override, in the format `{"<dependency name>@<version range>": { ... }}`.
    * For example, `{"assignment@^2.0.0": { licenseName: "MIT" }}`.
    *
    * Default: `{}`
    */
  var `override`: Record[String, PartialDependency] = js.native
}

object Options {
  @scala.inline
  def apply(
    allow: String,
    emitError: Boolean,
    filter: js.RegExp,
    ignore: js.Array[String],
    outputFilename: String,
    outputWriter: String | OutputWriter,
    `override`: Record[String, PartialDependency]
  ): Options = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], emitError = emitError.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], outputFilename = outputFilename.asInstanceOf[js.Any], outputWriter = outputWriter.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputWriterFunction1(value: /* args */ OutputWriterArgs => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputWriter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutputWriter(value: String | OutputWriter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputWriter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverride(value: Record[String, PartialDependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

