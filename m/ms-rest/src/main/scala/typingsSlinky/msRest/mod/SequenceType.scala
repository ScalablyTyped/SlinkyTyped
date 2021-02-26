package typingsSlinky.msRest.mod

import typingsSlinky.msRest.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceType extends Mapper {
  
  @JSName("type")
  var type_SequenceType: Element = js.native
}
object SequenceType {
  
  @scala.inline
  def apply(name: MapperType, required: Boolean, serializedName: String, `type`: Element): SequenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceType]
  }
  
  @scala.inline
  implicit class SequenceTypeMutableBuilder[Self <: SequenceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
