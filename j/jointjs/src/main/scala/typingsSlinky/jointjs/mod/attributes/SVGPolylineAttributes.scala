package typingsSlinky.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPolylineAttributes extends SVGAttributes {
  
  var points: js.UndefOr[String] = js.native
}
object SVGPolylineAttributes {
  
  @scala.inline
  def apply(): SVGPolylineAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolylineAttributes]
  }
  
  @scala.inline
  implicit class SVGPolylineAttributesMutableBuilder[Self <: SVGPolylineAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
  }
}
