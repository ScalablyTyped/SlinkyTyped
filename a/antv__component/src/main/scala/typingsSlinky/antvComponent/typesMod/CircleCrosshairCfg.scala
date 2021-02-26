package typingsSlinky.antvComponent.typesMod

import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleCrosshairCfg extends CrosshairBaseCfg {
  
  /**
    * 圆心
    * @type {Point}
    */
  var center: Point = js.native
  
  /**
    * 结束角度
    * @type {number}
    */
  var endAngle: Double = js.native
  
  /**
    * 半径
    * @type {number}
    */
  var radius: Double = js.native
  
  /**
    * 开始角度
    * @type {number}
    */
  var startAngle: Double = js.native
}
object CircleCrosshairCfg {
  
  @scala.inline
  def apply(center: Point, container: IGroup, endAngle: Double, radius: Double, startAngle: Double): CircleCrosshairCfg = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleCrosshairCfg]
  }
  
  @scala.inline
  implicit class CircleCrosshairCfgMutableBuilder[Self <: CircleCrosshairCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
