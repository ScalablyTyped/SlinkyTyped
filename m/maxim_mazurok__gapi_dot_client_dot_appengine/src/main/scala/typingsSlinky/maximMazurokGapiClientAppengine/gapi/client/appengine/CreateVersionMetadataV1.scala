package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVersionMetadataV1 extends js.Object {
  
  /** The Cloud Build ID if one was created as part of the version create. @OutputOnly */
  var cloudBuildId: js.UndefOr[String] = js.native
}
object CreateVersionMetadataV1 {
  
  @scala.inline
  def apply(): CreateVersionMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersionMetadataV1]
  }
  
  @scala.inline
  implicit class CreateVersionMetadataV1Ops[Self <: CreateVersionMetadataV1] (val x: Self) extends AnyVal {
    
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
    def setCloudBuildId(value: String): Self = this.set("cloudBuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudBuildId: Self = this.set("cloudBuildId", js.undefined)
  }
}
