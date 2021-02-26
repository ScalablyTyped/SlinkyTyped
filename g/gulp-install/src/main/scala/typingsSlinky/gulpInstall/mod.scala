package typingsSlinky.gulpInstall

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-install", JSImport.Namespace)
  @js.native
  val ^ : Install = js.native
  
  type Install = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  
  @js.native
  trait Options extends StObject {
    
    var allowRoot: js.UndefOr[Boolean] = js.native
    
    var args: js.UndefOr[String | js.Array[String]] = js.native
    
    var ignoreScripts: js.UndefOr[Boolean] = js.native
    
    var noOptional: js.UndefOr[Boolean] = js.native
    
    var production: js.UndefOr[Boolean] = js.native
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
      def setAllowRoot(value: Boolean): Self = StObject.set(x, "allowRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRootUndefined: Self = StObject.set(x, "allowRoot", js.undefined)
      
      @scala.inline
      def setArgs(value: String | js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreScripts(value: Boolean): Self = StObject.set(x, "ignoreScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreScriptsUndefined: Self = StObject.set(x, "ignoreScripts", js.undefined)
      
      @scala.inline
      def setNoOptional(value: Boolean): Self = StObject.set(x, "noOptional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoOptionalUndefined: Self = StObject.set(x, "noOptional", js.undefined)
      
      @scala.inline
      def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
    }
  }
  
  type _To = Install
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Install = ^
}
