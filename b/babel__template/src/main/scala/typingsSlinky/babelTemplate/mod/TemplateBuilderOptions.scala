package typingsSlinky.babelTemplate.mod

import typingsSlinky.babelParser.mod.ParserOptions
import typingsSlinky.babelTemplate.babelTemplateBooleans.`false`
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateBuilderOptions extends ParserOptions {
  /**
    * A pattern to search for when looking for Identifier and StringLiteral nodes that should be considered placeholders. `false` will
    * disable placeholder searching entirely, leaving only the `placeholderWhitelist` value to find placeholders.
    */
  var placeholderPattern: js.UndefOr[js.RegExp | `false`] = js.native
  /**
    * A set of placeholder names to automatically accept. Items in this list do not need to match the given placeholder pattern.
    */
  var placeholderWhitelist: js.UndefOr[Set[String]] = js.native
  /**
    * Set this to `true` to preserve any comments from the `code` parameter.
    */
  var preserveComments: js.UndefOr[Boolean] = js.native
}

object TemplateBuilderOptions {
  @scala.inline
  def apply(): TemplateBuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateBuilderOptions]
  }
  @scala.inline
  implicit class TemplateBuilderOptionsOps[Self <: TemplateBuilderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholderPatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderPattern(value: js.RegExp | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderWhitelist(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(js.undefined)
        ret
    }
  }
  
}

