package typingsSlinky.parseGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBraces extends js.Object {
  /**
    * True if it has braces ({1..2} or .{txt,md}).
    */
  var braces: Boolean = js.native
  /**
    * True if it has POSIX brackets ([[:alpha:]]).
    */
  var brackets: Boolean = js.native
  /**
    * True if the pattern should match dot-directories (like .git).
    */
  var dotdir: Boolean = js.native
  /**
    * True if the pattern should match dotfiles.
    */
  var dotfile: Boolean = js.native
  /**
    * True if it has extglobs (@(foo|bar)).
    */
  var extglob: Boolean = js.native
  /**
    * True if the pattern actually is a glob pattern.
    */
  var glob: Boolean = js.native
  /**
    * True if the pattern has a globstar (double star, **).
    */
  var globstar: Boolean = js.native
  /**
    * True if it's a negation pattern (!/foo.js).
    */
  var negated: Boolean = js.native
}

object AnonBraces {
  @scala.inline
  def apply(
    braces: Boolean,
    brackets: Boolean,
    dotdir: Boolean,
    dotfile: Boolean,
    extglob: Boolean,
    glob: Boolean,
    globstar: Boolean,
    negated: Boolean
  ): AnonBraces = {
    val __obj = js.Dynamic.literal(braces = braces.asInstanceOf[js.Any], brackets = brackets.asInstanceOf[js.Any], dotdir = dotdir.asInstanceOf[js.Any], dotfile = dotfile.asInstanceOf[js.Any], extglob = extglob.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBraces]
  }
  @scala.inline
  implicit class AnonBracesOps[Self <: AnonBraces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotdir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobstar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

