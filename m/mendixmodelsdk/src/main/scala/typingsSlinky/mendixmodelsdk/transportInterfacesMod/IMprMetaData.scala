package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMprMetaData extends StObject {
  
  /** docs:keep */ var _BuildVersion: String = js.native
  
  /** docs:keep */ var _ProductVersion: String = js.native
  
  /** docs:keep */ var _SchemaHash: String = js.native
}
object IMprMetaData {
  
  @scala.inline
  def apply(_BuildVersion: String, _ProductVersion: String, _SchemaHash: String): IMprMetaData = {
    val __obj = js.Dynamic.literal(_BuildVersion = _BuildVersion.asInstanceOf[js.Any], _ProductVersion = _ProductVersion.asInstanceOf[js.Any], _SchemaHash = _SchemaHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMprMetaData]
  }
  
  @scala.inline
  implicit class IMprMetaDataMutableBuilder[Self <: IMprMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_BuildVersion(value: String): Self = StObject.set(x, "_BuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ProductVersion(value: String): Self = StObject.set(x, "_ProductVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_SchemaHash(value: String): Self = StObject.set(x, "_SchemaHash", value.asInstanceOf[js.Any])
  }
}
