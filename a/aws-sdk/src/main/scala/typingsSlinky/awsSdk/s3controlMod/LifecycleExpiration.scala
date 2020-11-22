package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleExpiration extends js.Object {
  
  /**
    * Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
    */
  var Date: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.
    */
  var Days: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.Days] = js.native
  
  /**
    * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired. If set to false, the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
    */
  var ExpiredObjectDeleteMarker: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.ExpiredObjectDeleteMarker] = js.native
}
object LifecycleExpiration {
  
  @scala.inline
  def apply(): LifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleExpiration]
  }
  
  @scala.inline
  implicit class LifecycleExpirationOps[Self <: LifecycleExpiration] (val x: Self) extends AnyVal {
    
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
    def setDate(value: js.Date): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("Date", js.undefined)
    
    @scala.inline
    def setDays(value: Days): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("Days", js.undefined)
    
    @scala.inline
    def setExpiredObjectDeleteMarker(value: ExpiredObjectDeleteMarker): Self = this.set("ExpiredObjectDeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiredObjectDeleteMarker: Self = this.set("ExpiredObjectDeleteMarker", js.undefined)
  }
}
