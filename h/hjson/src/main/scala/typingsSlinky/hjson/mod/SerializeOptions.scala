package typingsSlinky.hjson.mod

import typingsSlinky.hjson.hjsonStrings.`no-tabs`
import typingsSlinky.hjson.hjsonStrings.all
import typingsSlinky.hjson.hjsonStrings.keys
import typingsSlinky.hjson.hjsonStrings.min
import typingsSlinky.hjson.hjsonStrings.off
import typingsSlinky.hjson.hjsonStrings.std
import typingsSlinky.hjson.hjsonStrings.strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeOptions extends js.Object {
  /**
    * makes braces appear on the same line as the key name. Default false.
    */
  var bracesSameLine: js.UndefOr[Boolean] = js.native
  /**
    * output ascii color codes
    */
  var colors: js.UndefOr[Boolean] = js.native
  /**
    * show braces for the root object. Default true.
    */
  var emitRootBraces: js.UndefOr[Boolean] = js.native
  /**
    * specifies the EOL sequence (default is set by Hjson.setEndOfLine())
    */
  var eol: js.UndefOr[String] = js.native
  /**
    * keep white space. See parse.
    */
  var keepWsc: js.UndefOr[Boolean] = js.native
  /**
    * controls how multiline strings are displayed. (setting quotes implies "off")
    * "std": strings containing \n are shown in multiline format (default)
    * "no-tabs": like std but disallow tabs
    * "off": show in JSON format
    */
  var multiline: js.UndefOr[std | `no-tabs` | off] = js.native
  /**
    * controls how strings are displayed. (setting separator implies "strings")
    * "min": no quotes whenever possible (default)
    * "keys": use quotes around keys
    * "strings": use quotes around string values
    * "all": use quotes around keys and string values
    */
  var quotes: js.UndefOr[min | keys | strings | all] = js.native
  /**
    * output a comma separator between elements. Default false
    */
  var separator: js.UndefOr[Boolean] = js.native
  /**
    * specifies the indentation of nested structures.
    * If it is a number, it will specify the number of spaces to indent at each level.
    * If it is a string (such as '\t' or ' '), it contains the characters used to indent at each level.
    */
  var space: js.UndefOr[Double | String] = js.native
}

object SerializeOptions {
  @scala.inline
  def apply(): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeOptions]
  }
  @scala.inline
  implicit class SerializeOptionsOps[Self <: SerializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBracesSameLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracesSameLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBracesSameLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracesSameLine")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitRootBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitRootBraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitRootBraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitRootBraces")(js.undefined)
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
    def withKeepWsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepWsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWsc")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: std | `no-tabs` | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotes(value: min | keys | strings | all): Self = {
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
    def withSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
  }
  
}

