package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSMBSecurityStrategyInput extends js.Object {
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * Specifies the type of security strategy. ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This option is recommended when you want to maximize compatibility across different clients in your environment. MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or newer. MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have encryption enabled. This option is highly recommended for environments that handle sensitive data. This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
    */
  var SMBSecurityStrategy: typingsSlinky.awsSdk.storagegatewayMod.SMBSecurityStrategy = js.native
}
object UpdateSMBSecurityStrategyInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN, SMBSecurityStrategy: SMBSecurityStrategy): UpdateSMBSecurityStrategyInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], SMBSecurityStrategy = SMBSecurityStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSMBSecurityStrategyInput]
  }
  
  @scala.inline
  implicit class UpdateSMBSecurityStrategyInputOps[Self <: UpdateSMBSecurityStrategyInput] (val x: Self) extends AnyVal {
    
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMBSecurityStrategy(value: SMBSecurityStrategy): Self = this.set("SMBSecurityStrategy", value.asInstanceOf[js.Any])
  }
}
