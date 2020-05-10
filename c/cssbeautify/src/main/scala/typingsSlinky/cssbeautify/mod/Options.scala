package typingsSlinky.cssbeautify.mod

import typingsSlinky.cssbeautify.cssbeautifyStrings.`end-of-line`
import typingsSlinky.cssbeautify.cssbeautifyStrings.`separate-line`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Always inserts a semicolon after the last ruleset(default is false)
    */
  var autosemicolon: js.UndefOr[Boolean] = js.native
  /**
    * A string used for the indentation of the declaration (default is 4
    * spaces).
    */
  var indent: js.UndefOr[String] = js.native
  /**
    * Defines the placement of open curly brace, either end-of-line (default)
    * or separate-line
    */
  var openbrace: js.UndefOr[`end-of-line` | `separate-line`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutosemicolon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosemicolon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosemicolon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosemicolon")(js.undefined)
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
    def withOpenbrace(value: `end-of-line` | `separate-line`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openbrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenbrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openbrace")(js.undefined)
        ret
    }
  }
  
}

