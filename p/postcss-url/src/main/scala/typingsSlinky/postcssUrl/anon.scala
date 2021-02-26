package typingsSlinky.postcssUrl

import typingsSlinky.node.Buffer
import typingsSlinky.postcssUrl.mod.CustomHashFunction
import typingsSlinky.postcssUrl.postcssUrlStrings.xxhash32
import typingsSlinky.postcssUrl.postcssUrlStrings.xxhash64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AbsolutePath extends StObject {
    
    /**
      * Absolute path to asset.
      */
    var absolutePath: js.UndefOr[String] = js.native
    
    /**
      * Hash from URL.
      */
    var hash: js.UndefOr[String] = js.native
    
    /**
      * URL pathname.
      */
    var pathname: js.UndefOr[String] = js.native
    
    /**
      * Current relative path to asset.
      */
    var relativePath: js.UndefOr[String] = js.native
    
    /**
      * Querystring from URL.
      */
    var search: js.UndefOr[String] = js.native
    
    /**
      * Original URL.
      */
    var url: String = js.native
  }
  object AbsolutePath {
    
    @scala.inline
    def apply(url: String): AbsolutePath = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsolutePath]
    }
    
    @scala.inline
    implicit class AbsolutePathMutableBuilder[Self <: AbsolutePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Append extends StObject {
    
    /**
      * Append the original filename in resulting filename.
      */
    var append: js.UndefOr[Boolean] = js.native
    
    /**
      * Hashing method or custom function.
      */
    var method: js.UndefOr[xxhash32 | xxhash64 | CustomHashFunction] = js.native
    
    /**
      * Shrink hast to certain length.
      */
    var shrink: js.UndefOr[Double] = js.native
  }
  object Append {
    
    @scala.inline
    def apply(): Append = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Append]
    }
    
    @scala.inline
    implicit class AppendMutableBuilder[Self <: Append] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setMethod(value: xxhash32 | xxhash64 | CustomHashFunction): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodFunction1(value: /* file */ Buffer => String): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setShrink(value: Double): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
    }
  }
  
  @js.native
  trait File extends StObject {
    
    /**
      * File path.
      */
    var file: js.UndefOr[String] = js.native
    
    /**
      * PostCSS from option.
      */
    var from: js.UndefOr[String] = js.native
    
    /**
      * PostCSS to option.
      */
    var to: js.UndefOr[String] = js.native
  }
  object File {
    
    @scala.inline
    def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
