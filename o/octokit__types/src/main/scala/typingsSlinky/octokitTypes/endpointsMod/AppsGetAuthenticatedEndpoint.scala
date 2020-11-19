package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
@js.native
trait AppsGetAuthenticatedEndpoint extends js.Object {
  
  var mediaType: `1` = js.native
}
object AppsGetAuthenticatedEndpoint {
  
  @scala.inline
  def apply(mediaType: `1`): AppsGetAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class AppsGetAuthenticatedEndpointOps[Self <: AppsGetAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setMediaType(value: `1`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
  }
}
