package typingsSlinky.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanInfoToken extends js.Object {
  var backslashes: js.UndefOr[Boolean] = js.native
  var depth: Double = js.native
  var isBrace: js.UndefOr[Boolean] = js.native
  var isBracket: js.UndefOr[Boolean] = js.native
  var isExtglob: js.UndefOr[Boolean] = js.native
  var isGlob: Boolean = js.native
  var isGlobstar: js.UndefOr[Boolean] = js.native
  var isPrefix: js.UndefOr[Boolean] = js.native
  var negated: js.UndefOr[Boolean] = js.native
  var value: String = js.native
}

object ScanInfoToken {
  @scala.inline
  def apply(depth: Double, isGlob: Boolean, value: String): ScanInfoToken = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInfoToken]
  }
  @scala.inline
  implicit class ScanInfoTokenOps[Self <: ScanInfoToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGlob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackslashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backslashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackslashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backslashes")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrace")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBracket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBracket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBracket")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExtglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExtglob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtglob")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGlobstar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlobstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGlobstar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlobstar")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNegated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negated")(js.undefined)
        ret
    }
  }
  
}

