package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.anon.Lower
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.A
    - typingsSlinky.ionicCore.ionicCoreStrings.B
    - js.UndefOr[scala.Nothing]
  */
  type KnobName = js.UndefOr[_KnobName]
  
  @js.native
  trait RangeChangeEventDetail extends StObject {
    
    var value: RangeValue = js.native
  }
  object RangeChangeEventDetail {
    
    @scala.inline
    def apply(value: RangeValue): RangeChangeEventDetail = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeChangeEventDetail]
    }
    
    @scala.inline
    implicit class RangeChangeEventDetailMutableBuilder[Self <: RangeChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: RangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RangeValue = Double | Lower
  
  trait _KnobName extends StObject
}
