package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tiering extends js.Object {
  
  /**
    * S3 Intelligent-Tiering access tier. See Storage class for automatically optimizing frequently and infrequently accessed objects for a list of access tiers in the S3 Intelligent-Tiering storage class.
    */
  var AccessTier: IntelligentTieringAccessTier = js.native
  
  /**
    * The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier. The minimum number of days specified for Archive Access tier must be at least 90 days and Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
    */
  var Days: IntelligentTieringDays = js.native
}
object Tiering {
  
  @scala.inline
  def apply(AccessTier: IntelligentTieringAccessTier, Days: IntelligentTieringDays): Tiering = {
    val __obj = js.Dynamic.literal(AccessTier = AccessTier.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tiering]
  }
  
  @scala.inline
  implicit class TieringOps[Self <: Tiering] (val x: Self) extends AnyVal {
    
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
    def setAccessTier(value: IntelligentTieringAccessTier): Self = this.set("AccessTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays(value: IntelligentTieringDays): Self = this.set("Days", value.asInstanceOf[js.Any])
  }
}
