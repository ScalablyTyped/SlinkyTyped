package typingsSlinky.gulpModernizr

import typingsSlinky.gulpModernizr.anon.ClassPrefix
import typingsSlinky.gulpModernizr.anon.Src
import typingsSlinky.gulpModernizr.gulpModernizrBooleans.`false`
import typingsSlinky.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-modernizr", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("gulp-modernizr", JSImport.Namespace)
  @js.native
  def apply(file: js.UndefOr[scala.Nothing], parames: Params): Transform = js.native
  @JSImport("gulp-modernizr", JSImport.Namespace)
  @js.native
  def apply(file: String): Transform = js.native
  @JSImport("gulp-modernizr", JSImport.Namespace)
  @js.native
  def apply(file: String, parames: Params): Transform = js.native
  @JSImport("gulp-modernizr", JSImport.Namespace)
  @js.native
  def apply(parames: Params): Transform = js.native
  
  @js.native
  trait Params extends StObject {
    
    /**
      * Avoid unnecessary builds (see Caching section below)
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, will crawl your project for references to Modernizr tests
      * Set to false to disable
      */
    var crawl: js.UndefOr[Boolean] = js.native
    
    /**
      * Have custom Modernizr tests? Add them here.
      */
    var customTests: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Path to save out the built file
      */
    var dest: js.UndefOr[String | `false`] = js.native
    
    /**
      * Path to the build you're using for development.
      */
    var devFile: js.UndefOr[String | `false`] = js.native
    
    /**
      * Useful for excluding any tests that this tool will match
      * e.g. you use .notification class for notification elements,
      * but don’t want the test for Notification API
      */
    var excludeTests: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * By default, this task will crawl all *.js, *.css, *.scss files.
      */
    var files: js.UndefOr[Src] = js.native
    
    /**
      * Based on default settings on http://modernizr.com/download/
      */
    var options: js.UndefOr[ClassPrefix] = js.native
    
    /**
      * Define any tests you want to explicitly include
      */
    var tests: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * By default, source is uglified before saving
      */
    var uglify: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to true to pass in buffers via the "files" parameter below
      */
    var useBuffers: js.UndefOr[Boolean] = js.native
  }
  object Params {
    
    @scala.inline
    def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCrawl(value: Boolean): Self = StObject.set(x, "crawl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrawlUndefined: Self = StObject.set(x, "crawl", js.undefined)
      
      @scala.inline
      def setCustomTests(value: js.Array[String]): Self = StObject.set(x, "customTests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomTestsUndefined: Self = StObject.set(x, "customTests", js.undefined)
      
      @scala.inline
      def setCustomTestsVarargs(value: String*): Self = StObject.set(x, "customTests", js.Array(value :_*))
      
      @scala.inline
      def setDest(value: String | `false`): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setDevFile(value: String | `false`): Self = StObject.set(x, "devFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevFileUndefined: Self = StObject.set(x, "devFile", js.undefined)
      
      @scala.inline
      def setExcludeTests(value: js.Array[String]): Self = StObject.set(x, "excludeTests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeTestsUndefined: Self = StObject.set(x, "excludeTests", js.undefined)
      
      @scala.inline
      def setExcludeTestsVarargs(value: String*): Self = StObject.set(x, "excludeTests", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: Src): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setOptions(value: ClassPrefix): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setTests(value: js.Array[String]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
      
      @scala.inline
      def setTestsVarargs(value: String*): Self = StObject.set(x, "tests", js.Array(value :_*))
      
      @scala.inline
      def setUglify(value: Boolean): Self = StObject.set(x, "uglify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUglifyUndefined: Self = StObject.set(x, "uglify", js.undefined)
      
      @scala.inline
      def setUseBuffers(value: Boolean): Self = StObject.set(x, "useBuffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBuffersUndefined: Self = StObject.set(x, "useBuffers", js.undefined)
    }
  }
}
