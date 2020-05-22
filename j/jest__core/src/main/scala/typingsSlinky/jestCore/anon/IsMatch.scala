package typingsSlinky.jestCore.anon

import typingsSlinky.jestCore.jestCoreStrings.roots
import typingsSlinky.jestCore.jestCoreStrings.testMatch
import typingsSlinky.jestCore.jestCoreStrings.testPathIgnorePatterns
import typingsSlinky.jestCore.jestCoreStrings.testPathPattern
import typingsSlinky.jestCore.jestCoreStrings.testRegex
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMatch extends js.Object {
  var stat: /* keyof @jest/core.@jest/core/build/types.Stats */ roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern
  def isMatch(path: Path): Boolean
}

object IsMatch {
  @scala.inline
  def apply(
    isMatch: Path => Boolean,
    stat: /* keyof @jest/core.@jest/core/build/types.Stats */ roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern
  ): IsMatch = {
    val __obj = js.Dynamic.literal(isMatch = js.Any.fromFunction1(isMatch), stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMatch]
  }
}

