package typingsSlinky.jupyterlabCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Download extends StObject {
    
    var download: Boolean = js.native
    
    var format: String = js.native
    
    var path: String = js.native
  }
  object Download {
    
    @scala.inline
    def apply(download: Boolean, format: String, path: String): Download = {
      val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Download]
    }
    
    @scala.inline
    implicit class DownloadMutableBuilder[Self <: Download] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Raw extends StObject {
    
    var raw: String = js.native
    
    var rule: js.RegExp = js.native
  }
  object Raw {
    
    @scala.inline
    def apply(raw: String, rule: js.RegExp): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: js.RegExp): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
}
