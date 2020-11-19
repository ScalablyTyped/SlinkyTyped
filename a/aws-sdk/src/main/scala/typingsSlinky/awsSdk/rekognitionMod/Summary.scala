package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Summary extends js.Object {
  
  var S3Object: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.S3Object] = js.native
}
object Summary {
  
  @scala.inline
  def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  
  @scala.inline
  implicit class SummaryOps[Self <: Summary] (val x: Self) extends AnyVal {
    
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
    def setS3Object(value: S3Object): Self = this.set("S3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Object: Self = this.set("S3Object", js.undefined)
  }
}
