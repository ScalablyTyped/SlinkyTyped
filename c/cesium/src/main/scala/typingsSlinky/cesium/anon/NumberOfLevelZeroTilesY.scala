package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberOfLevelZeroTilesY extends StObject {
  
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.native
  
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.native
  
  var rectangleNortheastInMeters: js.UndefOr[Cartesian2] = js.native
  
  var rectangleSouthwestInMeters: js.UndefOr[Cartesian2] = js.native
}
object NumberOfLevelZeroTilesY {
  
  @scala.inline
  def apply(): NumberOfLevelZeroTilesY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOfLevelZeroTilesY]
  }
  
  @scala.inline
  implicit class NumberOfLevelZeroTilesYMutableBuilder[Self <: NumberOfLevelZeroTilesY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setNumberOfLevelZeroTilesX(value: Double): Self = StObject.set(x, "numberOfLevelZeroTilesX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLevelZeroTilesXUndefined: Self = StObject.set(x, "numberOfLevelZeroTilesX", js.undefined)
    
    @scala.inline
    def setNumberOfLevelZeroTilesY(value: Double): Self = StObject.set(x, "numberOfLevelZeroTilesY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLevelZeroTilesYUndefined: Self = StObject.set(x, "numberOfLevelZeroTilesY", js.undefined)
    
    @scala.inline
    def setRectangleNortheastInMeters(value: Cartesian2): Self = StObject.set(x, "rectangleNortheastInMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleNortheastInMetersUndefined: Self = StObject.set(x, "rectangleNortheastInMeters", js.undefined)
    
    @scala.inline
    def setRectangleSouthwestInMeters(value: Cartesian2): Self = StObject.set(x, "rectangleSouthwestInMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleSouthwestInMetersUndefined: Self = StObject.set(x, "rectangleSouthwestInMeters", js.undefined)
  }
}
