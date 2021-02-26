package typingsSlinky.globrex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("globrex", JSImport.Namespace)
  @js.native
  def apply(glob: String): Results = js.native
  @JSImport("globrex", JSImport.Namespace)
  @js.native
  def apply(glob: String, options: Options): Results = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Enable all advanced features from extglob.
      * Matching so called "extended" globs pattern like single character matching,
      * matching ranges of characters, group matching, etc.
      * Note: Interprets [a-d] as [abcd].
      * To match a literal -, include it as first or last character.
      * @default false
      */
    var extended: js.UndefOr[Boolean] = js.native
    
    /**
      * Parse input strings as it was a file path for special path related features.
      * This feature only makes sense if the input is a POSIX path like /foo/bar/hello.js or URLs.
      * When true the returned object will have an additional path object.
      * @default false
      */
    var filepath: js.UndefOr[Boolean] = js.native
    
    /**
      * When `globstar` is false globs like '/foo/ *' are transformed to the following '^\/foo\/.*$'
      * which will match any string beginning with '/foo/'
      * When the globstar option is true, the same '/foo/ *'
      * glob is transformed to '^\/foo\/[^/]*$' which will match any string beginning with '/foo/'
      * that does not have a '/' to the right of it. '/foo/ *' will match: '/foo/bar', '/foo/bar.txt' but not '/foo/bar/baz' or '/foo/bar/baz.txt'.
      * Note: When globstar is true, '/foo/ **' is equivalent to '/foo/ *' when globstar is false
      * @default false
      */
    var globstar: js.UndefOr[Boolean] = js.native
    
    /**
      * Be forgiving about multiple slashes, like /// and make everything after the first / optional
      * This is how bash glob works.
      * @default false
      */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
      
      @scala.inline
      def setFilepath(value: Boolean): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      @scala.inline
      def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    /**
      * JavaScript RegExp instance build for testing against paths.
      * The regex have different path separators depending on host OS.
      */
    var regex: js.RegExp = js.native
    
    /**
      * Array of RegExp instances separated by /.
      * This can be usable when working with file paths or urls.
      * ```js
      * [ /^foo$/, /^bar$/, /^([^\/]*)$/, '^baz\\.(md|js|txt)$' ]
      * ```
      */
    var segments: js.Array[js.RegExp] = js.native
    
    /**
      * String representation of the RegExp
      */
    var string: String = js.native
  }
  object Path {
    
    @scala.inline
    def apply(regex: js.RegExp, segments: js.Array[js.RegExp], string: String): Path = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegments(value: js.Array[js.RegExp]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsVarargs(value: js.RegExp*): Self = StObject.set(x, "segments", js.Array(value :_*))
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Results extends StObject {
    
    /** This property only exists if the option `filepath` is true. */
    var path: js.UndefOr[Path] = js.native
    
    /** JavaScript RegExp instance. */
    var regex: js.RegExp = js.native
  }
  object Results {
    
    @scala.inline
    def apply(regex: js.RegExp): Results = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
}
