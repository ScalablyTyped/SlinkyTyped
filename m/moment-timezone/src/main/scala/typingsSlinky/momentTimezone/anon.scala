package typingsSlinky.momentTimezone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Links extends StObject {
    
    var links: js.Array[String] = js.native
    
    var version: String = js.native
    
    var zones: js.Array[String] = js.native
  }
  object Links {
    
    @scala.inline
    def apply(links: js.Array[String], version: String, zones: js.Array[String]): Links = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links]
    }
    
    @scala.inline
    implicit class LinksMutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value :_*))
    }
  }
}
