package typingsSlinky.jestCore

import typingsSlinky.jestCore.jestCoreStrings.roots
import typingsSlinky.jestCore.jestCoreStrings.testMatch
import typingsSlinky.jestCore.jestCoreStrings.testPathIgnorePatterns
import typingsSlinky.jestCore.jestCoreStrings.testPathPattern
import typingsSlinky.jestCore.jestCoreStrings.testRegex
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsMatch extends js.Object {
  var stat: /* keyof @jest/core.@jest/core/build/types.Stats */ roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern = js.native
  def isMatch(path: Path): Boolean = js.native
}

object AnonIsMatch {
  @scala.inline
  def apply(
    isMatch: Path => Boolean,
    stat: /* keyof @jest/core.@jest/core/build/types.Stats */ roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern
  ): AnonIsMatch = {
    val __obj = js.Dynamic.literal(isMatch = js.Any.fromFunction1(isMatch), stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsMatch]
  }
  @scala.inline
  implicit class AnonIsMatchOps[Self <: AnonIsMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMatch(value: Path => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStat(
      value: /* keyof @jest/core.@jest/core/build/types.Stats */ roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

