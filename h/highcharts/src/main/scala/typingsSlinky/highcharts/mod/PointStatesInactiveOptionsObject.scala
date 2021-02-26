package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointStatesInactiveOptionsObject extends StObject {
  
  /**
    * (Highcharts) Animation when not hovering over the node.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highcharts) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.native
}
object PointStatesInactiveOptionsObject {
  
  @scala.inline
  def apply(): PointStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesInactiveOptionsObject]
  }
  
  @scala.inline
  implicit class PointStatesInactiveOptionsObjectMutableBuilder[Self <: PointStatesInactiveOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
