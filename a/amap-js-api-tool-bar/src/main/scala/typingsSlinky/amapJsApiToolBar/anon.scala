package typingsSlinky.amapJsApiToolBar

import typingsSlinky.amapJsApi.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Lnglat extends StObject {
    
    var lnglat: LngLat = js.native
  }
  object Lnglat {
    
    @scala.inline
    def apply(lnglat: LngLat): Lnglat = {
      val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lnglat]
    }
    
    @scala.inline
    implicit class LnglatMutableBuilder[Self <: Lnglat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
    }
  }
}
