package typingsSlinky.fastDashGlob

import typingsSlinky.fastDashGlob.outTypesMod.MicromatchOptions
import typingsSlinky.fastDashGlob.outTypesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils/pattern", JSImport.Namespace)
@js.native
object outUtilsPatternMod extends js.Object {
  def convertPatternsToRe(patterns: js.Array[Pattern], options: MicromatchOptions): js.Array[js.RegExp] = js.native
  def convertToNegativePattern(pattern: Pattern): Pattern = js.native
  def convertToPositivePattern(pattern: Pattern): Pattern = js.native
  def endsWithSlashGlobStar(pattern: Pattern): Boolean = js.native
  def getBaseDirectory(pattern: Pattern): String = js.native
  def getMaxNaivePatternsDepth(patterns: js.Array[Pattern]): Double = js.native
  def getNaiveDepth(pattern: Pattern): Double = js.native
  def getNegativePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  def hasGlobStar(pattern: Pattern): Boolean = js.native
  def isAffectDepthOfReadingPattern(pattern: Pattern): Boolean = js.native
  def isDynamicPattern(pattern: Pattern): Boolean = js.native
  def isNegativePattern(pattern: Pattern): Boolean = js.native
  def isPositivePattern(pattern: Pattern): Boolean = js.native
  def isStaticPattern(pattern: Pattern): Boolean = js.native
  def makeRe(pattern: Pattern, options: MicromatchOptions): js.RegExp = js.native
  def matchAny(entry: String, patternsRe: js.Array[js.RegExp]): Boolean = js.native
}

