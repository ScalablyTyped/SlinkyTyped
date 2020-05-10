package typingsSlinky.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanInfo extends js.Object {
  var base: String = js.native
  var glob: String = js.native
  var input: String = js.native
  var isBrace: Boolean = js.native
  var isBracket: Boolean = js.native
  var isExtglob: Boolean = js.native
  var isGlob: Boolean = js.native
  var isGlobstar: Boolean = js.native
  var negated: Boolean = js.native
  var prefix: String = js.native
  var start: Double = js.native
}

object ScanInfo {
  @scala.inline
  def apply(
    base: String,
    glob: String,
    input: String,
    isBrace: Boolean,
    isBracket: Boolean,
    isExtglob: Boolean,
    isGlob: Boolean,
    isGlobstar: Boolean,
    negated: Boolean,
    prefix: String,
    start: Double
  ): ScanInfo = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isBrace = isBrace.asInstanceOf[js.Any], isBracket = isBracket.asInstanceOf[js.Any], isExtglob = isExtglob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], isGlobstar = isGlobstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInfo]
  }
  @scala.inline
  implicit class ScanInfoOps[Self <: ScanInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBracket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExtglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGlob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGlobstar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlobstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

