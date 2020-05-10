package typingsSlinky.globStream.mod

import typingsSlinky.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends IOptions {
  /**
    * Whether or not to error upon an empty singular glob.
    */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  /**
    * The absolute segment of the glob path that isn't a glob. This value is attached
    * to each globobject and is useful for relative pathing.
    */
  var base: js.UndefOr[String] = js.native
  /**
    * Whether or not the `cwd` and `base` should be the same.
    */
  var cwdbase: js.UndefOr[Boolean] = js.native
  /**
    * Filters stream to remove duplicates based on the string property name or the result of function.
    * When using a function, the function receives the streamed
    * data (objects containing `cwd`, `base`, `path` properties) to compare against.
    */
  var uniqueBy: js.UndefOr[UniqueByStringPredicate | UniqueByFunctionPredicate] = js.native
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
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withCwdbase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwdbase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwdbase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwdbase")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueByFunction1(value: /* entry */ Entry => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUniqueBy(value: UniqueByStringPredicate | UniqueByFunctionPredicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueBy")(js.undefined)
        ret
    }
  }
  
}

