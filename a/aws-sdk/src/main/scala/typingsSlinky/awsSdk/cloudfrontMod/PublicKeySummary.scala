package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeySummary extends js.Object {
  
  /**
    *  Comment for public key information summary. 
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    *  Creation time for public key information summary. 
    */
  var CreatedTime: js.Date = js.native
  
  /**
    *  Encoded key for public key information summary. 
    */
  var EncodedKey: String = js.native
  
  /**
    *  ID for public key information summary. 
    */
  var Id: String = js.native
  
  /**
    *  Name for public key information summary. 
    */
  var Name: String = js.native
}
object PublicKeySummary {
  
  @scala.inline
  def apply(CreatedTime: js.Date, EncodedKey: String, Id: String, Name: String): PublicKeySummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeySummary]
  }
  
  @scala.inline
  implicit class PublicKeySummaryOps[Self <: PublicKeySummary] (val x: Self) extends AnyVal {
    
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
    def setCreatedTime(value: js.Date): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedKey(value: String): Self = this.set("EncodedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
