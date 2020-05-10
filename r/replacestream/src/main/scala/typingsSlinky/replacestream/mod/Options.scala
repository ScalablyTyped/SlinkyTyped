package typingsSlinky.replacestream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The text encoding used during search and replace.
    *
    * Default: `"utf8"`
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * When doing string match (not relevant for regex matching) whether to do a
    * case insensitive search.
    *
    * Default: `true`
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  /**
    * Sets a limit on the number of times the replacement will be made. This
    * is forced to one when a regex without the global flag is provided.
    *
    * Default: `Infinity`
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * When doing cross-chunk replacing, this sets the maximum length match
    * that will be supported.
    *
    * Default: `100`
    */
  var maxMatchLen: js.UndefOr[Double] = js.native
  /**
    * When provided, these flags will be used when creating the search regexes
    * internally.
    *
    * @deprecated as the flags set on the regex provided are no longer mutated
    * if this is not provided.
    */
  var regExpOptions: js.UndefOr[String] = js.native
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
    def withEncoding(value: String): Self = {
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
    def withIgnoreCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMatchLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMatchLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMatchLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMatchLen")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExpOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegExpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExpOptions")(js.undefined)
        ret
    }
  }
  
}

