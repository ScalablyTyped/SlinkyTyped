package typingsSlinky.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormatOptions extends js.Object {
  /**
    * Whether double quotes or single quotes should be used in XML attributes.
    * By default, single quotes are used.
    */
  var doubleQuotes: js.UndefOr[Boolean] = js.native
  /**
    * The indent string used for pretty-printing. The default indent string is
    * four spaces.
    */
  var indent: js.UndefOr[String] = js.native
  /**
    * The newline string used for pretty-printing. The default newline string
    * is "\n".
    */
  var newline: js.UndefOr[String] = js.native
  /**
    * Whether pretty-printing is enabled. By default, pretty-printing is
    * enabled.
    */
  var pretty: js.UndefOr[Boolean] = js.native
}

object IFormatOptions {
  @scala.inline
  def apply(): IFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormatOptions]
  }
  @scala.inline
  implicit class IFormatOptionsOps[Self <: IFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoubleQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withNewline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
  }
  
}

