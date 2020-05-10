package typingsSlinky.picomatch.mod

import typingsSlinky.picomatch.AnonCHAR0
import typingsSlinky.picomatch.AnonContains
import typingsSlinky.picomatch.AnonDebug
import typingsSlinky.picomatch.AnonFormat
import typingsSlinky.picomatch.AnonIsMatch
import typingsSlinky.picomatch.AnonMaxLength
import typingsSlinky.picomatch.parseMod.State
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Picomatch extends js.Object {
  var constants: AnonCHAR0 = js.native
  /**
    * Creates a matcher function from one or more glob patterns. The
    * returned function takes a string to match as its first argument,
    * and returns true if the string is a match. The returned matcher
    * function also takes a boolean as the second argument that, when true,
    * returns an object with additional information.
    *
    * ```js
    * const picomatch = require('picomatch');
    * // picomatch(glob[, options]);
    *
    * const isMatch = picomatch('*.!(*a)');
    * console.log(isMatch('a.a')); //=> false
    * console.log(isMatch('a.b')); //=> true
    * ```
    * @param glob One or more glob patterns.
    * @return Returns a matcher function.
    * @api public
    */
  def apply(glob: String): Matcher = js.native
  def apply(glob: String, options: PicomatchOptions): Matcher = js.native
  def apply(glob: String, options: PicomatchOptions, returnState: Boolean): Matcher = js.native
  def apply(glob: js.Array[String]): Matcher = js.native
  def apply(glob: js.Array[String], options: PicomatchOptions): Matcher = js.native
  def apply(glob: js.Array[String], options: PicomatchOptions, returnState: Boolean): Matcher = js.native
  def compileRe(state: ReturnType[js.Function2[/* input */ String, /* options */ AnonMaxLength, State]]): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ AnonMaxLength, State]],
    options: AnonContains
  ): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ AnonMaxLength, State]],
    options: AnonContains,
    returnOutput: Boolean
  ): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ AnonMaxLength, State]],
    options: AnonContains,
    returnOutput: Boolean,
    returnState: Boolean
  ): js.RegExp = js.native
  def isMatch(str: String, patterns: String): Boolean = js.native
  def isMatch(str: String, patterns: String, options: js.Object): Boolean = js.native
  def isMatch(str: String, patterns: js.Array[String]): Boolean = js.native
  def isMatch(str: String, patterns: js.Array[String], options: js.Object): Boolean = js.native
  def isMatch(str: js.Array[String], patterns: String): Boolean = js.native
  def isMatch(str: js.Array[String], patterns: String, options: js.Object): Boolean = js.native
  def isMatch(str: js.Array[String], patterns: js.Array[String]): Boolean = js.native
  def isMatch(str: js.Array[String], patterns: js.Array[String], options: js.Object): Boolean = js.native
  def makeRe(input: String): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ AnonMaxLength, State]], 
    /* options */ js.UndefOr[AnonContains], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(input: String, options: js.Object): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ AnonMaxLength, State]], 
    /* options */ js.UndefOr[AnonContains], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(input: String, options: js.Object, returnOutput: Boolean): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ AnonMaxLength, State]], 
    /* options */ js.UndefOr[AnonContains], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(input: String, options: js.Object, returnOutput: Boolean, returnState: Boolean): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ AnonMaxLength, State]], 
    /* options */ js.UndefOr[AnonContains], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def matchBase(input: String, glob: String, options: js.Object): Boolean = js.native
  def matchBase(input: String, glob: String, options: js.Object, posix: js.Any): Boolean = js.native
  def matchBase(input: String, glob: js.RegExp, options: js.Object): Boolean = js.native
  def matchBase(input: String, glob: js.RegExp, options: js.Object, posix: js.Any): Boolean = js.native
  def parse(pattern: String, options: js.Object): js.Object = js.native
  def scan(input: String, options: js.Object): js.Object = js.native
  def test(input: String, regex: js.RegExp, options: AnonFormat): AnonIsMatch = js.native
  def test(input: String, regex: js.RegExp, options: AnonFormat, test: js.Object): AnonIsMatch = js.native
  def toRegex(source: String): js.RegExp = js.native
  def toRegex(source: String, options: AnonDebug): js.RegExp = js.native
  def toRegex(source: js.RegExp): js.RegExp = js.native
  def toRegex(source: js.RegExp, options: AnonDebug): js.RegExp = js.native
}

