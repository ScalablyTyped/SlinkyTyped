package typingsSlinky.getUri

import typingsSlinky.ftp.mod.Options
import typingsSlinky.getUri.mod.GetUriOptions
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ftpMod {
  
  @JSImport("get-uri/dist/ftp", JSImport.Default)
  @js.native
  def default(parsed: UrlWithStringQuery, opts: FTPOptions): js.Promise[Readable] = js.native
  
  @js.native
  trait FTPOptions
    extends GetUriOptions
       with Options {
    
    @JSName("cache")
    var cache_FTPOptions: js.UndefOr[FTPReadable] = js.native
  }
  object FTPOptions {
    
    @scala.inline
    def apply(): FTPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FTPOptions]
    }
    
    @scala.inline
    implicit class FTPOptionsMutableBuilder[Self <: FTPOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: FTPReadable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  @js.native
  trait FTPReadable extends Readable {
    
    var lastModified: js.UndefOr[js.Date] = js.native
  }
}
