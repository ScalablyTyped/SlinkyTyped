package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  migration_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
@js.native
trait MigrationsGetStatusForAuthenticatedUserEndpoint extends js.Object {
  
  var mediaType: `7` = js.native
  
  var migration_id: Double = js.native
}
object MigrationsGetStatusForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(mediaType: `7`, migration_id: Double): MigrationsGetStatusForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetStatusForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsGetStatusForAuthenticatedUserEndpointOps[Self <: MigrationsGetStatusForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMediaType(value: `7`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigration_id(value: Double): Self = this.set("migration_id", value.asInstanceOf[js.Any])
  }
}
