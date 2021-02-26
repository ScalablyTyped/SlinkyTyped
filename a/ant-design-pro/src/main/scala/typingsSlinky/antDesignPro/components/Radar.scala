package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.radarMod.IRadarProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radar {
  
  @scala.inline
  def apply(data: js.Array[typingsSlinky.antDesignPro.anon.Label], height: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IRadarProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts", "Radar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.chartsMod.Radar] {
    
    @scala.inline
    def hasLegend(value: Boolean): this.type = set("hasLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: js.Tuple4[Double, Double, Double, Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IRadarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
