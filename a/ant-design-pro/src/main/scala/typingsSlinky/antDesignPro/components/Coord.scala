package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.bizchartsStrings.x
import typingsSlinky.bizcharts.bizchartsStrings.y
import typingsSlinky.bizcharts.mod.CoordProps
import typingsSlinky.bizcharts.mod.CoordType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Coord {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Coord")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Coord] {
    
    @scala.inline
    def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRadius(value: Double): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reflect(value: x | y): this.type = set("reflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: js.Tuple2[Double, Double]): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transpose(value: Boolean): this.type = set("transpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: CoordType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Coord.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CoordProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
