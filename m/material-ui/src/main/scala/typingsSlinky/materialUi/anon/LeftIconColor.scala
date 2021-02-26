package typingsSlinky.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftIconColor extends StObject {
  
  var leftIconColor: js.UndefOr[String] = js.native
  
  var nestedLevelDepth: js.UndefOr[Double] = js.native
  
  var rightIconColor: js.UndefOr[String] = js.native
  
  var secondaryTextColor: js.UndefOr[String] = js.native
}
object LeftIconColor {
  
  @scala.inline
  def apply(): LeftIconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftIconColor]
  }
  
  @scala.inline
  implicit class LeftIconColorMutableBuilder[Self <: LeftIconColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftIconColor(value: String): Self = StObject.set(x, "leftIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconColorUndefined: Self = StObject.set(x, "leftIconColor", js.undefined)
    
    @scala.inline
    def setNestedLevelDepth(value: Double): Self = StObject.set(x, "nestedLevelDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedLevelDepthUndefined: Self = StObject.set(x, "nestedLevelDepth", js.undefined)
    
    @scala.inline
    def setRightIconColor(value: String): Self = StObject.set(x, "rightIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconColorUndefined: Self = StObject.set(x, "rightIconColor", js.undefined)
    
    @scala.inline
    def setSecondaryTextColor(value: String): Self = StObject.set(x, "secondaryTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTextColorUndefined: Self = StObject.set(x, "secondaryTextColor", js.undefined)
  }
}
