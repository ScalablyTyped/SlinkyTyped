package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateThemeResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for the theme.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The creation status of the theme.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * The ID for the theme.
    */
  var ThemeId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the new version of the theme.
    */
  var VersionArn: js.UndefOr[Arn] = js.native
}
object UpdateThemeResponse {
  
  @scala.inline
  def apply(): UpdateThemeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThemeResponse]
  }
  
  @scala.inline
  implicit class UpdateThemeResponseOps[Self <: UpdateThemeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreationStatus(value: ResourceStatus): Self = this.set("CreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationStatus: Self = this.set("CreationStatus", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = this.set("ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeId: Self = this.set("ThemeId", js.undefined)
    
    @scala.inline
    def setVersionArn(value: Arn): Self = this.set("VersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionArn: Self = this.set("VersionArn", js.undefined)
  }
}
