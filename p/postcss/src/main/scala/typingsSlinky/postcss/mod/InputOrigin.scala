package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputOrigin extends js.Object {
  /**
    * Contains the source column of the error. PostCSS will use input
    * source map to detect the original error location. If you wrote a
    * Sass file, then compiled it to CSS and parsed it with PostCSS,
    * PostCSS will show the original position in the Sass file. If you
    * need the position in the PostCSS input (e.g., to debug the
    * previous compiler), use error.input.column.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * If parser's from option is set, contains the absolute path to the
    * broken file. PostCSS will use the input source map to detect the
    * original error location. If you wrote a Sass file, then compiled it
    * to CSS and parsed it with PostCSS, PostCSS will show the original
    * position in the Sass file. If you need the position in the PostCSS
    * input (e.g., to debug the previous compiler), use error.input.file.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * Contains the source line of the error. PostCSS will use the input
    * source map to detect the original error location. If you wrote a Sass
    * file, then compiled it to CSS and parsed it with PostCSS, PostCSS
    * will show the original position in the Sass file. If you need the
    * position in the PostCSS input (e.g., to debug the previous
    * compiler), use error.input.line.
    */
  var line: js.UndefOr[Double] = js.native
  /**
    * Contains the source code of the broken file. PostCSS will use the
    * input source map to detect the original error location. If you wrote
    * a Sass file, then compiled it to CSS and parsed it with PostCSS,
    * PostCSS will show the original position in the Sass file. If you need
    * the position in the PostCSS input (e.g., to debug the previous
    * compiler), use error.input.source.
    */
  var source: js.UndefOr[String] = js.native
}

object InputOrigin {
  @scala.inline
  def apply(): InputOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOrigin]
  }
  @scala.inline
  implicit class InputOriginOps[Self <: InputOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
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
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
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

