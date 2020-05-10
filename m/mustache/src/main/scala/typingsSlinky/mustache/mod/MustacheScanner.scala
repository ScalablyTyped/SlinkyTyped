package typingsSlinky.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple string scanner that is used by the template parser to find tokens in template strings.
  */
@js.native
trait MustacheScanner extends js.Object {
  var pos: Double = js.native
  var string: String = js.native
  var tail: String = js.native
  /**
    * Returns `true` if the tail is empty (end of string).
    */
  def eos(): Boolean = js.native
  /**
    * Tries to match the given regular expression at the current position.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * The matched text if it can match, the empty string otherwise.
    */
  def scan(re: js.RegExp): String = js.native
  /**
    * Skips all text until the given regular expression can be matched.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * Returns the skipped string, which is the entire tail if no match can be made.
    */
  def scanUntil(re: js.RegExp): String = js.native
}

object MustacheScanner {
  @scala.inline
  def apply(
    eos: () => Boolean,
    pos: Double,
    scan: js.RegExp => String,
    scanUntil: js.RegExp => String,
    string: String,
    tail: String
  ): MustacheScanner = {
    val __obj = js.Dynamic.literal(eos = js.Any.fromFunction0(eos), pos = pos.asInstanceOf[js.Any], scan = js.Any.fromFunction1(scan), scanUntil = js.Any.fromFunction1(scanUntil), string = string.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheScanner]
  }
  @scala.inline
  implicit class MustacheScannerOps[Self <: MustacheScanner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEos(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScan(value: js.RegExp => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanUntil(value: js.RegExp => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanUntil")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

