package typingsSlinky.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorColor extends StObject {
  
  var color: typingsSlinky.plotlyJs.mod.Color = js.native
}
object ColorColor {
  
  @scala.inline
  def apply(color: typingsSlinky.plotlyJs.mod.Color): ColorColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorColor]
  }
  
  @scala.inline
  implicit class ColorColorMutableBuilder[Self <: ColorColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
  }
}
