package typingsSlinky.babelWebpackPlugin

import typingsSlinky.babelCore.mod.TransformOptions
import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  type BabelWebpackPlugin = Plugin
  
  type Matcher = js.RegExp | String | (js.Array[js.RegExp | String])
  
  @js.native
  trait Options extends TransformOptions {
    
    var exclude: js.UndefOr[Matcher] = js.native
    
    var include: js.UndefOr[Matcher] = js.native
    
    var test: js.UndefOr[Matcher] = js.native
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
      def setExclude(value: Matcher): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: Matcher): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setTest(value: Matcher): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestRegExp(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTestVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
}
