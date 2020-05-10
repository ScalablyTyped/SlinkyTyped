package typingsSlinky.cssesc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Partial<cssesc.cssesc.Options>> */
@js.native
trait ReadonlyPartialOptions extends js.Object {
  val escapeEverything: js.UndefOr[Boolean] = js.native
  val isIdentifier: js.UndefOr[Boolean] = js.native
  val quotes: js.UndefOr[String] = js.native
  val wrap: js.UndefOr[Boolean] = js.native
}

object ReadonlyPartialOptions {
  @scala.inline
  def apply(): ReadonlyPartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPartialOptions]
  }
  @scala.inline
  implicit class ReadonlyPartialOptionsOps[Self <: ReadonlyPartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscapeEverything(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeEverything")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeEverything: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeEverything")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIdentifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

