package typingsSlinky.phaser.spine.webgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexAttribute extends StObject {
  
  var name: String = js.native
  
  var numElements: Double = js.native
  
  var `type`: VertexAttributeType = js.native
}
object VertexAttribute {
  
  @scala.inline
  def apply(name: String, numElements: Double, `type`: VertexAttributeType): VertexAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], numElements = numElements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttribute]
  }
  
  @scala.inline
  implicit class VertexAttributeMutableBuilder[Self <: VertexAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumElements(value: Double): Self = StObject.set(x, "numElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VertexAttributeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
