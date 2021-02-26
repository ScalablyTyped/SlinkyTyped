package typingsSlinky.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Advertising {
  
  @js.native
  trait AdvertisementBase extends StObject {
    
    var source: js.Any = js.native
  }
  object AdvertisementBase {
    
    @scala.inline
    def apply(source: js.Any): AdvertisementBase = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvertisementBase]
    }
    
    @scala.inline
    implicit class AdvertisementBaseMutableBuilder[Self <: AdvertisementBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MidrollAdvertisement extends AdvertisementBase {
    
    var time: Double = js.native
    
    var timePercentage: Double = js.native
  }
  object MidrollAdvertisement {
    
    @scala.inline
    def apply(source: js.Any, time: Double, timePercentage: Double): MidrollAdvertisement = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timePercentage = timePercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MidrollAdvertisement]
    }
    
    @scala.inline
    implicit class MidrollAdvertisementMutableBuilder[Self <: MidrollAdvertisement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePercentage(value: Double): Self = StObject.set(x, "timePercentage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrerollAdvertisement extends AdvertisementBase
  object PrerollAdvertisement {
    
    @scala.inline
    def apply(source: js.Any): PrerollAdvertisement = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrerollAdvertisement]
    }
  }
}
