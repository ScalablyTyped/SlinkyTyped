package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStructureJson extends StObject {
  
  @JSName("$ID")
  var $ID: String = js.native
  
  @JSName("$Type")
  var $Type: String = js.native
}
object IStructureJson {
  
  @scala.inline
  def apply($ID: String, $Type: String): IStructureJson = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructureJson]
  }
  
  @scala.inline
  implicit class IStructureJsonMutableBuilder[Self <: IStructureJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ID(value: String): Self = StObject.set(x, "$ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Type(value: String): Self = StObject.set(x, "$Type", value.asInstanceOf[js.Any])
  }
}
