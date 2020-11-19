package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  card_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsGetCardEndpoint extends js.Object {
  
  var card_id: Double = js.native
  
  var mediaType: `8` = js.native
}
object ProjectsGetCardEndpoint {
  
  @scala.inline
  def apply(card_id: Double, mediaType: `8`): ProjectsGetCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetCardEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsGetCardEndpointOps[Self <: ProjectsGetCardEndpoint] (val x: Self) extends AnyVal {
    
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
    def setCard_id(value: Double): Self = this.set("card_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `8`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
  }
}
