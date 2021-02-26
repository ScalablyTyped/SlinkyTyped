package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.opt_in
import typingsSlinky.octokitTypes.octokitTypesStrings.opt_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsSetLfsPreferenceEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Can be one of `opt_in` (large files will be stored using Git LFS) or `opt_out` (large files will be removed during the import).
    */
  var use_lfs: opt_in | opt_out = js.native
}
object MigrationsSetLfsPreferenceEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, use_lfs: opt_in | opt_out): MigrationsSetLfsPreferenceEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsSetLfsPreferenceEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsSetLfsPreferenceEndpointMutableBuilder[Self <: MigrationsSetLfsPreferenceEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_lfs(value: opt_in | opt_out): Self = StObject.set(x, "use_lfs", value.asInstanceOf[js.Any])
  }
}
