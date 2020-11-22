package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoncurrentVersionExpiration extends js.Object {
  
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates When an Object Became Noncurrent in the Amazon Simple Storage Service Developer Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.native
}
object NoncurrentVersionExpiration {
  
  @scala.inline
  def apply(): NoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoncurrentVersionExpiration]
  }
  
  @scala.inline
  implicit class NoncurrentVersionExpirationOps[Self <: NoncurrentVersionExpiration] (val x: Self) extends AnyVal {
    
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
    def setNoncurrentDays(value: Days): Self = this.set("NoncurrentDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentDays: Self = this.set("NoncurrentDays", js.undefined)
  }
}
