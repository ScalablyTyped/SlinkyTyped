package typingsSlinky.rollupPluginBuble

import typingsSlinky.buble.mod.TransformOptions
import typingsSlinky.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-buble", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("rollup-plugin-buble", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends TransformOptions {
    
    var exclude: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.native
    
    // Every files will be parsed by default, but you can specify which files to include or exclude
    var include: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.native
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
      def setExclude(value: (js.Array[String | js.RegExp]) | String | js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeNull: Self = StObject.set(x, "exclude", null)
      
      @scala.inline
      def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: (js.Array[String | js.RegExp]) | String | js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNull: Self = StObject.set(x, "include", null)
      
      @scala.inline
      def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
}
