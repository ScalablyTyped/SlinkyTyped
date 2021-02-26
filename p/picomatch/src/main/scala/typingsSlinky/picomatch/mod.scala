package typingsSlinky.picomatch

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.picomatch.anon.CHAR0
import typingsSlinky.picomatch.anon.Debug
import typingsSlinky.picomatch.anon.IsMatch
import typingsSlinky.picomatch.anon.MaxLength
import typingsSlinky.picomatch.parseMod.State
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("picomatch", JSImport.Namespace)
  @js.native
  val ^ : Picomatch = js.native
  
  type Matcher = js.Function1[/* test */ String, Boolean]
  
  @js.native
  trait Picomatch extends StObject {
    
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
  
  @js.native
  trait PicomatchOptions extends StObject {
    
    var contains: js.UndefOr[Boolean] = js.native
    
    var dot: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
    
    var ignore: js.UndefOr[String] = js.native
    
    var onIgnore: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
    
    var onMatch: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
    
    var onResult: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
    
    var windows: js.UndefOr[Boolean] = js.native
  }
  object PicomatchOptions {
    
    @scala.inline
    def apply(): PicomatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PicomatchOptions]
    }
    
    @scala.inline
    implicit class PicomatchOptionsMutableBuilder[Self <: PicomatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setFormat(value: /* input */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setOnIgnore(value: /* result */ Result => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      @scala.inline
      def setOnMatch(value: /* result */ Result => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      @scala.inline
      def setOnResult(value: /* result */ Result => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      @scala.inline
      def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var glob: String = js.native
    
    var input: String = js.native
    
    var isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any = js.native
    
    var `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any = js.native
    
    var output: String = js.native
    
    var posix: Boolean = js.native
    
    var regex: js.RegExp = js.native
    
    var state: js.Any = js.native
  }
  object Result {
    
    @scala.inline
    def apply(
      glob: String,
      input: String,
      isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any,
      `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any,
      output: String,
      posix: Boolean,
      regex: js.RegExp,
      state: js.Any
    ): Result = {
      val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], posix = posix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMatch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any
      ): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any
      ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Picomatch
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Picomatch = ^
}
