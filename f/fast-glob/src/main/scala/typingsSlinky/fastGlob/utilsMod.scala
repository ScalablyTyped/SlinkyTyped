package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.patternMod.PatternTypeOptions
import typingsSlinky.fastGlob.typesMod.ErrnoException
import typingsSlinky.fastGlob.typesMod.MicromatchOptions
import typingsSlinky.fastGlob.typesMod.Pattern
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.nodelibFsScandir.typesMod.Dirent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  object array extends js.Object {
    def flatten[T](items: js.Array[js.Array[T]]): js.Array[T] = js.native
    def splitWhen[T](items: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[js.Array[T]] = js.native
  }
  
  @js.native
  object errno extends js.Object {
    def isEnoentCodeError(error: ErrnoException): Boolean = js.native
  }
  
  @js.native
  object fs extends js.Object {
    def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
  }
  
  @js.native
  object path extends js.Object {
    def escape(pattern: Pattern): Pattern = js.native
    def makeAbsolute(cwd: String, filepath: String): String = js.native
    def removeLeadingDotSegment(entry: String): String = js.native
    def unixify(filepath: String): String = js.native
  }
  
  @js.native
  object pattern extends js.Object {
    def convertPatternsToRe(patterns: js.Array[Pattern], options: MicromatchOptions): js.Array[js.RegExp] = js.native
    def convertToNegativePattern(pattern: Pattern): Pattern = js.native
    def convertToPositivePattern(pattern: Pattern): Pattern = js.native
    def endsWithSlashGlobStar(pattern: Pattern): Boolean = js.native
    def expandBraceExpansion(pattern: Pattern): js.Array[Pattern] = js.native
    def expandPatternsWithBraceExpansion(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
    def getBaseDirectory(pattern: Pattern): String = js.native
    def getNegativePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
    def getPatternParts(pattern: Pattern, options: MicromatchOptions): js.Array[Pattern] = js.native
    def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
    def hasGlobStar(pattern: Pattern): Boolean = js.native
    def isAffectDepthOfReadingPattern(pattern: Pattern): Boolean = js.native
    def isDynamicPattern(pattern: Pattern): Boolean = js.native
    def isDynamicPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = js.native
    def isNegativePattern(pattern: Pattern): Boolean = js.native
    def isPositivePattern(pattern: Pattern): Boolean = js.native
    def isStaticPattern(pattern: Pattern): Boolean = js.native
    def isStaticPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = js.native
    def makeRe(pattern: Pattern, options: MicromatchOptions): js.RegExp = js.native
    def matchAny(entry: String, patternsRe: js.Array[js.RegExp]): Boolean = js.native
  }
  
  @js.native
  object stream extends js.Object {
    def merge(streams: js.Array[Readable]): ReadableStream = js.native
  }
  
  @js.native
  object string extends js.Object {
    def isEmpty(input: String): Boolean = js.native
    def isString(input: js.Any): /* is string */ Boolean = js.native
  }
  
}

