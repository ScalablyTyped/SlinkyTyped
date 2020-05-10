package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.dateFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFileAppender extends Appender {
  // include the pattern in the name of the current log file as well as the backups.(default false)
  var alwaysIncludePattern: js.UndefOr[Boolean] = js.native
  // compress the backup files during rolling (backup files will have .gz extension)(default false)
  var compress: js.UndefOr[Boolean] = js.native
  // if this value is greater than zero, then files older than that many days will be deleted during log rolling.(default 0)
  var daysToKeep: js.UndefOr[Double] = js.native
  // default “utf-8”
  var encoding: js.UndefOr[String] = js.native
  // the path of the file where you want your logs written.
  var filename: String = js.native
  // default ‘a’
  var flags: js.UndefOr[String] = js.native
  // keep the file extension when rotating logs
  var keepFileExt: js.UndefOr[Boolean] = js.native
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.native
  // default 0644
  var mode: js.UndefOr[Double] = js.native
  // defaults to .yyyy-MM-dd - the pattern to use to determine when to roll the logs.
  /**
  	 * The following strings are recognised in the pattern:
  	 *  - yyyy : the full year, use yy for just the last two digits
  	 *  - MM   : the month
  	 *  - dd   : the day of the month
  	 *  - hh   : the hour of the day (24-hour clock)
  	 *  - mm   : the minute of the hour
  	 *  - ss   : seconds
  	 *  - SSS  : milliseconds (although I'm not sure you'd want to roll your logs every millisecond)
  	 *  - O    : timezone (capital letter o)
  	 */
  var pattern: js.UndefOr[String] = js.native
  var `type`: dateFile = js.native
}

object DateFileAppender {
  @scala.inline
  def apply(filename: String, `type`: dateFile): DateFileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFileAppender]
  }
  @scala.inline
  implicit class DateFileAppenderOps[Self <: DateFileAppender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: dateFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysIncludePattern(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysIncludePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysIncludePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysIncludePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysToKeep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToKeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysToKeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToKeep")(js.undefined)
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
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepFileExt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepFileExt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepFileExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepFileExt")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
  }
  
}

