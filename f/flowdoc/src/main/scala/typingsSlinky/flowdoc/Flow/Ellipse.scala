package typingsSlinky.flowdoc.Flow

import typingsSlinky.flowdoc.Shape
import typingsSlinky.flowdoc.flowdocStrings.ELLIPSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipse extends Shape {
  
  @JSName("type")
  var type_Ellipse: ELLIPSE = js.native
}
object Ellipse {
  
  @scala.inline
  def apply(id: String, name: String, position: Point, size: Size, `type`: ELLIPSE): Ellipse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipse]
  }
  
  @scala.inline
  implicit class EllipseMutableBuilder[Self <: Ellipse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ELLIPSE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
