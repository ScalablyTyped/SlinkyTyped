package typingsSlinky.mimeDb

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mime-db", JSImport.Namespace)
  @js.native
  val ^ : MimeDatabase = js.native
  
  /**
    * @see {@link https://github.com/jshttp/mime-db#data-structure}
    */
  type MimeDatabase = StringDictionary[MimeEntry]
  
  /**
    * @see {@link https://github.com/jshttp/mime-db#data-structure}
    */
  @js.native
  trait MimeEntry extends StObject {
    
    /** The default charset associated with this type, if any. */
    val charset: js.UndefOr[String] = js.native
    
    /** Whether a file of this type can be gzipped. */
    val compressible: js.UndefOr[Boolean] = js.native
    
    /** Known extensions associated with this mime type. */
    val extensions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Where the mime type is defined.
      * If not set, it's probably a custom media type.
      */
    val source: js.UndefOr[MimeSource] = js.native
  }
  object MimeEntry {
    
    @scala.inline
    def apply(): MimeEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimeEntry]
    }
    
    @scala.inline
    implicit class MimeEntryMutableBuilder[Self <: MimeEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCompressible(value: Boolean): Self = StObject.set(x, "compressible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressibleUndefined: Self = StObject.set(x, "compressible", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: MimeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /**
    * Sources:
    * http://www.iana.org/assignments/media-types/media-types.xhtml
    * http://svn.apache.org/repos/asf/httpd/httpd/trunk/docs/conf/mime.types
    * http://hg.nginx.org/nginx/raw-file/default/conf/mime.types
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mimeDb.mimeDbStrings.iana
    - typingsSlinky.mimeDb.mimeDbStrings.apache
    - typingsSlinky.mimeDb.mimeDbStrings.nginx
  */
  trait MimeSource extends StObject
  object MimeSource {
    
    @scala.inline
    def apache: typingsSlinky.mimeDb.mimeDbStrings.apache = "apache".asInstanceOf[typingsSlinky.mimeDb.mimeDbStrings.apache]
    
    @scala.inline
    def iana: typingsSlinky.mimeDb.mimeDbStrings.iana = "iana".asInstanceOf[typingsSlinky.mimeDb.mimeDbStrings.iana]
    
    @scala.inline
    def nginx: typingsSlinky.mimeDb.mimeDbStrings.nginx = "nginx".asInstanceOf[typingsSlinky.mimeDb.mimeDbStrings.nginx]
  }
  
  type _To = MimeDatabase
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MimeDatabase = ^
}
