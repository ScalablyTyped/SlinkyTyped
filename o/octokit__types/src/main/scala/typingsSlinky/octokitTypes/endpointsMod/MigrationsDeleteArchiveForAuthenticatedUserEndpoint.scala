package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  migration_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
@js.native
trait MigrationsDeleteArchiveForAuthenticatedUserEndpoint extends StObject {
  
  var mediaType: `6` = js.native
  
  var migration_id: Double = js.native
}
object MigrationsDeleteArchiveForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(mediaType: `6`, migration_id: Double): MigrationsDeleteArchiveForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsDeleteArchiveForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsDeleteArchiveForAuthenticatedUserEndpointMutableBuilder[Self <: MigrationsDeleteArchiveForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `6`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
  }
}
