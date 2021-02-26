package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointStatesNormalOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock) Animation when returning to normal state after
    * hovering.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
}
object PointStatesNormalOptionsObject {
  
  @scala.inline
  def apply(): PointStatesNormalOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesNormalOptionsObject]
  }
  
  @scala.inline
  implicit class PointStatesNormalOptionsObjectMutableBuilder[Self <: PointStatesNormalOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
