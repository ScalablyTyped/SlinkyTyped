package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetHierarchy extends StObject {
  
  /**
    * The ID of the hierarchy. This ID is a hierarchyId.
    */
  var id: js.UndefOr[ID] = js.native
  
  /**
    * The hierarchy name provided in the CreateAssetModel or UpdateAssetModel API operation.
    */
  var name: Name = js.native
}
object AssetHierarchy {
  
  @scala.inline
  def apply(name: Name): AssetHierarchy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetHierarchy]
  }
  
  @scala.inline
  implicit class AssetHierarchyMutableBuilder[Self <: AssetHierarchy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
