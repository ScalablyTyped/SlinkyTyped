package typingsSlinky.antvComponent.typesMod

import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleGridCfg extends GridBaseCfg {
  
  /**
    * 中心点
    * @type {Point}
    */
  var center: Point = js.native
}
object CircleGridCfg {
  
  @scala.inline
  def apply(center: Point, container: IGroup, items: js.Array[GridItem]): CircleGridCfg = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleGridCfg]
  }
  
  @scala.inline
  implicit class CircleGridCfgMutableBuilder[Self <: CircleGridCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
  }
}
