package typingsSlinky.doctrine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set to `true` to add `lineNumber` to each node, specifying the line on
    * which the node is found in the source. Default: `false`.
    */
  var lineNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to preserve leading and trailing whitespace when extracting
    * comment text.
    */
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * set to `true` to keep parsing even when syntax errors occur. Default:
    * `false`.
    */
  var recoverable: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to allow optional parameters to be specified in brackets
    * (`@param {string} [foo]`). Default: `false`.
    */
  var sloppy: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to throw an error when syntax errors occur. If false then
    * errors will be added to `tag.errors` instead.
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * An array of tags to return. When specified, Doctrine returns
    * only tags in this array. For example, if `tags` is `["param"]`, then only
    * `@param` tags will be returned. Default: `null`.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set to `true` to delete the leading `/ **`, any `*` that begins a line,
    * and the trailing `* /` from the source text. Default: `false`.
    */
  var unwrap: js.UndefOr[Boolean] = js.native
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
    def withLineNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoverable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoverable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoverable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoverable")(js.undefined)
        ret
    }
    @scala.inline
    def withSloppy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sloppy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSloppy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sloppy")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUnwrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnwrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrap")(js.undefined)
        ret
    }
  }
  
}

