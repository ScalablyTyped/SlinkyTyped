package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateReleaseAssetEndpoint extends StObject {
  
  var asset_id: Double = js.native
  
  /**
    * An alternate short description of the asset. Used in place of the filename.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The file name of the asset.
    */
  var name: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposUpdateReleaseAssetEndpoint {
  
  @scala.inline
  def apply(asset_id: Double, owner: String, repo: String): ReposUpdateReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateReleaseAssetEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateReleaseAssetEndpointMutableBuilder[Self <: ReposUpdateReleaseAssetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset_id(value: Double): Self = StObject.set(x, "asset_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
