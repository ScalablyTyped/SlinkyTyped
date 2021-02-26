package typingsSlinky.gulpHelpDoc

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.gulp.mod.Gulp
import typingsSlinky.gulpHelpDoc.anon.Log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-help-doc", JSImport.Namespace)
  @js.native
  val ^ : Usage = js.native
  
  type Usage = js.Function2[/* gulp */ Gulp, /* options */ js.UndefOr[UsageOptions], js.Promise[js.Any]]
  
  @js.native
  trait UsageOptions extends StObject {
    
    /**
      * Path to a gulpfile (default is gulpfile.js)
      * Normally, there is no need to change this option. It may be used
      * for some special cases, like mocking gulpfile for testing.
      */
    var gulpfile: js.UndefOr[String] = js.native
    
    /**
      * Defines max width of the column width tasks or args names
      * (by default is 20 characters long)
      */
    var keysColumnWidth: js.UndefOr[Double] = js.native
    
    /**
      * Defines  max line width for the printed output lines
      * (by default is 80 characters long)
      */
    var lineWidth: js.UndefOr[Double] = js.native
    
    /**
      * Printing engine (by default is console). Accepted any device
      * which has log() function defined to do output.
      */
    var logger: js.UndefOr[Log] = js.native
    
    /**
      * Defines number of empty characters for left-padding of the output
      */
    var padding: js.UndefOr[Double] = js.native
  }
  object UsageOptions {
    
    @scala.inline
    def apply(): UsageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageOptions]
    }
    
    @scala.inline
    implicit class UsageOptionsMutableBuilder[Self <: UsageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGulpfile(value: String): Self = StObject.set(x, "gulpfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGulpfileUndefined: Self = StObject.set(x, "gulpfile", js.undefined)
      
      @scala.inline
      def setKeysColumnWidth(value: Double): Self = StObject.set(x, "keysColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysColumnWidthUndefined: Self = StObject.set(x, "keysColumnWidth", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setLogger(value: Log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  type _To = Usage
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Usage = ^
}
