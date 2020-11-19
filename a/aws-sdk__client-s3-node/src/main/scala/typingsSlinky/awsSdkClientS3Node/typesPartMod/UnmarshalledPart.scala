package typingsSlinky.awsSdkClientS3Node.typesPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledPart extends Part {
  
  /**
    * <p>Date and time at which the part was uploaded.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledPart: js.UndefOr[js.Date] = js.native
}
object UnmarshalledPart {
  
  @scala.inline
  def apply(): UnmarshalledPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPart]
  }
  
  @scala.inline
  implicit class UnmarshalledPartOps[Self <: UnmarshalledPart] (val x: Self) extends AnyVal {
    
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
    def setLastModified(value: js.Date): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
  }
}
