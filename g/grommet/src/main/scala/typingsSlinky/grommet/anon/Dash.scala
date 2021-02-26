package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.area
import typingsSlinky.grommet.grommetStrings.bar
import typingsSlinky.grommet.grommetStrings.bars
import typingsSlinky.grommet.grommetStrings.circle
import typingsSlinky.grommet.grommetStrings.diamond
import typingsSlinky.grommet.grommetStrings.line
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.point
import typingsSlinky.grommet.grommetStrings.square
import typingsSlinky.grommet.grommetStrings.star
import typingsSlinky.grommet.grommetStrings.strong
import typingsSlinky.grommet.grommetStrings.triangle
import typingsSlinky.grommet.grommetStrings.triangleDown
import typingsSlinky.grommet.grommetStrings.weak
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.ThicknessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dash extends StObject {
  
  var color: js.UndefOr[ColorType | js.Array[Color] | Opacity] = js.native
  
  var dash: js.UndefOr[Boolean] = js.native
  
  // defaults to undefined
  var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.native
  
  var point: js.UndefOr[circle | diamond | square | star | triangle | triangleDown] = js.native
  
  // default across points
  // property to get values from objects in data
  var property: String | (js.Array[Property | String]) | Thickness = js.native
  
  var round: js.UndefOr[Boolean] = js.native
  
  // defaults to undefined
  var thickness: js.UndefOr[ThicknessType] = js.native
  
  // defaults to auto assigned based on available space and amount of data
  var `type`: js.UndefOr[bar | line | area | point | bars] = js.native
}
object Dash {
  
  @scala.inline
  def apply(property: String | (js.Array[Property | String]) | Thickness): Dash = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dash]
  }
  
  @scala.inline
  implicit class DashMutableBuilder[Self <: Dash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType | js.Array[Color] | Opacity): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Color*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDash(value: Boolean): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    @scala.inline
    def setOpacity(value: weak | medium | strong | Boolean | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPoint(value: circle | diamond | square | star | triangle | triangleDown): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setProperty(value: String | (js.Array[Property | String]) | Thickness): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyVarargs(value: (Property | String)*): Self = StObject.set(x, "property", js.Array(value :_*))
    
    @scala.inline
    def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    @scala.inline
    def setThickness(value: ThicknessType): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setType(value: bar | line | area | point | bars): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
