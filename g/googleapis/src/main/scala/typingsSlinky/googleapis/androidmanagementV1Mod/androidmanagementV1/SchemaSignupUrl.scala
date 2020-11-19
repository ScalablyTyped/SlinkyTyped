package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enterprise signup URL.
  */
@js.native
trait SchemaSignupUrl extends js.Object {
  
  /**
    * The name of the resource. Use this value in the signupUrl field when
    * calling enterprises.create to complete the enterprise signup flow.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A URL where an enterprise admin can register their enterprise. The page
    * can&#39;t be rendered in an iframe.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaSignupUrl {
  
  @scala.inline
  def apply(): SchemaSignupUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignupUrl]
  }
  
  @scala.inline
  implicit class SchemaSignupUrlOps[Self <: SchemaSignupUrl] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
