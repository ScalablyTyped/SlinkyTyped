package typingsSlinky.magicString

import typingsSlinky.magicString.mod.MagicString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Content extends StObject {
    
    var content: MagicString = js.native
    
    var filename: js.UndefOr[String] = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: MagicString): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: MagicString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  /* Inlined std.Partial<magic-string.magic-string.SourceMapOptions> */
  @js.native
  trait PartialSourceMapOptions extends StObject {
    
    var file: js.UndefOr[String] = js.native
    
    var hires: js.UndefOr[Boolean] = js.native
    
    var includeContent: js.UndefOr[Boolean] = js.native
    
    var source: js.UndefOr[String] = js.native
  }
  object PartialSourceMapOptions {
    
    @scala.inline
    def apply(): PartialSourceMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSourceMapOptions]
    }
    
    @scala.inline
    implicit class PartialSourceMapOptionsMutableBuilder[Self <: PartialSourceMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setHires(value: Boolean): Self = StObject.set(x, "hires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiresUndefined: Self = StObject.set(x, "hires", js.undefined)
      
      @scala.inline
      def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
