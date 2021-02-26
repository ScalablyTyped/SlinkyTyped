package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PFaxAccount extends StObject {
  
  val bstrJobId: String = js.native
  
  val pFaxAccount: FaxAccount = js.native
  
  val pJobStatus: FaxJobStatus = js.native
}
object PFaxAccount {
  
  @scala.inline
  def apply(bstrJobId: String, pFaxAccount: FaxAccount, pJobStatus: FaxJobStatus): PFaxAccount = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PFaxAccount]
  }
  
  @scala.inline
  implicit class PFaxAccountMutableBuilder[Self <: PFaxAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrJobId(value: String): Self = StObject.set(x, "bstrJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPJobStatus(value: FaxJobStatus): Self = StObject.set(x, "pJobStatus", value.asInstanceOf[js.Any])
  }
}
