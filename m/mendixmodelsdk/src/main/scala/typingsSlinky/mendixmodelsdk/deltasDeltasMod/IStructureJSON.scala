package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStructureJSON
  extends /* propertyName */ StringDictionary[
      PrimitiveValue | (js.Array[IStructureJSON | PrimitiveValue]) | IStructureJSON | Null
    ] {
  
  @JSName("$ID")
  var $ID: String = js.native
  
  @JSName("$Type")
  var $Type: String = js.native
}
object IStructureJSON {
  
  @scala.inline
  def apply($ID: String, $Type: String): IStructureJSON = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructureJSON]
  }
  
  @scala.inline
  implicit class IStructureJSONMutableBuilder[Self <: IStructureJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ID(value: String): Self = StObject.set(x, "$ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Type(value: String): Self = StObject.set(x, "$Type", value.asInstanceOf[js.Any])
  }
}
