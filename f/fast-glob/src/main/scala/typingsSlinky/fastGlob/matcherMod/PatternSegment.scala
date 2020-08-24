package typingsSlinky.fastGlob.matcherMod

import typingsSlinky.fastGlob.fastGlobBooleans.`false`
import typingsSlinky.fastGlob.fastGlobBooleans.`true`
import typingsSlinky.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastGlob.matcherMod.StaticPatternSegment
  - typingsSlinky.fastGlob.matcherMod.DynamicPatternSegment
*/
trait PatternSegment extends js.Object

object PatternSegment {
  @scala.inline
  def StaticPatternSegment(dynamic: `false`, pattern: Pattern): PatternSegment = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternSegment]
  }
  @scala.inline
  def DynamicPatternSegment(dynamic: `true`, pattern: Pattern, patternRe: js.RegExp): PatternSegment = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternSegment]
  }
}

