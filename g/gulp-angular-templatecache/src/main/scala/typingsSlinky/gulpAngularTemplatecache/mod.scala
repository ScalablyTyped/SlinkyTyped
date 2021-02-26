package typingsSlinky.gulpAngularTemplatecache

import typingsSlinky.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-angular-templatecache", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-angular-templatecache", JSImport.Namespace)
  @js.native
  def apply(filename: String): ReadWriteStream = js.native
  @JSImport("gulp-angular-templatecache", JSImport.Namespace)
  @js.native
  def apply(filename: String, options: Options): ReadWriteStream = js.native
  @JSImport("gulp-angular-templatecache", JSImport.Namespace)
  @js.native
  def apply(options: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Override file base path.
      */
    var base: js.UndefOr[String | js.Function] = js.native
    
    /**
      * Name to use when concatenating.
      */
    var filename: js.UndefOr[String] = js.native
    
    /**
      * Name of AngularJS module.
      */
    var module: js.UndefOr[String] = js.native
    
    /**
      * Wrap the templateCache in a module system. Currently supported systems: RequireJS, Browserify, ES6 and IIFE (Immediately-Invoked Function Expression).
      */
    var moduleSystem: js.UndefOr[String] = js.native
    
    /**
      * Prefix for template URLs.
      */
    var root: js.UndefOr[String] = js.native
    
    /**
      * Create a new AngularJS module, instead of using an existing.
      */
    var standalone: js.UndefOr[Boolean] = js.native
    
    /**
      * Override template body.
      */
    var templateBody: js.UndefOr[String] = js.native
    
    /**
      * Override template footer.
      */
    var templateFooter: js.UndefOr[String] = js.native
    
    /**
      * Override template header.
      */
    var templateHeader: js.UndefOr[String] = js.native
    
    /**
      * Transform the generated URL before it's put into $templateCache.
      */
    var transformUrl: js.UndefOr[js.Function] = js.native
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
      def setBase(value: String | js.Function): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleSystem(value: String): Self = StObject.set(x, "moduleSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleSystemUndefined: Self = StObject.set(x, "moduleSystem", js.undefined)
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      @scala.inline
      def setTemplateBody(value: String): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
      
      @scala.inline
      def setTemplateFooter(value: String): Self = StObject.set(x, "templateFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateFooterUndefined: Self = StObject.set(x, "templateFooter", js.undefined)
      
      @scala.inline
      def setTemplateHeader(value: String): Self = StObject.set(x, "templateHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateHeaderUndefined: Self = StObject.set(x, "templateHeader", js.undefined)
      
      @scala.inline
      def setTransformUrl(value: js.Function): Self = StObject.set(x, "transformUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUrlUndefined: Self = StObject.set(x, "transformUrl", js.undefined)
    }
  }
}
