package typingsSlinky.minify

import typingsSlinky.minify.anon.MaxSize
import typingsSlinky.terser.mod.MinifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A minifier of js, css, html and img files.
    * @async
    */
  @JSImport("minify", JSImport.Namespace)
  @js.native
  def apply(name: String): js.Promise[String] = js.native
  @JSImport("minify", JSImport.Namespace)
  @js.native
  def apply(name: String, options: Options): js.Promise[String] = js.native
  
  /**
    * Full documentation for options that each file type accepts
    * can be found on the pages of the libraries used by minify to process the files
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * see {@link https://github.com/jakubpawlowicz/clean-css}
      */
    var css: js.UndefOr[typingsSlinky.cleanCss.mod.Options] = js.native
    
    /**
      * see {@link https://github.com/kangax/html-minifier}
      */
    var html: js.UndefOr[typingsSlinky.htmlMinifierTerser.mod.Options] = js.native
    
    /**
      * see {@link https://github.com/Filirom1/css-base64-images}
      */
    var img: js.UndefOr[MaxSize] = js.native
    
    /**
      * see {@link https://github.com/terser/terser}
      */
    @JSName("js")
    var js_ : js.UndefOr[MinifyOptions] = js.native
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
      def setCss(value: typingsSlinky.cleanCss.mod.Options): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setHtml(value: typingsSlinky.htmlMinifierTerser.mod.Options): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setImg(value: MaxSize): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setJs_(value: MinifyOptions): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
    }
  }
}
