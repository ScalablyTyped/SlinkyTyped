package typingsSlinky.fastDashGlob

import typingsSlinky.atNodelibFsDotScandir.outTypesMod.Dirent
import typingsSlinky.fastDashGlob.outTypesMod.ErrnoException
import typingsSlinky.fastDashGlob.outTypesMod.MicromatchOptions
import typingsSlinky.fastDashGlob.outTypesMod.Pattern
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils", JSImport.Namespace)
@js.native
object outUtilsMod extends js.Object {
  @js.native
  object array extends js.Object {
    def flatten[T](items: js.Array[js.Array[T]]): js.Array[T] = js.native
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
    def makeAbsolute(cwd: String, filepath: String): String = js.native
    def unixify(filepath: String): String = js.native
  }
  
  @js.native
  object pattern extends js.Object {
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
  
  @js.native
  object stream extends js.Object {
    def merge(streams: js.Array[ReadableStream]): ReadableStream = js.native
  }
  
}

