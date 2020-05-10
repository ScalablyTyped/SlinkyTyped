package typingsSlinky.grunt.minimatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal matching utility options.
  *
  * This is the matching library used internally by npm.
  * Eventually, it will replace the C binding in node-glob.
  * It works by converting glob expressions into JavaScript RegExp objects.
  */
@js.native
trait IMinimatchOptions extends js.Object {
  /*
    All options are false by default.
    */
  /**
    * Dump a ton of stuff to stderr.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Allow patterns to match filenames starting with a period,
    * even if the pattern does not explicitly have a period in that spot.
    */
  // Note that by default, a/**\/b will not match a/.d/b, unless dot is set.
  var dot: js.UndefOr[Boolean] = js.native
  /**
    * Returns from negate expressions the same as if they were not negated. (Ie, true on a hit, false on a miss.)
    */
  var flipNegate: js.UndefOr[Boolean] = js.native
  /**
    * If set, then patterns without slashes will be matched against the basename of the path if it contains slashes.
    * For example, a?b would match the path /xyz/123/acb, but not /xyz/acb/123.
    */
  var matchBase: js.UndefOr[Boolean] = js.native
  /**
    * Do not expand {a,b} and {1..3} brace sets.
    */
  var nobrace: js.UndefOr[Boolean] = js.native
  /**
    * Perform a case-insensitive match.
    */
  var nocase: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the behavior of treating # at the start of a pattern as a comment.
    */
  var nocomment: js.UndefOr[Boolean] = js.native
  /**
    * Disable "extglob" style patterns like +(a|b).
    */
  var noext: js.UndefOr[Boolean] = js.native
  /**
    * Disable ** matching against multiple folder names.
    */
  var noglobstar: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the behavior of treating a leading ! character as negation.
    */
  var nonegate: js.UndefOr[Boolean] = js.native
  /**
    * When a match is not found by minimatch.match, return a list containing the pattern itself.
    * When set, an empty list is returned if there are no matches.
    */
  var nonull: js.UndefOr[Boolean] = js.native
}

object IMinimatchOptions {
  @scala.inline
  def apply(): IMinimatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMinimatchOptions]
  }
  @scala.inline
  implicit class IMinimatchOptionsOps[Self <: IMinimatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipNegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipNegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipNegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipNegate")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(js.undefined)
        ret
    }
    @scala.inline
    def withNobrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNobrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(js.undefined)
        ret
    }
    @scala.inline
    def withNocase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(js.undefined)
        ret
    }
    @scala.inline
    def withNocomment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocomment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocomment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocomment")(js.undefined)
        ret
    }
    @scala.inline
    def withNoext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(js.undefined)
        ret
    }
    @scala.inline
    def withNoglobstar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoglobstar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(js.undefined)
        ret
    }
    @scala.inline
    def withNonegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonegate")(js.undefined)
        ret
    }
    @scala.inline
    def withNonull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonull")(js.undefined)
        ret
    }
  }
  
}

