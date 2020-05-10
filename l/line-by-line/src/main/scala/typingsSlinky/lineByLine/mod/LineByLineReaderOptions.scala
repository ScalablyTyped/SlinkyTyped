package typingsSlinky.lineByLine.mod

import typingsSlinky.lineByLine.lineByLineStrings.ascii
import typingsSlinky.lineByLine.lineByLineStrings.base64
import typingsSlinky.lineByLine.lineByLineStrings.binary
import typingsSlinky.lineByLine.lineByLineStrings.hex
import typingsSlinky.lineByLine.lineByLineStrings.latin1
import typingsSlinky.lineByLine.lineByLineStrings.ucs2
import typingsSlinky.lineByLine.lineByLineStrings.utf16le
import typingsSlinky.lineByLine.lineByLineStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineByLineReaderOptions extends js.Object {
  /** The encoding to use. */
  var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex] = js.native
  /** If set to true, empty lines do not emit the "line" event. */
  var skipEmptyLines: js.UndefOr[Boolean] = js.native
}

object LineByLineReaderOptions {
  @scala.inline
  def apply(): LineByLineReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineByLineReaderOptions]
  }
  @scala.inline
  implicit class LineByLineReaderOptionsOps[Self <: LineByLineReaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex): Self = {
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
    def withSkipEmptyLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipEmptyLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyLines")(js.undefined)
        ret
    }
  }
  
}

