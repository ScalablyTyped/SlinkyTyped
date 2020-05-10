package typingsSlinky.jestCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var roots: Double = js.native
  var testMatch: Double = js.native
  var testPathIgnorePatterns: Double = js.native
  var testPathPattern: js.UndefOr[Double] = js.native
  var testRegex: Double = js.native
}

object Stats {
  @scala.inline
  def apply(roots: Double, testMatch: Double, testPathIgnorePatterns: Double, testRegex: Double): Stats = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoots(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestMatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPathIgnorePatterns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRegex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPathPattern(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestPathPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathPattern")(js.undefined)
        ret
    }
  }
  
}

