package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  org :string,   migration_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
@js.native
trait MigrationsDeleteArchiveForOrgEndpoint extends js.Object {
  
  var mediaType: `7` = js.native
  
  var migration_id: Double = js.native
  
  @JSName("org")
  var org_ : String = js.native
}
object MigrationsDeleteArchiveForOrgEndpoint {
  
  @scala.inline
  def apply(mediaType: `7`, migration_id: Double, org_ : String): MigrationsDeleteArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsDeleteArchiveForOrgEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsDeleteArchiveForOrgEndpointOps[Self <: MigrationsDeleteArchiveForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
  }
}
