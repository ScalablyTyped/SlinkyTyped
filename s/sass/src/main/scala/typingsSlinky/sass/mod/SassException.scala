package typingsSlinky.sass.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SassException extends Error {
  /**
    * The column number of error.
    */
  var column: Double = js.native
  /**
    * The filename of error.
    *
    * In case file option was not set (in favour of `data`), this will reflect the value `stdin`.
    */
  var file: String = js.native
  /**
    * The formatted error.
    */
  var formatted: String = js.native
  /**
    * The line number of error.
    */
  var line: Double = js.native
  /**
    * The status code.
    */
  var status: Double = js.native
}

object SassException {
  @scala.inline
  def apply(
    column: Double,
    file: String,
    formatted: String,
    line: Double,
    message: String,
    name: String,
    status: Double
  ): SassException = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SassException]
  }
  @scala.inline
  implicit class SassExceptionOps[Self <: SassException] (val x: Self) extends AnyVal {
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
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

