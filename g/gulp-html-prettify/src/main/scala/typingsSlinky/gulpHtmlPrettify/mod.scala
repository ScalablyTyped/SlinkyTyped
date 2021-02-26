package typingsSlinky.gulpHtmlPrettify

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-html-prettify", JSImport.Namespace)
  @js.native
  val ^ : GulpHtmlPrettify = js.native
  
  type GulpHtmlPrettify = js.Function1[/* options */ js.UndefOr[GulpHtmlPrettifyOptions], ReadWriteStream]
  
  @js.native
  trait GulpHtmlPrettifyOptions extends StObject {
    
    var indent_char: js.UndefOr[String] = js.native
    
    var indent_size: js.UndefOr[Double] = js.native
  }
  object GulpHtmlPrettifyOptions {
    
    @scala.inline
    def apply(): GulpHtmlPrettifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpHtmlPrettifyOptions]
    }
    
    @scala.inline
    implicit class GulpHtmlPrettifyOptionsMutableBuilder[Self <: GulpHtmlPrettifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent_char(value: String): Self = StObject.set(x, "indent_char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_charUndefined: Self = StObject.set(x, "indent_char", js.undefined)
      
      @scala.inline
      def setIndent_size(value: Double): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
    }
  }
  
  type _To = GulpHtmlPrettify
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpHtmlPrettify = ^
}
