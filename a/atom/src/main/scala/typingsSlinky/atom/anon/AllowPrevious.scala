package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowPrevious extends js.Object {
  var allowPrevious: js.UndefOr[Boolean] = js.native
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.native
  var wordRegex: js.UndefOr[js.RegExp] = js.native
}

object AllowPrevious {
  @scala.inline
  def apply(): AllowPrevious = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPrevious]
  }
  @scala.inline
  implicit class AllowPreviousOps[Self <: AllowPrevious] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPrevious(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNonWordCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNonWordCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNonWordCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNonWordCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWordRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordRegex")(js.undefined)
        ret
    }
  }
  
}

