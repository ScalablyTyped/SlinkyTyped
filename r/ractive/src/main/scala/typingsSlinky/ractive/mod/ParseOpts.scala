package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOpts extends BaseParseOpts {
  /** If true, the parser will operate as if in a tag e.g. foo="bar" is parsed as an attribute rather than a string. */
  var attributes: js.UndefOr[Boolean] = js.native
  /** If true, will parse elements as plain text, which allows the resulting template to be used to produce templates that are also later parsed. */
  var textOnlyMode: js.UndefOr[Boolean] = js.native
}

object ParseOpts {
  @scala.inline
  def apply(): ParseOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOpts]
  }
  @scala.inline
  implicit class ParseOptsOps[Self <: ParseOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOnlyMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOnlyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOnlyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOnlyMode")(js.undefined)
        ret
    }
  }
  
}

