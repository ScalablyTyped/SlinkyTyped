package typingsSlinky.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLabelsOptions extends js.Object {
  
  var userProject: js.UndefOr[String] = js.native
}
object SetLabelsOptions {
  
  @scala.inline
  def apply(): SetLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetLabelsOptions]
  }
  
  @scala.inline
  implicit class SetLabelsOptionsOps[Self <: SetLabelsOptions] (val x: Self) extends AnyVal {
    
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
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
}
