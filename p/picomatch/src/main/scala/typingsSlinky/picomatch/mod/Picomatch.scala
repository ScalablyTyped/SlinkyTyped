package typingsSlinky.picomatch.mod

import typingsSlinky.picomatch.anon.CHAR0
import typingsSlinky.picomatch.anon.Debug
import typingsSlinky.picomatch.anon.IsMatch
import typingsSlinky.picomatch.anon.MaxLength
import typingsSlinky.picomatch.parseMod.State
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Picomatch extends js.Object {
  
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
  def apply(glob: String, options: js.UndefOr[scala.Nothing], returnState: Boolean): Matcher = js.native
  def apply(glob: String, options: PicomatchOptions): Matcher = js.native
  def apply(glob: String, options: PicomatchOptions, returnState: Boolean): Matcher = js.native
  def apply(glob: js.Array[String]): Matcher = js.native
  def apply(glob: js.Array[String], options: js.UndefOr[scala.Nothing], returnState: Boolean): Matcher = js.native
  def apply(glob: js.Array[String], options: PicomatchOptions): Matcher = js.native
  def apply(glob: js.Array[String], options: PicomatchOptions, returnState: Boolean): Matcher = js.native
  
  def compileRe(state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]]): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: js.UndefOr[scala.Nothing],
    returnOutput: js.UndefOr[scala.Nothing],
    returnState: Boolean
  ): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: js.UndefOr[scala.Nothing],
    returnOutput: Boolean
  ): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: js.UndefOr[scala.Nothing],
    returnOutput: Boolean,
    returnState: Boolean
  ): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: PicomatchOptions
  ): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: PicomatchOptions,
    returnOutput: js.UndefOr[scala.Nothing],
    returnState: Boolean
  ): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: PicomatchOptions,
    returnOutput: Boolean
  ): js.RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: PicomatchOptions,
    returnOutput: Boolean,
    returnState: Boolean
  ): js.RegExp = js.native
  
  var constants: CHAR0 = js.native
  
  def isMatch(str: String, patterns: String): Boolean = js.native
  def isMatch(str: String, patterns: String, options: js.Object): Boolean = js.native
  def isMatch(str: String, patterns: js.Array[String]): Boolean = js.native
  def isMatch(str: String, patterns: js.Array[String], options: js.Object): Boolean = js.native
  def isMatch(str: js.Array[String], patterns: String): Boolean = js.native
  def isMatch(str: js.Array[String], patterns: String, options: js.Object): Boolean = js.native
  def isMatch(str: js.Array[String], patterns: js.Array[String]): Boolean = js.native
  def isMatch(str: js.Array[String], patterns: js.Array[String], options: js.Object): Boolean = js.native
  
  def makeRe(input: String): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(
    input: String,
    options: js.UndefOr[scala.Nothing],
    returnOutput: js.UndefOr[scala.Nothing],
    returnState: Boolean
  ): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(input: String, options: js.UndefOr[scala.Nothing], returnOutput: Boolean): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(input: String, options: js.UndefOr[scala.Nothing], returnOutput: Boolean, returnState: Boolean): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(input: String, options: PicomatchOptions): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(
    input: String,
    options: PicomatchOptions,
    returnOutput: js.UndefOr[scala.Nothing],
    returnState: Boolean
  ): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(input: String, options: PicomatchOptions, returnOutput: Boolean): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    js.RegExp
  ] = js.native
  def makeRe(input: String, options: PicomatchOptions, returnOutput: Boolean, returnState: Boolean): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
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
  
  def test(input: String, regex: js.RegExp): IsMatch = js.native
  def test(input: String, regex: js.RegExp, options: js.UndefOr[scala.Nothing], test: js.Object): IsMatch = js.native
  def test(input: String, regex: js.RegExp, options: PicomatchOptions): IsMatch = js.native
  def test(input: String, regex: js.RegExp, options: PicomatchOptions, test: js.Object): IsMatch = js.native
  
  def toRegex(source: String): js.RegExp = js.native
  def toRegex(source: String, options: Debug): js.RegExp = js.native
  def toRegex(source: js.RegExp): js.RegExp = js.native
  def toRegex(source: js.RegExp, options: Debug): js.RegExp = js.native
}
