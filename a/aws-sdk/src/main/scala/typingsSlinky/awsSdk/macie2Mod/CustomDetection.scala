package typingsSlinky.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDetection extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the custom data identifier.
    */
  var arn: js.UndefOr[string] = js.native
  
  /**
    * The total number of occurrences of the sensitive data that the custom data identifier detected.
    */
  var count: js.UndefOr[long] = js.native
  
  /**
    * The name of the custom data identifier.
    */
  var name: js.UndefOr[string] = js.native
  
  /**
    * The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A finding includes location data for a maximum of 15 occurrences of sensitive data.
    */
  var occurrences: js.UndefOr[Occurrences] = js.native
}
object CustomDetection {
  
  @scala.inline
  def apply(): CustomDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDetection]
  }
  
  @scala.inline
  implicit class CustomDetectionOps[Self <: CustomDetection] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCount(value: long): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOccurrences(value: Occurrences): Self = this.set("occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrences: Self = this.set("occurrences", js.undefined)
  }
}
