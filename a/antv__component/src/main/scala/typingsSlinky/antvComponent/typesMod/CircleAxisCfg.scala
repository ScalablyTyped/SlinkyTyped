package typingsSlinky.antvComponent.typesMod

import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleAxisCfg extends AxisBaseCfg {
  
  /**
    * 中心点, x, y
    * @type {Point}
    */
  var center: Point = js.native
  
  /**
    * 结束弧度
    * @type {number}
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /**
    * 半径
    * @type {number}
    */
  var radius: Double = js.native
  
  /**
    * 开始弧度
    * @type {number}
    */
  var startAngle: js.UndefOr[Double] = js.native
}
object CircleAxisCfg {
  
  @scala.inline
  def apply(center: Point, container: IGroup, radius: Double, ticks: js.Array[ListItem]): CircleAxisCfg = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleAxisCfg]
  }
  
  @scala.inline
  implicit class CircleAxisCfgMutableBuilder[Self <: CircleAxisCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
