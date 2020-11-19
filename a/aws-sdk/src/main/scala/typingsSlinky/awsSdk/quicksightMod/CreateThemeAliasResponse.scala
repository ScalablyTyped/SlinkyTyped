package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThemeAliasResponse extends js.Object {
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * Information about the theme alias.
    */
  var ThemeAlias: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ThemeAlias] = js.native
}
object CreateThemeAliasResponse {
  
  @scala.inline
  def apply(): CreateThemeAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThemeAliasResponse]
  }
  
  @scala.inline
  implicit class CreateThemeAliasResponseOps[Self <: CreateThemeAliasResponse] (val x: Self) extends AnyVal {
    
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
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setThemeAlias(value: ThemeAlias): Self = this.set("ThemeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeAlias: Self = this.set("ThemeAlias", js.undefined)
  }
}
