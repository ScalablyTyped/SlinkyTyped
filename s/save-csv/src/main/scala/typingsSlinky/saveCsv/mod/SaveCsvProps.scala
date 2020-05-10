package typingsSlinky.saveCsv.mod

import typingsSlinky.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveCsvProps extends js.Object {
  var bom: js.UndefOr[Boolean] = js.native
  var eol: js.UndefOr[String] = js.native
  var filename: String = js.native
  var formatter: js.UndefOr[js.Function1[/* value */ String | JSON, Unit]] = js.native
  var mime: js.UndefOr[String] = js.native
  var quote: js.UndefOr[String] = js.native
  var sep: js.UndefOr[String] = js.native
}

object SaveCsvProps {
  @scala.inline
  def apply(filename: String): SaveCsvProps = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveCsvProps]
  }
  @scala.inline
  implicit class SaveCsvPropsOps[Self <: SaveCsvProps] (val x: Self) extends AnyVal {
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
    def withBom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: /* value */ String | JSON => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withMime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
    @scala.inline
    def withSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(js.undefined)
        ret
    }
  }
  
}

