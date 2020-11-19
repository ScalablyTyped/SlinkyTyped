package typingsSlinky.awsSdkClientS3Browser.typesGlacierJobParametersMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Bulk
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Expedited
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Standard_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlacierJobParameters extends js.Object {
  
  /**
    * <p>Glacier retrieval tier at which the restore will be processed.</p>
    */
  var Tier: Standard_ | Bulk | Expedited | String = js.native
}
object GlacierJobParameters {
  
  @scala.inline
  def apply(Tier: Standard_ | Bulk | Expedited | String): GlacierJobParameters = {
    val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlacierJobParameters]
  }
  
  @scala.inline
  implicit class GlacierJobParametersOps[Self <: GlacierJobParameters] (val x: Self) extends AnyVal {
    
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
    def setTier(value: Standard_ | Bulk | Expedited | String): Self = this.set("Tier", value.asInstanceOf[js.Any])
  }
}
