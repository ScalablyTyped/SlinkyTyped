package typingsSlinky.parseCacheControl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-cache-control", JSImport.Namespace)
  @js.native
  def apply(field: String): Header | Null = js.native
  
  @js.native
  trait Header extends StObject {
    
    var `max-age`: js.UndefOr[Double] = js.native
    
    var `must-revalidate`: js.UndefOr[Boolean] = js.native
    
    var `no-cache`: js.UndefOr[Boolean] = js.native
    
    var `no-store`: js.UndefOr[Boolean] = js.native
    
    var `private`: js.UndefOr[Boolean] = js.native
  }
  object Header {
    
    @scala.inline
    def apply(): Header = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setMax-age`(value: Double): Self = StObject.set(x, "max-age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-ageUndefined`: Self = StObject.set(x, "max-age", js.undefined)
      
      @scala.inline
      def `setMust-revalidate`(value: Boolean): Self = StObject.set(x, "must-revalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMust-revalidateUndefined`: Self = StObject.set(x, "must-revalidate", js.undefined)
      
      @scala.inline
      def `setNo-cache`(value: Boolean): Self = StObject.set(x, "no-cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-cacheUndefined`: Self = StObject.set(x, "no-cache", js.undefined)
      
      @scala.inline
      def `setNo-store`(value: Boolean): Self = StObject.set(x, "no-store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-storeUndefined`: Self = StObject.set(x, "no-store", js.undefined)
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
}
